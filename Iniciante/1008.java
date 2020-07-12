import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        double vh = sc. nextDouble();
        double salario = h * vh;
        System.out.println("NUMBER = "+n);
        System.out.printf("SALARY = U$ %.2f", salario);
        System.out.println();
               
        
    }

}
