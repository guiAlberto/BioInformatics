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

	/**
	 * @param aminoAcids
	 *            List of amino acid. It must have the special "stop" amino acid
	 *            at the last position, and only there.
	 * @throws InvalidProteinException
	 */
	public Protein(List<AminoAcid> aminoAcids) throws InvalidProteinException {
		super();
		AminoAcid stopAminoacid = new AminoAcid('X');
		AminoAcid lastAminoacid = aminoAcids.get(aminoAcids.size() - 1);
		List<AminoAcid> proteinWithoutLastAminoacid = new ArrayList<>();
		for (int i = 0; i < aminoAcids.size() - 1; i++) {
			proteinWithoutLastAminoacid.add(aminoAcids.get(i));
		}

		if (!aminoAcids.contains(stopAminoacid)) {
			throw new InvalidProteinException("Protein does not contains any stop amino acid");
		}

		if (!lastAminoacid.equals(stopAminoacid)) {
			throw new InvalidProteinException("Protein last amino acid is not a stop amino acid");
		}

		if (proteinWithoutLastAminoacid.contains(stopAminoacid)) {
			throw new InvalidProteinException(
					"Some of the amino acids is a stop amino acid and it is not the last one");
		}
		this.aminoAcids = aminoAcids;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < this.aminoAcids.size() - 1; i++) {
			stringBuilder.append(this.aminoAcids.get(i).toString());
		}
		return stringBuilder.toString();
	}

}
