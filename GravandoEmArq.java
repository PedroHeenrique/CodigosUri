
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GravandoEmArq {

	public static void main(String[] args) throws IOException {

//		FileOutputStream fout = null;
//
//		byte valores[] = new byte[20];
//		int numero = System.in.read(valores);
//
//		System.out.println();
//
//		try {
//
//			fout = new FileOutputStream("saida.txt");
//			for (int i = 0; i < numero; i++) {
//
//				fout.write(valores[i]);
//			}
//
//		} catch (IOException exc) {
//			System.out.println("Erro" + exc.getCause());
//		}

		copiarArquivo("C:/Users/Pichau/Desktop/Internet.txt");

	}

	public static void copiarArquivo(String caminho) {

		try (FileInputStream carregaArquivo = new FileInputStream(caminho)) {

			try (FileOutputStream copiaArquivo = new FileOutputStream("C:/Users/Pichau/Desktop/copia.txt")) {
				int i;
				do {

					i = carregaArquivo.read();
					if (i != -1) {
						copiaArquivo.write(i);
					}
				} while (i != -1);

			} catch (IOException exc) {
				System.out.println("Caminho invalido");
			}

		} catch (IOException exc) {
			System.out.println("Arquivo nao encontrado, favor verificar");
		}

		

		

	}
}
