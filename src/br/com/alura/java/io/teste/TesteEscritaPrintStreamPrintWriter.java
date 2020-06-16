package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 
 * @author roquelaecio
 *
 */
public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);

//		BufferedWriter bw = new BufferedWriter(osw)
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		
		ps.println("Olá! Anteriormente, estabelecemos um fluxo de entrada concreto a "
				+ "partir de um arquivo. Nesta aula, nosso foco será o fluxo de saída.");
		
		ps.println("Anteriormente, havíamos criado a classe TesteEscrita, onde "
				+ "estabelecemos uma entrada de texto, análoga à leitura de código.");

		ps.close();
	}

}
