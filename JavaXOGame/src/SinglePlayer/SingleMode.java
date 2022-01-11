/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglePlayer;

import Entities.User;
import UI.Home;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author hossa
 */
public class SingleMode extends javax.swing.JFrame {
    int x_pressed = 0;
    int y_pressed = 0;
    int x=1;
    ArrayList<JButton> currentBoard = new ArrayList<>();
    
    
    User u ;
    
    boolean player1_turn;
    
    
    Random random = new Random();

    /**
     * Creates new form SingleMode
     */
    public SingleMode() {
        initComponents();
        firstTurn();
        //nicknameP1.setText(u.getName());
        
        currentBoard.addAll(Arrays.asList(new JButton []{btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8}));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dragLabel = new javax.swing.JLabel();
        frstTurn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nicknameP1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn0.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 146, 108, 93));

        btn1.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 146, 110, 93));

        btn2.setFont(new java.awt.Font("Arial", 0, 1)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 146, 105, 93));

        btn6.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 355, 108, 93));

        btn7.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 355, 110, 93));

        btn8.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 355, 105, 93));

        btn3.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn3.setBorder(null);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 250, 108, 93));

        btn4.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn4.setBorder(null);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 250, 110, 93));

        btn5.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 250, 105, 93));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/backWhite2.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("x");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -10, -1, -1));

        dragLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragLabelMouseDragged(evt);
            }
        });
        dragLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragLabelMousePressed(evt);
            }
        });
        getContentPane().add(dragLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        frstTurn.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        frstTurn.setForeground(new java.awt.Color(255, 255, 0));
        frstTurn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(frstTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 220, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/oPng.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 320, 60, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/XPngg.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 320, 60, 60));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("  CPU Easy");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 270, 110, 30));

        nicknameP1.setBackground(java.awt.Color.white);
        nicknameP1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nicknameP1.setForeground(new java.awt.Color(204, 204, 204));
        nicknameP1.setText("NickNaame");
        getContentPane().add(nicknameP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 110, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Player 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 240, 80, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Player 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 80, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/playerB.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/playerB.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 150, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/test7.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 130, 380, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Board/background.png"))); // NOI18N
        jLabel1.setIconTextGap(0);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(player1_turn){
            if(btn0.getText()==""){
                btn0.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn0.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(player1_turn){
            if(btn1.getText()==""){
                btn1.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn1.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(player1_turn){
            if(btn2.getText()==""){
                btn2.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn2.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(player1_turn){
            if(btn6.getText()==""){
                btn6.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn6.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(player1_turn){
            if(btn7.getText()==""){
                btn7.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn7.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        if(player1_turn){
            if(btn8.getText()==""){
                btn8.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn8.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(player1_turn){
            if(btn3.getText()==""){
                btn3.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn3.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(player1_turn){
            if(btn4.getText()==""){
                btn4.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn4.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(player1_turn){
            if(btn5.getText()==""){
                btn5.setIcon(new ImageIcon(getClass().getResource("/UI/Board/xCol2.png")));
                btn5.setText("X");
                player1_turn=false;
                frstTurn.setText("    O Turn");
                if(checkWinner()==false){
                    cpuMove();
                }

            }}
    }//GEN-LAST:event_btn5ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void dragLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLabelMouseDragged
        setLocation(evt.getXOnScreen() - x_pressed, evt.getYOnScreen() - y_pressed);
    }//GEN-LAST:event_dragLabelMouseDragged

    private void dragLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLabelMousePressed
        x_pressed = evt.getX();
        y_pressed = evt.getY();
    }//GEN-LAST:event_dragLabelMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // if(!player1_turn){
            //cpuMove();
            // }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
            Home home = new Home();
            home.setVisible(true);
            home.pack();
            home.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(SingleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingleMode().setVisible(true);
            }
        });
    }
    
    public void firstTurn(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SingleMode.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(random.nextInt(1) == 0){
            player1_turn = true;
            frstTurn.setText("X turn first");
        }
        
    }
       
            
    public boolean checkWinner(){
        int win = 0;
        
        //check row
          for(int i = 0; i <currentBoard.size(); i+=3){  
              if(currentBoard.get(i).getText() == "X" && currentBoard.get(i+1).getText() == "X" && currentBoard.get(i+2).getText() == "X"){
                  xWin(currentBoard.get(i),currentBoard.get(i+1),currentBoard.get(i+2));
                  return true;
              }
              if(currentBoard.get(i).getText() == "O" && currentBoard.get(i+1).getText() == "O" && currentBoard.get(i+2).getText() == "O"){
                  oWin(currentBoard.get(i),currentBoard.get(i+1),currentBoard.get(i+2));
                  return true;
              }
          }
          
          //check col
          for(int i =0 ; i<=2 ; i++){
              if(currentBoard.get(i).getText() == "X" && currentBoard.get(i+3).getText() == "X" && currentBoard.get(i+6).getText() == "X"){
                  xWin(currentBoard.get(i),currentBoard.get(i+3),currentBoard.get(i+6));
                  return true;
              }
              if(currentBoard.get(i).getText() == "O" && currentBoard.get(i+3).getText() == "O" && currentBoard.get(i+6).getText() == "O"){
                  oWin(currentBoard.get(i),currentBoard.get(i+3),currentBoard.get(i+6));
                  return true;
              }
          }
          
          //check diag
          
              if(currentBoard.get(0).getText() == "X" && currentBoard.get(4).getText() == "X" && currentBoard.get(8).getText() == "X" ){
                  xWin(currentBoard.get(0),currentBoard.get(4), currentBoard.get(8));
                  return true;
              }
              
              if(currentBoard.get(2).getText() == "X" && currentBoard.get(4).getText() == "X" && currentBoard.get(6).getText() == "X"){
                  xWin(currentBoard.get(2),currentBoard.get(4), currentBoard.get(6));
                  return true;
              }
              if(currentBoard.get(0).getText() == "O" && currentBoard.get(4).getText() == "O" && currentBoard.get(8).getText() == "O"){
                  oWin(currentBoard.get(0),currentBoard.get(4), currentBoard.get(8));
                  return true;
              }
              
              if(currentBoard.get(2).getText() == "O" && currentBoard.get(4).getText() == "O" && currentBoard.get(6).getText() == "O"){
                  oWin(currentBoard.get(2),currentBoard.get(4), currentBoard.get(6));
                  return true;
              }
          
        
        
        return false;
    }
            
            
    
    public void xWin(JButton a, JButton b, JButton c){
        a.setIcon(new ImageIcon(getClass().getResource("/UI/Board/XPngg.png")));
        b.setIcon(new ImageIcon(getClass().getResource("/UI/Board/XPngg.png")));
        c.setIcon(new ImageIcon(getClass().getResource("/UI/Board/XPngg.png")));
        a.setBackground(Color.GREEN);
        b.setBackground(Color.GREEN);
        c.setBackground(Color.GREEN);
        
        frstTurn.setText("    X Wins");
        
        
        
        //JOptionPane.showMessageDialog(null,"X Won");
        int n;
        n = JOptionPane.showConfirmDialog(null, "X Won, Play again?", "Game ended", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION){
            
            
            this.dispose();
            SingleMode jframe = new SingleMode();
            jframe.setVisible(true);
            jframe.pack();
            jframe.setLocationRelativeTo(null);
            
        }
        
        if(n == JOptionPane.NO_OPTION){
            this.dispose();
            Home home = new Home();
            home.setVisible(true);
            home.pack();
            home.setLocationRelativeTo(null);
        }
    }
    
    public void oWin(JButton a, JButton b, JButton c){
        a.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oPng.png")));
        b.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oPng.png")));
        c.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oPng.png")));
        a.setBackground(Color.GREEN);
        b.setBackground(Color.GREEN);
        c.setBackground(Color.GREEN);
         
        
        frstTurn.setText("    O Wins");
        
        
        //JOptionPane.showMessageDialog(null,"O Won");
        int n;
        n = JOptionPane.showConfirmDialog(null, "O Won, Play again?", "Game ended", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION){
            this.dispose();
            SingleMode jframe = new SingleMode();
            jframe.setVisible(true);
            jframe.pack();
            jframe.setLocationRelativeTo(null);
            
        }
        
        if(n == JOptionPane.NO_OPTION){
            this.dispose();
            Home home = new Home();
            home.setVisible(true);
            home.pack();
            home.setLocationRelativeTo(null);
        }
    }
    
    public void draw(){
        int n;
        n = JOptionPane.showConfirmDialog(null, "Draw, Play again?", "Game ended", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION){
            
            this.dispose();
            SingleMode jframe = new SingleMode();
            jframe.setVisible(true);
            jframe.pack();
            jframe.setLocationRelativeTo(null);
        }
        
        if(n == JOptionPane.NO_OPTION){
            this.dispose();
            Home home = new Home();
            home.setVisible(true);
            home.pack();
            home.setLocationRelativeTo(null);
        }
    }
    
    public void cpuMove(){
        Random move = new Random();
        int computerMove;
        while(!player1_turn){
        
            computerMove = move.nextInt(9)+1;
            switch(computerMove){
                case 1: 
                    if(btn0.getText()==""){
                        btn0.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn0.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 2:
                    if(btn1.getText()==""){
                        btn1.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn1.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 3:
                    if(btn2.getText()==""){
                        btn2.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn2.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 4:
                    if(btn3.getText()==""){
                        btn3.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn3.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 5:
                    if(btn4.getText()==""){
                        btn4.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn4.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 6:
                    if(btn5.getText()==""){
                        btn5.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn5.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 7:
                    if(btn6.getText()==""){
                        btn6.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn6.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 8:
                    if(btn7.getText()==""){
                        btn7.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn7.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }else{
                        cpuMove();
                    }
                    
                    break;
                    
                case 9:
                    if(btn8.getText()==""){
                        btn8.setIcon(new ImageIcon(getClass().getResource("/UI/Board/oCol2.png")));
                        btn8.setText("O");
                        player1_turn=true;
                        frstTurn.setText("    X Turn");
                        checkWinner();
                    }
                    else{
                        cpuMove();
                    }
                    
                    break;
                    
                
                    
            }
            
               
        }
    }

    
    
    class Ai {
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JLabel dragLabel;
    private javax.swing.JLabel frstTurn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nicknameP1;
    // End of variables declaration//GEN-END:variables
}
