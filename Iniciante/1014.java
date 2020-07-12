import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double l = sc.nextDouble();
        double cm = km / l;
        System.out.printf("%.3f", cm);
        System.out.println(" km/l");
        
    }

}
