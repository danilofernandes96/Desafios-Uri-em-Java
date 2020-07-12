import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        double sal = sc.nextDouble();
        double vendas = sc.nextDouble();
        double total = sal + ((vendas * 15) / 100);
        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println();
    }

}
