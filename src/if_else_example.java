import java.util.Scanner;

public class if_else_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary here: ");
        int salary = sc.nextInt();
        if(salary > 20_000) {
            salary += 2000;
        } else if (salary > 10_000) {
            salary += 1_000;
        } else {
            salary += 500;
        }
        System.out.print(salary);
    }
}
