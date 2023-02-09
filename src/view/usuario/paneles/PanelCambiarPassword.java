/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.usuario.paneles;

import controller.tools.Colores;
import controller.tools.ComprobarDatos;
import controller.tools.EventoFoco;
import controller.tools.Mensajes;
import controller.usuario.Codigos;
import controller.usuario.ConfiguracionUsuario;
import controller.usuario.GestionUsuarios;
import controller.usuario.Login;

import javax.swing.*;

/**
 *
 * @author fernando
 */
public class PanelCambiarPassword extends javax.swing.JPanel {



    /**
     * Creates new form PanelCambiarContraseña
     */
    public PanelCambiarPassword() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtNewPassword2 = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        txtOldPassword.addFocusListener(new EventoFoco());
        txtNewPassword.addFocusListener(new EventoFoco());
        txtOldPassword.addFocusListener(new EventoFoco());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Contraseña Antigua");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña nueva");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña nueva 2");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBackground(Colores.COLOR_BOTON_CANCELAR);
        btnCancelar.setForeground(Colores.COLOR_NEGRO);

        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBackground(Colores.COLOR_BOTON_ACEPTAR);
        btnAceptar.setForeground(Colores.COLOR_NEGRO);
        btnAceptar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNewPassword2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtNewPassword)
                            .addComponent(txtOldPassword))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNewPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*
          antes de pasar a realizar la operacion de modificacion comprobamos que los campos no estan vacios,
          de esta forma evitamos que al usuario se le muestren mensajes de error si pulsa el boton accidentalmente
         */
        if(String.valueOf(txtOldPassword.getPassword()).equals("") ||
           String.valueOf(txtNewPassword.getPassword()).equals("") ||
           String.valueOf(txtNewPassword2.getPassword()).equals("")){
            //simplemente, cortamos la ejecucion del metodo
            return;
        }
        //ahora pasamos a realizar todas las comprobaciones necesarias antes de modificiar la contraseña

        if(Login.login(ConfiguracionUsuario.getNombreUsuario(), String.valueOf(txtOldPassword.getPassword())) == Codigos.ERROR_PASSWORD_INCORRECTA){
            //primero se comprueba que la contraseña antigua sea correcta
            JOptionPane.showMessageDialog(this, Mensajes.PASSWORD_INCORRECTA,"Error",JOptionPane.ERROR_MESSAGE);
        }else if(!String.valueOf(txtNewPassword.getPassword()).equals(String.valueOf(txtNewPassword2.getPassword()))){
            //Despues comprobamos que las dos contraseñas nuevas coinciden
            JOptionPane.showMessageDialog(this,Mensajes.ERROR_PASSWORDS,"Error",JOptionPane.ERROR_MESSAGE);
        }else if(!ComprobarDatos.comprobarFormatoPassword(String.valueOf(txtNewPassword.getPassword()))){
            //Aqui se comprueba que el formato de la contraseña es el permitido
            JOptionPane.showMessageDialog(this,Mensajes.ERROR_FORMATO_PASSWORD,"Error",JOptionPane.ERROR_MESSAGE);
        } else if(JOptionPane.showConfirmDialog(null, Mensajes.MENSAJE_CONFIRMACION, "¿Estas seguro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
            if(GestionUsuarios.cambiarPassword(ConfiguracionUsuario.getNombreUsuario(),String.valueOf(txtNewPassword.getPassword()))){
                //aqui se entra en caso de que la contraseña se cambie correctamente
                JOptionPane.showMessageDialog(this, Mensajes.PASSWORD_CAMBIADA,"Error",JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }else{ //aqui se llega en caso de que la contraseña no se cambie
                JOptionPane.showMessageDialog(this, Mensajes.ERROR_CAMBIAR_PASSWORD,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCampos() {
        txtOldPassword.setText("");
        txtNewPassword.setText("");
        txtNewPassword2.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtNewPassword2;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
