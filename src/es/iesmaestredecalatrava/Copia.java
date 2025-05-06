package es.iesmaestredecalatrava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copia {

	public static void main(String[] args) {
		// Especificar los archivos de entrada y salida
        String archivoEntrada = "archivo_origen.txt";
        String archivoSalida = "archivo_destino.txt";
        
        // Instanciar FileReader y FileWriter
        try (FileReader fr = new FileReader(archivoEntrada); 
             FileWriter fw = new FileWriter(archivoSalida)) {
             
            int caracter;
            // Leer el archivo de entrada carácter por carácter y escribirlo en el archivo de salida
            while ((caracter = fr.read()) != -1) {
                fw.write(caracter);
            }

            System.out.println("El contenido se ha copiado correctamente.");
            
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

	}

}
