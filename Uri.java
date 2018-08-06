
import java.util.*;

public class Uri {

	public static void main(String[] args) {
// URI 1015
		Scanner entrada = new Scanner(System.in);
		Formatter formato = new Formatter(Locale.ENGLISH);

		String primeiraLinha = entrada.nextLine(); 
		String segundaLinha = entrada.nextLine();

		String[] eixosPrimeiraLinha = primeiraLinha.split(" ");
		double x1 = Double.parseDouble(eixosPrimeiraLinha[0]);
		double y1 = Double.parseDouble(eixosPrimeiraLinha[1]);

		String[] eixosSegundaLinha = segundaLinha.split(" "); 
		double x2 = Double.parseDouble(eixosSegundaLinha[0]); 
		double y2 = Double.parseDouble(eixosSegundaLinha[1]);
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2)  +  Math.pow(y2 - y1,2) );

		formato.format("%.8f", distancia);

		System.out.println(formato);

		entrada.close();

	}

}
