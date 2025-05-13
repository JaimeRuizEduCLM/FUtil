package es.maestredam.jug.persistence;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import es.iesmaestredecalatrava.Persona;

public class Escritor {
	private String filename;
	public Escritor (String filename) {
		this.filename = filename;
	}
	public void escribir(Persona persona) {
		try (ObjectOutputStream fichero = 
				new ObjectOutputStream(new FileOutputStream(filename)) ){
			fichero.writeObject(persona);
		}catch (IOException ioe) {
			System.out.println("ERROR Escritura: "+ioe);
		}
	}
	public void escribir(ArrayList<Persona> lista) throws FileNotFoundException, IOException {
		try (ObjectOutputStream fichero = 
				new ObjectOutputStream(new FileOutputStream(filename)) ){
			for (Persona p: lista) {
				fichero.writeObject(p);
			}
			}catch (IOException ioe) {
				System.out.println("ERROR Escritura: "+ioe);
			}
		}
}
