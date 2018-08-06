
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EntradaArquivo {

	public static void main(String[] args) throws IOException {

		FileInputStream carregaArquivo = null;
		int i;
		try {
			carregaArquivo = new FileInputStream("C:/Users/Pichau/Desktop/Internet.txt");
		} catch (FileNotFoundException exc) {
			System.out.println("Arquivo nao encontrado");
		}

		try {

			do {

				i = carregaArquivo.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);

		} catch (IOException exc) {
			System.out.println("Erro de leitura do arquivo" + exc.getCause());
		}

		carregaArquivo.close();
	}

}
