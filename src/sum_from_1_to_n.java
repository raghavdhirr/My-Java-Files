import java.util.Scanner;

public class sum_from_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n'th number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            count+= i;
        }
        System.out.print("Sum of digits from 1 to " + n + " is: " + count);
    }
}
