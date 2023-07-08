package Moneda;

import java.text.DecimalFormat;

import static Moneda.Monedas.*;

//Logica para convertir una moneda a otra
public class ProcesoConvertirMoneda {

    private double resultado = 0;

    //Formato a double por defecto
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public ProcesoConvertirMoneda(String entradaMoneda, String salidaMoneda, double dinero) {

        //Peso colombiano a [...]
        if (entradaMoneda == "COP" && salidaMoneda == "USD") {

            resultado = Colombianos().get("USD") * dinero;
            decimalFormat = new DecimalFormat("0.00000");

        } else if (entradaMoneda == "COP" && salidaMoneda == "EUR") {

            resultado = Colombianos().get("EUR") * dinero;
            decimalFormat = new DecimalFormat("0.00000");

        } else if (entradaMoneda == "COP" && salidaMoneda == "GBP") {

            resultado = Colombianos().get("GBP") * dinero;
            decimalFormat = new DecimalFormat("0.00000");

        } else if (entradaMoneda == "COP" && salidaMoneda == "JPY") {

            resultado = Colombianos().get("JPY") * dinero;
            decimalFormat = new DecimalFormat("0.000");

        } else if (entradaMoneda == "COP" && salidaMoneda == "KRW") {

            resultado = Colombianos().get("KRW") * dinero;

        }

        //Dolar estadounidense a [...]
        if (entradaMoneda == "USD" && salidaMoneda == "COP") {

            resultado = Dolar().get("COP") * dinero;

        } else if (entradaMoneda == "USD" && salidaMoneda == "EUR") {

            resultado = Dolar().get("EUR") * dinero;

        } else if (entradaMoneda == "USD" && salidaMoneda == "GBP") {

            resultado = Dolar().get("GBP") * dinero;

        } else if (entradaMoneda == "USD" && salidaMoneda == "JPY") {

            resultado = Dolar().get("JPY") * dinero;

        } else if (entradaMoneda == "USD" && salidaMoneda == "KRW") {

            resultado = Dolar().get("KRW") * dinero;

        }

        //Euro a [...]
        if (entradaMoneda == "EUR" && salidaMoneda == "COP") {

            resultado = Euro().get("COP") * dinero;

        } else if (entradaMoneda == "EUR" && salidaMoneda == "USD") {

            resultado = Euro().get("USD") * dinero;

        } else if (entradaMoneda == "EUR" && salidaMoneda == "GBP") {

            resultado = Euro().get("GBP") * dinero;

        } else if (entradaMoneda == "EUR" && salidaMoneda == "JPY") {

            resultado = Euro().get("JPY") * dinero;

        } else if (entradaMoneda == "EUR" && salidaMoneda == "KRW") {

            resultado = Euro().get("KRW") * dinero;

        }

        //Libra esterlina a [...]
        if (entradaMoneda == "GBP" && salidaMoneda == "COP") {

            resultado = LibraEsterlina().get("COP") * dinero;

        } else if (entradaMoneda == "GBP" && salidaMoneda == "USD") {

            resultado = LibraEsterlina().get("USD") * dinero;

        } else if (entradaMoneda == "GBP" && salidaMoneda == "EUR") {

            resultado = LibraEsterlina().get("EUR") * dinero;

        } else if (entradaMoneda == "GBP" && salidaMoneda == "JPY") {

            resultado = LibraEsterlina().get("JPY") * dinero;

        } else if (entradaMoneda == "GBP" && salidaMoneda == "KRW") {

            resultado = LibraEsterlina().get("KRW") * dinero;

        }


        //Yen japones a [...]
        if (entradaMoneda == "JPY" && salidaMoneda == "COP") {

            resultado = YenJapones().get("COP") * dinero;

        } else if (entradaMoneda == "JPY" && salidaMoneda == "USD") {

            resultado = YenJapones().get("USD") * dinero;
            decimalFormat = new DecimalFormat("0.0000");

        } else if (entradaMoneda == "JPY" && salidaMoneda == "EUR") {

            resultado = YenJapones().get("EUR") * dinero;
            decimalFormat = new DecimalFormat("0.0000");

        } else if (entradaMoneda == "JPY" && salidaMoneda == "GBP") {

            resultado = YenJapones().get("GBP") * dinero;
            decimalFormat = new DecimalFormat("0.0000");

        } else if (entradaMoneda == "JPY" && salidaMoneda == "KRW") {

            resultado = YenJapones().get("KRW") * dinero;

        }

        //Won SurCoreano a [...]
        if (entradaMoneda == "KRW" && salidaMoneda == "COP") {

            resultado = WonSurCoreano().get("COP") * dinero;

        } else if (entradaMoneda == "KRW" && salidaMoneda == "USD") {

            resultado = WonSurCoreano().get("USD") * dinero;
            decimalFormat = new DecimalFormat("0.00000");

        } else if (entradaMoneda == "KRW" && salidaMoneda == "EUR") {

            resultado = WonSurCoreano().get("EUR") * dinero;
            decimalFormat = new DecimalFormat("0.00000");

        } else if (entradaMoneda == "KRW" && salidaMoneda == "GBP") {

            resultado = WonSurCoreano().get("GBP") * dinero;
            decimalFormat = new DecimalFormat("0.00000");

        } else if (entradaMoneda == "KRW" && salidaMoneda == "JPY") {

            resultado = WonSurCoreano().get("JPY") * dinero;

        }

    }

    //Envia el valor convertido
    @Override
    public String toString() {
        return String.valueOf(decimalFormat.format(resultado));
    }
}
