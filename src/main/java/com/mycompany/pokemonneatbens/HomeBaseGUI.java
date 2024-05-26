/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemonneatbens;

/**
 *
 * @author aditya wirz
 */
public class HomeBaseGUI extends javax.swing.JFrame {
    public Dunia dunia;
    public Player player;
    /**
     * Creates new form UsserInterface
     */
    public HomeBaseGUI() {
        initComponents();
    }
    public HomeBaseGUI(Dunia dunia, Player player) {
        initComponents();
        this.dunia = dunia;
        this.player = player;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToUsserIn1 = new javax.swing.JButton();
        ToUsserIn2 = new javax.swing.JButton();
        ToUsserIn3 = new javax.swing.JButton();
        ToUsserIn4 = new javax.swing.JButton();
        ToUsserIn5 = new javax.swing.JButton();
        ToUsserIn6 = new javax.swing.JButton();
        ToUsserIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToUsserIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Exit.png"))); // NOI18N
        ToUsserIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn1ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 270, 60));

        ToUsserIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Save.png"))); // NOI18N
        ToUsserIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn2ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 270, 70));

        ToUsserIn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/ChestMonster.png"))); // NOI18N
        ToUsserIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn3ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 750, 270, 60));

        ToUsserIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Shop.png"))); // NOI18N
        ToUsserIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn4ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 830, 270, 60));

        ToUsserIn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Evolve.png"))); // NOI18N
        ToUsserIn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn5ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 910, 270, 60));

        ToUsserIn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Dungeon.png"))); // NOI18N
        ToUsserIn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn6ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 830, 270, 60));

        ToUsserIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Heal.png"))); // NOI18N
        ToUsserIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserInActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 910, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/LobbyBase.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToUsserInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserInActionPerformed
        ((HomeBase)dunia).healMonster(player);
    }//GEN-LAST:event_ToUsserInActionPerformed

    private void ToUsserIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn1ActionPerformed
        // TODO add your handling code here:
        UsserInterface lobby = new UsserInterface();
        lobby.setVisible(true);
    }//GEN-LAST:event_ToUsserIn1ActionPerformed

    private void ToUsserIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn2ActionPerformed
        GameManager gm = new GameManager();
        gm.saveProgress(player);
    }//GEN-LAST:event_ToUsserIn2ActionPerformed

    private void ToUsserIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn3ActionPerformed
        // TODO add your handling code here:
        dunia = new Dungeon(dunia.monsterChest);
        DungeonGUI dungeon = new DungeonGUI(dunia, player);
        setVisible(false);
        dungeon.setVisible(true);
    }//GEN-LAST:event_ToUsserIn3ActionPerformed

    private void ToUsserIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn4ActionPerformed
        // TODO add your handling code here:
        SHOPGUI shop = new SHOPGUI(dunia, player);
        shop.dunia = dunia;
        shop.player = player;
        setVisible(false);
        shop.setVisible(true);
    }//GEN-LAST:event_ToUsserIn4ActionPerformed

    private void ToUsserIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn5ActionPerformed

    private void ToUsserIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn6ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeBaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        HomeBaseGUI Interface = new HomeBaseGUI();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeBaseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ToUsserIn;
    private javax.swing.JButton ToUsserIn1;
    private javax.swing.JButton ToUsserIn2;
    private javax.swing.JButton ToUsserIn3;
    private javax.swing.JButton ToUsserIn4;
    private javax.swing.JButton ToUsserIn5;
    private javax.swing.JButton ToUsserIn6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
