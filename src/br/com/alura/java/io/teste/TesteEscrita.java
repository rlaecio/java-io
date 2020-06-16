package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 
 * @author roquelaecio
 *
 */
public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Olá! Anteriormente, estabelecemos um fluxo de entrada concreto a "
				+ "partir de um arquivo. Nesta aula, nosso foco será o fluxo de saída.");
		
		bw.close();
	}

}
