package Moneda;

import java.util.HashMap;

public class Monedas {

    /*
      COP
      USD
      EUR
      GBP
      JPY
      KRW
      */

    //Peso colombiano
    public static HashMap<String, Double> Colombianos() {

        HashMap<String, Double> COP = new HashMap<String, Double>();

        COP.put("USD", 0.00024);
        COP.put("EUR", 0.00022);
        COP.put("GBP", 0.00019);
        COP.put("JPY", 0.035);
        COP.put("KRW", 0.32);

        return COP;

    }

    //Dolar estadounidense
    public static HashMap<String, Double> Dolar(){

        HashMap<String, Double> USD = new HashMap<String, Double>();

        USD.put("COP", 4168.0);
        USD.put("EUR", 0.92);
        USD.put("GBP", 0.79);
        USD.put("JPY", 144.31);
        USD.put("KRW", 1316.30);

        return USD;

    }

    //Euro
    public static HashMap<String, Double> Euro(){

        HashMap<String, Double> EUR = new HashMap<String, Double>();

        EUR.put("COP", 4533.79);
        EUR.put("USD", 1.09);
        EUR.put("GBP", 0.86);
        EUR.put("JPY", 157.44);
        EUR.put("KRW", 1436.17);

        return EUR;

    }

    //Libra esterlina
    public static HashMap<String, Double> LibraEsterlina() {

        HashMap<String, Double> GBP = new HashMap<String, Double>();

        GBP.put("COP", 5277.51);
        GBP.put("USD", 1.27);
        GBP.put("EUR", 1.16);
        GBP.put("JPY", 183.26);
        GBP.put("KRW", 1671.62);

        return GBP;
    }

    //Yen japones
    public static HashMap<String, Double> YenJapones() {

        HashMap<String, Double> JPY = new HashMap<String, Double>();

        JPY.put("COP", 28.80);
        JPY.put("USD", 0.0069);
        JPY.put("EUR", 0.0064);
        JPY.put("GBP", 0.0055);
        JPY.put("KRW", 9.12);

        return JPY;
    }

    //Won SurCoreano
    public static HashMap<String, Double> WonSurCoreano() {

        HashMap<String, Double> KRW = new HashMap<String, Double>();

        KRW.put("COP", 3.16);
        KRW.put("USD", 0.00076);
        KRW.put("EUR", 0.00070);
        KRW.put("GBP", 0.00060);
        KRW.put("JPY", 0.11);

        return KRW;


    }


}
