package Monedas;

import java.util.AbstractMap;
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
    HashMap<String, Double> COP, USD, EUR, GBP, JPY, KRW  = new HashMap<String, Double>();


    public Monedas() {

        //Peso colombiano
        COP.put("USD", 0.00024);
        COP.put("EUR", 0.00022);
        COP.put("GBP", 0.00019);
        COP.put("JPY", 0.035);
        COP.put("KRW", 0.32);

        //Dolar estadounidense
        USD.put("COP", 4168.0);
        USD.put("EUR", 0.92);
        USD.put("GBP", 0.79);
        USD.put("JPY", 144.31);
        USD.put("KRW", 1316.30);

        //Euro
        EUR.put("COP", 4533.79);
        EUR.put("USD", 1.09);
        EUR.put("GBP", 0.86);
        EUR.put("JPY", 157.44);
        EUR.put("KRW", 1436.17);

        //Libra esterlina
        GBP.put("COP", 5277.51);
        GBP.put("USD", 1.27);
        GBP.put("EUR", 1.16);
        GBP.put("JPY", 183.26);
        GBP.put("KRW", 1671.62);

        //Yen japones
        JPY.put("COP", 28.80);
        JPY.put("USD", 0.0069);
        JPY.put("EUR", 0.0064);
        JPY.put("GBP", 0.0055);
        JPY.put("KRW", 9.12);

        //Won coreano
        KRW.put("COP", 3.16);
        KRW.put("USD", 0.00076);
        KRW.put("EUR", 0.00070);
        KRW.put("GBP", 0.00060);
        KRW.put("JPY", 0.11);



    }


}
