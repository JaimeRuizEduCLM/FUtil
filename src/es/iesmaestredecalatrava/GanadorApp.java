package es.iesmaestredecalatrava;

import java.util.ArrayList;

public class GanadorApp {

	public static void main(String[] args) {
		final String fichero = "jugadores.dat";
		ArrayList<Jugador>lista1= new ArrayList<>();
		Jugador j1= new Jugador("Ana",1);
		lista1.add(j1);
		lista1.add(new Jugador("Juan",2));
		lista1.get(2).sumarPuntos(10);
		for (Jugador j:lista1) {
			fichero.writeObject(j1);
		}
		while (true) {
			Jugador j1= (Jugador)fichero.readObject());
			ArrayList<Jugador> listaLectura;
			listaLectura.add(j1);
		}
	}

}
