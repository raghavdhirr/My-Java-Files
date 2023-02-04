import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int n = 1;
        while(n <= number) {
            System.out.print(n + " ");
            n++;
        }
    }
}
