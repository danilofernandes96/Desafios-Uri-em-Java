import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a =  sc.nextDouble();
        double b =  sc.nextDouble();
        double c =  sc.nextDouble();
        double pi = 3.14159;
        double triangulo = (a * c) / 2;
        double circulo = pi * (c * c);
        double trapezio = ((a + b) / 2) * c;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        
    }

}
