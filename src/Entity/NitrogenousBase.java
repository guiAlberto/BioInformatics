package Entity;

import Exception.InvalidNitrogenousBaseException;

/**
 * A class that handle the information of an nitrogenous base by an
 * identification character abbreviation: adenine ("A"), uracil ("U"), guanine
 * ("G"), thymine ("T"), and cytosine ("C").
 * 
 * @author guilherme
 *
 */
public class NitrogenousBase {

	private Character nitrogenousBase;

	/**
	 * @param nitrogenousBase
	 *            Case sensitive character that represent the nitrogenous base.
	 * @throws InvalidNitrogenousBaseException
	 */
	public NitrogenousBase(Character nitrogenousBase) throws InvalidNitrogenousBaseException {
		super();
		if (!nitrogenousBase.equals("A") && !nitrogenousBase.equals("T") && !nitrogenousBase.equals("C")
				&& !nitrogenousBase.equals("G") && nitrogenousBase.equals("U")) {
			throw new InvalidNitrogenousBaseException();
		}
		this.nitrogenousBase = nitrogenousBase;
	}

	@Override
	public String toString() {
		return this.nitrogenousBase.toString();
	}

}
