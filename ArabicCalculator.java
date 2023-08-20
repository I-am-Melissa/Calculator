class ArabicCalculator {
    public static int arabicCalc(String input) {
        int result;
        String[] split = input.split(" ");
        int operator1 = Integer.parseInt(split[0]);
        String operand = split[1];
        int operator2 = Integer.parseInt(split[2]);

        try {
            if (operator1 < 1 || operator2 < 1) {
                throw new RuntimeException();
            } else if (operator1 > 10 || operator2 > 10) {
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
                case "+" -> result = operator1 + operator2;
                case "-" -> result = operator1 - operator2;
                case "*" -> result = operator1 * operator2;
                case "/" -> result = operator1 / operator2;
                default -> throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Введенный символ не соответствует операции сложения, вычитания, умножения или деления");
            throw e;
        }
        return result;
    }
}