package fr.gtm.proxibanqueSI.v3.dao;

public interface IDao<T> {

	void create(T object);

	T read(Object primaryKey);

	T update(T object);

	void delete(T object);

}