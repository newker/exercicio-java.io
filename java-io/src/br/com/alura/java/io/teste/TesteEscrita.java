package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream ifs = new FileOutputStream("lorem2.txt");
		OutputStreamWriter fl = new OutputStreamWriter(ifs);
		BufferedWriter br = new BufferedWriter(fl);
		
		br.write("Escrevendo em um arquivo");
		br.newLine();
		br.write("Agora na segunda linha");
		
		br.close();

	}

}
