package nl.bongers;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsConverterTest {

    @Test
    public void convertToRomanNumerals() {
        assertEquals("convert 1 to I", "I", RomanNumeralsConverter.arabicToRoman(1));
        assertEquals("convert 2 to II", "II", RomanNumeralsConverter.arabicToRoman(2));
        assertEquals("convert 3 to III", "III", RomanNumeralsConverter.arabicToRoman(3));
        assertEquals("convert 4 to IV", "IV", RomanNumeralsConverter.arabicToRoman(4));
        assertEquals("convert 5 to V", "V", RomanNumeralsConverter.arabicToRoman(5));
        assertEquals("convert 6 to VI", "VI", RomanNumeralsConverter.arabicToRoman(6));
        assertEquals("convert 7 to VII", "VII", RomanNumeralsConverter.arabicToRoman(7));
        assertEquals("convert 8 to VIII", "VIII", RomanNumeralsConverter.arabicToRoman(8));
        assertEquals("convert 9 to IX", "IX", RomanNumeralsConverter.arabicToRoman(9));
        assertEquals("convert 10 to X", "X", RomanNumeralsConverter.arabicToRoman(10));
        assertEquals("convert 11 to XI", "XI", RomanNumeralsConverter.arabicToRoman(11));
        assertEquals("convert 12 to XII", "XII", RomanNumeralsConverter.arabicToRoman(12));
        assertEquals("convert 13 to XIII", "XIII", RomanNumeralsConverter.arabicToRoman(13));
        assertEquals("convert 14 to XIV", "XIV", RomanNumeralsConverter.arabicToRoman(14));
        assertEquals("convert 15 to XV", "XV", RomanNumeralsConverter.arabicToRoman(15));
        assertEquals("convert 16 to XVI", "XVI", RomanNumeralsConverter.arabicToRoman(16));
        assertEquals("convert 17 to XVII", "XVII", RomanNumeralsConverter.arabicToRoman(17));
        assertEquals("convert 18 to XVIII", "XVIII", RomanNumeralsConverter.arabicToRoman(18));
        assertEquals("convert 19 to XIX", "XIX", RomanNumeralsConverter.arabicToRoman(19));
        assertEquals("convert 20 to XX", "XX", RomanNumeralsConverter.arabicToRoman(20));
    }
}