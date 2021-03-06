/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Entities.UserGameDetails;
import Utils.AppManager;
import Utils.ConnectionManager;
import Utils.UserGameDetailsCrud;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tarek
 */
public class History extends javax.swing.JFrame {
       
      int x,y;
      UserGameDetailsCrud userGameDetailsCrud;
    public History() {
        initComponents();
       setLocationRelativeTo(null);

       ConnectionManager connection;
        try {
            connection = ConnectionManager.getInstance();
            
            userGameDetailsCrud = new UserGameDetailsCrud(connection.in,connection.out);

            AppManager app = AppManager.getInstance();
//            UserGameDetailsCrud userg = new UserGameDetailsCrud(connection.in,connection.out);
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();

            new Thread(()->{
                try {
                    ArrayList<UserGameDetails> userGamesDetails =
                            userGameDetailsCrud
                                    .getAllWithId(app.getUser().getId());
                                            

                    for (UserGameDetails ugd :userGamesDetails){
                        Vector<String> data= new Vector<>();
                        data.add(ugd.getPlayerOneDetails().getPlayer().getName());
                        data.add(ugd.getPlayerTwoDetails().getPlayer().getName());
                        data.add(ugd.getGameMode().toString());
                        data.add(ugd.getGameDifficultyLvl().toString());
                        data.add(ugd.getPlayerOneDetails().getPlayerSimbole().toString());
                        data.add(ugd.getPlayerTwoDetails().getPlayerSimbole().toString());
                        data.add(""+ugd.isRecordedForUser(app.getUser().getId()));
                        data.add(ugd.getPlayerOneDetails().getPlayerState().toString());
                        data.add(ugd.getPlayerTwoDetails().getPlayerState().toString());
                        EventQueue.invokeLater(()->{
                            model.addRow(data);
                            revalidate();
                        });
                    } 
                                            
                                                                   

                                            } catch (IOException ex) {
                    Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();



        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
          //for (UserGameDetails ugd : {}









     }

     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 600));
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player one Name", "Player one Simbole", "Player two Name ", "Player two Simbole ", "Player one status", "Player two status ", "Game Mode ", "Game Difficulty", "Record"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 30, 1290, 570);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1260, -10, 40, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1220, -4, 30, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 1300, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        this.setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setState(JFrame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }
public  Vector<UserGameDetails> getData(ConnectionManager connection, String id) {
    Vector<UserGameDetails> data = new Vector<>();
        try {
            for (UserGameDetails ugd : (new UserGameDetailsCrud(connection.in, connection.out)).getAllWithId(id)) {
                data.add(ugd);
            }
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}