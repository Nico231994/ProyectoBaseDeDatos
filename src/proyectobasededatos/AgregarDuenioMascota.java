/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

/**
 *
 * @author NicoPlaceres
 */
public class AgregarDuenioMascota extends javax.swing.JFrame {

    /**
     * Creates new form AgregarDuenioMascota
     */
    public AgregarDuenioMascota() {
        initComponents();
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        JTextDuenioNomb = new javax.swing.JTextField();
        JTextDuenioApell = new javax.swing.JTextField();
        JTextDuenioCI = new javax.swing.JTextField();
        JTextDuenioEmail = new javax.swing.JTextField();
        JTextDuenioCelular = new javax.swing.JTextField();
        JTextDuenioFechaNac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTextMascotaNombre = new javax.swing.JTextField();
        JTextMascotaPeso = new javax.swing.JTextField();
        JTextNumeroChip = new javax.swing.JTextField();
        JTextMascotaEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JBottonGuardarMascDuen = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Telugu Sangam MN", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Dueño y Mascota ");

        JTextDuenioNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuenioNombActionPerformed(evt);
            }
        });

        JTextDuenioApell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuenioApellActionPerformed(evt);
            }
        });

        JTextDuenioCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuenioCIActionPerformed(evt);
            }
        });

        JTextDuenioEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuenioEmailActionPerformed(evt);
            }
        });

        JTextDuenioCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuenioCelularActionPerformed(evt);
            }
        });

        JTextDuenioFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuenioFechaNacActionPerformed(evt);
            }
        });

        jLabel2.setText("DATOS DEL DUEÑO:");

        jLabel3.setText("Nombre*");

        jLabel4.setText("CI*");

        jLabel5.setText("Apellido*");

        jLabel6.setText("Fecha Nacimiento dd/mm/yyyy");

        jLabel7.setText("Email*");

        jLabel8.setText("Celular*");

        JTextMascotaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextMascotaNombreActionPerformed(evt);
            }
        });

        JTextMascotaPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextMascotaPesoActionPerformed(evt);
            }
        });

        JTextNumeroChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNumeroChipActionPerformed(evt);
            }
        });

        JTextMascotaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextMascotaEdadActionPerformed(evt);
            }
        });

        jLabel9.setText("DATOS DEL MASCOTA:");

        jLabel10.setText("Numero CHIP*");

        jLabel11.setText("Nombre*");

        jLabel12.setText("Peso*");

        jLabel14.setText("Edad*");

        JBottonGuardarMascDuen.setText("Guardar");
        JBottonGuardarMascDuen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBottonGuardarMascDuenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTextDuenioApell, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextDuenioNomb, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextDuenioCI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextDuenioCelular)
                            .addComponent(JTextDuenioEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JTextDuenioFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTextMascotaNombre)
                                            .addComponent(JTextNumeroChip)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(JTextMascotaPeso))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JBottonGuardarMascDuen)
                                                .addGap(0, 17, Short.MAX_VALUE))
                                            .addComponent(JTextMascotaEdad)))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextNumeroChip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextMascotaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextMascotaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextMascotaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDuenioCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDuenioNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDuenioApell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTextDuenioFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDuenioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextDuenioCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(JBottonGuardarMascDuen))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextDuenioNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuenioNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuenioNombActionPerformed

    private void JTextDuenioApellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuenioApellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuenioApellActionPerformed

    private void JTextDuenioCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuenioCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuenioCIActionPerformed

    private void JTextDuenioEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuenioEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuenioEmailActionPerformed

    private void JTextDuenioCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuenioCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuenioCelularActionPerformed

    private void JTextDuenioFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuenioFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuenioFechaNacActionPerformed

    private void JTextMascotaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextMascotaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextMascotaNombreActionPerformed

    private void JTextMascotaPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextMascotaPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextMascotaPesoActionPerformed

    private void JTextNumeroChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNumeroChipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNumeroChipActionPerformed

    private void JTextMascotaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextMascotaEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextMascotaEdadActionPerformed

    private void JBottonGuardarMascDuenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBottonGuardarMascDuenActionPerformed
        // Se crea el dueno y la mascota. se obtienen los datos del dueno y de la mascota. 
        //Datos del dueno
        String nombreDue = JTextDuenioNomb.getText();
        String apellido = JTextDuenioApell.getText();
        String ci = JTextDuenioCI.getText();
        String fecha_nac = JTextDuenioFechaNac.getText();
        String email = JTextDuenioEmail.getText();
        String celular = JTextDuenioCelular.getText();
        //Datos de la Mascota
        String num_chip = JTextNumeroChip.getText();
        String nombreMascota = JTextMascotaNombre.getText();
        double pesoMascota=Double.parseDouble(JTextMascotaPeso.getText());
        int edadMascota = Integer.parseInt(JTextMascotaEdad.getText());
        
        
        
        
    }//GEN-LAST:event_JBottonGuardarMascDuenActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarDuenioMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDuenioMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDuenioMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDuenioMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDuenioMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBottonGuardarMascDuen;
    private javax.swing.JTextField JTextDuenioApell;
    private javax.swing.JTextField JTextDuenioCI;
    private javax.swing.JTextField JTextDuenioCelular;
    private javax.swing.JTextField JTextDuenioEmail;
    private javax.swing.JTextField JTextDuenioFechaNac;
    private javax.swing.JTextField JTextDuenioNomb;
    private javax.swing.JTextField JTextMascotaEdad;
    private javax.swing.JTextField JTextMascotaNombre;
    private javax.swing.JTextField JTextMascotaPeso;
    private javax.swing.JTextField JTextNumeroChip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
