import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempoGasto = sc.nextInt();
	    int velocidadeMedia = sc.nextInt();
	    double litros = (tempoGasto * velocidadeMedia) / 12.0;
	    System.out.printf("%.3f\n", litros);
	    
	}
}