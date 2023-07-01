package Paneles;

import javax.swing.*;

import static java.lang.System.exit;

public class menu_principal {

    public static void main(String[] args) {

        Object[] possibleValues = {"Conversor de monedas", "Conversor de temperatura"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleccione una opcion de conversion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        if (selectedValue != null) {

            if (selectedValue.equals("Conversor de monedas")) {

                    //IngresarDinero.main();
                    ConvertirMoneda moneda = new ConvertirMoneda();

            }

        } else {

            exit(0);

        }

    }

}
