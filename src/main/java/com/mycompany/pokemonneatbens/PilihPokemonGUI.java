/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemonneatbens;

import javax.swing.ImageIcon;

/**
 *
 * @author aditya wirz
 */
public class PilihPokemonGUI extends javax.swing.JFrame {
    public Dunia dunia;
    public Player player;
    ImageIcon Agoni = new ImageIcon("Agoni.png");
    ImageIcon Trachy = new ImageIcon("Trachy.png");
    ImageIcon Fotia = new ImageIcon("Fotia.png");
    ImageIcon Megali = new ImageIcon("Megali.png");
    ImageIcon Krya = new ImageIcon("Krya.png");
    ImageIcon Pagomenos = new ImageIcon("Pagomenos.png");
    ImageIcon Naida = new ImageIcon("Naida.png");
    ImageIcon Irupe = new ImageIcon("Irupe.png");
    ImageIcon Anemos = new ImageIcon("Anemos.png");
    ImageIcon Ishchyroi = new ImageIcon("Ishchyroi.png");

    public PilihPokemonGUI(){
        initComponents();
    }
    /**
     * Creates new form UsserInterface
     */
    public PilihPokemonGUI(Dunia dunia, Player player) {
        //test1
        initComponents();
        this.dunia = dunia;
        this.player = player;
        if(player.playerMonster.get(0).name.equals("Agoni")){
            jLabel2.setIcon(Agoni);
        }
        if(player.playerMonster.get(0).name.equals("Trachy")){
            jLabel2.setIcon(Trachy);
        }
        if(player.playerMonster.get(0).name.equals("Fotia")){
            jLabel2.setIcon(Fotia);
        }
        if(player.playerMonster.get(0).name.equals("Megali")){
            jLabel2.setIcon(Megali);
        }
        if(player.playerMonster.get(0).name.equals("Krya")){
            jLabel2.setIcon(Krya);
        }
        if(player.playerMonster.get(0).name.equals("Pagomenos")){
            jLabel2.setIcon(Pagomenos);
        }
        if(player.playerMonster.get(0).name.equals("Naida")){
            jLabel2.setIcon(Naida);
        }
        if(player.playerMonster.get(0).name.equals("Irupe")){
            jLabel2.setIcon(Irupe);
        }
        if(player.playerMonster.get(0).name.equals("Anemos")){
            jLabel2.setIcon(Anemos);
        }
        if(player.playerMonster.get(0).name.equals("Ishchyroi")){
            jLabel2.setIcon(Ishchyroi);
        }
        //asdtgae
        if(player.playerMonster.size() >= 2){
            if(player.playerMonster.get(1).name.equals("Agoni")){
                jLabel3.setIcon(Agoni);
            }
            if(player.playerMonster.get(1).name.equals("Trachy")){
                jLabel3.setIcon(Trachy);
            }
            if(player.playerMonster.get(1).name.equals("Fotia")){
                jLabel3.setIcon(Fotia);
            }
            if(player.playerMonster.get(1).name.equals("Megali")){
                jLabel3.setIcon(Megali);
            }
            if(player.playerMonster.get(1).name.equals("Krya")){
                jLabel3.setIcon(Krya);
            }
            if(player.playerMonster.get(1).name.equals("Pagomenos")){
                jLabel3.setIcon(Pagomenos);
            }
            if(player.playerMonster.get(1).name.equals("Naida")){
                jLabel3.setIcon(Naida);
            }
            if(player.playerMonster.get(1).name.equals("Irupe")){
                jLabel3.setIcon(Irupe);
            }
            if(player.playerMonster.get(1).name.equals("Anemos")){
                jLabel3.setIcon(Anemos);
            }
            if(player.playerMonster.get(1).name.equals("Ishchyroi")){
                jLabel3.setIcon(Ishchyroi);
            }
        }
        if(player.playerMonster.size() >= 3){
            if(player.playerMonster.get(2).name.equals("Agoni")){
                jLabel4.setIcon(Agoni);
            }
            if(player.playerMonster.get(2).name.equals("Trachy")){
                jLabel4.setIcon(Trachy);
            }
            if(player.playerMonster.get(2).name.equals("Fotia")){
                jLabel4.setIcon(Fotia);
            }
            if(player.playerMonster.get(2).name.equals("Megali")){
                jLabel4.setIcon(Megali);
            }
            if(player.playerMonster.get(2).name.equals("Krya")){
                jLabel4.setIcon(Krya);
            }
            if(player.playerMonster.get(2).name.equals("Pagomenos")){
                jLabel4.setIcon(Pagomenos);
            }
            if(player.playerMonster.get(2).name.equals("Naida")){
                jLabel4.setIcon(Naida);
            }
            if(player.playerMonster.get(2).name.equals("Irupe")){
                jLabel4.setIcon(Irupe);
            }
            if(player.playerMonster.get(2).name.equals("Anemos")){
                jLabel4.setIcon(Anemos);
            }
            if(player.playerMonster.get(2).name.equals("Ishchyroi")){
                jLabel4.setIcon(Ishchyroi);
            }
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

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/ItemWaktuPerang/46.png"))); // NOI18N
        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 860, 260, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/PilihPokemon/1.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, 180, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/PilihPokemon/3.png"))); // NOI18N
        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 180, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/PilihPokemon/2.png"))); // NOI18N
        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 180, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 220, 240));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 220, 240));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 220, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 100)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/PilihPokemon/47.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //pokemon3
        if(player.playerMonster.size() >= 3){
            TempatWar war = new TempatWar(player, dunia, 2);
            war.setVisible(true);
            setVisible(false); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DungeonGUI dungeon = new DungeonGUI(dunia, player);
        setVisible(false);
        dungeon.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here
        //pokemon1
        TempatWar war = new TempatWar(player, dunia, 0);
        war.setVisible(true);
        setVisible(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //pokemon2
        if(player.playerMonster.size() >= 2){
            TempatWar war = new TempatWar(player, dunia, 1);
            war.setVisible(true);
            setVisible(false); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PilihPokemonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihPokemonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihPokemonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihPokemonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        PilihPokemonGUI Interface = new PilihPokemonGUI();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihPokemonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
