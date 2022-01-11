/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RecordGame;

import Entities.PlayerDetails;
import Entities.UserGameDetails.PlayerState;
import java.awt.Color;

/**
 *
 * @author A H M E D
 */
public class RecordedRow extends javax.swing.JPanel {

    /**
     * Creates new form RecordedRow
     */
    
    
    public RecordedRow(PlayerState playerState,PlayerDetails playerOne,PlayerDetails playerTwo) {
        initComponents();
        System.out.println("playerTwo.getIsAccount()");
        System.out.println(playerTwo.getIsAccount());
        gameState1.setText(playerState.name());
        playerOne1.setText(playerOne.getPlayer().getName()+" ("+playerOne.getPlayer().getUserName()+") ");
        playerTwo1.setText(playerTwo.getPlayer().getName()+" ("+(playerTwo.getIsAccount()?playerTwo.getPlayer().getUserName():"Gust")+") ");
        
        if(gameState1.equals(PlayerState.Winner)){
            jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        }else if(gameState1.equals(PlayerState.Loser)){
            jPanel1.setBackground(new java.awt.Color(153, 0, 102));
        }else{
            jPanel1.setBackground(new java.awt.Color(153, 0, 204));
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

        jPanel1 = new javax.swing.JPanel();
        gameState1 = new javax.swing.JLabel();
        playerOne1 = new javax.swing.JLabel();
        playerTwo1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,0));
        setMaximumSize(new java.awt.Dimension(2000, 45));
        setMinimumSize(new java.awt.Dimension(900, 45));
        setPreferredSize(new java.awt.Dimension(663, 40));

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        gameState1.setBackground(new java.awt.Color(255, 255, 255));
        gameState1.setFont(new java.awt.Font("Lithos Pro Regular", 1, 14)); // NOI18N
        gameState1.setForeground(new java.awt.Color(255, 255, 255));
        gameState1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameState1.setText("WIN");

        playerOne1.setBackground(new java.awt.Color(255, 255, 255));
        playerOne1.setFont(new java.awt.Font("Lithos Pro Regular", 1, 14)); // NOI18N
        playerOne1.setForeground(new java.awt.Color(255, 255, 255));
        playerOne1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerOne1.setText("Ahmed (AhmedGomaa)");

        playerTwo1.setBackground(new java.awt.Color(255, 255, 255));
        playerTwo1.setFont(new java.awt.Font("Lithos Pro Regular", 1, 14)); // NOI18N
        playerTwo1.setForeground(new java.awt.Color(255, 255, 255));
        playerTwo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerTwo1.setText("HossamMohamed");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lithos Pro Regular", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameState1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerOne1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerTwo1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gameState1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(playerTwo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(playerOne1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel gameState1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel playerOne1;
    public javax.swing.JLabel playerTwo1;
    // End of variables declaration//GEN-END:variables
}