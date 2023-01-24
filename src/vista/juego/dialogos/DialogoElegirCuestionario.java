/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.juego.dialogos;

import controlador.administrador.GestionCuestionarios;
import controlador.herramientas.Colores;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author fernando
 */
public class DialogoElegirCuestionario extends javax.swing.JDialog {
    private static boolean puedeContinuar = true;
    private static String cuestionarioElegido;

    /**
     * Creates new form DialogoElegirCuestionario
     */
    public DialogoElegirCuestionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //en caso de que cierre el dialogo en la x no pasara a jugar ningun cuestionario
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                puedeContinuar =  false;
            }
        });
    }

    /**
     * Este metodo permite mostrar el dialogo
     * @author Fernando
     */
    public static void mostrarDialogo() {
        DialogoElegirCuestionario frame = new DialogoElegirCuestionario(new JFrame(),true);
        frame.setVisible(true);
    }

    public static boolean obtenerEstado() {
        return puedeContinuar;
    }
    public static String obtenerCuestionarioElegido(){
        return cuestionarioElegido;
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
        panelFIla1 = new javax.swing.JPanel();
        listaCuestionarios = new javax.swing.JComboBox<>();
        panelFila2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        panelPrincipal.setLayout(new java.awt.GridLayout(2, 1));

        panelFIla1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        listaCuestionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listaCuestionarios.setForeground(new java.awt.Color(255, 255, 255));
        listaCuestionarios.setPreferredSize(new java.awt.Dimension(500, 50));
        listaCuestionarios.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                listaCuestionariosItemListener(evt);
            }
        });
        panelFIla1.add(listaCuestionarios);

        panelPrincipal.add(panelFIla1);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setBackground(Colores.getColorBotonPeligroso());
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnCancelarActionListener(evt);
            }
        });
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 60));
        panelFila2.add(btnCancelar);

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBackground(Colores.colorBotonSeguro());
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnConfirmarActionListener(evt);
            }
        });
        btnConfirmar.setPreferredSize(new java.awt.Dimension(150, 60));
        panelFila2.add(btnConfirmar);

        panelPrincipal.add(panelFila2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        for(String s: GestionCuestionarios.obtenerCuestionariosCompletos()){
            listaCuestionarios.addItem(s);
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaCuestionariosItemListener(ItemEvent evt) {
        cuestionarioElegido = listaCuestionarios.getSelectedItem().toString();
    }

    private void btnConfirmarActionListener(ActionEvent evt) {
        dispose();
    }

    private void btnCancelarActionListener(ActionEvent evt) {
        puedeContinuar = false;
        dispose();
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
            java.util.logging.Logger.getLogger(DialogoElegirCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoElegirCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoElegirCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoElegirCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoElegirCuestionario dialog = new DialogoElegirCuestionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> listaCuestionarios;
    private javax.swing.JPanel panelFIla1;
    private javax.swing.JPanel panelFila2;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
