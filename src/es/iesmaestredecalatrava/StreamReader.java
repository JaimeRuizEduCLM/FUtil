package es.iesmaestredecalatrava;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader {

	public static void main(String[] args) {
		int car='?';
		
		try {
			InputStreamReader streamTeclado = new InputStreamReader(System.in);
			
			car= streamTeclado.read();
			streamTeclado.close();
		}catch (IOException ioe) {
			System.out.printf("ERROR E/S: ", ioe);
		}
		System.out.printf("Has tecleado %c %n", car);
	}
			
	}