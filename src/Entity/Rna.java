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

	// TODO find a way to not rewrite the constructor code
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
	 * @return the list of the nitrogenous bases that compose the Rna
	 */
	public List<NitrogenousBase> getNitrogenousBases() {
		return nitrogenousBases;
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
