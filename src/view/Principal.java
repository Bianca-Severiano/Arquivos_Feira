package view;

import java.io.IOException;

import controller.ControllerArquivo;

public class Principal {

	public static void main(String[] args) {
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		ControllerArquivo ca = new ControllerArquivo();
		
		try {
			ca.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
