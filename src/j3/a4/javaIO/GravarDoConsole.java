package j3.a4.javaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GravarDoConsole {

	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Escreva o que vc quer gravar: ");
			String content = entrada.nextLine();

			File file = new File("saida.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			System.out.println("Feito!");
			
		} catch (IOException e) {
			System.out.println("Não conseguiu criar um arquivo.");
			e.printStackTrace();
		}

	}
}
