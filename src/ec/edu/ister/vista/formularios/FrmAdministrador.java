/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista.formularios;

import ec.edu.ister.vista.formularios.internos.*;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paola
 */
public class FrmAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdministrador
     */
    public FrmAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(FrmAdministrador.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdministrador = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmiLoggin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiRegistrar = new javax.swing.JMenuItem();
        jmiEditar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmiDateUtil = new javax.swing.JMenuItem();
        jmiCalendar = new javax.swing.JMenuItem();
        jmiTime = new javax.swing.JMenuItem();
        jmiDateSQL = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAdministrador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdministrador.setText("Administrador");

        Escritorio.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalir);

        jmiLoggin.setText("Loggin");
        jmiLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogginActionPerformed(evt);
            }
        });
        jMenu1.add(jmiLoggin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");

        jmiRegistrar.setText("Registrar");
        jmiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRegistrar);

        jmiEditar.setText("Editar");
        jmiEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiEditar);

        jmiEliminar.setText("Eliminar");
        jMenu2.add(jmiEliminar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Productos");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jmiDateUtil.setText("Date.util");
        jmiDateUtil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDateUtilActionPerformed(evt);
            }
        });
        jMenu4.add(jmiDateUtil);

        jmiCalendar.setText("Calendar");
        jmiCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCalendarActionPerformed(evt);
            }
        });
        jMenu4.add(jmiCalendar);

        jmiTime.setText("Time");
        jmiTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTimeActionPerformed(evt);
            }
        });
        jMenu4.add(jmiTime);

        jmiDateSQL.setText("Date SQL");
        jmiDateSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDateSQLActionPerformed(evt);
            }
        });
        jMenu4.add(jmiDateSQL);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(lblAdministrador)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogginActionPerformed
        // TODO add your handling code here:
        Loggin loggin = new Loggin();
        loggin.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_jmiLogginActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        
        FrmiRegistrar frmIntRegistrar = new FrmiRegistrar();
        Escritorio.add(frmIntRegistrar);
        frmIntRegistrar.setVisible(true);
        
        try {
            frmIntRegistrar.setMaximum(true);
            frmIntRegistrar.setMaximizable(true);
            frmIntRegistrar.setSelected(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmiRegistrarActionPerformed

    private void jmiEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        
        FrmiEditar frmIntEditar = new FrmiEditar();
        Escritorio.add(frmIntEditar);
        frmIntEditar.setVisible(true);

        try {
            frmIntEditar.setMaximum(true);
            frmIntEditar.setMaximizable(true);
            frmIntEditar.setSelected(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmiEditarActionPerformed

    private void jmiDateUtilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDateUtilActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        
        FrmiDateUtil frmiDateUtil = new FrmiDateUtil();
        Escritorio.add(frmiDateUtil);
        frmiDateUtil.setVisible(true);
        
        try {
            frmiDateUtil.setMaximum(true);
            frmiDateUtil.setMaximizable(true);
            frmiDateUtil.setSelected(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmiDateUtilActionPerformed

    private void jmiCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCalendarActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        
        FrmiCalendar frmiCalendar = new FrmiCalendar();
        Escritorio.add(frmiCalendar);
        frmiCalendar.setVisible(true);
        
        try {
            frmiCalendar.setMaximum(true);
            frmiCalendar.setMaximizable(true);
            frmiCalendar.setSelected(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmiCalendarActionPerformed

    private void jmiTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTimeActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        
        FrmiTime frmiTime = new FrmiTime();
        Escritorio.add(frmiTime);
        frmiTime.setVisible(true);
        
        try {
            frmiTime.setMaximum(true);
            frmiTime.setMaximizable(true);
            frmiTime.setSelected(true);
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jmiTimeActionPerformed

    private void jmiDateSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDateSQLActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        
        FrmiDateSql frmiDateSql = new FrmiDateSql();
        Escritorio.add(frmiDateSql);
        frmiDateSql.setVisible(true);
        
        try {
            frmiDateSql.setMaximum(true);
            frmiDateSql.setMaximizable(true);
            frmiDateSql.setSelected(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmiDateSQLActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//              
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiCalendar;
    private javax.swing.JMenuItem jmiDateSQL;
    private javax.swing.JMenuItem jmiDateUtil;
    private javax.swing.JMenuItem jmiEditar;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiLoggin;
    private javax.swing.JMenuItem jmiRegistrar;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiTime;
    private javax.swing.JLabel lblAdministrador;
    // End of variables declaration//GEN-END:variables
}