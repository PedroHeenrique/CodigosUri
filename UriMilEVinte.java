import java.util.Scanner;

public class UriMilEVinte {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		int idadeEmDias = entrada.nextInt();
		
		int anos = idadeEmDias /365 ;
		int meses = (idadeEmDias % 365) /30;
		int dias = (idadeEmDias % 365)%30;
		
		System.out.println(anos+" ano(s)\n" + meses + " mes(es)\n" + dias +" dia(s)" );
		
		
		entrada.close();

	}

}
