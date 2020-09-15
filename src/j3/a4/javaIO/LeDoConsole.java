package j3.a4.javaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeDoConsole {

	public static void main(String[] args) {
		
		try {
            Scanner entrada = new Scanner(System.in);
			System.out.println("Escreva o que vc quer gravar: ");
			String content = entrada.nextLine();

            File file = new File("saida.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            while (content != null || content != "") {
            	bw.write(content);            	
            }
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		
		
		
		
//		try {
//		      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		      String lineFromInput = in.readLine();
//		      PrintStream out = new PrintStream(new FileOutputStream("saida.txt"));
//		      System.setOut(out);
//		      out.println(lineFromInput);
//		      out.close();
//		   }
//		      catch(IOException e1) {
//		        System.out.println("Error during reading/writing");
//		   }
    }
}
