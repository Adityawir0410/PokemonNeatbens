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

    /**
     * Creates new form UsserInterface
     */
    public SHOPGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToUsserIn2 = new javax.swing.JButton();
        ToUsserIn5 = new javax.swing.JButton();
        ToUsserIn3 = new javax.swing.JButton();
        ToUsserIn4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ToUsserIn6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToUsserIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Dungeon/NEW GAME (1)/backhomebase.png"))); // NOI18N
        ToUsserIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn2ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 270, 70));

        ToUsserIn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Dungeon/NEW GAME (1)/exit.png"))); // NOI18N
        ToUsserIn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn5ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 910, 270, 70));

        ToUsserIn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Dungeon/NEW GAME (1)/searchingpokemon.png"))); // NOI18N
        ToUsserIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn3ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 790, 440, 100));

        ToUsserIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Dungeon/NEW GAME (1)/save.png"))); // NOI18N
        ToUsserIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn4ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 910, 270, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/Dungeon/NEW GAME (1)/Dungeon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1000));

        ToUsserIn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/HomeBase/Save.png"))); // NOI18N
        ToUsserIn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn6ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 270, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToUsserIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn2ActionPerformed

    private void ToUsserIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn3ActionPerformed

    private void ToUsserIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn6ActionPerformed

    private void ToUsserIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn4ActionPerformed

    private void ToUsserIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn5ActionPerformed

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
    private javax.swing.JButton ToUsserIn3;
    private javax.swing.JButton ToUsserIn4;
    private javax.swing.JButton ToUsserIn5;
    private javax.swing.JButton ToUsserIn6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
