import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioB1 {
	public static void main(String[] args) {
		try {
			File f = new File("./Documentos/numeros.txt");
			Scanner sc = null;
			sc = new Scanner(f);
			
			int max = sc.nextInt();
			int min = sc.nextInt();
			
			while (sc.hasNextInt()) {
				int ln = sc.nextInt();
				
				if (ln > max) {
					max = ln;
				} else if (ln < min) {
					min = ln;
				}
			}
			
			System.out.println("El número máximo es: " + max);
			System.out.println("El número mínimo es: " + min);

			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
	}
}