package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author roquelaecio
 *
 */
public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
		

		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Olá! Anteriormente, estabelecemos um fluxo de entrada concreto a "
				+ "partir de um arquivo. Nesta aula, nosso foco será o fluxo de saída.");
		
		bw.newLine();
		
		bw.write("Anteriormente, havíamos criado a classe TesteEscrita, onde "
				+ "estabelecemos uma entrada de texto, análoga à leitura de código.");

		bw.close();
	}

}
