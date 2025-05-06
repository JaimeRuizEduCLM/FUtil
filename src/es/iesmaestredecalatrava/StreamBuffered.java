package es.iesmaestredecalatrava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamBuffered {

	public static void main(String[] args) throws IOException {
		final String FICHERO= "prueba.txt";
		try (
				FileReader fichero = new FileReader(FICHERO);
				BufferedReader br = new BufferedReader(fichero)){
				String linea = br.readLine();
				linea = br.readLine();
				System.out.println(linea);
				
				int cPals=0;
				String [] palabras= linea.split("\\s+");
				cPals=palabras.length;
				System.out.printf("Nº caracteres: %d%n", linea.length());
				System.out.printf("Nº palabras: %d%n", cPals);
				
		}catch (IOException ioe) {
			System.out.println("ERROR E/S: " + ioe);
		}
		try (
				BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"))){
				System.out.print("Generando html...");
				bw.write("<ul>");
				bw.newLine();
				bw.write("<li>Item 1</li>");
				bw.newLine();
				bw.write("<li>Item 2</li>");
				bw.newLine();
				bw.write("</ul>");
				bw.newLine();

	}catch (IOException ioe) {
			System.out.println("ERROR E/S: " + ioe);
	}
		try (
				BufferedReader br = new BufferedReader(new FileReader("index.html"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("index_copia.html"))){
				System.out.print("Generando html...");
				int numCars=0;
				int numLineas=0;
				String linea = br.readLine();
				while (linea!=null) {
					bw.write(linea);
					bw.newLine();
					numLineas++;
					numCars = numCars + linea.length();
					linea = br.readLine();
				}
				bw.write("<footer style=\"color:blue\">");
				bw.newLine();
				bw.write("<hr>");
				bw.newLine();
				bw.write("Lineas copiadas: " + numLineas);
				bw.newLine();
				bw.write("<br> Wed Apr 30 10:10:50 CEST 2025");
				bw.newLine();
				bw.write("</footer>");
	}catch (IOException ioe) {
			System.out.println("ERROR E/S: " + ioe);
	}
}
}
