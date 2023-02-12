import java.util.Scanner;

public class to_find_roots_of_quadratic_eq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coeffient of x^2: ");
        double a = sc.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of constant: ");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if(discriminant > 0) {
            double root1 = (- b + Math.sqrt(discriminant))/(2 * a);
            double root2 = (- b - Math.sqrt(discriminant))/(2 * a);
            System.out.print("Roots are: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2*a);
            System.out.print("The root is: "+ root);
        } else {
            System.out.print("The equation has no real roots");
        }
    }
}
