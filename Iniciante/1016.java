import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vx = 60;
	    int vy = 90;
	    int sx = sc.nextInt();
        int x = (vx * sx) / 30;
		System.out.printf("%d minutos\n", x);
	}
}