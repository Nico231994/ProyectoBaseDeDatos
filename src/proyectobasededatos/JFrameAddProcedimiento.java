/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Feder
 */
public class JFrameAddProcedimiento extends javax.swing.JFrame {
    private Veterinaria veta;
    private Veterinario veto;
    /**
     * Creates new form JFrameAddDenuncia
     */
    public JFrameAddProcedimiento() {
        initComponents();
    }
    
    public JFrameAddProcedimiento(Veterinaria veta, Veterinario veto) {
        this.veta = veta;
        this.veto = veto;
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

        jLabel8 = new javax.swing.JLabel();
        prod_costo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        prod_descripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fecha_prod = new javax.swing.JTextField();
        chip = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chip_masc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipo_prod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Descripcion*");

        prod_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_costoActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        prod_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_descripcionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("DATOS PROCEDIMIENTO ");

        fecha_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_prodActionPerformed(evt);
            }
        });

        chip.setText("Chip_mascota*");

        tipo.setText("Tipo*");

        jLabel6.setText("Fecha Realizado dd/mm/yyyy*");
        jLabel6.setToolTipText("");

        chip_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chip_mascActionPerformed(evt);
            }
        });

        jLabel7.setText("Costo*");

        tipo_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tipo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chip_masc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(fecha_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prod_costo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prod_descripcion)))))
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chip_masc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(prod_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prod_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prod_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_costoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Procedimiento prod = new Procedimiento(this.chip_masc.getText(), veto.getCi(), veta.getRut(), this.tipo_prod.getText(), Integer.parseInt(this.prod_costo.getText()), this.prod_descripcion.getText(), this.fecha_prod.getText());
            DB_Driver.insertarProcedimiento(prod);
            JOptionPane.showMessageDialog(null, "Procedimiento agregado correctamente.");
            this.dispose();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameAddProcedimiento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "El costo se encuentra en un formato incorrecto.", "Costo incorrecto", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(JFrameAddProcedimiento.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Alguno de los datos es incorrecto.", "Informacion incorrecta", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void prod_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_descripcionActionPerformed

    private void fecha_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_prodActionPerformed

    private void chip_mascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chip_mascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chip_mascActionPerformed

    private void tipo_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_prodActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAddProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAddProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAddProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAddProcedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAddProcedimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chip;
    private javax.swing.JTextField chip_masc;
    private javax.swing.JTextField fecha_prod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField prod_costo;
    private javax.swing.JTextField prod_descripcion;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField tipo_prod;
    // End of variables declaration//GEN-END:variables
}
