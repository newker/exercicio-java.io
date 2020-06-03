package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamAndPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//FileWriter fw = new FileWriter("lorem6.txt");
		
		//PrintWriter br = new PrintWriter("lorem4.txt");
		PrintStream br = new PrintStream("lorem5.txt");
		
		br.println("Escrevendo num arquivo usando a classe FileWriter que é um OutputStreamWriter, e um Writer.");
		br.println("Agora na segunda linha");
		
		br.close();

	}

}
