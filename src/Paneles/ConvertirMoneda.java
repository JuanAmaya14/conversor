package Paneles;

import Excepcion.MiExcepcion;
import Moneda.Monedas;
import Moneda.ProcesoConvertir;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.lang.System.exit;

public class ConvertirMoneda extends JFrame {
    private JButton convertirButton;
    private JTextField inputDinero;

    private JComboBox moneda1;
    private JComboBox moneda2;
    private JButton atrasButton;
    private JPanel panel;
    private JLabel outputDinero;
    private JButton Finalizar;

    private static ConvertirMoneda pantalla = new ConvertirMoneda();

    public ConvertirMoneda(){

        inputDinero.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char[] p = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
                int b = 0;
                for (int i = 0; i <= 10; i++) {
                    if (p[i] == evt.getKeyChar()) {
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

                double dinero = 0;
                try {

                    dinero = Double.valueOf(inputDinero.getText());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "La entrada no puede estar vacia",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }

                String entradaMoneda = String.valueOf(moneda1.getSelectedItem());

                String salidaMoneda = String.valueOf(moneda2.getSelectedItem());

                if (entradaMoneda == salidaMoneda) {

                    JOptionPane.showMessageDialog(null, "No puedes poner dos monedas iguales",
                            "ERROR", JOptionPane.ERROR_MESSAGE);

                    throw new MiExcepcion("Las monedas no deben ser iguales");

                }

                ProcesoConvertir resultado = new ProcesoConvertir(entradaMoneda, salidaMoneda, dinero);


                outputDinero.setText(String.valueOf(resultado.toString()));

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

                if(JOptionPane.showConfirmDialog(null, "¿Quieres finalizar el programa?",
                        "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){

                    exit(0);

                }else{

                    pantalla.setVisible(true);

                }

            }
        });
    }

    public static void main(String[] args) {

        pantalla.setContentPane(new ConvertirMoneda().panel);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.pack();

    }

}




