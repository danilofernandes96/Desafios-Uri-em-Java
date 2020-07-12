import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14159;
        double volume = (4 / 3.0) * pi * (r * r * r);
        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();
        
    }

}
