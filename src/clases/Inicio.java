/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setTitle("Inicio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MCA = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MCM = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MEA = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MEM = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MRC = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MRE = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MAA = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MOL = new javax.swing.JMenuItem();
        MOS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Clientes");

        MCA.setText("Acciones");
        MCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCAActionPerformed(evt);
            }
        });
        jMenu1.add(MCA);
        jMenu1.add(jSeparator1);

        MCM.setText("Mostrar");
        MCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCMActionPerformed(evt);
            }
        });
        jMenu1.add(MCM);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Empleados");

        MEA.setText("Acciones");
        MEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEAActionPerformed(evt);
            }
        });
        jMenu3.add(MEA);
        jMenu3.add(jSeparator2);

        MEM.setText("Mostrar");
        MEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEMActionPerformed(evt);
            }
        });
        jMenu3.add(MEM);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        MRC.setText("Clientes");
        MRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRCActionPerformed(evt);
            }
        });
        jMenu4.add(MRC);
        jMenu4.add(jSeparator3);

        MRE.setText("Empleados");
        MRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MREActionPerformed(evt);
            }
        });
        jMenu4.add(MRE);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ayuda");

        MAA.setText("Acerca de ...");
        MAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAAActionPerformed(evt);
            }
        });
        jMenu5.add(MAA);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Opciones");

        MOL.setText("Login");
        MOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOLActionPerformed(evt);
            }
        });
        jMenu6.add(MOL);

        MOS.setText("Salir");
        MOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSActionPerformed(evt);
            }
        });
        jMenu6.add(MOS);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Reportes empleados
    private void MREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MREActionPerformed
        // TODO add your handling code here:
        Rempleados rempleados = new Rempleados();
        rempleados.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MREActionPerformed
    //Acerca de ...
    private void MAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAAActionPerformed
        // TODO add your handling code here:
        Acerca acerca = new Acerca(this, rootPaneCheckingEnabled);
        acerca.setVisible(true);
    }//GEN-LAST:event_MAAActionPerformed
     //Salie
    private void MOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MOSActionPerformed
    //Clientes-Acciones
    private void MCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCAActionPerformed
        // TODO add your handling code here:
        clientes clientes = new clientes();
        clientes.toFront();
        clientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MCAActionPerformed
    //Loggin
    private void MOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOLActionPerformed
        // TODO add your handling code here:
        Acceso acceso = new Acceso();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MOLActionPerformed
    //Mostrar clientes
    private void MCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCMActionPerformed
        // TODO add your handling code here:
        Mclientes mclientes = new Mclientes();
        mclientes.toFront();
        mclientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MCMActionPerformed
    //Empleados
    private void MEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEAActionPerformed
        // TODO add your handling code here:
        Empleados empleados = new Empleados();
        empleados.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_MEAActionPerformed
    //Mostrar empleados
    private void MEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEMActionPerformed
        // TODO add your handling code here:
        Mempleados mempleados = new Mempleados();
        mempleados.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MEMActionPerformed
//Reportes Clientes
    private void MRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRCActionPerformed
        // TODO add your handling code here:
        Rclientes rclientes = new Rclientes();
        rclientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MRCActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MAA;
    private javax.swing.JMenuItem MCA;
    private javax.swing.JMenuItem MCM;
    private javax.swing.JMenuItem MEA;
    private javax.swing.JMenuItem MEM;
    private javax.swing.JMenuItem MOL;
    private javax.swing.JMenuItem MOS;
    private javax.swing.JMenuItem MRC;
    private javax.swing.JMenuItem MRE;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
