package Util;

import java.util.ArrayList;
import java.util.List;

import Entity.AminoAcid;
import Entity.Codom;
import Entity.NitrogenousBase;
import Entity.Protein;
import Entity.Rna;
import Exception.InvalidAminoAcidException;

/**
 * Class responsible to convert rna to protein.
 * 
 * @author guilherme
 *
 */
public class RnaToProtein {

	/**
	 * Convert a rna to protein.
	 * 
	 * @param rna
	 * @return
	 * @throws InvalidAminoAcidException
	 */
	public static Protein covert(Rna rna) throws InvalidAminoAcidException {
		List<Codom> codoms = new ArrayList<Codom>();
		int i = 0;
		while (i < rna.size()) {
			NitrogenousBase[] crack = new NitrogenousBase[3];
			crack[0] = rna.getNitrogenousBaseAt(i++);
			crack[1] = rna.getNitrogenousBaseAt(i++);
			crack[2] = rna.getNitrogenousBaseAt(i++);
			Codom codom = new Codom(crack);
			codoms.add(codom);
		}
		List<AminoAcid> aminoacids = CodomToAminoacid.convert(codoms);
		Protein protein = new Protein(aminoacids);
		return protein;
	}

}
