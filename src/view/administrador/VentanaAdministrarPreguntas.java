package view.administrador;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import controller.administrador.GestionCategorias;
import controller.administrador.GestionPreguntas;
import controller.baseDeDatos.CopiaDeSeguridad;
import controller.tools.Colores;
import controller.tools.EventoFoco;
import model.Pregunta;
import view.acceso.VentanaLogin;
import view.juego.VentanaSeleccionarModoJuego;
import view.usuario.VentanaAjustesUsuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
/**
 *
 * @author Fernando
 */
public class VentanaAdministrarPreguntas extends javax.swing.JFrame {
    DefaultTableModel modelo;

    /**
     * Creates new form VentanaAdministrarPreguntas
     */
    public VentanaAdministrarPreguntas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        opcionModoJuego = new javax.swing.JMenuItem();
        opcionCerrarSesion = new javax.swing.JMenuItem();
        opcionAjustesUsuario = new javax.swing.JMenuItem();
        menuAdministrador = new javax.swing.JMenu();
        opcionPreguntas = new javax.swing.JMenuItem();
        opcionCuestionarios = new javax.swing.JMenuItem();
        opcionCategorias = new javax.swing.JMenuItem();
        opcionCopiasDeSeguridad = new javax.swing.JMenu();
        opcionImportar = new javax.swing.JMenuItem();
        opcionExportar = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPreguntas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        listaCategorias = new javax.swing.JComboBox<>();
        panelControles = new javax.swing.JPanel();
        panelOperaciones = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        panelDatosPregunta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEnunciado = new javax.swing.JTextField();
        txtRespuestaCorrecta = new javax.swing.JTextField();
        txtRespuestaIncorrecta1 = new javax.swing.JTextField();
        txtRespuestaIncorrecta2 = new javax.swing.JTextField();
        txtRespuestaIncorrecta3 = new javax.swing.JTextField();

        txtEnunciado.addFocusListener(new EventoFoco());
        txtRespuestaCorrecta.addFocusListener(new EventoFoco());
        txtRespuestaIncorrecta1.addFocusListener(new EventoFoco());
        txtRespuestaIncorrecta2.addFocusListener(new EventoFoco());
        txtRespuestaIncorrecta3.addFocusListener(new EventoFoco());

        menuUsuario.setText("Usuario");

        opcionModoJuego.setText("Seleccionar Modo de juego");
        opcionModoJuego.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
        opcionModoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModoJuegoActionPerformed(evt);
            }
        });
        menuUsuario.add(opcionModoJuego);
        opcionCerrarSesion.setText("Cerrar Sesion");
        opcionCerrarSesion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        opcionCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCerrarSesionActionPerformed(evt);
            }
        });
        menuUsuario.add(opcionCerrarSesion);
        opcionAjustesUsuario.setText("Ajustes de usuario");
        opcionAjustesUsuario.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
        opcionAjustesUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                opcionAjustesUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(opcionAjustesUsuario);

        barraMenu.add(menuUsuario);

        menuAdministrador.setText("Administrador");

        opcionPreguntas.setText("Preguntas");
        opcionPreguntas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
        opcionPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPreguntasActionPerformed(evt);
            }
        });
        menuAdministrador.add(opcionPreguntas);

        opcionCuestionarios.setText("Cuestionarios");
        opcionCuestionarios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        opcionCuestionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCuestionariosActionPerformed(evt);
            }
        });
        menuAdministrador.add(opcionCuestionarios);

        opcionCategorias.setText("Categorias");
        opcionCategorias.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
        opcionCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCategoriasActionPerformed(evt);
            }
        });
        menuAdministrador.add(opcionCategorias);  opcionCopiasDeSeguridad.setText("Copias de seguridad");
        opcionImportar.setText("Importar");
        opcionImportar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
        opcionImportar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                opcionImportarActionPerformed(evt);
            }
        });
        opcionExportar.setText("Exportar");
        opcionExportar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
        opcionExportar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                opcionExportarActionPeformed(evt);
            }
        });
        opcionCopiasDeSeguridad.add(opcionImportar);
        opcionCopiasDeSeguridad.add(opcionExportar);
        menuAdministrador.add(opcionCopiasDeSeguridad);




        barraMenu.add(menuAdministrador);


        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelTitulo.setText("Preguntas");
        panelTitulo.add(labelTitulo);

        panelPrincipal.add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        panelContenido.setLayout(new java.awt.BorderLayout());

        tablaPreguntas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Enunciado", "Respuesta Correcta", "Respuesta Incorrecta 1", "Respuesta Incorrecta 2", "Respuesta Incorrecta 3"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPreguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPreguntasMouseClicked(evt);
            }
        });
        tablaPreguntas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaPreguntasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPreguntas);

        panelContenido.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 50));
        listaCategorias.setPreferredSize(new java.awt.Dimension(400, 40));
        listaCategorias.setFont(new java.awt.Font("Segoe UI", 1, 14));
        listaCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaCategoriasItemStateChanged(evt);
            }
        });
        jPanel2.add(listaCategorias);

        panelContenido.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        panelPrincipal.add(panelContenido, java.awt.BorderLayout.CENTER);

        panelControles.setPreferredSize(new java.awt.Dimension(1200, 260));

        panelOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        panelOperaciones.setPreferredSize(new java.awt.Dimension(200, 300));
        panelOperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnModificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnModificar.setBackground(Colores.colorBotonPeligroso());
        btnModificar.setForeground(Color.black);
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelOperaciones.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 40));

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInsertar.setBackground(Colores.colorBotonSeguro());
        btnInsertar.setForeground(Color.black);
        btnInsertar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelOperaciones.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 40));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBorrar.setBackground(Colores.colorBotonPeligroso());
        btnBorrar.setForeground(Color.black);
        btnBorrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        panelOperaciones.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 40));

        panelDatosPregunta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Enunciado");

        jLabel2.setText("Respuesta Correcta");

        jLabel3.setText("Respuesta Incorrecta 1");

        jLabel4.setText("Respuesta Incorrecta 2");

        jLabel5.setText("Respuesta Incorrecta 3");

        javax.swing.GroupLayout panelDatosPreguntaLayout = new javax.swing.GroupLayout(panelDatosPregunta);
        panelDatosPregunta.setLayout(panelDatosPreguntaLayout);
        panelDatosPreguntaLayout.setHorizontalGroup(
                panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosPreguntaLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDatosPreguntaLayout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRespuestaIncorrecta1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelDatosPreguntaLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRespuestaIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelDatosPreguntaLayout.createSequentialGroup()
                                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtRespuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtRespuestaIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelDatosPreguntaLayout.setVerticalGroup(
                panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosPreguntaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtRespuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtRespuestaIncorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtRespuestaIncorrecta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(panelDatosPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtRespuestaIncorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelControlesLayout = new javax.swing.GroupLayout(panelControles);
        panelControles.setLayout(panelControlesLayout);
        panelControlesLayout.setHorizontalGroup(
                panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelControlesLayout.createSequentialGroup()
                                .addComponent(panelDatosPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelControlesLayout.setVerticalGroup(
                panelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelDatosPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelPrincipal.add(panelControles, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        colocarCategorias();
        modelo = (DefaultTableModel) tablaPreguntas.getModel();
        setJMenuBar(barraMenu);
        pack();
    }// </editor-fold>

    private void opcionAjustesUsuarioActionPerformed(ActionEvent evt) {
        VentanaAjustesUsuario frame = new VentanaAjustesUsuario();
        frame.setVisible(true);
        dispose();
    }


    /**
     * Este metodo permite colocar las categorias en la lista desplegable
     *
     * @author Fernando
     */
    public void colocarCategorias() {
        ArrayList<String> nombresCategorias = GestionCategorias.obtenerCategorias();
        for (String s : nombresCategorias) {
            listaCategorias.addItem(s);
        }
    }

    /**
     * Este metodo permite vaciar el modelo de la tabla
     *
     * @author Fernando
     */
    private void vaciarModeloTabla() {
        modelo = (DefaultTableModel) tablaPreguntas.getModel();
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    /**
     * Este metodo permite colocar los datos de una pregunta
     * en sus casillas correspondientes
     *
     * @author Fernando
     */
    private void colocarDatosPregunta() {
        int posicion = tablaPreguntas.getSelectedRow();
        if(posicion >= 0){
            txtEnunciado.setText((String) modelo.getValueAt(posicion,0));
            txtRespuestaCorrecta.setText((String) modelo.getValueAt(posicion,1));
            txtRespuestaIncorrecta1.setText((String) modelo.getValueAt(posicion,2));
            txtRespuestaIncorrecta2.setText((String) modelo.getValueAt(posicion,3));
            txtRespuestaIncorrecta3.setText((String) modelo.getValueAt(posicion,4));
        }
    }

    /**
     * Este metodo permite actualizar las preguntas de la tabla,
     * coloca las preguntas de la categoria seleccionada en la
     * lista desplegable
     *
     * @author Fernando
     */
    private void actualizarTabla() {
        vaciarModeloTabla();
        ArrayList<String[]> datos = GestionPreguntas.obtenerPreguntas(listaCategorias.getSelectedItem().toString());
        for(String[] arr: datos){
            modelo.addRow(arr);
        }
    }

    /**
     * Este metodo permite vaciar las cajas con los datos de la pregunta
     *
     * @author Fernando
     */
    private void vaciarCajas(){
        txtEnunciado.setText("");
        txtRespuestaCorrecta.setText("");
        txtRespuestaIncorrecta1.setText("");
        txtRespuestaIncorrecta2.setText("");
        txtRespuestaIncorrecta3.setText("");
    }
    private void opcionExportarActionPeformed(ActionEvent evt) {
        if(JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres realizar una copia de seguridad?", "¿Estas seguro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) != 0){
            return;
        }
        if(CopiaDeSeguridad.crearCopia()){
            JOptionPane.showMessageDialog(this,"Copia realizada correctamente","Correcto",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,"Error al realizar la copia de seguridad","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void opcionImportarActionPerformed(ActionEvent evt) {

    }


    private void opcionModoJuegoActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaSeleccionarModoJuego ventana = new VentanaSeleccionarModoJuego();
        ventana.setVisible(true);
        dispose();
    }

    private void opcionPreguntasActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaAdministrarPreguntas ventana = new VentanaAdministrarPreguntas();
        ventana.setVisible(true);
        dispose();
    }

    private void opcionCuestionariosActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaAdministrarCuestionarios ventana =  new VentanaAdministrarCuestionarios();
        ventana.setVisible(true);
        dispose();
    }

    private void opcionCategoriasActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaAdministrarCategorias ventana =  new VentanaAdministrarCategorias();
        ventana.setVisible(true);
        dispose();
    }
    private void opcionCerrarSesionActionPerformed(ActionEvent evt) {
        VentanaLogin frame = new VentanaLogin();
        frame.setVisible(true);
        dispose();
    }


    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {
        String enunciado = txtEnunciado.getText();
        String respuestaCorrecta = txtRespuestaCorrecta.getText();
        String respuestaIncorrecta1 = txtRespuestaIncorrecta1.getText();
        String respuestaIncorrecta2 = txtRespuestaIncorrecta2.getText();
        String respuestaIncorrecta3 = txtRespuestaIncorrecta3.getText();
        int idCategoria = GestionCategorias.obtenerIdCategoria(listaCategorias.getSelectedItem().toString());
        //nos aseguramos que los campos estan rellenos
        if (enunciado.equals("") || respuestaCorrecta.equals("") || respuestaIncorrecta1.equals("")
                || respuestaIncorrecta2.equals("") || respuestaIncorrecta3.equals("") || idCategoria == -1) {
            JOptionPane.showMessageDialog(this, "Datos Erroneos", "Error", JOptionPane.WARNING_MESSAGE);
        }else if(GestionPreguntas.existePregunta(enunciado)){
            //nos aseguramos de que no existe una pregunta con ese nombre ya
            JOptionPane.showMessageDialog(this, "Ya existe una pregunta con ese enunciado", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (GestionPreguntas.insertarPregunta(new Pregunta(enunciado, respuestaCorrecta, respuestaIncorrecta1, respuestaIncorrecta2, respuestaIncorrecta3, idCategoria))) {
            //en caso de que se inserte
            JOptionPane.showMessageDialog(this, "Pregunta Insertada Correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            actualizarTabla();
        } else {
            //en caso de que ocurra algun error
            JOptionPane.showMessageDialog(this, "No se ha podido insertar la pregunta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String enunciado = txtEnunciado.getText();
            if (JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres realizar la accion?", "¿Estas seguro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                if (GestionPreguntas.borrarPregunta(enunciado)) {
                    JOptionPane.showMessageDialog(this, "Pregunta Borrada Correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    actualizarTabla();
                } else {
                    StringBuilder cadena = new StringBuilder();
                    cadena.append("No se ha podido borrar la pregunta, las posibles causas son:\n");
                    cadena.append("\t > Ha ocurrido un error en la conexion a la base de datos\n");
                    cadena.append("\t > No dispones de los permisos necesarios para realizar esa accion\n");
                    cadena.append("\t > No se pueden borrar preguntas asignadas a un cuestionario\n");
                    cadena.append("\t> No se pueden borrar preguntas que hayan sido respondidas en alguna partida\n");
                    JOptionPane.showMessageDialog(this, cadena.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NullPointerException npe) {
            /*
            En caso de que ocurra la excepcion limpiamos las cajas porque
            significa que la tabla de preguntas esta vacia y no hay ninguna
            seleccionada
             */
            txtEnunciado.setText("");
            txtRespuestaCorrecta.setText("");
            txtRespuestaIncorrecta1.setText("");
            txtRespuestaIncorrecta2.setText("");
            txtRespuestaIncorrecta3.setText("");
        }

    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
         /*
        obtenemos el enunciado antiguo de la pregunta, es importante tenerlo guardado
        porque puede ser modificado
         */
        String enunciadoAntiguo = (String) modelo.getValueAt(tablaPreguntas.getSelectedRow(),0);
        //obtenemos los datos de la pregunta
        String enunciado = txtEnunciado.getText();
        String respuestaCorrecta = txtRespuestaCorrecta.getText();
        String respuestaIncorrecta1 = txtRespuestaIncorrecta1.getText();
        String respuestaIncorrecta2 = txtRespuestaIncorrecta2.getText();
        String respuestaIncorrecta3 = txtRespuestaIncorrecta3.getText();
        //creamos la pregunta con los datos recogidos
        Pregunta p = new Pregunta(enunciado, respuestaCorrecta, respuestaIncorrecta1, respuestaIncorrecta2, respuestaIncorrecta3);
        //nos aseguramos de que no estan vacios
        if (enunciado.equals("") || respuestaCorrecta.equals("") || respuestaIncorrecta1.equals("")
                || respuestaIncorrecta2.equals("") || respuestaIncorrecta3.equals("")) {
            //en ese caso mostramos el mensaje de error
            JOptionPane.showMessageDialog(this, "Datos Erroneos", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (GestionPreguntas.modificarPregunta(p, enunciadoAntiguo)) {//si se modifica la pregunta
            JOptionPane.showMessageDialog(this, "Pregunta Modificada Correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            actualizarTabla();
        } else {//en caso de que no se pueda modificar la pregunta
            JOptionPane.showMessageDialog(this, "No se ha podido Modificar la pregunta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void listaCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {
        actualizarTabla();
        vaciarCajas();
    }


    private void tablaPreguntasMouseClicked(java.awt.event.MouseEvent evt) {
        colocarDatosPregunta();
    }



    private void tablaPreguntasKeyReleased(java.awt.event.KeyEvent evt) {
        colocarDatosPregunta();
    }

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
            java.util.logging.Logger.getLogger(VentanaAdministrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrarPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministrarPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JComboBox<String> listaCategorias;
    private javax.swing.JMenu menuAdministrador;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem opcionCategorias;
    private javax.swing.JMenuItem opcionCuestionarios;
    private javax.swing.JMenuItem opcionModoJuego;
    private javax.swing.JMenuItem opcionCerrarSesion;
    private javax.swing.JMenu opcionCopiasDeSeguridad;
    private javax.swing.JMenuItem opcionExportar;
    private javax.swing.JMenuItem opcionImportar;

    private javax.swing.JMenuItem opcionAjustesUsuario;
    private javax.swing.JMenuItem opcionPreguntas;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatosPregunta;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaPreguntas;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtRespuestaCorrecta;
    private javax.swing.JTextField txtRespuestaIncorrecta1;
    private javax.swing.JTextField txtRespuestaIncorrecta2;
    private javax.swing.JTextField txtRespuestaIncorrecta3;
    // End of variables declaration
}
