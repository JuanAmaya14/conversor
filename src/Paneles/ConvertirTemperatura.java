package Paneles;

import Excepcion.MiExcepcion;
import Inicio.MenuPrincipal;
import Temperatura.ProcesoConvertirTemperatura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.System.exit;

//Convertir temperatura
public class ConvertirTemperatura extends JFrame {
    //Elementos de la pantalla
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
                //Lista de caracteres permitidos
                char[] caracteres = {'-', '.', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
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

                double numero = 0;

                boolean seguir = true;

                //captura las opciones de los JComboBox
                String entradaTemperatura = String.valueOf(temperatura1.getSelectedItem());

                String salidaTemperatura = String.valueOf(temperatura2.getSelectedItem());

                try {
                    //Captura el input
                    numero = Double.valueOf(inputTemperatura.getText());

                } catch (NumberFormatException ex) {
                    //En caso de que el input este vacio
                    JOptionPane.showMessageDialog(null, "La entrada no puede estar vacia",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    //no puede seguir la conversion
                    seguir = false;
                }

                //En caso de que las opciones sean iguales
                if (entradaTemperatura == salidaTemperatura) {

                    JOptionPane.showMessageDialog(null, "No puedes poner dos unidades de temperatura iguales",
                            "ERROR", JOptionPane.ERROR_MESSAGE);

                    throw new MiExcepcion("Las unidades de temperatura no deben ser iguales");

                    //si no hay ningun inconveniente, puede seguir con la converion
                }else if(seguir == true){

                    //Envia opciones y valor del input
                    ProcesoConvertirTemperatura temperatura = new ProcesoConvertirTemperatura(entradaTemperatura, salidaTemperatura, numero);

                    //Regresa valor convertido
                    outputTemperatura.setText(String.valueOf(temperatura.toString()));

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

        pantalla.setContentPane(new ConvertirTemperatura().panel);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setBackground(Color.black);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.pack();

    }

}
