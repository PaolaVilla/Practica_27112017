/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista.formularios.internos;

import java.time.Month;
import java.time.MonthDay;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Paola
 */
public class FrmiEjemplosTime extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmiEjemplosTime
     */
    public FrmiEjemplosTime() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEjemplos = new javax.swing.JLabel();
        btnTime = new javax.swing.JButton();

        lblEjemplos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEjemplos.setText("Ejemplos");

        btnTime.setText("Time");
        btnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lblEjemplos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnTime)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEjemplos)
                .addGap(78, 78, 78)
                .addComponent(btnTime)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeActionPerformed
        // TODO add your handling code here:
        MonthDay dia = MonthDay.of(Month.MARCH, 29);
        JOptionPane.showMessageDialog(null,"El día 29 de marzo es válido para el año 2017"+dia+dia.isValidYear(2017));
    }//GEN-LAST:event_btnTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTime;
    private javax.swing.JLabel lblEjemplos;
    // End of variables declaration//GEN-END:variables
}
