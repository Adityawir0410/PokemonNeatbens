/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemonneatbens;

/**
 *
 * @author aditya wirz
 */
public class SHOPGUI extends javax.swing.JFrame {
    public Dunia dunia;
    public Player player;

    public SHOPGUI(){
        initComponents();
    }
    /**
     * Creates new form UsserInterface
     */
    public SHOPGUI(Dunia dunia, Player player) {
        //test1
        initComponents();
        this.dunia = dunia;
        this.player = player;
        jLabel2.setText("$"+Integer.toString(player.money));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ToUsserIn2 = new javax.swing.JButton();
        ToUsserIn8 = new javax.swing.JButton();
        ToUsserIn9 = new javax.swing.JButton();
        ToUsserIn7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ads");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 220, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("$20");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 220, 50));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("$30");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 220, 50));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("$10");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 50));

        ToUsserIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Shop/attackpotion.png"))); // NOI18N
        ToUsserIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn2ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 190, 50));

        ToUsserIn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Shop/okeball.png"))); // NOI18N
        ToUsserIn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn8ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 190, 50));

        ToUsserIn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Shop/healthpotion.png"))); // NOI18N
        ToUsserIn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn9ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 190, 50));

        ToUsserIn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Dungeon/NEW GAME (1)/backhomebase.png"))); // NOI18N
        ToUsserIn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn7ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 900, 270, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 100)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Shop/Shop.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToUsserIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn2ActionPerformed
        // TODO add your handling code here:\
        if(player.money >= 30){
            player.money -= 30;
            player.courage.add(new Item("Attack Potion", 100, 0, 10));
            jLabel2.setText("$"+Integer.toString(player.money));
        }    
    }//GEN-LAST:event_ToUsserIn2ActionPerformed

    private void ToUsserIn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn7ActionPerformed
        // TODO add your handling code here:
        HomeBaseGUI rumah = new HomeBaseGUI(dunia, player);
        setVisible(false);
        rumah.setVisible(true);
    }//GEN-LAST:event_ToUsserIn7ActionPerformed

    private void ToUsserIn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn8ActionPerformed
        // TODO add your handling code here:
        if(player.money >= 20){
            player.money -= 20;
            player.okeball.add(new Item("OkeBall", 100, 0, 10));
            jLabel2.setText("$"+Integer.toString(player.money));
        }
    }//GEN-LAST:event_ToUsserIn8ActionPerformed

    private void ToUsserIn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn9ActionPerformed
        // TODO add your handling code here:
        if(player.money >= 10){
            player.money -= 10;
            player.health.add(new Item("Health Potion", 100, 0, 10));
            jLabel2.setText("$"+Integer.toString(player.money));
        }
    }//GEN-LAST:event_ToUsserIn9ActionPerformed

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
            java.util.logging.Logger.getLogger(SHOPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SHOPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SHOPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SHOPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        SHOPGUI Interface = new SHOPGUI();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SHOPGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ToUsserIn2;
    private javax.swing.JButton ToUsserIn7;
    private javax.swing.JButton ToUsserIn8;
    private javax.swing.JButton ToUsserIn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
