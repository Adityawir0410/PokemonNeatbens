/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemonneatbens;

/**
 *
 * @author aditya wirz
 */
public class BerhasilTangkapMonsterGui extends javax.swing.JFrame {

    /**
     * Creates new form UsserInterface
     */
    public BerhasilTangkapMonsterGui() {
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

        ToUsserIn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToUsserIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/YouLoose/Back.png"))); // NOI18N
        ToUsserIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn1ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 870, 310, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/BerhasilTangkap/NEW GAME (4).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToUsserIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToUsserIn1ActionPerformed

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
            java.util.logging.Logger.getLogger(BerhasilTangkapMonsterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BerhasilTangkapMonsterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BerhasilTangkapMonsterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BerhasilTangkapMonsterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        BerhasilTangkapMonsterGui Interface = new BerhasilTangkapMonsterGui();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BerhasilTangkapMonsterGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ToUsserIn1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
