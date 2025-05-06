package es.iesmaestredecalatrava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MeterFrase {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter (new FileWriter("frase.txt"))) {
			bw.write("La vida es así");
		}catch (IOException e) {
		}

	}

}
