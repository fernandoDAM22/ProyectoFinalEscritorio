/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.kitfox.svg.A;
import controlador.controlPartida.ConsultasPartida;
import controlador.controlPartida.GestionPartida;
import controlador.controlPartida.PartidaModoLibre;
import controlador.herramientas.TipoPartida;
import controlador.usuario.ConfiguracionUsuario;
import controlador.usuario.GestionUsuarios;
import modelo.Partida;
import vista.administrador.VentanaAdministrarCategorias;
import vista.administrador.VentanaAdministrarCuestionarios;
import vista.administrador.VentanaAdministrarPreguntas;

import javax.swing.*;

/**
 * @author fernando
 */
public class VentanaJugar extends javax.swing.JFrame {
    private TipoPartida tipoPartida;
    private PartidaModoLibre partidaModoLibre;
    private Partida partida;
    private boolean bandera;
    private boolean fin;
    private int idPregunta;

    /**
     * Creates new form VentanaJugar
     */
    public VentanaJugar() {
        initComponents();
    }

    public VentanaJugar(TipoPartida tipoPartida) {
        this.tipoPartida = tipoPartida;
        bandera = true;
        fin = false;
        initComponents();
        jugar();
    }

    /**
     * Este metodo permite iniciar una partida
     *
     * @author Fernando
     */
    private void jugar() {
        switch (tipoPartida) {
            case MODO_LIBRE -> jugarModoLibre();
            case MODO_SIN_FALLOS -> jugarModoSinFallos();
            case MODO_CLASICO -> jugarModoClasico();
            case CUESTIONARIOS -> jugarCuestionarios();
        }
    }

    /**
     * Este metodo permite jugar una partida en modo libre
     *
     * @author Fernando
     */
    private void jugarModoLibre() {
        int idPartida = GestionPartida.obtenerId();
        int idUsuario = GestionUsuarios.obtenerIdUsuario(ConfiguracionUsuario.getNombreUsuario());
        if (idPartida == -1 || idUsuario == -1) {
            return;
        }
        partida = new Partida(idPartida, tipoPartida.toString(), idUsuario);
        partidaModoLibre = new PartidaModoLibre(partida,btnOpcion1,btnOpcion2,btnOpcion3,btnOpcion4,labelPregunta);
        idPregunta = partidaModoLibre.ciclo();
    }





    private void jugarCuestionarios() {
    }

    private void jugarModoClasico() {
    }

    private void jugarModoSinFallos() {
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelInformacion = new javax.swing.JPanel();
        panelControles = new javax.swing.JPanel();
        labelRespuestasIncorrectas = new javax.swing.JLabel();
        labelRespuestasCorrectas = new javax.swing.JLabel();
        panelPregunta = new javax.swing.JPanel();
        labelPregunta = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnOpcion1 = new javax.swing.JButton();
        btnOpcion2 = new javax.swing.JButton();
        btnOpcion3 = new javax.swing.JButton();
        btnOpcion4 = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        barraMenu6 = new javax.swing.JMenuBar();
        menuUsuario6 = new javax.swing.JMenu();
        opcionModoJuego6 = new javax.swing.JMenuItem();
        menuAdministrador = new javax.swing.JMenu();
        opcionPreguntas = new javax.swing.JMenuItem();
        opcionCuestionarios = new javax.swing.JMenuItem();
        opcionCategorias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        panelPrincipal.setLayout(new java.awt.GridLayout(4, 1));

        panelInformacion.setPreferredSize(new java.awt.Dimension(1000, 10));
        panelInformacion.setLayout(new java.awt.BorderLayout());


        labelRespuestasIncorrectas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelRespuestasIncorrectas.setForeground(new Color(238, 82, 83));
        labelRespuestasIncorrectas.setText("Respuestas Incorrectas: ");
        labelRespuestasIncorrectas.setPreferredSize(new java.awt.Dimension(220, 0));
        panelInformacion.add(labelRespuestasIncorrectas, java.awt.BorderLayout.LINE_START);

        labelRespuestasCorrectas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelRespuestasCorrectas.setForeground(new Color(29, 209, 161));
        labelRespuestasCorrectas.setText("Respuestas Correctas: ");
        labelRespuestasCorrectas.setPreferredSize(new java.awt.Dimension(220, 0));
        panelInformacion.add(labelRespuestasCorrectas, java.awt.BorderLayout.LINE_END);

        panelPrincipal.add(panelInformacion);

        labelPregunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPregunta.setText("Aqui va el texto de la pregunta");
        labelPregunta.setPreferredSize(new java.awt.Dimension(1000, 50));
        panelPregunta.add(labelPregunta);

        panelPrincipal.add(panelPregunta);

        btnOpcion1.setBackground(new Color(72, 219, 251));
        btnOpcion1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpcion1.setForeground(new Color(0, 0, 0));
        btnOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion1.setPreferredSize(new java.awt.Dimension(220, 50));
        btnOpcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                responder(evt);
            }
        });
        panelOpciones.add(btnOpcion1);

        btnOpcion2.setBackground(new Color(72, 219, 251));
        btnOpcion2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpcion2.setForeground(new Color(0, 0, 0));
        btnOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion2.setPreferredSize(new java.awt.Dimension(220, 50));
        btnOpcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                responder(evt);
            }
        });
        panelOpciones.add(btnOpcion2);

        btnOpcion3.setBackground(new Color(72, 219, 251));
        btnOpcion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpcion3.setForeground(new Color(0, 0, 0));
        btnOpcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion3.setPreferredSize(new java.awt.Dimension(220, 50));
        btnOpcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                responder(evt);
            }
        });
        panelOpciones.add(btnOpcion3);

        btnOpcion4.setBackground(new Color(72, 219, 251));
        btnOpcion4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpcion4.setForeground(new Color(0, 0, 0));
        btnOpcion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion4.setPreferredSize(new java.awt.Dimension(220, 50));
        btnOpcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                responder(evt);
            }
        });
        panelOpciones.add(btnOpcion4);

        panelPrincipal.add(panelOpciones);

        panelControles.setLayout(new java.awt.FlowLayout());

        btnFinalizar.setBackground(new Color(238, 82, 83));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new Color(0, 0, 0));
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setPreferredSize(new java.awt.Dimension(220, 50));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnFinalizarActionListener(evt);
            }
        });

        panelControles.add(btnFinalizar);

        panelControles.setLayout(new java.awt.FlowLayout());
        btnSiguiente.setBackground(new Color(29, 209, 161));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSiguiente.setForeground(new Color(0, 0, 0));
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.setPreferredSize(new java.awt.Dimension(220, 50));
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnSiguienteActionListener(evt);
            }
        });
        btnSiguiente.setText("Siguiente");

        panelControles.add(btnSiguiente);

        panelPrincipal.add(panelControles);


        menuUsuario6.setText("Usuario");

        opcionModoJuego6.setText("Seleccionar Modo de juego");
        opcionModoJuego6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModoJuego6ActionPerformed(evt);
            }
        });
        menuUsuario6.add(opcionModoJuego6);

        barraMenu6.add(menuUsuario6);

        menuAdministrador.setText("Administrador");

        opcionPreguntas.setText("Preguntas");
        opcionPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPreguntasActionPerformed(evt);
            }
        });
        menuAdministrador.add(opcionPreguntas);

        opcionCuestionarios.setText("Cuestionarios");
        opcionCuestionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCuestionariosActionPerformed(evt);
            }
        });
        menuAdministrador.add(opcionCuestionarios);

        opcionCategorias.setText("Categorias");
        opcionCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCategoriasActionPerformed(evt);
            }
        });
        menuAdministrador.add(opcionCategorias);

        barraMenu6.add(menuAdministrador);

        setJMenuBar(barraMenu6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionListener(ActionEvent evt) {
        if (JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres realizar la accion?", "¿Estas seguro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            colocarPuntuacion();
            VentanaResultado frame = new VentanaResultado();
            frame.setVisible(true);
            dispose();
        }
    }

    private void colocarPuntuacion() {
        int puntuacion;
        switch (tipoPartida){
            case MODO_LIBRE:
                puntuacion = partidaModoLibre.getContadorPreguntasCorrectas();
                ConsultasPartida.establecerPuntuacion(partida.getId(),puntuacion);
                break;
        }
    }

    private void btnSiguienteActionListener(ActionEvent evt) {
        switch (tipoPartida){
            case MODO_LIBRE:
                if (!partidaModoLibre.fin()) {
                    bandera = true;
                    idPregunta = partidaModoLibre.ciclo();
                }
                break;
        }
    }

    private void responder(ActionEvent evt) {
        switch (tipoPartida){
            case MODO_LIBRE -> responderModoLibre(evt);
        }
    }
    private void responderModoLibre(ActionEvent evt){
        if (bandera) {
            JButton button = (JButton) evt.getSource();
            boolean acertada = partidaModoLibre.responder(button);
            bandera = false;
            labelRespuestasCorrectas.setText("Respuestas correctas: " + partidaModoLibre.getContadorPreguntasCorrectas());
            labelRespuestasIncorrectas.setText("Respuestas incorrectas " + partidaModoLibre.getContadorRespuestasIncorrectas());
            ConsultasPartida.insertarPregunta(partida.getId(),idPregunta,acertada);
        }
    }

    private void opcionModoJuego6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModoJuego6ActionPerformed
        VentanaSeleccionarModoJuego ventana = new VentanaSeleccionarModoJuego();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_opcionModoJuego6ActionPerformed

    private void opcionPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPreguntasActionPerformed
        VentanaAdministrarPreguntas ventana = new VentanaAdministrarPreguntas();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_opcionPreguntasActionPerformed

    private void opcionCuestionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCuestionariosActionPerformed
        VentanaAdministrarCuestionarios ventana = new VentanaAdministrarCuestionarios();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_opcionCuestionariosActionPerformed

    private void opcionCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCategoriasActionPerformed
        VentanaAdministrarCategorias ventana = new VentanaAdministrarCategorias();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_opcionCategoriasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu6;
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JButton btnOpcion4;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnFinalizar;

    private javax.swing.JLabel labelPregunta;
    private javax.swing.JLabel labelRespuestasCorrectas;
    private javax.swing.JLabel labelRespuestasIncorrectas;
    private javax.swing.JMenu menuAdministrador;
    private javax.swing.JMenu menuUsuario6;
    private javax.swing.JMenuItem opcionCategorias;
    private javax.swing.JMenuItem opcionCuestionarios;
    private javax.swing.JMenuItem opcionModoJuego6;
    private javax.swing.JMenuItem opcionPreguntas;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPregunta;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
