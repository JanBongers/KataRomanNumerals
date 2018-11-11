package nl.bongers;

public class RomanNumeralsConverter {

    private StringBuilder builder;
    private int[] numbers = {1_000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String numberToRoman(int number) {
        if (number >= 4_000) return "Input exceeds 4000";

        int remaining = number;
        builder = new StringBuilder();

        while (remaining > 0) {
            for (int i = 0; i < numbers.length; i++) {
                remaining = append(remaining, numbers[i], romans[i]);
            }
        }
        return builder.toString();
    }

    private int append(int remaining, int number, String roman) {
        int result = remaining;
        while (result >= number) {
            builder.append(roman);
            result -= number;
        }
        return result;
    }
}
