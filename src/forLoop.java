import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num= sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            System.out.print(i + " ");
        }
    }
}
