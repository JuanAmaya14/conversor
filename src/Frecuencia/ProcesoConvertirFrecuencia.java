package Frecuencia;

import java.text.DecimalFormat;

//Logica para convertir la frecuencia en diferentes unidades
public class ProcesoConvertirFrecuencia {

    private double resultado = 0;

    //Formato por defecto del double
    private DecimalFormat decimalFormat = new DecimalFormat("0.000000000");

    public ProcesoConvertirFrecuencia(String entradaFrecuencia, String salidaFrecuencia, double frecuencia) {

        //Hercio a [...]
        if (entradaFrecuencia == "Hercio" && salidaFrecuencia == "Kilohercio") {

            resultado = frecuencia / 1000;
            decimalFormat = new DecimalFormat("0.000");

        } else if (entradaFrecuencia == "Hercio" && salidaFrecuencia == "Megahercio") {

            resultado = frecuencia / 1e6;
            decimalFormat = new DecimalFormat("0.000000");

        } else if (entradaFrecuencia == "Hercio" && salidaFrecuencia == "Gigahercio") {

            resultado = frecuencia / 1e9;

        }

        //Kilohercio a [...]
        if (entradaFrecuencia == "Kilohercio" && salidaFrecuencia == "Hercio") {

            resultado = frecuencia * 1000;
            decimalFormat = new DecimalFormat("0.00");

        } else if (entradaFrecuencia == "Kilohercio" && salidaFrecuencia == "Megahercio") {

            resultado = frecuencia / 1000;
            decimalFormat = new DecimalFormat("0.000");

        } else if (entradaFrecuencia == "Kilohercio" && salidaFrecuencia == "Gigahercio") {

            resultado = frecuencia / 1e6;
            decimalFormat = new DecimalFormat("0.000000");

        }

        //Megahercio a [...]
        if (entradaFrecuencia == "Megahercio" && salidaFrecuencia == "Hercio") {

            resultado = frecuencia * 1e6;
            decimalFormat = new DecimalFormat("0.00");

        } else if (entradaFrecuencia == "Megahercio" && salidaFrecuencia == "Kilohercio") {

            resultado = frecuencia * 1000;
            decimalFormat = new DecimalFormat("0.00");

        } else if (entradaFrecuencia == "Megahercio" && salidaFrecuencia == "Gigahercio") {

            resultado = frecuencia / 1000;
            decimalFormat = new DecimalFormat("0.000");

        }

        //Gigahercio a [...]
        if (entradaFrecuencia == "Gigahercio" && salidaFrecuencia == "Hercio") {

            resultado = frecuencia * 1e9;
            decimalFormat = new DecimalFormat("0.00");

        } else if (entradaFrecuencia == "Gigahercio" && salidaFrecuencia == "Kilohercio") {

            resultado = frecuencia * 1e6;
            decimalFormat = new DecimalFormat("0.00");

        } else if (entradaFrecuencia == "Gigahercio" && salidaFrecuencia == "Megahercio") {

            resultado = frecuencia * 1000;
            decimalFormat = new DecimalFormat("0.00");

        }
    }

    //Envia el valor convertido
    @Override
    public String toString() {
        return String.valueOf(decimalFormat.format(resultado));
    }
}

