package Inicio;

import Excepcion.MiExcepcion;
import Paneles.ConvertirFrecuencia;
import Paneles.ConvertirMoneda;
import Paneles.ConvertirTemperatura;

import javax.swing.*;

import static java.lang.System.exit;

//Inicio

public class MenuPrincipal {

    public static void main(String[] args) {

        //Opciones
        Object[] possibleValues = {"Conversor de monedas", "Conversor de temperatura", "Conversion de frecuencia"};

        //JOptionPane
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleccione una opcion de conversion", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                possibleValues, possibleValues[0]);

        //Si le da "OK"
        if (selectedValue != null) {

            //Si una de las opciones es elegida
            if (selectedValue.equals("Conversor de monedas")) {

                new ConvertirMoneda().main(args);

            } else if (selectedValue.equals("Conversor de temperatura")) {

                new ConvertirTemperatura().main(args);

            } else if (selectedValue.equals("Conversion de frecuencia")) {

                new ConvertirFrecuencia().main(args);

            }


        } else {

            //si le da al boton "Cancel" se cierra el programa
            exit(0);

        }

    }

}
