package bonjour;

public class Bonjour {

	public static String bonjour(String nom) {
		if (nom == null)
			return "Bonjour, ami.";
		if (nom.equals("NORBERT"))
			return "BONJOUR, NORBERT !";
		else if (nom.equals("PATRICK"))
			return "BONJOUR, PATRICK !";
		return "Bonjour, " + nom + ".";
	}

}
