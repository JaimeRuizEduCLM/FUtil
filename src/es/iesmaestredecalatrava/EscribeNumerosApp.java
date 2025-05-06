package es.iesmaestredecalatrava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribeNumerosApp {

	public static void main(String[] args) {
		
		final String FICHERO = "numeros.dat";
		
		double num= 78.36;
		double [] numeros = {78.36, 79.34, 75.68, 44.44, 99.99, 1213.99};
		
		try (DataOutputStream dos = new DataOutputStream
				(new FileOutputStream(FICHERO))) {
			for (double d:numeros) {
			dos.writeDouble(d);
			}
		}catch (IOException ioe) {
			System.out.println("ERROR E/S " +ioe);
		}

	}

}
