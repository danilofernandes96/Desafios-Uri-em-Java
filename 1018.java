import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int troco, cem, cinquenta, vinte, dez, cinco, dois, um;
		int valor = sc.nextInt();
		troco = valor;
		cem = troco / 100;
		troco = troco - (cem * 100);
	    
		cinquenta = troco / 50;
		troco = troco - (cinquenta * 50);

		vinte = troco / 20;
		troco = troco - (vinte * 20);
		
		dez = troco / 10;
		troco = troco - (dez * 10);

		cinco = troco / 5;
		troco = troco - (cinco * 5);

		dois = troco / 2;
		troco = troco - (dois * 2);
		
		System.out.println(valor);
		
		System.out.printf("%d nota(s) de R$ 100,00\n",cem);

        System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);

        System.out.printf("%d nota(s) de R$ 20,00\n",vinte);

        System.out.printf("%d nota(s) de R$ 10,00\n",dez);

        System.out.printf("%d nota(s) de R$ 5,00\n",cinco);

        System.out.printf("%d nota(s) de R$ 2,00\n",dois);

        System.out.printf("%d nota(s) de R$ 1,00\n",troco);

	}
}
