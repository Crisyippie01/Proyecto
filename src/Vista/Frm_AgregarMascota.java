/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.RegistroMascota;
import Modelo.Mascota;
import javax.swing.JOptionPane;

/**
 *
 * @author CPU
 */
public class Frm_AgregarMascota extends javax.swing.JFrame {

    /**
     * Creates new form Frm_AgregarMascota
     */
    public Frm_AgregarMascota() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtn_registrarMascota = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        jtxt_edad = new javax.swing.JTextField();
        jbtn_retroceder = new javax.swing.JButton();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        jtxt_descripcion = new javax.swing.JTextField();
        jtxt_peso = new javax.swing.JTextField();
        jtxt_usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 246, 150));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Mascota");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setOpaque(true);

        jbtn_registrarMascota.setBackground(new java.awt.Color(248, 82, 68));
        jbtn_registrarMascota.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jbtn_registrarMascota.setText("Registrar Mascota");
        jbtn_registrarMascota.setBorder(new javax.swing.border.MatteBorder(null));
        jbtn_registrarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_registrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registrarMascotaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jlabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel2.setText("Edad");

        jtxt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_edadActionPerformed(evt);
            }
        });

        jbtn_retroceder.setBackground(new java.awt.Color(248, 229, 84));
        jbtn_retroceder.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jbtn_retroceder.setText("Retroceder");
        jbtn_retroceder.setBorder(new javax.swing.border.MatteBorder(null));
        jbtn_retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_retrocederActionPerformed(evt);
            }
        });

        jlabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel3.setText("Peso");

        jlabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel4.setText("Descripcion");

        jlabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel5.setText("Usuario");

        jtxt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_descripcionActionPerformed(evt);
            }
        });

        jtxt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_pesoActionPerformed(evt);
            }
        });

        jtxt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jtxt_edad)
                            .addComponent(jtxt_descripcion)
                            .addComponent(jtxt_peso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxt_usuario))
                        .addGap(158, 158, 158))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jlabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jlabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jlabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jlabel5)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtn_registrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtn_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel2)
                    .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel4)
                    .addComponent(jtxt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel3)
                    .addComponent(jtxt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel5)
                    .addComponent(jtxt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jbtn_registrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_registrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registrarMascotaActionPerformed

        // Capturar los datos del registro
        int edad = Integer.parseInt(this.jtxt_edad.getText().trim());
        double peso = Double.parseDouble(this.jtxt_peso.getText().trim());
        String nombre = this.jtxt_nombre.getText().trim();
        String descripcion = this.jtxt_descripcion.getText().trim();
        String usuario = this.jtxt_usuario.getText().trim();
        

        // Crear un objeto Cliente
        Mascota mascota = new Mascota(edad, edad, peso, nombre, descripcion, usuario);

        // Crear un objeto RegistroCliente
        RegistroMascota registro = new RegistroMascota();
        // Ingreso de Cliente
        if (registro.agregar(mascota)) {
            JOptionPane.showMessageDialog(null, "Se ha registrado la mascota " + nombre, "Guardando",1);
        }
        else {
            JOptionPane.showMessageDialog(null, "Hubo un error en el registro de " + usuario, "No guardado",1 );
        }
    }//GEN-LAST:event_jbtn_registrarMascotaActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jtxt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_edadActionPerformed

    private void jbtn_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_retrocederActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_retrocederActionPerformed

    private void jtxt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_descripcionActionPerformed

    private void jtxt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_pesoActionPerformed

    private void jtxt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_AgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_AgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_AgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_AgregarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_AgregarMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_registrarMascota;
    private javax.swing.JButton jbtn_retroceder;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JTextField jtxt_descripcion;
    private javax.swing.JTextField jtxt_edad;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_peso;
    private javax.swing.JTextField jtxt_usuario;
    // End of variables declaration//GEN-END:variables
}