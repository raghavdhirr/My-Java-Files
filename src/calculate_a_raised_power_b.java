import java.util.Scanner;

public class calculate_a_raised_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = sc.nextInt();
        int original_a = a;
        System.out.print("Now enter the value of 'b': ");
        int b = sc.nextInt();
        int original_b = b;
        int ans = 1;
        for (int i = 1; i <= b ; i++) {
            ans *= a;
        }
        System.out.print(original_a + " raised power " + original_b+ " gives: " + ans);
    }
}
