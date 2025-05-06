package es.iesmaestredecalatrava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirPersonasApp {

	public static void main(String[] args) {
		final String FICHERO = "personas.dat";
		String [] nombres = {"Jaime", "Jorge", "Álvaro"};
		boolean [] mayorEdad = {true, true, false};
		double [] saldo = {200.66, 456.21, 124.55};
		try (DataOutputStream dos = new DataOutputStream
				(new FileOutputStream(FICHERO))) {
			int nombre = nombres.length;
			dos.write(nombre);
			for (int i=0;i<nombre;i++) {
				dos.write(nombre[i]);
			}
		}
	}catch (IOException ioe) {
		System.out.printf("%s no encontrado", FICHERO);
	}

}
