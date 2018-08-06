import java.util.Scanner;

public class UriMileDezoito {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int valor = entrada.nextInt();

		int ntCem = valor / 100;
		int ntCinquenta = (valor % 100) / 50;
		int ntVinte = ((valor % 100) % 50) / 20;
		int ntDez = (((valor % 100) % 50) % 20) / 10;
		int ntCinco = ((((valor % 100) % 50) % 20) % 10) / 5;
		int ntDois = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
		int ntUm = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;

		System.out.println(valor);
		System.out.printf("%d nota(s) de R$ 100,00%n", ntCem);
		System.out.printf("%d nota(s) de R$ 50,00%n", ntCinquenta);
		System.out.printf("%d nota(s) de R$ 20,00%n", ntVinte);
		System.out.printf("%d nota(s) de R$ 10,00%n", ntDez);
		System.out.printf("%d nota(s) de R$ 5,00%n", ntCinco);
		System.out.printf("%d nota(s) de R$ 2,00%n", ntDois);
		System.out.printf("%d nota(s) de R$ 1,00%n", ntUm);
		
		entrada.close();
	}

}
