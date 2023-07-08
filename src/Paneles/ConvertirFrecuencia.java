package Paneles;

import Excepcion.MiExcepcion;
import Frecuencia.ProcesoConvertirFrecuencia;
import Inicio.MenuPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import static java.lang.System.exit;

public class ConvertirFrecuencia extends JFrame {
    private JPanel panel;
    private JButton convertirButton;
    private JTextField inputFrecuencia;
    private JLabel outputFrecuencia;
    private JComboBox frecuencia1;
    private JComboBox frecuencia2;
    private JButton atrasButton;
    private JButton Finalizar;

    private static ConvertirFrecuencia pantalla = new ConvertirFrecuencia();

    public ConvertirFrecuencia() {

        inputFrecuencia.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char[] caracteres = {'-', '.', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
                int b = 0;
                for (int i = 0; i <= 10; i++) {
                    if (caracteres[i] == evt.getKeyChar()) {
                        b = 1;
                    }

                }
                if (b == 0) {
                    evt.consume();
                }
            }
        });


        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double numero = 0;
                boolean seguir = true;

                String entradaFrecuencia = String.valueOf(frecuencia1.getSelectedItem());

                String salidaFrecuencia = String.valueOf(frecuencia2.getSelectedItem());

                try {

                    numero = Double.valueOf(inputFrecuencia.getText());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "La entrada no puede estar vacia",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    seguir = false;
                }

                if (entradaFrecuencia == salidaFrecuencia) {

                    JOptionPane.showMessageDialog(null, "No puedes poner dos unidades de temperatura iguales",
                            "ERROR", JOptionPane.ERROR_MESSAGE);

                    throw new MiExcepcion("Las unidades de temperatura no deben ser iguales");

                }else if(seguir == true){

                    ProcesoConvertirFrecuencia temperatura = new ProcesoConvertirFrecuencia(entradaFrecuencia, salidaFrecuencia, numero);

                    outputFrecuencia.setText(String.valueOf(temperatura.toString()));

                }

            }
        });
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setVisible(false);
                new MenuPrincipal().main(new String[]{""});
            }
        });
        Finalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(null, "¿Quieres finalizar el programa?",
                        "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

                    exit(0);

                } else {

                    pantalla.setVisible(true);

                }

            }
        });

    }

    public static void main(String[] args) {

        pantalla.setContentPane(new ConvertirFrecuencia().panel);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setBackground(Color.black);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.pack();

    }

}
