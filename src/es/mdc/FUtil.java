package es.mdc;
import java.io.File;

/**
 * Verifica si un archivo con el nombre especificado existe en el sistema de archivos.
 *
 * @param filename El nombre (ruta) del archivo a verificar.
 * @return {@code true} si el archivo existe; {@code false} si no existe.
 * @throws IllegalArgumentException si el nombre del archivo está vacío o en blanco.
 * @author jaime
 */
public class FUtil {
	public static boolean existe(String filename) {
		File file = new File(filename);
		if (file.exists()) {
				return true;
			}
		if (filename.isEmpty() || filename.isBlank()) {
			throw new IllegalArgumentException ("No existe el archivo");
		}
			return false;
	}
}
