import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number 1: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number 2: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter any operator(+,-,*,/,%): ");
            char op = sc.next().trim().charAt(0);
            double result;
            switch (op) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero...");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                }
                case '%' -> {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                }
                default -> System.out.println("Invalid operator entered!");
            }
            System.out.print("Would you like to continue(y/n): ");
            char c = sc.next().trim().charAt(0);
            if(c=='n') {
                break;
            }
        }
    }
}
