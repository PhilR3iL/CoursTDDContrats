package bonjour;

public class Bonjour {

	public static String bonjour(String... noms) {
		if (noms == null)
			return "Bonjour, ami.";
		if (noms[0].equals(noms[0].toUpperCase()))
			return "BONJOUR, " + noms[0].toUpperCase() + " !";
		return "Bonjour, " + noms[0] + ".";
	}

}
