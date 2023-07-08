package Inicio;

import Excepcion.MiExcepcion;
import Paneles.ConvertirFrecuencia;
import Paneles.ConvertirMoneda;
import Paneles.ConvertirTemperatura;

import javax.swing.*;

import static java.lang.System.exit;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public static void main(String[] args) throws MiExcepcion {

        Object[] possibleValues = {"Conversor de monedas", "Conversor de temperatura", "Conversion de frecuencia"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleccione una opcion de conversion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        if (selectedValue != null) {

            if (selectedValue.equals("Conversor de monedas")) {

                new ConvertirMoneda().main(new String[]{""});

            } else if (selectedValue.equals("Conversor de temperatura")) {

                new ConvertirTemperatura().main(new String[]{""});

            } else if (selectedValue.equals("Conversion de frecuencia")) {

                new ConvertirFrecuencia().main(new String[]{""});

            }

        } else {

            exit(0);

        }

    }

}
