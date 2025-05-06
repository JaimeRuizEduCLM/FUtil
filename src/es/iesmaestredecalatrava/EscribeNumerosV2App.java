package es.iesmaestredecalatrava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribeNumerosV2App {

	public static void main(String[] args) {
		
		final String FICHERO = "numeros_v2.dat";
		
		double [] numeros = {78.36, 79.34, 75.68, 44.44, 99.99, 1213.99};
		
		try (DataOutputStream dos = new DataOutputStream
				(new FileOutputStream(FICHERO))) {
			int numElementos= numeros.length;
			dos.writeInt(numElementos);
			for (int i=0;i<numElementos;i++) {
				dos.writeDouble(numeros[i]);
			}
		}catch (IOException ioe) {
			System.out.println("ERROR E/S " +ioe);
		}

	}

}
