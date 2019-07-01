/* package com.esoft.societyadd.daoservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.provider.PersistenceProvider;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

public class CustomRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements CustomRepository<T, ID>
	{

	private static final String ID_MUST_NOT_BE_NULL = "The given id must not be null!";

	private final JpaEntityInformation<T, ?> entityInformation;
	private final EntityManager em;
	private final PersistenceProvider provider;
	private Class<?> springDataRepositoryInterface;

	public Class<?> getSpringDataRepositoryInterface() {
		return springDataRepositoryInterface;
	}

	public void setSpringDataRepositoryInterface(Class<?> springDataRepositoryInterface) {
		this.springDataRepositoryInterface = springDataRepositoryInterface;
	}

	public CustomRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager,
			Class<?> springDataRepositoryInterface) {
		super(entityInformation, entityManager);
		this.entityInformation = entityInformation;
		this.em = entityManager;
		this.provider = PersistenceProvider.fromEntityManager(entityManager);
		this.springDataRepositoryInterface = springDataRepositoryInterface;
	}

	public CustomRepositoryImpl(Class<T> domainClass, EntityManager em) {
		this(JpaEntityInformationSupport.getEntityInformation(domainClass, em), em, null);
	}

	@Override
	public <S extends T> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Long deleteBySocietyName(String societyName) {
		// TODO Auto-generated method stub
		return null;
	}

	

	 
	

	

	 
	 

}
*/