package com.esoft.societyadd.daoservice;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;



@NoRepositoryBean
public interface CustomRepository <T, ID extends Serializable>extends CrudRepository<T, ID>{

<S extends T> S save(S entity);
Long deleteBySocietyName(String societyName);
}
