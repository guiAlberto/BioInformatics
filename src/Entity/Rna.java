package Entity;

import java.util.ArrayList;
import java.util.List;

import Exception.InvalidRnaException;

public class Rna {

	private List<NitrogenousBase> nitrogenousBases;

	/**
	 * @param nitrogenousBases
	 *            list of the nitrogenous bases that compose the Rna
	 * @throws InvalidRnaException
	 */
	public Rna(List<NitrogenousBase> nitrogenousBases) throws InvalidRnaException {
		super();
		if (nitrogenousBases.size() % 3 != 0) {
			throw new InvalidRnaException();
		}
		this.nitrogenousBases = nitrogenousBases;
	}

	/**
	 * @param string
	 *            list of the nitrogenous bases that compose the Rna
	 * @throws InvalidRnaException
	 */
	public Rna(String string) throws InvalidRnaException {
		List<NitrogenousBase> nitrogenousBases = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			nitrogenousBases.add(new NitrogenousBase(new Character(string.charAt(i))));
		}
		if (nitrogenousBases.size() % 3 != 0) {
			throw new InvalidRnaException();
		}
		this.nitrogenousBases = nitrogenousBases;
	}

	/**
	 * @return Number of nitrogenous bases that compose the RNA
	 */
	public int size() {
		return this.nitrogenousBases.size();
	}

	/**
	 * @param i
	 *            Index of nitrogenous base in the RNA
	 * @return Nitrogenous Base at index position
	 */
	public NitrogenousBase getNitrogenousBaseAt(int i) {
		return this.nitrogenousBases.get(i);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < this.nitrogenousBases.size(); i++) {
			stringBuilder.append(this.nitrogenousBases.get(i).toString());
		}
		return stringBuilder.toString();
	}

}
