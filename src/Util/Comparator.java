package Util;

import Entity.Protein;

/**
 * Class responsible to compare proteins
 * 
 * @author guilherme
 *
 */
public class Comparator {

	/**
	 * Method responsible for compare two proteins.
	 * 
	 * It only compare the amino acids at the same index between two proteins.
	 * If one is larger than the other, the remaining amino acids are ignored.
	 * 
	 * @param p1
	 * @param p2
	 * @return Score of similarity between the two proteins. 0 for completely
	 *         different and 1 for completely equals.
	 */
	public static double compare(Protein p1, Protein p2) {
		if (p1.size() > p2.size()) {
			Protein temp = p1;
			p1 = p2;
			p2 = temp;
		}
		int score = 0;
		for (int i = 0; i < p1.size(); i++) {
			if (p1.getAminoacid(i).equals(p2.getAminoacid(i))) {
				score++;
			}
		}
		return (double) score / p1.size();
	}

}
