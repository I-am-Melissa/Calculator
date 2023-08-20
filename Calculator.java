class Calculator {
    public static String calc(String input) {
        String[] split = input.split(" ");
        String str1 = split[0];
        String str2 = split[2];
        String result;

        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        boolean isArabic = false;
        boolean isArabic2 = false;

        for (String number : numbers) {
            if (str1.equals(number)) {
                isArabic = true;
            } else if (str2.equals(number)) {
                isArabic2 = true;
            }
        }

        if (isArabic || isArabic2) {
            result = Integer.toString(ArabicCalculator.arabicCalc(input));
        } else {
            result = String.valueOf(RomanNumeral.convert(RomanCalculator.romanCalc(input)));
        }
        return result;
    }
}

