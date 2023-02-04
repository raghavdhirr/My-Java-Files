import java.util.Scanner;

public class factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n'th number: ");
        int n = sc.nextInt();
        long factorial= 1;
        for (int i = 2; i <=n ; i++) {
            factorial *= i;
        }
        System.out.print("Factorial of " + n + " is: " + factorial);
    }
}
