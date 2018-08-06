import java.util.Scanner;

public class UriMilDezenove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int segundos = entrada.nextInt();

		int minutos = segundos / 60;
		int segunDos = segundos % 60;

		int horas = minutos / 60;
		int minutosCorreto = minutos % 60;

		
		System.out.println(horas + ":" + minutosCorreto + ":" + segunDos);
		entrada.close();

	}

}
