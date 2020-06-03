package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("lorem3.txt");
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("Escrevendo num arquivo usando a classe FileWriter que � um OutputStreamWriter, e um Writer.");
		br.newLine();
		br.write("Agora na segunda linha");
		
		br.close();

	}

}
