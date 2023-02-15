package fizzbuzz;

public class FizzBuzz {

	/**
	 * Réalise le calcul du FizzBuzz pour i.
	 * 
	 * @param i valeur d'entrée
	 * @return cf. énoncé
	 */
	public static String fizzBuzz(int i) {
		if (i == 3)
			return "Fizz";
		else
			return Integer.toString(i);
	}

}
