package es.iesmaestredecalatrava;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class LeeNumerosV2App {

	public static void main(String[] args) {
		
		final String FICHERO = "numeros_v2.dat";
		System.out.printf("Contenido de %s%n", FICHERO);
		try (DataInputStream dis = new DataInputStream
				(new FileInputStream(FICHERO))) {
			int num= dis.readInt();
			System.out.printf("Cuenta: %d%n%n", num);
			for (int i=0; i<num; i++) {
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
