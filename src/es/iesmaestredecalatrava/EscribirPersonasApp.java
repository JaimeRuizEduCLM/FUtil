package es.iesmaestredecalatrava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EscribirPersonasApp {

	public static void main(String[] args) {
		final String FICHERO = "personas.dat";
		Persona p1 = new Persona("Juan", true, 1000);
		Persona p2 = new Persona("Ana", true, 2000);
		Persona p3 = new Persona("Daniel", false, 0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		try (ObjectOutputStream ficheroPersonas = 
				new ObjectOutputStream(new FileOutputStream(FICHERO)) ){
			ficheroPersonas.writeObject(p1);
			ficheroPersonas.writeObject(p2);
			ficheroPersonas.writeObject(p3);
		}catch (IOException ioe) {
			System.out.println("ERROR Escritura: "+ioe);
		}
		p1=null;
		p2=null;
		p3=null;
		System.gc();

		try (ObjectInputStream ficheroPersonas = 
				new ObjectInputStream(new FileInputStream(FICHERO)) ){
			Persona pLeido1 = (Persona) ficheroPersonas.readObject();
			Persona pLeido2 = (Persona) ficheroPersonas.readObject();
			Persona pLeido3 = (Persona) ficheroPersonas.readObject();
			System.out.println(pLeido1);
			System.out.println(pLeido2);
			System.out.println(pLeido3);
		}catch (FileNotFoundException fnfe) {
			System.out.println("ERROR Fichero no encontrado");
		}catch (IOException ioe) {
			System.out.println("ERROR Lectura: "+ioe);
		}catch (ClassNotFoundException e) {
			System.out.println("ERROR Lectura: "+e);		
		}
	}
}