package bonjour;

public class Bonjour {

	public static String bonjour(String nom) {
		if (nom == null)
			return "Bonjour, ami.";
		if (nom.equals(nom.toUpperCase()))
			return "BONJOUR, " + nom.toUpperCase() + " !";
		return "Bonjour, " + nom + ".";
	}

}
