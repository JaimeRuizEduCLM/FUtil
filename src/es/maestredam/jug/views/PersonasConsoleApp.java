package es.maestredam.jug.views;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import es.iesmaestredecalatrava.Persona;
import es.maestredam.jug.persistence.Escritor;
import es.maestredam.jug.persistence.Lector;

public class PersonasConsoleApp {
	public static void main(String [] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		Persona p = new Persona("Ana", true, 2000);
		Escritor escritor = new Escritor("personas.dat");
		escritor.escribir(p);
		System.out.println(p.getNombre());
		Lector lector = new Lector("personas.dat");
		Persona pLeido = lector.leer();
		System.out.print("He leido objeto ");
		
		System.out.println(pLeido.getNombre());
		Persona n= new Persona("Nico", false, 1000);
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p);
		listaPersonas.add(n);
		escritor.escribir(listaPersonas);
	}
}
