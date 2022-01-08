/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Entities.GameRoom;
import Entities.UserGameDetails;
import UI.MultiPlayer.MultiMain;
import UI.MultiPlayer.MultiOnlineMenu;
import Utils.AppManager;
import Utils.ConnectionManager;
import Utils.UserGameDetailsCrud;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tarek
 */
public class Home extends javax.swing.JFrame {

    int x;
    int y;
    public static String player2;
     public static String player1;
    
    private enum Screens{
        MultiOnline
    }
    /**
     * Creates new form Home
     */
    MultiOnlineMenu multiOnlinePanel;
    public Home() {
        initComponents();
        multiOnlinePanel = new MultiOnlineMenu();
        multiOnlinePanel.setVisible(true);
        
        
        setLocationRelativeTo(null);
        ConnectionManager connection;
        AppManager appManager;
        appManager = AppManager.getinstance();
        try {
            connection = ConnectionManager.getInstance();
            win.setText("win : " + getResult(0, connection, appManager.getUser().getUserName()));
            lose.setText("lose : " + getResult(1, connection, appManager.getUser().getUserName()));
            this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
            jPanel6.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
            jPanel5.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
            jPanel7.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
            player1=appManager.getUser().getUserName();
        
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
      

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        singlBT = new javax.swing.JLabel();
        localBT = new javax.swing.JLabel();
        multiBT = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        singlBT1 = new javax.swing.JLabel();
        localBT1 = new javax.swing.JLabel();
        multiBT1 = new javax.swing.JLabel();
        win = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 552));
        jPanel1.setLayout(null);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button (11).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button (12).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/btRecords2.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel12)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel6, "card3");

        singlBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singlBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/single player.png"))); // NOI18N
        singlBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singlBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                singlBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                singlBTMouseExited(evt);
            }
        });

        localBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/local player.png"))); // NOI18N
        localBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                localBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                localBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                localBTMouseExited(evt);
            }
        });

        multiBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/multi player.png"))); // NOI18N
        multiBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiBTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localBT, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singlBT, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiBT, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singlBT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(multiBT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(localBT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel5, "card2");

        singlBT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singlBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/easy_1.png"))); // NOI18N
        singlBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                singlBT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                singlBT1MouseExited(evt);
            }
        });

        localBT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/difficult_1.png"))); // NOI18N
        localBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                localBT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                localBT1MouseExited(evt);
            }
        });

        multiBT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/meduim.png"))); // NOI18N
        multiBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiBT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiBT1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singlBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(singlBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(multiBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(localBT1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.add(jPanel7, "card2");

        jPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(221, 239, 390, 270);

        win.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        win.setForeground(new java.awt.Color(255, 255, 255));
        win.setText("win : 3");
        jPanel1.add(win);
        win.setBounds(390, 140, 80, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tic.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 0, 100, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tac.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 20, 100, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/toe.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(520, 20, 100, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backWhite.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 10, 48, 30);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("x");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(760, 0, 30, 30);

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
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -4, 800, 40);

        lose.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lose.setForeground(new java.awt.Color(255, 255, 255));
        lose.setText("lose : 4");
        jPanel1.add(lose);
        lose.setBounds(390, 180, 100, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/scorePane (1).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 100, 130, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homee.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singlBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlBTMouseEntered
        singlBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/single player 2.png"))); // NOI18N
    }//GEN-LAST:event_singlBTMouseEntered

    private void singlBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlBTMouseExited
        singlBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/single player.png"))); // NOI18N
    }//GEN-LAST:event_singlBTMouseExited

    private void localBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localBTMouseEntered
        localBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/local player2.png"))); // NOI18N
    }//GEN-LAST:event_localBTMouseEntered

    private void localBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localBTMouseExited
localBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/local player.png")));
     }//GEN-LAST:event_localBTMouseExited

    private void multiBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiBTMouseEntered
        multiBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/multi player 2.png"))); // NOI18N
    }//GEN-LAST:event_multiBTMouseEntered

    private void multiBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiBTMouseExited
        multiBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/multi player.png"))); // NOI18N
    }//GEN-LAST:event_multiBTMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        getPanal(jPanel5);

        back = 1;// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button (13).png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button (11).png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button (14).png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button (12).png"))); // NOI18N
    }//GEN-LAST:event_jLabel2MouseExited

    private void singlBT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlBT1MouseEntered
        singlBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/easy2.png"))); // NOI18N

        // TODO add your handling code here:
    }//GEN-LAST:event_singlBT1MouseEntered

    private void singlBT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlBT1MouseExited
  singlBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/easy_1.png"))); // NOI18N

    }//GEN-LAST:event_singlBT1MouseExited

    private void localBT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localBT1MouseEntered
        localBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/difficult2.png"))); // NOI18N
       
    }//GEN-LAST:event_localBT1MouseEntered

    private void localBT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localBT1MouseExited
               localBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/difficult_1.png"))); // NOI18N

    }//GEN-LAST:event_localBT1MouseExited

    private void multiBT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiBT1MouseEntered
             multiBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/meduim2.png"))); // NOI18N

    }//GEN-LAST:event_multiBT1MouseEntered

    private void multiBT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiBT1MouseExited
              multiBT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/meduim.png"))); // NOI18N

    }//GEN-LAST:event_multiBT1MouseExited

    private void singlBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlBTMouseClicked
        getPanal(jPanel7);
        back = 2;
    }//GEN-LAST:event_singlBTMouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
x=evt.getX();
y=evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
       this.setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
if (back == 1) {
            getPanal(jPanel6);
            back = 0;

        }
        if (back == 2) {

            getPanal(jPanel5);
            back = 1;

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void multiBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiBTMouseClicked
                    this.setVisible(false);
    
        new MultiMain(this).setVisible(true);
    }//GEN-LAST:event_multiBTMouseClicked

    private void localBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localBTMouseClicked
 String str = JOptionPane.showInputDialog(null, "Enter the second player's name : ", 
"Click a button", 1);
  if(str != null){
 player2=str;
 new MultiLocal().setVisible(true);
  
  }
  
  
  

      
    }//GEN-LAST:event_localBTMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
new History().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
       jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/btrecords.png")));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button/btRecords2.png")));
    }//GEN-LAST:event_jLabel12MouseExited
    
    public void getPanal(JPanel jp) {
        jLayeredPane1.removeAll();
        jLayeredPane1.add(jp);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }
    public int getResult(int typ, ConnectionManager connection, String name) throws IOException {
        int wins = 0;
        int lose = 0;
    
        for (UserGameDetails ugd : new UserGameDetailsCrud(connection.in, connection.out).getAllWithUserName(name)) {
            if (ugd.getPlayerWithUserName(name).getPlayerState().equals(UserGameDetails.PlayerState.Winner)) {
                wins++;
            } else {
                lose++;
            }
        }
        
        if (typ == 0) {
            return wins;
        } else {
            return lose;
        }
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new Home().setVisible(true);
                
            }
        });
    }

    private int back = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel localBT;
    private javax.swing.JLabel localBT1;
    private javax.swing.JLabel lose;
    private javax.swing.JLabel multiBT;
    private javax.swing.JLabel multiBT1;
    private javax.swing.JLabel singlBT;
    private javax.swing.JLabel singlBT1;
    private javax.swing.JLabel win;
    // End of variables declaration//GEN-END:variables
}
