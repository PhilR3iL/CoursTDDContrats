package contrats;

public class Compte {
	
	/**
	 * Le solde du compte.
	 */
	private int solde;
	
	/**
	 * Retire montant du compte.
	 * @param montant (en centimes)
	 * @return le solde restant
	 * @require (pré condition) montant > 0
	 * @require montant <= solde
	 * @ensure (post condition) solde < soldeDebut
	 * @assert (invariant) solde >= 0
	 */
	public int retirerArgent(int montant) {
		// Préconditions :
		assert(montant > 0) : "Le montant doit être positif.";
		assert(montant <= solde) : "Le montant retiré doit être inférieur au solde.";
		// Invariant
		assert(solde >= 0) : "Le compte ne doit pas être débiteur.";
		// Variables du contrat
		int soldeDebut = solde;
		///////////////////
		int retour = 0;
		///////////////////
		
		///////////////////
		// Le code ici ne sera pas donné.
		///////////////////
		
		///////////////////
		//// Post conditions :
		assert(solde < soldeDebut) : "On a bien retiré des sous.";
		// Invariant
		assert(solde >= 0) : "Le compte ne doit pas être débiteur.";
		return retour;
	}
}
