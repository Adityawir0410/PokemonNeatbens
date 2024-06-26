/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pokemonneatbens;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author aditya wirz
 */
public class TempatWar extends javax.swing.JFrame {
    Player player;
    Dunia dunia;
    int monsterPlayer;
    Monster wildMonster;
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

    /**
     * Creates new form UsserInterface
     */
    public TempatWar(Player player, Dunia dunia, int index){
        initComponents();
        this.player = player;
        this.dunia = dunia;
        this.monsterPlayer = index; 
        jLabel6.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        this.wildMonster = ((Dungeon)(dunia)).generateWildMonsters(player);
        jLabel4.setText(Integer.toString(player.playerMonster.get(index).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
        if(player.playerMonster.get(index).name.equals("Agoni")){           
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
        }
        if(player.playerMonster.get(index).name.equals("Trachy")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Fotia")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Megali")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Krya")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Pagomenos")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Naida")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Irupe")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Anemos")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }
        if(player.playerMonster.get(index).name.equals("Ishchyroi")){
            jLabel2.setIcon(new MirrorImageIcon(player.playerMonster.get(index).name + ".png"));
            jLabel7.setText(player.playerMonster.get(index).name + " " + Integer.toString(player.playerMonster.get(index).level));
        }

        if(wildMonster.name.equals("Agoni")){
            jLabel3.setIcon(Agoni);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Trachy")){
            jLabel3.setIcon(Trachy);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Fotia")){
            jLabel3.setIcon(Fotia);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Megali")){
            jLabel3.setIcon(Megali);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Krya")){
            jLabel3.setIcon(Krya);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Pagomenos")){
            jLabel3.setIcon(Pagomenos);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Naida")){
            jLabel3.setIcon(Naida);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Irupe")){
            jLabel3.setIcon(Irupe);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Anemos")){
            jLabel3.setIcon(Anemos);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
        if(wildMonster.name.equals("Ishchyroi")){
            jLabel3.setIcon(Ishchyroi);
            jLabel8.setText(wildMonster.name + " " + Integer.toString(wildMonster.level));
        }
    }
    public TempatWar() {
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
        ToUsserIn3 = new javax.swing.JButton();
        ToUsserIn4 = new javax.swing.JButton();
        ToUsserIn5 = new javax.swing.JButton();
        ToUsserIn6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToUsserIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/TempatWar/special.png"))); // NOI18N
        ToUsserIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn2ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 820, 300, 70));

        ToUsserIn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/TempatWar/basic attack.png"))); // NOI18N
        ToUsserIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn3ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 820, 300, 70));

        ToUsserIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/TempatWar/item.png"))); // NOI18N
        ToUsserIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn4ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 910, 300, 70));

        ToUsserIn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/TempatWar/27.png"))); // NOI18N
        ToUsserIn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn5ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 910, 300, 70));

        ToUsserIn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/TempatWar/elemental.png"))); // NOI18N
        ToUsserIn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToUsserIn6ActionPerformed(evt);
            }
        });
        getContentPane().add(ToUsserIn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 820, 300, 70));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 940, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, 570, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 130, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 260, 250));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 260, 250));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 230, 280));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 230, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SRC/TempatWar/Lobby.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToUsserIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn2ActionPerformed
        // TODO add your handling code here:
        int healthAwalPlayer = player.playerMonster.get(monsterPlayer).hp;
        int healthAwalMusuh = wildMonster.hp;
        ((Dungeon)(dunia)).playerDoingSpecialAttack(player, wildMonster, monsterPlayer);
        jLabel4.setText(Integer.toString(player.playerMonster.get(monsterPlayer).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
        DungeonGUI dungeon = new DungeonGUI(dunia, player);
        YouLoose kalah = new YouLoose(dunia, player);
        int damageMusuh = healthAwalPlayer - player.playerMonster.get(monsterPlayer).hp;
        int damagePlayer = healthAwalMusuh - wildMonster.hp;
        jLabel6.setText("Player Melakukan " + Integer.toString(damagePlayer) + " Musuh Melakukan " + damageMusuh);
        if (player.playerMonster.get(monsterPlayer).hp <= 0) {
            jLabel6.setText("Monster Anda kalah dalam pertarungan!");
            jLabel6.setText("Kamu Kalah");
            kalah.setVisible(true);
            setVisible(false);
        }  else if(wildMonster.getHp() <= 0){
            jLabel6.setText("Selamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            jLabel6.setText(player.playerMonster.get(monsterPlayer).getName() + " mendapatkan " + epGained + " EP.");
            dungeon.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_ToUsserIn2ActionPerformed

    public void setHp(){
        jLabel4.setText(Integer.toString(player.playerMonster.get(monsterPlayer).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
    }

    private void ToUsserIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn3ActionPerformed
        // TODO add your handling code here:
        int healthAwalPlayer = player.playerMonster.get(monsterPlayer).hp;
        int healthAwalMusuh = wildMonster.hp;
        ((Dungeon)(dunia)).playerDoingBasicAttack(player, wildMonster, monsterPlayer);
        jLabel4.setText(Integer.toString(player.playerMonster.get(monsterPlayer).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
        DungeonGUI dungeon = new DungeonGUI(dunia, player);
        YouLoose kalah = new YouLoose(dunia, player);
        int damageMusuh = healthAwalPlayer - player.playerMonster.get(monsterPlayer).hp;
        int damagePlayer = healthAwalMusuh - wildMonster.hp;
        jLabel6.setText("Player Melakukan " + Integer.toString(damagePlayer) + " Musuh Melakukan " + damageMusuh);
        if (player.playerMonster.get(monsterPlayer).getHp() <= 0) {
            jLabel6.setText("Monster Anda kalah dalam pertarungan!");
            jLabel6.setText("Kamu Kalah");
            kalah.setVisible(true);
            setVisible(false);
        }  else if(wildMonster.getHp() <= 0){
            jLabel6.setText("Selamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            jLabel6.setText(player.playerMonster.get(monsterPlayer).getName() + " mendapatkan " + epGained + " EP.");
            dungeon.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_ToUsserIn3ActionPerformed

    private void ToUsserIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn4ActionPerformed
        Monster monster = player.playerMonster.get(monsterPlayer);
        LoadGame game = new LoadGame(player,monster,dunia,monsterPlayer,wildMonster);
        game.setVisible(true);
    }//GEN-LAST:event_ToUsserIn4ActionPerformed

    private void ToUsserIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn5ActionPerformed
        // TODO add your handling code here:
        int healthAwalPlayer = player.playerMonster.get(monsterPlayer).hp;
        int healthAwalMusuh = wildMonster.hp;
        DungeonGUI dungeon = new DungeonGUI(dunia, player);
        boolean lari = ((Dungeon)(dunia)).playerRun(player, wildMonster, monsterPlayer);
        jLabel4.setText(Integer.toString(player.playerMonster.get(monsterPlayer).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
        if(lari){
            dungeon.setVisible(true);
            setVisible(false);
        }
        YouLoose kalah = new YouLoose(dunia, player);
        int damageMusuh = healthAwalPlayer - player.playerMonster.get(monsterPlayer).hp;
        int damagePlayer = healthAwalMusuh - wildMonster.hp;
        jLabel6.setText("Player Melakukan " + Integer.toString(damagePlayer) + " Musuh Melakukan " + damageMusuh);
        if (player.playerMonster.get(monsterPlayer).getHp() <= 0) {
            jLabel6.setText("Monster Anda kalah dalam pertarungan!");
            jLabel6.setText("Kamu Kalah");
            kalah.setVisible(true);
            setVisible(false);
        }  else if(wildMonster.getHp() <= 0){
            jLabel6.setText("Selamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            jLabel6.setText(player.playerMonster.get(monsterPlayer).getName() + " mendapatkan " + epGained + " EP.");
            dungeon.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_ToUsserIn5ActionPerformed

    private void ToUsserIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToUsserIn6ActionPerformed
        // TODO add your handling code here:
        int healthAwalPlayer = player.playerMonster.get(monsterPlayer).hp;
        int healthAwalMusuh = wildMonster.hp;
        ((Dungeon)(dunia)).playerDoingElementalAttack(player, wildMonster, monsterPlayer);
        jLabel4.setText(Integer.toString(player.playerMonster.get(monsterPlayer).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
        DungeonGUI dungeon = new DungeonGUI(dunia, player);
        YouLoose kalah = new YouLoose(dunia, player);
        int damageMusuh = healthAwalPlayer - player.playerMonster.get(monsterPlayer).hp;
        int damagePlayer = healthAwalMusuh - wildMonster.hp;
        jLabel6.setText("Player Melakukan " + Integer.toString(damagePlayer) + " Musuh Melakukan " + damageMusuh);
        if (player.playerMonster.get(monsterPlayer).getHp() <= 0) {
            jLabel6.setText("Monster Anda kalah dalam pertarungan!");
            jLabel6.setText("Kamu Kalah");
            kalah.setVisible(true);
            setVisible(false);
        }  else if(wildMonster.getHp() <= 0){
            jLabel6.setText("Selamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            jLabel6.setText(player.playerMonster.get(monsterPlayer).getName() + " mendapatkan " + epGained + " EP.");
            dungeon.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_ToUsserIn6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabel4.setText(Integer.toString(player.playerMonster.get(monsterPlayer).hp));
        jLabel5.setText(Integer.toString(wildMonster.hp));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TempatWar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempatWar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempatWar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempatWar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        TempatWar Interface = new TempatWar();
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempatWar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ToUsserIn2;
    private javax.swing.JButton ToUsserIn3;
    private javax.swing.JButton ToUsserIn4;
    private javax.swing.JButton ToUsserIn5;
    private javax.swing.JButton ToUsserIn6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}

class MirrorImageIcon extends ImageIcon {

    public MirrorImageIcon(String filename) {
        super(filename);
    }

    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.translate(getIconWidth(), 0);
        g2.scale(-1, 1);
        super.paintIcon(c, g2, x, y);
    }

}