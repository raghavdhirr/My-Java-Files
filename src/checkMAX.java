import java.util.Scanner;

public class checkMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number 1: ");
            double a = sc.nextDouble();
            System.out.print("Enter number 2: ");
            double b = sc.nextDouble();
            System.out.print("Enter number 3: ");
            double c = sc.nextDouble();
            double max = a;
            if (b > max) {
                max = b;
            } if(c > max) {
                max = c;
            }
            System.out.println("Maximum number is: " + max);
            System.out.print("Would you like to continue(y/n): ");
            char ch = sc.next().trim().charAt(0);
            if (ch == 'n') {
                break;
            }

        }
    }
}
