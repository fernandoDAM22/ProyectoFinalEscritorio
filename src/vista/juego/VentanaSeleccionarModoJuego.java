/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import controlador.herramientas.Mensajes;
import controlador.herramientas.TipoPartida;
import controlador.usuario.ConfiguracionUsuario;
import vista.acceso.VentanaLogin;
import vista.administrador.VentanaAdministrarCategorias;
import vista.administrador.VentanaAdministrarCuestionarios;
import vista.administrador.VentanaAdministrarPreguntas;
import vista.juego.dialogos.DialogoElegirCuestionario;

import javax.swing.*;

/**
 * @author fernando
 */
public class VentanaSeleccionarModoJuego extends javax.swing.JFrame {
    boolean puedeContinuar = true;

    /**
     * Creates new form VentanaSeleccionarModoJuego
     */
    public VentanaSeleccionarModoJuego() {
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

        grupoBotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        panelBotonesModoJuego = new javax.swing.JPanel();
        btnModoLibre = new javax.swing.JToggleButton();
        btnModoSinFallos = new javax.swing.JToggleButton();
        btnModoClasico = new javax.swing.JToggleButton();
        btnModoCuestionarios = new javax.swing.JToggleButton();
        panelControles = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        panelDescripcion = new javax.swing.JPanel();
        labelDescripcion = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuUsuario6 = new javax.swing.JMenu();
        opcionCerrarSesion = new javax.swing.JMenuItem();
        opcionModoJuego6 = new javax.swing.JMenuItem();
        menuAdministrador = new javax.swing.JMenu();
        opcionPreguntas = new javax.swing.JMenuItem();
        opcionCuestionarios = new javax.swing.JMenuItem();
        opcionCategorias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccionar modo de juego");
        jLabel1.setPreferredSize(new java.awt.Dimension(38, 50));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        panelCentro.setLayout(new java.awt.GridLayout(3, 1));

        panelBotonesModoJuego.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 100));
        btnModoLibre.setBackground(new Color(72, 219, 251));
        grupoBotones.add(btnModoLibre);
        btnModoLibre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModoLibre.setForeground(new Color(0, 0, 0));
        btnModoLibre.setText("Modo Libre");
        btnModoLibre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                colocarDescripcion(evt);
            }
        });
        btnModoLibre.setPreferredSize(new java.awt.Dimension(150, 50));
        panelBotonesModoJuego.add(btnModoLibre);

        btnModoSinFallos.setBackground(new Color(72, 219, 251));
        grupoBotones.add(btnModoSinFallos);
        btnModoSinFallos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModoSinFallos.setForeground(new Color(0, 0, 0));
        btnModoSinFallos.setText("Modo sin fallos");
        btnModoSinFallos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                colocarDescripcion(evt);
            }
        });
        btnModoSinFallos.setPreferredSize(new java.awt.Dimension(150, 50));
        panelBotonesModoJuego.add(btnModoSinFallos);

        btnModoClasico.setBackground(new Color(72, 219, 251));
        grupoBotones.add(btnModoClasico);
        btnModoClasico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModoClasico.setForeground(new Color(0, 0, 0));
        btnModoClasico.setText("Modo Clasico");
        btnModoClasico.setPreferredSize(new java.awt.Dimension(150, 50));
        btnModoClasico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                colocarDescripcion(evt);
            }
        });
        panelBotonesModoJuego.add(btnModoClasico);

        btnModoCuestionarios.setBackground(new Color(72, 219, 251));
        grupoBotones.add(btnModoCuestionarios);
        btnModoCuestionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModoCuestionarios.setForeground(new Color(0, 0, 0));
        btnModoCuestionarios.setText("Cuestionarios");
        btnModoCuestionarios.setPreferredSize(new java.awt.Dimension(150, 50));
        btnModoCuestionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                colocarDescripcion(evt);
            }
        });
        panelBotonesModoJuego.add(btnModoCuestionarios);

        panelCentro.add(panelBotonesModoJuego);

        panelControles.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        btnCancelar.setBackground(new Color(238, 82, 83));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionListener(evt);
            }
        });
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 50));
        panelControles.add(btnCancelar);

        btnJugar.setBackground(new Color(29, 209, 161));
        btnJugar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnJugar.setForeground(new Color(0, 0, 0));
        btnJugar.setText("Jugar");
        btnJugar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnJugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnJugarActionListener(evt);
            }
        });
        panelControles.add(btnJugar);

        panelCentro.add(panelControles);

        panelDescripcion.setLayout(new java.awt.GridLayout(1, 0));

        labelDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelDescripcion.add(labelDescripcion);

        panelCentro.add(panelDescripcion);

        getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

        menuUsuario6.setText("Usuario");

        opcionModoJuego6.setText("Seleccionar Modo de juego");

        opcionModoJuego6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModoJuego6ActionPerformed(evt);
            }
        });
        menuUsuario6.add(opcionModoJuego6);

        barraMenu.add(menuUsuario6);
        opcionCerrarSesion.setText("Cerrar sesion");
        opcionCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                opcionCerrarSesionActionListener(evt);
            }
        });
        menuUsuario6.add(opcionCerrarSesion);

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

        barraMenu.add(menuAdministrador);

        setJMenuBar(barraMenu);
        ConfiguracionUsuario.desactivarMenu(barraMenu, menuAdministrador);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionListener(ActionEvent evt) {
        grupoBotones.clearSelection();
        labelDescripcion.setText("");
    }

    private void colocarDescripcion(ActionEvent evt) {
        JToggleButton button = (JToggleButton) evt.getSource();
        if(button.equals(btnModoLibre)){
            labelDescripcion.setText(Mensajes.DESCRIPCION_MODO_LIBRE);
        }else if(button.equals(btnModoSinFallos)){
            labelDescripcion.setText(Mensajes.DESCRIPCION_MODO_SIN_FALLOS);
        }else if (button.equals(btnModoClasico)){
            labelDescripcion.setText(Mensajes.DESCRIPCION_MODO_CLASICO);
        }else{
            labelDescripcion.setText(Mensajes.DESCRIPCION_CUESTIONARIOS);
        }
    }

    private String seleccionarPartida() {
        ButtonModel modeloBoton = grupoBotones.getSelection();
        JToggleButton botonSeleccionado = null;
        // Iterar a través de todos los botones del grupo
        for (Enumeration<AbstractButton> botones = grupoBotones.getElements(); botones.hasMoreElements(); ) {
            JToggleButton boton = (JToggleButton) botones.nextElement();
            if (boton.getModel() == modeloBoton) {
                // Este es el botón seleccionado
                botonSeleccionado = boton;
                break;
            }
        }
        if (botonSeleccionado != null) {
            return botonSeleccionado.getText();
        } else {
            return null;
        }
    }

    private void btnJugarActionListener(ActionEvent evt) {
        String mensaje = seleccionarPartida();
        TipoPartida tipoPartida = null;
        if (mensaje == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un modo de juego", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            switch (mensaje) {
                case "Modo Libre":
                    tipoPartida = TipoPartida.MODO_LIBRE;
                    break;
                case "Modo sin fallos":
                    tipoPartida = TipoPartida.MODO_SIN_FALLOS;
                    break;
                case "Modo Clasico":
                    tipoPartida = TipoPartida.MODO_CLASICO;
                    break;
                case "Cuestionarios":
                    DialogoElegirCuestionario.mostrarDialogo();
                    boolean elegido = DialogoElegirCuestionario.obtenerEstado();
                    if (!elegido) {
                        return;
                    }
                    tipoPartida = TipoPartida.CUESTIONARIOS;
                    break;
            }
        }
        VentanaJugar frame = new VentanaJugar(tipoPartida);
        frame.setSize(1000, 600);
        frame.setVisible(true);
        dispose();

    }

    private void opcionCerrarSesionActionListener(ActionEvent evt) {
        VentanaLogin frame = new VentanaLogin();
        frame.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(VentanaSeleccionarModoJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSeleccionarModoJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSeleccionarModoJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSeleccionarModoJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSeleccionarModoJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JToggleButton btnModoClasico;
    private javax.swing.JToggleButton btnModoCuestionarios;
    private javax.swing.JToggleButton btnModoLibre;
    private javax.swing.JToggleButton btnModoSinFallos;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JMenu menuAdministrador;
    private javax.swing.JMenu menuUsuario6;
    private javax.swing.JMenuItem opcionCategorias;
    private javax.swing.JMenuItem opcionCuestionarios;
    private javax.swing.JMenuItem opcionModoJuego6;
    private javax.swing.JMenuItem opcionCerrarSesion;
    private javax.swing.JMenuItem opcionPreguntas;
    private javax.swing.JPanel panelBotonesModoJuego;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDescripcion;
    // End of variables declaration//GEN-END:variables
}
