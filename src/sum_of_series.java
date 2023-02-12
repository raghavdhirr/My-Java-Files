import java.util.Scanner;

public class sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n'th number of series: ");
        int n = sc.nextInt();
        System.out.print("Enter the power of series: ");
        int m = sc.nextInt();
        long result = 0;
        for (int i = 1; i <= n ; i++) {
            int power = 1;
            for (int j = 0; j < m; j++) {
                power *= i;
            }
            result += power;
        }
        System.out.print("Sum of series is: "+ result);
    }
}
