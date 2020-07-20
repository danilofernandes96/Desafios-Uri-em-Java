import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ano  = n / 365;
		int mes = n % 365;
		int dia = mes % 30;
		mes = mes / 30;
		
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
	}
}
