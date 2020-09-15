
package j3.a4.javaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 								                            Exception  
 *    
 * IOException				                          RuntimeException						              SQLException  
 * 		
 * FileNotFoundException      	           NullPointerException, ArrayIndexOutOfBoundsException
 * 
 * 
 * 
 * Exception => filhas: IOException, RuntimeException, SQLException
 * RuntimeException=>filhas: NullPointerException, ArrayIndexOutOfBoundsException
 * IOException => filhas: FileNotFoundException
 * 
 * Alguns tipos de Exception são OBRIGATÓRIOS TRATAR explicitamente:
 * OBRIGATÓRIO: IOException e SQLException. 
 * OPCIONAL: RuntimeException e suas filhas.
 * 
 * 
 * JAVA IO

Também diz-se que se deve usar a biblioteca Log4j para obter logs do java.
 */




/**
 * Tenho que criar meu "leitura.txt" no diretório raiz do projeto e escrever algo nele. 
 * 
 * NÃO FUNCIONA ESCREVER NO CONSOLE E GRAVAR NO ARQUIVO, PQ NÃO GRAVA. VER OUTRAS CLASSES DESTE PACOTE.
 * 
 * @author Pati
 *
 */
public class TestaJavaIO {

	public static void main(String[] args) throws IOException {
		// Ler um arquivo
		InputStream is = new FileInputStream("leitura.txt");    //lê bytes
		InputStreamReader isr = new InputStreamReader(is);      //lê caracteres
		BufferedReader br = new BufferedReader(isr);           //lê Strings: uma linha inteira
		
		//Escrever arquivo
		OutputStream os = System.out;                                  //o System.out é um OutputStream. (Vai mostrar no console)
//		OutputStream os = new FileOutputStream("saida.txt");           //escreve bytes (ele cria um arquivo txt automaticamente)
		OutputStreamWriter osw = new OutputStreamWriter(os);           //escreve caracteres
		BufferedWriter bw = new BufferedWriter(osw);                   //escreve linha inteira
		
		
		//método readLine(): qdo não tiver mais linha no arquivo, retorna nulo
		
		String linha = br.readLine();
		while (linha != null) {
//			System.out.println(linha);             //acrescenta essa linha no meu arquivo de saída
			bw.append(linha);
			bw.newLine();
			linha = br.readLine();        			//estou lendo a próxima linha!			
		}
		br.close();
		bw.close();
		
	}

}
