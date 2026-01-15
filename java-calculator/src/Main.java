import java.util.Scanner;

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Type a number: ");

    if (!input.hasNextInt()) {
        System.out.println("Please type a valid number");
        return;
    }

    int numero1 = input.nextInt();

    System.out.print("Type another number: ");

    if(!input.hasNextInt()) {
        System.out.println("Please type a valid number");
        return;
    }

    int numero2 = input.nextInt();

    System.out.print("Type the Mathematical Operators (+ - * /): ");
    String operator = input.next();

    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
        System.out.print("Please type a valid operator (+ - * /)");
    }


    switch (operator) {
        case "+":
            System.out.print(numero1 + numero2);
            break;

        case "-":
            System.out.print(numero1 - numero2);
            break;

        case "*":
            System.out.print(numero1 * numero2);
            break;

        case "/":
            System.out.print(numero1 / numero2);
            break;
        }
    input.close();
}
