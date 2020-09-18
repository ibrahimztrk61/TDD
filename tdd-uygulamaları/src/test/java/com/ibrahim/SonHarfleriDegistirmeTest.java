package com.ibrahim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonHarfleriDegistirmeTest {

    @Test
    public void testStringLastTwoCharShouldReverseWith2Char(){

        SonHarfleriDegistirme sonHarfleriDegistirme = new SonHarfleriDegistirme();

        String swapped = sonHarfleriDegistirme.swapLastTwoCharacters("AB");


        assertEquals("BA",swapped);
    }
 @Test
    public void testStringLastTwoCharShouldReverseWith4Char(){

        SonHarfleriDegistirme sonHarfleriDegistirme = new SonHarfleriDegistirme();

        String swapped = sonHarfleriDegistirme.swapLastTwoCharacters("ABWE");


        assertEquals("ABEW",swapped);
    }
    @Test
    public void testStringLastTwoCharShouldReverseWith8Char(){

        SonHarfleriDegistirme sonHarfleriDegistirme = new SonHarfleriDegistirme();

        String swapped = sonHarfleriDegistirme.swapLastTwoCharacters("ABWERTYU");


        assertEquals("ABEWRTUY",swapped);
    }
  @Test
    public void testStringLastTwoCharShouldReverseWith1Char(){

        SonHarfleriDegistirme sonHarfleriDegistirme = new SonHarfleriDegistirme();

        String swapped = sonHarfleriDegistirme.swapLastTwoCharacters("A");


        assertEquals("A",swapped);
    }

}