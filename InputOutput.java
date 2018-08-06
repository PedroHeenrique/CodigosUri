import java.io.*;

public class InputOutput {

	public static void main(String[] args) throws IOException {

		// byte [] data = new byte[10];
		//
		// System.out.println("Enter com a letra");
		// int numero = System.in.read(data); //Le bytes no fluxo de entrada e os insere
		// em buffer até o array ficar cheio,
		// System.out.println("Eu digitei:");
		// for(int i =0; i <numero; i++)System.out.write((char)data[i]);
		//
		
//		FileInputStream fin = new FileInputStream("TESTE.TXT.txt");
//		InputStreamReader isr = new InputStreamReader(fin); // transforma bytes em caracteres
//		BufferedReader br = new BufferedReader(isr);// junta os caracteres em uma linha
//
//		String linha = br.readLine();
//
//		while (linha != null) {
//
//			System.out.println(linha);
//			linha = br.readLine();
//		}
//
//		br.close();

		
		OutputStream outPut = new FileOutputStream("Saida.txt");
		OutputStreamWriter os = new OutputStreamWriter(outPut);
		BufferedWriter bw = new BufferedWriter(os);
		
		bw.write("Programador Java Senior");
		bw.close();
	}

}
