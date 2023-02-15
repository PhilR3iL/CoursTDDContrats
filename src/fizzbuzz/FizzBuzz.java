package fizzbuzz;

public class FizzBuzz {

	/**
	 * Réalise le calcul du FizzBuzz pour i.
	 * 
	 * @param i valeur d'entrée
	 * @return cf. énoncé
	 */
	public static String fizzBuzz(int i) {
		String res = "0";
		// Cas 0 particulier.
		if (i != 0) {
			if (i % 3 == 0 && i % 5 == 0)
				res = "FizzBuzz";
			else if (i % 3 == 0)
				res = "Fizz";
			else if (i % 5 == 0)
				res = "Buzz";
			else
				// Cas général
				res = Integer.toString(i);
		}
		return res;
	}

}
