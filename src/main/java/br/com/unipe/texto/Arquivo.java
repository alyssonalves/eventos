package br.com.unipe.texto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	public static void main(String[] args) {

		arquivotxt();
	}

	private static void arquivotxt() {

		try {

			File file = new File( "D://Dropbox/Dropbox/Unipê/arquivoTexto2.xls");
			FileWriter fileW = new FileWriter(file);
			BufferedWriter buf = new BufferedWriter(fileW);

			buf.write("Ana Maria");
			buf.write("23/12/1990");
			buf.write("12345678900");

			buf.write ("\n");

			buf.close();
			fileW.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void arquivocsv() {

		
	}
}
