package Temperatura;

import java.text.DecimalFormat;

//Logica para convertir la temperatura en diferentes unidades
public class ProcesoConvertirTemperatura {

    private double resultado = 0;

    private DecimalFormat decimalFormat = new DecimalFormat("0.0000");

    public ProcesoConvertirTemperatura(String entradaTemperatura, String salidaTemperatura, double temperatura) {

        //Grados Celsius a [...]
        if (entradaTemperatura == "Celcius" && salidaTemperatura == "Farenheit") {

            resultado = (temperatura * 9/5) + 32;
            decimalFormat = new DecimalFormat("0.0");

        } else if (entradaTemperatura == "Celcius" && salidaTemperatura == "Kelvin") {

            resultado = temperatura + 273.15;
            decimalFormat = new DecimalFormat("0.00");

        }

        //Grados Farenheit a [...]
        if (entradaTemperatura == "Farenheit" && salidaTemperatura == "Celcius") {

            resultado = (temperatura - 32) * 5/9;

        } else if (entradaTemperatura == "Farenheit" && salidaTemperatura == "Kelvin") {

            resultado = (temperatura - 32) * 5/9 + 273.15;
            decimalFormat = new DecimalFormat("0.000");

        }

        //Grados Kelvin a [...]
        if (entradaTemperatura == "Kelvin" && salidaTemperatura == "Farenheit") {

            resultado = (temperatura - 273.15) * 9/5 + 32;
            decimalFormat = new DecimalFormat("0.00");

        } else if (entradaTemperatura == "Kelvin" && salidaTemperatura == "Celcius") {

            resultado = temperatura - 273.15;
            decimalFormat = new DecimalFormat("0.00");

        }
    }

    //Envia el valor convertido
    @Override
    public String toString() {
        return String.valueOf(decimalFormat.format(resultado));
    }
}
