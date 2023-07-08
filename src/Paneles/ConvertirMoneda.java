package Paneles;

import Excepcion.MiExcepcion;
import Inicio.MenuPrincipal;
import Moneda.ProcesoConvertirMoneda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.System.exit;

//Convertir moneda
public class ConvertirMoneda extends JFrame {

    //Elementos de la pantalla
    private JButton convertirButton;
    private JTextField inputDinero;

    private JComboBox moneda1;
    private JComboBox moneda2;
    private JButton atrasButton;
    private JPanel panel;
    private JLabel outputDinero;
    private JButton Finalizar;

    private static ConvertirMoneda pantalla = new ConvertirMoneda();

    public ConvertirMoneda() {

        //Input
        inputDinero.addKeyListener(new KeyAdapter() {
            //Cuando se dijite una tecla en el input
            @Override
            public void keyTyped(KeyEvent evt) {
                //Lista de caracteres permitidos
                char[] caracteres = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
                int b = 0;
                //si entra un caracter permitido puede estar en el input
                for (int i = 0; i <= 10; i++) {
                    if (caracteres[i] == evt.getKeyChar()) {
                        b = 1;
                    }

                }
                //si entra un caracter que no esta permitido no puede estar en el input
                if (b == 0) {
                    evt.consume();
                }
            }
        });

        //Boton de convertir
        convertirButton.addActionListener(new ActionListener() {
            //cuando el boton es presionado
            @Override
            public void actionPerformed(ActionEvent e) {

                double dinero = 0;
                boolean seguir = true;

                //captura las opciones los JComboBox
                String entradaMoneda = String.valueOf(moneda1.getSelectedItem());

                String salidaMoneda = String.valueOf(moneda2.getSelectedItem());

                try {
                    //Captura el input
                    dinero = Double.valueOf(inputDinero.getText());

                } catch (NumberFormatException ex) {
                    //En caso de que el input este vacio
                    JOptionPane.showMessageDialog(null, "La entrada no puede estar vacia",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    //no puede seguir la conversion
                    seguir = false;
                }

                //En caso de que las opciones sean iguales
                if (entradaMoneda == salidaMoneda) {

                    JOptionPane.showMessageDialog(null, "No puedes poner dos monedas iguales",
                            "ERROR", JOptionPane.ERROR_MESSAGE);

                    throw new MiExcepcion("Las monedas no deben ser iguales");

                    //si no hay ningun inconveniente, puede seguir con la converion
                } else if (seguir == true) {

                    //Envia opciones y valor del input
                    ProcesoConvertirMoneda moneda = new ProcesoConvertirMoneda(entradaMoneda, salidaMoneda, dinero);

                    //Regresa valor convertido
                    outputDinero.setText(String.valueOf(moneda.toString()));
                }

            }
        });

        //Boton Atras
        atrasButton.addActionListener(new ActionListener() {
            //Si es presionado se devuelve al menu
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setVisible(false);
                new MenuPrincipal().main(new String[]{""});
            }
        });

        //Boton finalizar
        Finalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //si "OK" es presionado se cierra el programa
                if (JOptionPane.showConfirmDialog(null, "¿Quieres finalizar el programa?",
                        "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

                    exit(0);

                    //Si se presiona "No" el programa sigue
                } else {

                    pantalla.setVisible(true);

                }

            }
        });
    }

    //Arranca el programa
    public static void main(String[] args) {

        pantalla.setContentPane(new ConvertirMoneda().panel);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setBackground(Color.black);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.pack();

    }

}




