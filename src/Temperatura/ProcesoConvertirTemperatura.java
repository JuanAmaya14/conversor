package Temperatura;

import java.text.DecimalFormat;

import static Moneda.Monedas.*;

public class ProcesoConvertirTemperatura {

    private double resultado = 0;

    private DecimalFormat decimalFormat = new DecimalFormat("0.0000");

    public ProcesoConvertirTemperatura(String entradaTemperatura, String salidaTemperatura, double temperatura) {

        //Grado Celsius a [...]
        if (entradaTemperatura == "Celcius" && salidaTemperatura == "Farenheit") {

            resultado = (temperatura * 9/5) + 32;

        } else if (entradaTemperatura == "Celcius" && salidaTemperatura == "Kelvin") {

            resultado = temperatura + 273.15;

        }

        //Farenheit a [...]
        if (entradaTemperatura == "Farenheit" && salidaTemperatura == "Celcius") {

            resultado = (temperatura - 32) * 5/9;

        } else if (entradaTemperatura == "Farenheit" && salidaTemperatura == "Kelvin") {

            resultado = (temperatura - 32) * 5/9 + 273.15;

        }

        //Kelvin a [...]
        if (entradaTemperatura == "Kelvin" && salidaTemperatura == "Farenheit") {

            resultado = (temperatura - 273.15) * 9/5 + 32;

        } else if (entradaTemperatura == "Kelvin" && salidaTemperatura == "Celcius") {

            resultado = temperatura - 273.15;

        }
    }

    @Override
    public String toString() {
        return String.valueOf(decimalFormat.format(resultado));
    }
}
