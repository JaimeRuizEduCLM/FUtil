package es.iesmaestredecalatrava;

public class Jugador implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private int numero;
	private String nombre;
	private int puntuacion;
	public Jugador(String nombre, int numero) {
		this.nombre=nombre;
		this.numero=numero;
		this.puntuacion=0;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNumero() {
		return numero;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void sumarPuntos (int puntos) {
		puntuacion=puntuacion+puntos;
	}
	public String toString() {
		return "Nombre: " + nombre + " Numero: " + numero + " Puntuacion: " + puntuacion;
	}
}
