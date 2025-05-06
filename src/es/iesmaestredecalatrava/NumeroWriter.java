package es.iesmaestredecalatrava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumeroWriter {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			
			System.out.println("Introduce un numero: "); 
			String entrada = br.readLine(); 
			
			int numero = Integer.parseInt(entrada); 
			
			OutputStreamWriter writer = new OutputStreamWriter (System.out);
			writer.write("Numero Introducido: " + numero + "\n");
			
			writer.flush();
			br.close();
			writer.close(); 
		}catch (Exception e) {
			
		}
	}

}
