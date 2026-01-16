import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Type a number: ");

    if (!input.hasNextInt()) {
        System.out.println("Please type a valid number");
        return;
    }

    int number1 = input.nextInt();

    System.out.print("Type another number: ");

    if(!input.hasNextInt()) {
        System.out.println("Please type a valid number");
        return;
    }

    int number2 = input.nextInt();

    System.out.print("Type the Mathematical Operators (+ - * /): ");
    String operator = input.next();

    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
        System.out.print("Please type a valid operator (+ - * /)");
    }

    switch (operator) {
        case "+":
            System.out.print(Calculator.add(number1, number2));
            break;

        case "-":
            System.out.print(Calculator.subtract(number1, number2));
            break;

        case "*":
            System.out.print(Calculator.multiplication(number1, number2));
            break;

        case "/":
            System.out.print(Calculator.divide(number1, number2));
            break;
        }

        System.out.printf("%nDo you want to do another operation? (y/n) ");
        String yesNo = input.next();

        while (yesNo.equals("y")) {
            System.out.print("Type a number: ");

            if (!input.hasNextInt()) {
                System.out.println("Please type a valid number");
                return;
            }

            number1 = input.nextInt();

            System.out.print("Type another number: ");

            if(!input.hasNextInt()) {
                System.out.println("Please type a valid number");
                return;
            }

            number2 = input.nextInt();

            System.out.print("Type the Mathematical Operators (+ - * /): ");
            operator = input.next();

            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                System.out.print("Please type a valid operator (+ - * /)");
            }

            switch (operator) {
                case "+":
                    System.out.print(Calculator.add(number1, number2));
                    break;

                case "-":
                    System.out.print(Calculator.subtract(number1, number2));
                    break;

                case "*":
                    System.out.print(Calculator.multiplication(number1, number2));
                    break;

                case "/":
                    System.out.print(Calculator.divide(number1, number2));
                    break;

            }
            System.out.printf("%nDo you want to do another operation? (y/n) ");
            yesNo = input.next();
        }
    input.close();
    }
}