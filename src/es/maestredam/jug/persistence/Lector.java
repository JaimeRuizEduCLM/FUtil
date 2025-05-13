package es.maestredam.jug.persistence;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import es.iesmaestredecalatrava.Persona;


public class Lector {
	private String filename;
	public Lector(String filename) {
		this.filename=filename;
	}
	public Persona leer1() throws ClassNotFoundException {
		Persona objeto = null;
		try (ObjectInputStream fichero =
					new ObjectInputStream(new FileInputStream(filename)) ) {
			objeto = (Persona) fichero.readObject();
		}catch (FileNotFoundException fnfe) {
			System.out.println("ERROR: fichero no encontado");
		}catch (EOFException eof) {
			System.out.println("ERROR: Encontrado EOF");
		}catch (IOException ioe) {
			System.out.println("ERROR Lectura: " + ioe);
		}
		return objeto;
	}
	public Persona leer() throws ClassNotFoundException{
		Persona objeto = null;
		ArrayList<Persona> lista = new ArrayList<>();
		try (ObjectInputStream fichero =
				new ObjectInputStream(new FileInputStream(filename)) ) {
			while(true) {
				objeto = (Persona) fichero.readObject();
				lista.add(objeto);
			}
			}catch (FileNotFoundException fnfe) {
				System.out.println("ERROR: fichero no encontado");
			}catch (EOFException eof) {
				System.out.println("ERROR: Encontrado EOF");
			}catch (IOException ioe) {
				System.out.println("ERROR Lectura: " + ioe);
			}
		return objeto;
		}
	}