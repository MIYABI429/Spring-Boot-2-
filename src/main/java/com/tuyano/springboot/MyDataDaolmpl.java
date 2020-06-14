package com.tuyano.springboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MyDataDaolmpl implements MyDataDao<MyData> {
 private static final long serialVersionUID = 1L;

 private EntityManager entityManager;

 public MyDataDaolmpl() {
	 super();
 }
 public MyDataDaolmpl(EntityManager manager) {
	 this();
	 entityManager = manager;
 }
	@Override
	public List<MyData> getAll() {
		Query  query = entityManager.createQuery("from MyData");
		@SuppressWarnings("unchecked")
		List<MyData> list = query.getResultList();
		entityManager.close();
		return list;
	}

}
