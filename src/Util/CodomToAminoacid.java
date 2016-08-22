package Util;

import java.util.ArrayList;
import java.util.List;

import Entity.AminoAcid;
import Entity.Codom;
import Exception.InvalidAminoAcidException;

/**
 * Class responsible to convert codom to amino acid.
 * 
 * @author guilherme
 *
 */
public class CodomToAminoacid {

	/**
	 * Method responsible to convert one codom to one amino acid.
	 * 
	 * @param codom
	 * @returnColl
	 * @throws InvalidAminoAcidException
	 */
	public static AminoAcid convert(Codom codom) throws InvalidAminoAcidException {
		return codom.getAminoacid();
	}

	/**
	 * Method responsible to convert a list of codoms to a list of respective
	 * amino acids.
	 * 
	 * @param codoms
	 * @return
	 * @throws InvalidAminoAcidException
	 */
	public static List<AminoAcid> convert(List<Codom> codoms) throws InvalidAminoAcidException {
		List<AminoAcid> aminoacids = new ArrayList<>();
		for (Codom codom : codoms) {
			aminoacids.add(CodomToAminoacid.convert(codom));
		}
		return aminoacids;
	}

}
