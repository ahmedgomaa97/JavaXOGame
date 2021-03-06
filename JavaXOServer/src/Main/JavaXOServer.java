/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entities.GameRoom;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import Entities.*;
import Entities.GameRoom.gameRoomResponce;
import Entities.Responce.responceCodes;
import Utils.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A H M E D
 */





public class JavaXOServer {
 ServerSocket serverSocket;
 
    
    public JavaXOServer() throws IOException, SQLException {
        serverSocket = new ServerSocket(5005);
        System.out.println("wiating for client...");
        while (true) {
            Socket s = serverSocket.accept();
            System.out.println("hi Client how r u?");
            System.out.println("garsone handle our Client");
            new RequestHandler(s);
        }
        
    }

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
            new JavaXOServer();
        } catch (SQLException ex) {
            Logger.getLogger(JavaXOServer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(JavaXOServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static Vector<Player> availToPlay = new Vector<>();

    class RequestHandler extends Thread {
        private DataInputStream in;
        private DataOutputStream out;
        private Socket s;
        private Connection con;
        UserCrud userCrud;
        PlayerDetailsCrud playerDetailsCrud;
        UserGameDetailsCrud userGameDetailsCrud;
        boolean isRunning =true;
        GameRoom gameRoom;


        public RequestHandler(Socket s){
            try {
                this.in = new DataInputStream(s.getInputStream());
                this.out = new DataOutputStream(s.getOutputStream());
                this.s = s;
                DriverManager.setLoginTimeout(10);
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/javaOXDatabase","javaProject","javaProject");

                userCrud = new UserCrud(con);
                playerDetailsCrud = new PlayerDetailsCrud(in,out,con);
                userGameDetailsCrud = new UserGameDetailsCrud(con,playerDetailsCrud);

                new Responce(responceCodes.ConnectionApproved, "Done").sendJson(out);

                start();
            } catch (SQLException ex) {
                try {
                    new Responce(responceCodes.SQLConnectionError, ex.getMessage()).sendJson(out);
                } catch (IOException ex1) {
                    try {
                        s.close();
                    } catch (IOException ex2) {
                        Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex2);
                    }

                    Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                try {
                    s.close();
                } catch (IOException ex1) {
                    Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex1);
                }

                try {
                    con.close();
                } catch (SQLException ex1) {
                    Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex1);
                }

                Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public void run() {
            while (isRunning) {
                try {
                    String str = in.readUTF();
                    JsonAction action = JsonAction.fromJson(str);
                    System.out.println("action: "+action);

                    if(usersRoute(action))
                        continue;

                    if(userGameDetailsRouts(action))
                        continue;

                    if(GameRoomRouts(action))
                        continue;

                } catch (JSONException ex) {
                    Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    try {
                        s.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    try {
                        in.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    try {
                        out.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    try {
                        con.close();
                    } catch (SQLException ex1) {
                        Logger.getLogger(RequestHandler.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    System.out.println(ex);
                    System.out.println("user quit");
                    return;
                }
            } 

        }
        
        private gameRoomResponce getGameRoom(String code){
            if(GameRoom.gameRooms.isEmpty())
                return gameRoomResponce.NoGameRoomRightNow;

            gameRoom = GameRoom.getGameRoom(code);
            if(gameRoom==null)
            {
               return gameRoomResponce.NoGameRoomWithThisCode;
            }
            return null;
        }

        public Player isThereReadyPlayer(User user){
            if(availToPlay.isEmpty())
                return null;

            for (Player player : availToPlay) {
                if(!player.user.getUserName().equals(user.getUserName()))
                    return player;
            }

            return null;
        }
        
        
        // routes
        private boolean usersRoute(JsonAction action) throws JsonProcessingException, JSONException, IOException, SQLException{
            Integer updatedRow;
            Integer deletedRow;
            switch(action.getType()){
                case AddUser:
                    Integer code = userCrud.add(new ObjectMapper().readValue(action.getObject(), User.class));
                    new Responce(responceCodes.Done, code.toString()).sendJson(out);
                break;

                case GetAllUsers:
                    ArrayList<User> users = userCrud.getAll();
                    new Responce(responceCodes.Done, Responce.arrayToString(users)).sendJson(out);
                break;

                case GetUser:
                    User user = userCrud.get(action.getParams());
                    new Responce(responceCodes.Done, user!=null?user.toJson():"null").sendJson(out);
                break;

                case GetUserWithUesrName:
                    User userWithUserName = userCrud.getWithUserName(action.getParams());
                    new Responce(responceCodes.Done, userWithUserName!=null?userWithUserName.toJson():"null").sendJson(out);
                break;

                case UpdateUser:
                    updatedRow = userCrud.update(action.getParams(),new ObjectMapper().readValue(action.getObject(), User.class));
                    new Responce(responceCodes.Done, updatedRow.toString()).sendJson(out);
                break;

                case DeleteUser:
                     deletedRow= userCrud.delete(action.getParams());
                    new Responce(responceCodes.Done, deletedRow.toString()).sendJson(out);
                break;
                default:
                    return false;

            }
            return true;
        }

        private boolean userGameDetailsRouts(JsonAction action) throws  JsonProcessingException, JSONException, IOException, SQLException{
            Integer updatedRow;
            Integer deletedRow;
            switch(action.getType()){
                        case Add:
                            Integer addedRow = userGameDetailsCrud.add(new ObjectMapper().readValue(action.getObject(), UserGameDetails.class));
                            new Responce(responceCodes.Done, addedRow.toString()).sendJson(out);
                        break;

                        case GetAll:
                            ArrayList<UserGameDetails> array = userGameDetailsCrud.getAll();
                            new Responce(responceCodes.Done, Responce.arrayToString(array)).sendJson(out);
                        break;

                        case Get:
                            UserGameDetails userGameDetails = userGameDetailsCrud.get(action.getParams());
                            new Responce(responceCodes.Done, userGameDetails!=null?userGameDetails.toJson():"null").sendJson(out);
                        break;

                        case Update:
                             updatedRow = userGameDetailsCrud.update(action.getParams(),new ObjectMapper().readValue(action.getObject(), UserGameDetails.class));
                            new Responce(responceCodes.Done, updatedRow.toString()).sendJson(out);
                        break;

                        case Delete:
                             deletedRow =userGameDetailsCrud.delete(action.getParams());
                            new Responce(responceCodes.Done, deletedRow.toString()).sendJson(out);
                        break;

                        case GetAllWithId:
                            ArrayList<UserGameDetails> arrayWithId =userGameDetailsCrud.getAllWithId(action.getParams());
                            new Responce(responceCodes.Done, Responce.arrayToString(arrayWithId)).sendJson(out);
                        break;

                        case GetAllWithUesrName:
                           ArrayList<UserGameDetails> arrayWithUserName = userGameDetailsCrud.getAllWithUserName(action.getParams());
                            new Responce(responceCodes.Done, Responce.arrayToString(arrayWithUserName)).sendJson(out);
                        break;

                        // GAME ROOM Routs
                        default:
                            return false;
                    }
            return true;
        }

        private boolean GameRoomRouts(JsonAction action) throws JsonProcessingException, JsonProcessingException, IOException, JSONException, SQLException{
            gameRoomResponce gemeRoomResponce = null;

            switch(action.getType()){
                case createGameRoom:
                    gameRoom = new GameRoom(new Player(new ObjectMapper().readValue(action.getObject(), User.class),s));
                    new Responce(responceCodes.createGameRoom, gameRoom.toJson()).sendJson(out);
                break;



                case LeaveGameRoom:
                    gemeRoomResponce = getGameRoom(action.getParams());
                    gameRoom.Playerleave(action.getObject());
                    isRunning = false;
                    if(!gameRoom.hasPlayer())
                        GameRoom.gameRooms.remove(gameRoom);
                    else
                        gameRoom.notifySockets(responceCodes.LeaveGameRoom,gameRoomResponce.PlayerLeave.name());

                break;

                case StartRecordingForUser:
                    getGameRoom(action.getParams());
                    userGameDetailsCrud.setIsRecorded(action.getObject(),gameRoom.getId());
                    System.out.println("StartRecordingForUser");
                break;

                case playAgain:
                    getGameRoom(action.getParams());
                    gameRoom.playAgain(action.getObject());
                    if(gameRoom.playAgain(action.getObject()).equals(responceCodes.waitingPlayerTwoPlayAgain)){
                        gameRoom.notifySockets(responceCodes.waitingPlayerTwoPlayAgain,action.getObject());
                    }else{
                        gameRoom.notifySockets(responceCodes.playAgain,gameRoom.toJson());
                    }
                break;


                case findGameRoom:
                    Player p = isThereReadyPlayer(new ObjectMapper().readValue(action.getObject(), User.class));
                    System.out.println("availToPlay.isEmpty()");
                    System.out.println(availToPlay.isEmpty());
                    if(p==null){
                        availToPlay.add(new Player(new ObjectMapper().readValue(action.getObject(), User.class),s));
                        new Responce(responceCodes.findGame, gameRoomResponce.FindingGame.name()).sendJson(out);
                    }else{
                        gameRoom = new GameRoom(p,new Player(new ObjectMapper().readValue(action.getObject(), User.class),s));
                        availToPlay.remove(p);
                        gameRoom.notifySockets(responceCodes.startGame,gameRoom.toJson());
                    }
                break;

                case findGameRoomWithCode:
                    gemeRoomResponce = getGameRoom(action.getParams());

                    if(gemeRoomResponce!=null){
                        new Responce(responceCodes.findGameWithCodeError, gemeRoomResponce.name()).sendJson(out);
                        break;
                    }

                    gemeRoomResponce = gameRoom.setPlayerTwo(new Player(new ObjectMapper().readValue(action.getObject(), User.class),s));
                    if(gemeRoomResponce!=null)
                        new Responce(responceCodes.findGameWithCodeError, gemeRoomResponce.name()).sendJson(out);
                    else{
                        new Responce(responceCodes.findGameWithCode, responceCodes.Done.name()).sendJson(out);
                        gameRoom.notifySockets(responceCodes.startGame,gameRoom.toJson());
                    }
                    break;

                case setMove:
                    gemeRoomResponce = getGameRoom(action.getParams());

                    if(gemeRoomResponce!=null){
                        new Responce(responceCodes.setMoveError, gemeRoomResponce.name()).sendJson(out);
                        break;
                    }

                    gemeRoomResponce = gameRoom.setMove(new ObjectMapper().readValue(action.getObject(), Integer.class));
                    if(gemeRoomResponce!=null)
                        new Responce(responceCodes.setMoveError, gemeRoomResponce.name()).sendJson(out);
                    else
                        switch(gameRoom._getGameSate())
                        {
                            case playing:
                                gameRoom.notifySockets(responceCodes.setMove,gameRoom.toJson());
                            break;
                            case draw:
                                gameRoom.notifySockets(responceCodes.Draw,gameRoom.toJson());
                                userGameDetailsCrud.add(gameRoom);
                            break;
                            case winner:
                                gameRoom.notifySockets(responceCodes.Winner,gameRoom.toJson());
                                userGameDetailsCrud.add(gameRoom);
                            break;

                        }
                break;
                default:
                    return false;
            }
            return true;
        }
    }
}
