import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the annual interest rate: ");
        int r = sc.nextInt();
        System.out.print("Enter time period: ");
        int t = sc.nextInt();
        int simpleInterest = (p*r*t)/100;
        System.out.print("Interest amount is: " + simpleInterest);
    }
}
