package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopia {

	public static void main(String[] args) throws IOException {
		
		InputStream ifs = System.in; //new FileInputStream("lorem.txt");
		InputStreamReader fl = new InputStreamReader(ifs);
		BufferedReader br = new BufferedReader(fl);
		
		OutputStream fos = new FileOutputStream("copia.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();		
	
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();

	}

}
