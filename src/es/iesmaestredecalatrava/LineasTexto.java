package es.iesmaestredecalatrava;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class LineasTexto {

	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.txt"))) {
			
			bw.write("La vida es así");
			bw.newLine();
			bw.write("Es así la vida");
			bw.newLine();
			
		}catch (Exception o) {
			
		}

	}

}
