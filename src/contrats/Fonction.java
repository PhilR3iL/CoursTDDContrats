package contrats;

public class Fonction {
	
	/**
	 * Calcule le maximum de a et b.
	 * @param a
	 * @param b
	 * @return
	 * @ensure max(a,b) >= a 
	 * @ensure max(a,b) >= b
	 * @ensure max(a,b) == a || max(a,b) == b
	 */
	public static int max(int a, int b) {

		int MAX = 0;
		/// CALCUL DU MAX
		
		///
		assert(MAX >= a);
		assert(MAX >= b);
		assert(MAX == a || MAX == b);
		return MAX;
	}
}
