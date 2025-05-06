package es.iesmaestredecalatrava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleStreamApp {

	public static void main(String[] args) {
		int car='?';
		try {
		InputStreamReader streamTeclado = new InputStreamReader (System.in);
		
		car= streamTeclado.read();
		
		streamTeclado.close();
		
		}catch (IOException ioe) {
			System.out.printf("ERROR E/S: ", ioe);
		}
		System.out.printf("Has tecleado %c %n", car);
		
		
		try {
			FileReader streamFichero = new FileReader ("prueba.txt");
		
		car= streamFichero.read();
		
		streamFichero.close();
		
		}catch (IOException ioe) {
			System.out.printf("ERROR E/S: ", ioe);
		}
		System.out.printf("El primer caracter es %c %n", car);
		
		StringBuffer sb = new StringBuffer();
		
		
		try {
			FileReader streamFichero = new FileReader ("prueba.txt");
		
			for (int i=0; i<3; i++) {
				car= streamFichero.read();
		
				sb.append((char)car);
		}
		streamFichero.close();
		
		}catch (IOException ioe) {
			System.out.printf("ERROR E/S: ", ioe);
		}
		System.out.printf("Los caracteres leidos son: ", sb.toString());

	final int EOF = -1;	
	try {
		FileReader streamFichero = new FileReader ("prueba.txt");
		car = streamFichero.read();
		 while (car != EOF) {
             System.out.printf("%c", car); 
             car= streamFichero.read();
         }
		System.out.println(" EOF - Final del fichero");
	
	}catch (IOException ioe) {
		System.out.printf("ERROR E/S: ", ioe);
	}
	
	System.out.printf("Los caracteres leidos son: ", sb.toString());


	try (
		FileReader entrada = new FileReader ("prueba.txt");
		FileWriter salida = new FileWriter ("prueba_copia.txt");
	){
		System.out.print("Copiando...");
	} catch (FileNotFoundException fnf) {
		System.out.println("ERRROR E/S: Fichero no encontrado");
	} catch (IOException ioe) {
		System.out.println("ERROR E/S: " + ioe);
	}
	System.out.println("[Fin]");

	try (
			FileReader entrada = new FileReader ("prueba.txt");
			FileWriter salida = new FileWriter ("prueba_copia.txt");
		){
			System.out.print("Copiando...");
			car=entrada.read();
			while (car != 1) {
				if (Character.isAlphabetic(car)) {
					salida.write((car+1));
				}
				car = entrada.read();
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("ERRROR E/S: Fichero no encontrado");
		} catch (IOException ioe) {
			System.out.println("ERROR E/S: " + ioe);
		}
		System.out.println("[Fin]");
	}
}