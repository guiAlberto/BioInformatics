package Entity;

import Exception.InvalidAminoAcidException;

/**
 * A class that handle one amino acid.
 * 
 * @author guilherme
 *
 */
public class AminoAcid {

	private Character aminoAcid;

	/**
	 * @param amonoAcid
	 *            Character representation of an amino acid
	 * @throws InvalidAminoAcidException
	 */
	public AminoAcid(Character amonoAcid) throws InvalidAminoAcidException {
		super();
		if (!amonoAcid.equals('F') && !amonoAcid.equals('L') && !amonoAcid.equals('S') && !amonoAcid.equals('Y')
				&& !amonoAcid.equals('C') && !amonoAcid.equals('W') && !amonoAcid.equals('P') && !amonoAcid.equals('H')
				&& !amonoAcid.equals('Q') && !amonoAcid.equals('R') && !amonoAcid.equals('I') && !amonoAcid.equals('M')
				&& !amonoAcid.equals('T') && !amonoAcid.equals('N') && !amonoAcid.equals('K') && !amonoAcid.equals('V')
				&& !amonoAcid.equals('A') && !amonoAcid.equals('D') && !amonoAcid.equals('E')
				&& !amonoAcid.equals('G')) {
			throw new InvalidAminoAcidException();
		}
		this.aminoAcid = amonoAcid;
	}

	@Override
	public String toString() {
		return this.aminoAcid.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aminoAcid == null) ? 0 : aminoAcid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AminoAcid other = (AminoAcid) obj;
		if (aminoAcid == null) {
			if (other.aminoAcid != null)
				return false;
		} else if (!aminoAcid.equals(other.aminoAcid))
			return false;
		return true;
	}

}
