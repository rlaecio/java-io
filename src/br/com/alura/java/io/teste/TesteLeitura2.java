package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format(new Locale("pt", "PT"), "%s - %04d-%08d, %20s: %010.2f", tipoConta,
					agencia, conta, titular, saldo);
			System.out.println(valorFormatado);

			linhaScanner.close();

//			String[] valores = linha.split(",");m±
//			System.out.println(valores[3]);

		}
		scanner.close();

	}

}
