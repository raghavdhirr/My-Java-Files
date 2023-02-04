import java.util.Scanner;

public class currencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in Ruppes(₹): ");
        float rupees = sc.nextFloat();
        float dollars = (float) (rupees/82.23f);
        System.out.print(rupees + " ₹ in USD($) are: "+ dollars);
    }
}
