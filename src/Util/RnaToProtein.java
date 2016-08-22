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
	public static Protein covert(final Rna rna) throws InvalidAminoAcidException {
		List<Codom> codoms = new ArrayList<Codom>();
		List<NitrogenousBase> nitrogenousBases = rna.getNitrogenousBases();
		int i = 0;
		while (i < nitrogenousBases.size()) {
			NitrogenousBase[] crack = new NitrogenousBase[3];
			crack[0] = nitrogenousBases.get(i++);
			crack[1] = nitrogenousBases.get(i++);
			crack[2] = nitrogenousBases.get(i++);
			Codom codom = new Codom(crack);
			codoms.add(codom);
		}
		List<AminoAcid> aminoacids = CodomToAminoacid.convert(codoms);
		Protein protein = new Protein(aminoacids);
		return protein;
	}

}
