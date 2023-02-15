package bonjour;

public class Bonjour {

	public static String bonjour(String nom) {
		if (nom == null)
			return "Bonjour, ami.";
		return "Bonjour, " + nom + ".";
	}

}
