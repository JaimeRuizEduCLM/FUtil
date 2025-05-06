package es.iesmaestredecalatrava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Lineas {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader (new FileReader("prueba.txt"))){
			int numCars=0;
			int numLineas=0;
			String linea = br.readLine();
			while (linea!=null) {
				br.read();
				numLineas++;
				linea = br.readLine();
				System.out.println(linea);
			}
		}catch (Exception e) {
			
		}
		
	}

}
