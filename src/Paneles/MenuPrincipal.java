package Paneles;

import Excepcion.MiExcepcion;

import javax.swing.*;

import static java.lang.System.exit;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public static void main(String[] args) throws MiExcepcion {

        Object[] possibleValues = {"Conversor de monedas", "Conversor de temperatura"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleccione una opcion de conversion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        if (selectedValue != null) {

            if (selectedValue.equals("Conversor de monedas")) {

                    new ConvertirMoneda().main(new String[]{""});

            } else if (selectedValue.equals("Conversor de temperatura")) {

                System.out.println("Conversor de temperatura");

            }

        } else {

            exit(0);

        }

    }

}
