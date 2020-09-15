package j3.a4.javaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Grava só uma linha.
 * @author Pati
 *
 */
public class LerFileScannerGravaTxt {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner (new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream("saida.txt");
		
		while (sc.hasNext()) {
			String linha = sc.nextLine();
			ps.println(linha);
		}
		ps.close();
		sc.close();
	}

}
