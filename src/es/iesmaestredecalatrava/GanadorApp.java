package es.iesmaestredecalatrava;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GanadorApp {

	public static void main(String[] args) {
		final String fichero = "jugadores2.dat";
		ArrayList<Jugador>lista1= new ArrayList<>();
		
		Jugador j1= new Jugador("Ana",1);
		lista1.add(j1);
		lista1.add(new Jugador("Juan",2));
		lista1.add(new Jugador("Jaime",3));
		lista1.get(1).sumarPuntos(10);
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
			for (Jugador j:lista1) {
				oos.writeObject(j);
			}
		}catch (IOException ioe) {
			System.out.println("Error de archivo " + ioe);
		}
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
			
			Jugador j;
			j=(Jugador) ois.readObject();
			while (j!=null) {
				System.out.println(j.toString());
				j=(Jugador) ois.readObject();
			}
		}catch (FileNotFoundException fnfe) {
			System.out.printf("%s no encontrado", fichero);
		}catch (EOFException eof) {
			System.out.println("[Fin]");
		}catch (IOException ioe) {
			System.out.println("ERROR E/S " +ioe.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
