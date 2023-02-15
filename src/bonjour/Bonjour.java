package bonjour;

public class Bonjour {

	public static String bonjour(String... noms) {
		if (noms == null)
			return "Bonjour, ami.";
		if (noms.length == 1) {
			if (noms[0].equals(noms[0].toUpperCase()))
				return "BONJOUR, " + noms[0].toUpperCase() + " !";
			return "Bonjour, " + noms[0] + ".";
		} else if (noms.length == 3) {
			return "Bonjour, " + noms[0] + ", " + noms[1] + " et " + noms[2] + ".";
		} else {
			return "Bonjour, " + noms[0] + " et " + noms[1] + ".";
		}
	}

}
