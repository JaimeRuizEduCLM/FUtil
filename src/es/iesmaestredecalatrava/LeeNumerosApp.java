package es.iesmaestredecalatrava;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeeNumerosApp {

	public static void main(String[] args) {
		final String FICHERO = "numeros.dat";
		
		System.out.printf("Contenido de %s%n", FICHERO);
		try (DataInputStream dis = new DataInputStream
				(new FileInputStream(FICHERO))) {
			for (int i=0; i<6; i++) {	
				double valor=dis.readDouble();
				System.out.printf("%f%n", valor);
			}
		}catch (FileNotFoundException fnfe) {
			System.out.printf("%s no encontrado", FICHERO);
		}catch (EOFException eof) {
			System.out.println("[Fin]");
		}catch (IOException ioe) {
			System.out.println("ERROR E/S " +ioe);
		}

	}

}
