package fr.gtm.proxibanqueSI.v3.service;

import Domaine.*;

public interface IGestionCompte {

	/**
	 * 
	 * @param client
	 */
	Compte creerCompte(Client client);

	/**
	 * 
	 * @param compte
	 */
	void consulterCompte(Compte compte);

	/**
	 * 
	 * @param compte
	 */
	void supprimerCompte(Compte compte);

	/**
	 * 
	 * @param compteDebite
	 * @param montant
	 * @param compteCredite
	 */
	void faireVirement(Compte compteDebite, int montant, Compte compteCredite);

}