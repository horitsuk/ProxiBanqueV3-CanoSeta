/**
 * Licence CC0
 * Auteur : K
 */
package fr.gtm.proxibanqueSI.v3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.util.Bdd;

public abstract class ADao<T> implements IDao<T>{

	protected Class<T> entityClass;

	
	/* (non-Javadoc)
	 * @see com.objis.dao.IDao#create(T)
	 */
	@Override
	public void create(T object) {
		EntityManagerFactory emf = new Bdd().connexion();
		EntityManager em = emf.createEntityManager();

		try {
			// Début de la transaction avec la BDD
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			// Création d'un enregistrement de formation dans la BDD
			em.persist(object);

			// Fermeture de la transaction, du gestionnaire d'entité et de sa
			// fabrique
			tx.commit();
		} finally {
			em.close();
			new Bdd().deconnexion(emf);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.objis.dao.IDao#read(java.lang.Object)
	 */
	@Override
	public T read(Object primaryKey) {
		EntityManagerFactory emf = new Bdd().connexion();
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		T returnedObject = (T) em.find(this.entityClass, primaryKey);

		tx.commit();

		em.close();
		new Bdd().deconnexion(emf);

		return returnedObject;
	}

	/* (non-Javadoc)
	 * @see com.objis.dao.IDao#update(T)
	 */
	@Override
	public T update(T object) {
		EntityManagerFactory emf = new Bdd().connexion();
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		T returnedObject = (T) em.merge(object);

		tx.commit();

		em.close();
		new Bdd().deconnexion(emf);

		return returnedObject;
	}

	/* (non-Javadoc)
	 * @see com.objis.dao.IDao#delete(T)
	 */
	@Override
	public void delete(T object) {
		EntityManagerFactory emf = new Bdd().connexion();
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// Suppression d'un enregistrement dans la BDD
		em.remove(object);

		tx.commit();

		em.close();
		new Bdd().deconnexion(emf);
	}
}
