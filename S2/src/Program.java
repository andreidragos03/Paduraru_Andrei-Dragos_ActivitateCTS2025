import Clase.Angajat;
import Clase.Aplicant;
import Readers.AngajatReader;
import Readers.AplicantReader;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		AplicantReader aplicantReader = new AngajatReader("angajati.txt");
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = aplicantReader.readAplicanti();
			for(Aplicant aplicant : listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}