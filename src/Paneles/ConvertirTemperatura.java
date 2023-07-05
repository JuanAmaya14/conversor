package Paneles;

import Excepcion.MiExcepcion;
import Inicio.MenuPrincipal;
import Temperatura.ProcesoConvertirTemperatura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.lang.System.exit;

public class ConvertirTemperatura extends JFrame {
    private JButton convertirButton;
    private JTextField inputTemperatura;

    private JComboBox temperatura1;
    private JComboBox temperatura2;
    private JButton atrasButton;
    private JPanel panel;
    private JLabel outputTemperatura;
    private JButton Finalizar;

    private static ConvertirTemperatura pantalla = new ConvertirTemperatura();

    public ConvertirTemperatura() {

        inputTemperatura.addKeyListener(new KeyAdapter() {
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

                String entradaTemperatura = String.valueOf(temperatura1.getSelectedItem());

                String salidaTemperatura = String.valueOf(temperatura2.getSelectedItem());

                try {

                    numero = Double.valueOf(inputTemperatura.getText());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "La entrada no puede estar vacia",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }

                if (entradaTemperatura == salidaTemperatura) {

                    JOptionPane.showMessageDialog(null, "No puedes poner dos unidades de temperatura iguales",
                            "ERROR", JOptionPane.ERROR_MESSAGE);

                    throw new MiExcepcion("Las unidades de temperatura no deben ser iguales");

                }

                ProcesoConvertirTemperatura temperatura = new ProcesoConvertirTemperatura(entradaTemperatura, salidaTemperatura, numero);

                outputTemperatura.setText(String.valueOf(temperatura.toString()));

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

        pantalla.setContentPane(new ConvertirTemperatura().panel);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.pack();

    }

}
