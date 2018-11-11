package nl.bongers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsConverterTest {

    private RomanNumeralsConverter converter;

    @Before
    public void setUp() {
        converter = new RomanNumeralsConverter();
    }

    @Test
    public void convertSingleDigitToRomanNumeral() {
        int[] singleDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] expectedRomans = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        for (int i = 0; i < singleDigits.length; i++) {
            assertEquals(expectedRomans[i], converter.numberToRoman(singleDigits[i]));
        }
    }

    @Test
    public void convertDoubleDigitsToRomanNumeral() {
        int[] doubleDigit = {10, 12, 14, 15, 19, 20, 30, 40, 44, 45, 50, 60, 70, 80, 90};
        String[] expectedRomans = {"X","XII","XIV","XV","XIX","XX","XXX","XL","XLIV","XLV","L","LX","LXX","LXXX","XC"};
        for (int i = 0; i < doubleDigit.length; i++) {
            assertEquals(expectedRomans[i], converter.numberToRoman(doubleDigit[i]));
        }
    }

    @Test
    public void convertTripleDigitsToRomanNumeral() {
        int[] tripleDigits = {100, 200, 300, 400, 500, 600, 700, 800, 900, 999};
        String[] expectedRomans = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM","CMXCIX"};
        for (int i = 0; i < tripleDigits.length; i++) {
            assertEquals(expectedRomans[i], converter.numberToRoman(tripleDigits[i]));
        }
    }

    @Test
    public void convertQuadrupleDigitsToRomalNumeral() {
        int[] quadrupleDigits = {1000, 2000, 3000, 3999};
        String[] expectedRomans = {"M","MM","MMM","MMMCMXCIX"};
        for (int i = 0; i < quadrupleDigits.length; i++) {
            assertEquals(expectedRomans[i], converter.numberToRoman(quadrupleDigits[i]));
        }
    }

    @Test
    public void numberToHigh() {
        assertEquals("Input exceeds 4000", converter.numberToRoman(4000));
    }
}