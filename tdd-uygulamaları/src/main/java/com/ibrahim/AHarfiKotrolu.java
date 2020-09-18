package com.ibrahim;

public class AHarfiKotrolu {

    public String kontrol(String str) {

        int length = str.length();

        if (length<2)
            return str.replaceAll("A","");

        String substring = str.substring(2, length);
        char ilk = str.charAt(0);
        char ikinci = str.charAt(1);

        if (ilk == 'A' && ikinci != 'A'){
              return ""+ikinci +substring;
        }
        if (ilk == 'A'){
              return ""+substring;
        }
        if (ikinci != 'A'){
              return ""+ilk+ikinci +substring;
        }
        return str;


    }
}
