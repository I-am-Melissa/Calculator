class RomanCalculator {
    public static int romanCalc(String input) {
        int result;
        String[] split = input.split(" ");
        int num1 = RomanNumeral.valueOf(split[0]).getNum();
        String operand = split[1];
        int num2 = RomanNumeral.valueOf(split[2]).getNum();

        try {
            if (num1 < 1 || num2 < 1) {
                throw new RuntimeException();
            } else if (num1 > 10 || num2 > 10) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Калькулятор принимает на вход числа от 1 до 10 включительно");
            throw e;
        }

        try {
            if (split.length > 3) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Превышено допустимое количество символов");
            throw e;
        }

        try {
            switch (operand) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Введенный символ не соответствует операции сложения, вычитания, умножения или деления");
            throw e;
        }

        try {
            if (result < 1) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Результатом работы могут быть только положительные числа");
            throw e;
        }
        return result;
    }
}