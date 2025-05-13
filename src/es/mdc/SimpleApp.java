package es.mdc;
import java.io.File;

public class SimpleApp {

	public static void main(String[] args) {
		FUtil file1 = new FUtil ();
		file1.existe("file.txt");
		file1.existe("");
	}

}
