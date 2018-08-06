import java.util.Scanner;

public class UriMilVinteUm {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float valor = entrada.nextFloat();

		//int valor = (int) valorN - 0;
		
		int ntCem = (int) valor / 100;
		int ntCinquenta = (int) (valor % 100) / 50;
		int ntVinte = (int) ((valor % 100) % 50) / 20;
		int ntDez = (int) (((valor % 100) % 50) % 20) / 10;
		int ntCinco = (int) ((((valor % 100) % 50) % 20) % 10) / 5;
		int ntDois = (int) (((((valor % 100) % 50) % 20) % 10) % 5) / 2;

		int moUm = (int) ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;
		//float valorM = valorN - valor;

		valor += 0.001;
		int moCinquenta = (int) ((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.50);
		int moedaVinteCinco = (int) (((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) / 0.25);
		int moDez = (int) ((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) / 0.10);
		int moCincoCents = (int) (((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10)
				/ 0.05);

		int moUmcent = (int) ((((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) % 0.05)
				/ .01);

		System.out.print("NOTAS:\n");
		System.out.print(ntCem + " nota(s) de R$ 100.00\n");
		System.out.print(ntCinquenta + " nota(s) de R$ 50.00\n");
		System.out.print(ntVinte + " nota(s) de R$ 20.00\n");
		System.out.print(ntDez + " nota(s) de R$ 10.00\n");
		System.out.print(ntCinco + " nota(s) de R$ 5.00\n");
		System.out.print(ntDois + " nota(s) de R$ 2.00\n");
		System.out.print("MOEDAS:\n");

		System.out.print(moUm + " moeda(s) de R$ 1.00\n");
		System.out.print(moCinquenta + " moeda(s) de R$ 0.50\n");
		System.out.print(moedaVinteCinco + " moeda(s) de R$ 0.25\n");
		System.out.print(moDez + " moeda(s) de R$ 0.10\n");
		System.out.print(moCincoCents + " moeda(s) de R$ 0.05\n");
		System.out.print(moUmcent + " moeda(s) de R$ 0.01\n");

		entrada.close();
	}

}
