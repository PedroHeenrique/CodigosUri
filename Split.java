
import java.util.*;


public class UriMilEUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Formatter formato = new Formatter(Locale.ENGLISH);
		
		String valoresUm , valoresDois;
		double total;
		
		
		valoresUm = entrada.nextLine();
		String arrayUm []= valoresUm.split(" ");
		int codUm = Integer.parseInt(arrayUm[0]);
		int quant = Integer.parseInt(arrayUm[1]);
		double valorUni = Double.parseDouble(arrayUm[2]);
		
        
		valoresDois = entrada.nextLine();
		
		String arrayDois [] = valoresDois.split(" ");
		int codDois = Integer.parseInt(arrayDois[0]);
		int quantDois = Integer.parseInt(arrayDois[1]);
		double valorUniDois = Double.parseDouble(arrayDois[2]);
		
		
	    total = (quant * valorUni) + (quantDois * valorUniDois);
		
	
		
		
		
		
		formato.format("VALOR A PAGAR: R$ %.2f", total);
		
		System.out.println(formato);

	}

}
