import java.util.Scanner;

class Main {
    public static void main(String args[]) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        double x, y, result;
        String op;

        System.out.println("Insert two numbers, enter the operation, or press q to quit");

        for(;;) {
            System.out.println("Insert the first number: ");
            x = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Insert the second number: ");
            y = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Insert the operation(1: +, 2: -, 3: *, 4: /): ");
            op = scanner.nextLine();

            if(op.equals("q")) break; //This is not working

            switch(op) {
                case "1":
                    result = x + y;
                    System.out.println(x + " + " + y + " = " + result);
                    break;
                case "2":
                    result = x - y;
                    System.out.println(x + " - " + y + " = " + result);
                    break;
                case "3":
                    result = x * y;
                    System.out.println(x + " x " + y + " = " + result);
                    break;
                case "4":
                    if(y == 0) {
                        System.out.println("ERROR: Division by zero.");
                        break;
                    } else {
                        result = x / y;
                        System.out.println(x + " / " + y + " = " + result);
                        break;
                    }
                default:
                    System.out.println("Sorry... Invalid input.");
            }
            scanner.close();
        }
    }
}