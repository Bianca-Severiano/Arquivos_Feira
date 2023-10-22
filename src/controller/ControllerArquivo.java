package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControllerArquivo {
	static int Max1 = 0;
	static int Max2 = 0;

	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);

		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			linha = buffer.readLine();

			while (linha != null) {
				String campos[] = linha.split(",");

				if (campos[2].equals("Fruits")) {
					System.out.printf("%-" + 30 + "s", campos[0]);
					System.out.printf("%-" + 50 + "s", campos[1]);
					System.out.printf("%-" + 1 + "s", campos[3]);
					System.out.println("");
			
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();

		} else {
			throw new IOException("Arquivo Inválido");

		}

	}

}
