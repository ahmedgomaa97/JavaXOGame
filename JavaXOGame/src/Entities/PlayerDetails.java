/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author A H M E D
 */
public class PlayerDetails extends BaseEntity {
   
    
    public static PlayerDetails fromJson(String body) throws  JsonProcessingException{
           ObjectMapper obm = new ObjectMapper();
            return obm.readValue(body, PlayerDetails.class);
    }
        
    public String toJson() throws JsonProcessingException {
        ObjectMapper obm = new ObjectMapper();
        
        return obm.writeValueAsString(this);
    }

    @Override
    public String toString() {
        return "PlayerDetails{" + "player=" + player + ", playerState=" + playerState + ", PlayerSimbole=" + PlayerSimbole + ", isRecorded=" + isRecorded + ", isAccount=" + isAccount + '}';
    }

    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public UserGameDetails.PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(UserGameDetails.PlayerState playerState) {
        this.playerState = playerState;
    }

    public UserGameDetails.PlayerSimbole getPlayerSimbole() {
        return PlayerSimbole;
    }

    public void setPlayerSimbole(UserGameDetails.PlayerSimbole PlayerSimbole) {
        this.PlayerSimbole = PlayerSimbole;
    }

    public boolean getIsRecorded() {
        return isRecorded;
    }

    public void setIsRecorded(boolean isRecorded) {
        this.isRecorded = isRecorded;
    }
    
    public boolean getIsAccount() {
        return isAccount;
    }

    public void setIsAccount(boolean isAccount) {
        this.isAccount = isAccount;
    }
    
    

    public PlayerDetails(String id,User player, UserGameDetails.PlayerState playerState, UserGameDetails.PlayerSimbole PlayerSimbole, boolean isRecorded,boolean isAccount) {
        super(id);
        this.player = player;
        this.playerState = playerState;
        this.PlayerSimbole = PlayerSimbole;
        this.isRecorded = isRecorded;
        this.isAccount = isAccount;
        this.isAccount=isAccount;
    }

        
    public PlayerDetails(User player, UserGameDetails.PlayerSimbole playerSample) {
        this.player = player;
        this.PlayerSimbole = playerSample;
        this.playerState = UserGameDetails.PlayerState.Draw;
        this.isAccount=player.getUserName()!=null;
    }
    
    public PlayerDetails(User player, UserGameDetails.PlayerSimbole playerSample,boolean isAccount) {
        this.player = player;
        this.PlayerSimbole = playerSample;
        this.playerState = UserGameDetails.PlayerState.Draw;
        this.isAccount=isAccount;
    }

    public PlayerDetails() {
    }

    private User player;
    private UserGameDetails.PlayerState playerState;
    private UserGameDetails.PlayerSimbole  PlayerSimbole;
    protected boolean isRecorded;
    protected boolean isAccount;
}
