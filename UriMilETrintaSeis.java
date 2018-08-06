import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class UriMilETrintaSeis {

	public static void main(String[] args) {

	
		Formatter formato = new Formatter(Locale.ENGLISH);
		Scanner entrada = new Scanner(System.in);

		String valores = entrada.nextLine();

		String valoresSeparados[] = valores.split(" ");

		// Regra da formula de bhaskara é que A não pode ser igual a 0
		double a = Double.parseDouble(valoresSeparados[0]);
		double b = Double.parseDouble(valoresSeparados[1]);
		double c = Double.parseDouble(valoresSeparados[2]);
		double raiz, x1, x2;

		if (a != 0) {
			double delta = ((Math.pow(b, 2)) - (4 * (a * c)));

			if (delta > 0) {
				raiz = Math.sqrt(delta);

				x1 = (-b + raiz) != 0 ? (-b + raiz) / (2 * a) : 0;
				x2 = (-b - raiz) != 0 ? (-b - raiz) / (2 * a) : 0;

				if (x1 != 0 || x2 != 0)
					System.out.println(formato.format("R1 = %.5f%nR2 = %.5f", x1, x2));

				else
					System.out.println("Impossivel calculcar");
			} else
				System.out.println("Impossivel calcular");

		} else
			System.out.println("Impossivel calcular");

		entrada.close();

	}

}
