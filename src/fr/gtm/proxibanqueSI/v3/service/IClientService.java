package fr.gtm.proxibanqueSI.v3.service;

import Domaine.*;

public interface IClientService {

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 * @param tel
	 * @param email
	 */
	Client creerClient(String nom, String prenom, String adresse, int codePostal, String ville, int tel, String email);

	/**
	 * 
	 * @param client
	 */
	void lireClient(Client client);

	/**
	 * 
	 * @param client
	 */
	void modifierClient(Client client);

	/**
	 * 
	 * @param client
	 */
	void supprimerClient(Client client);

}