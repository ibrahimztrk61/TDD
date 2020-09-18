package com.ibrahim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AHarfiKotroluTest {

    @Test
    public void ilkHarflerideAHarfiOlmamali() {

        AHarfiKotrolu aHarfiKotrolu = new AHarfiKotrolu();

        String swapped = aHarfiKotrolu.kontrol("ABWE");

        assertEquals("BWE", swapped);

    }@Test
    public void ilkHarflerideAHarfiOlmamali1() {

        AHarfiKotrolu aHarfiKotrolu = new AHarfiKotrolu();

        String swapped = aHarfiKotrolu.kontrol("A");

        assertEquals("", swapped);

    }

    @Test
    public void ilkHarflerideAHarfiOlmamali22() {

        AHarfiKotrolu aHarfiKotrolu = new AHarfiKotrolu();

        String swapped = aHarfiKotrolu.kontrol("AB");

        assertEquals("B", swapped);

    }
    @Test
    public void ilkHarflerideAHarfiOlmamaliAAO() {

        AHarfiKotrolu aHarfiKotrolu = new AHarfiKotrolu();

        String swapped = aHarfiKotrolu.kontrol("AA");

        assertEquals("", swapped);

    }

    @Test
    public void ilkHarflerideAHarfiOlmamaliAA() {

        AHarfiKotrolu aHarfiKotrolu = new AHarfiKotrolu();

        String swapped = aHarfiKotrolu.kontrol("AABWE");

        assertEquals("BWE", swapped);

    }

    @Test
    public void ilkHarflerideAHarfiOlmamaliSS() {

        AHarfiKotrolu aHarfiKotrolu = new AHarfiKotrolu();

        String swapped = aHarfiKotrolu.kontrol("SSBWE");

        assertEquals("SSBWE", swapped);

    }
}
