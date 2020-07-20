import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int s = 60;
        int minuto = n / s;
        int segundo = n % s;
        int hora = minuto / s;
        minuto = minuto % s;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
	}
}
