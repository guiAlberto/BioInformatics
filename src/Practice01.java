import java.util.Scanner;

import Entity.Protein;
import Entity.Rna;
import Exception.InvalidAminoAcidException;
import Util.RnaToProtein;

public class Practice01 {

	public static void main(String[] args) throws InvalidAminoAcidException {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira as bases do RNA (ou deixe em branco para um RNA de exemplo): ");
		string = scanner.nextLine();
		scanner.close();
		if (string.equals("")) {
			string = "AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA";
		}

		Rna rna = new Rna(string);
		Protein protein = RnaToProtein.covert(rna);
		System.out.println("RNA: " + rna.toString());
		System.out.println("Protein: " + protein.toString());
	}

}
