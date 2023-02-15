package fizzbuzz;

public class FizzBuzz {

	/**
	 * Réalise le calcul du FizzBuzz pour i.
	 * 
	 * @param i valeur d'entrée
	 * @return cf. énoncé
	 */
	public static String fizzBuzz(int i) {
		if(i == 0)
			return "0";
		if (i % 3 == 0)
			return "Fizz";
		else
			return Integer.toString(i);
	}

}
