package nl.bongers;

public class RomanNumeralsConverter {

    public static String arabicToRoman(int number) {
        int remaining = number;
        StringBuilder result = new StringBuilder();
        while(remaining >= 10) {
            result.append("X");
            remaining -= 10;
        }
        if(remaining == 9) {
            result.append("IX");
            remaining -= 9;
        }
        if(remaining >= 5) {
            result.append("V");
            remaining -= 5;
        }
        if(remaining == 4) {
            result.append("IV");
            remaining -= 4;
        }
        while(remaining >= 1) {
            result.append("I");
            remaining--;
        }
        return result.toString();
    }

    private static int append(int arabic, int value, String romanDigits, StringBuilder builder) {
        int result = arabic;
        while (result >= value) {
            builder.append(romanDigits);
            result -= value;
        }
        return result;
    }
}
