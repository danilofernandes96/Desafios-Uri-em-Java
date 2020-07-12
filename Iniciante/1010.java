import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int n1 = sc.nextInt();
        double v1 = sc.nextDouble();
        int c2 = sc.nextInt();
        int n2 = sc.nextInt();
        double v2 = sc.nextDouble();
        double total = (n1 * v1) + (n2 * v2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println();
        
    }

}
