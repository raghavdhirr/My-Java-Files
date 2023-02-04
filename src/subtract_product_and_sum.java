import java.util.Scanner;

public class subtract_product_and_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int sum=0;
        int product=1;
        while(n>0) {
            sum += (n % 10);
            product *= (n % 10);
            n= n / 10;
        }
        System.out.print(product-sum);
    }
}
