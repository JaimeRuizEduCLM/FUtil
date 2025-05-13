package es.iesmaestredecalatrava;

public class Persona implements java.io.Serializable{
	private static final long serialVersionUID = 1512495449323780145L;
	private String nombre;
	private boolean mayorEdad;
	private double saldo;
	
	public Persona(String nombre, boolean mayorEdad, double saldo) {
		this.nombre=nombre;
		this.mayorEdad=mayorEdad;
		this.saldo=saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean isMayorEdad() {
		return mayorEdad;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo (double saldo) {
		if (saldo<0) {
			throw new IllegalArgumentException("El saldo es negativo");
		}
		this.saldo=saldo;
	}
	public String toString() {
		return "Persona [nombre=" + nombre + " saldo= " + saldo + " mayorEdad= " + mayorEdad + "]";
	}
}
