import java.util.Scanner;

public class factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n'th number: ");
        int n = sc.nextInt();
        int factorial = 1;
        int i = 2;
        while(i <= n) {
            factorial *= i;
            i++;
        }
        System.out.print("Factorial of " + n + " is: " + factorial);
    }
}
