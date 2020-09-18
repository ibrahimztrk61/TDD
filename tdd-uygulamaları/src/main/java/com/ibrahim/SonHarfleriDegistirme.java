package com.ibrahim;

public class SonHarfleriDegistirme {
    public String swapLastTwoCharacters(String str) {

        int length = str.length();

        if (length<2)
            return str;

        String subStringWithoutLast2Char = str.substring(0,length-2);

        char lastChar = str.charAt(length-1);
        char secondLastChar = str.charAt(length-2);

    return ""+subStringWithoutLast2Char+lastChar+secondLastChar;
}
}

