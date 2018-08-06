import java.util.Scanner;

public class UriMilTrintaCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		boolean ePar = false;
		if (a % 2 == 0)
			ePar = true;

		if ((b > c) & (d >= a) & ((c + d) > (a + b)) & ((c > 0) & (d > 0)) & (ePar))
			System.out.println("Valores aceitos");

		else
			System.out.println("Valores nao aceitos");

		entrada.close();

	}

}
