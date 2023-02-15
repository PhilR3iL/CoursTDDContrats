package bonjour;

public class Bonjour {

	public static String bonjour(String... noms) {
		if (noms == null)
			return "Bonjour, ami.";
		if(noms.length == 1) {
		if (noms[0].equals(noms[0].toUpperCase()))
			return "BONJOUR, " + noms[0].toUpperCase() + " !";
		return "Bonjour, " + noms[0] + ".";
		}else {
			return "Bonjour, "+noms[0] + " et " + noms[1] + ".";
		}
	}

}
