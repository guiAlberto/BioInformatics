package Entity;

import java.util.ArrayList;
import java.util.List;

import Exception.InvalidProteinException;

/**
 * A class that handle the protein properties. It contains a list of the amino
 * acids components from the protein.
 * 
 * @author guilherme
 *
 */
public class Protein {

	private List<AminoAcid> aminoAcids;

	public Protein(List<AminoAcid> aminoAcids) throws InvalidProteinException {
		super();
		this.aminoAcids = aminoAcids;
	}

	public Protein(String string) {
		List<AminoAcid> aminoAcids = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			aminoAcids.add(new AminoAcid(string.charAt(i)));
		}
		this.aminoAcids = aminoAcids;
	}

	/**
	 * @return Number of amino acids that compose the protein
	 */
	public int size() {
		return this.aminoAcids.size();
	}

	/**
	 * @param i
	 *            Index of the amino acid in the protein
	 * @return Amino acid at index position
	 */
	public AminoAcid getAminoacid(int i) {
		return this.aminoAcids.get(i);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < this.aminoAcids.size(); i++) {
			stringBuilder.append(this.aminoAcids.get(i).toString());
		}
		return stringBuilder.toString();
	}

}
