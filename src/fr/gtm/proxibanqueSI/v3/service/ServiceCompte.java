package fr.gtm.proxibanqueSI.v3.service;

import Domaine.*;

public abstract class ServiceCompte {

	/**
	 * 
	 * @param client
	 */
	public Compte creerCompte(Client client) {
		// TODO - implement ServiceCompte.creerCompte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compte
	 */
	public void consulterCompte(Compte compte) {
		// TODO - implement ServiceCompte.consulterCompte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compte
	 */
	public void supprimerCompte(Compte compte) {
		// TODO - implement ServiceCompte.supprimerCompte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compteDebite
	 * @param montant
	 * @param compteCredite
	 */
	public void faireVirement(Compte compteDebite, double montant, Compte compteCredite) {
		// TODO - implement ServiceCompte.faireVirement
		throw new UnsupportedOperationException();
	}

}