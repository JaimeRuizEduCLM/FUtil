package es.iesmaestredecalatrava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LeerLineaTexto {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter (new FileWriter("leer.txt"))) {
			bw.write("Mi vida");
			bw.newLine();
			bw.write("Mi vida");
			bw.newLine();
			bw.write("Mi vida");
			bw.newLine();
			bw.write("Mi vida");
			BufferedReader br = new BufferedReader(new FileReader("leer.txt"));
			String linea; 
			
			while((linea = br.readLine() ) != null) {
				System.out.println(linea); 
			}
			
			
			
		}catch (Exception e) {
			
		}

	}

}
