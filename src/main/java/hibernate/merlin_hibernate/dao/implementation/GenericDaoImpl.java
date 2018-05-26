package hibernate.merlin_hibernate.dao.implementation;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


import hibernate.merlin_hibernate.dao.Interface.IGenericDao;

//import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
//import org.hibernate.criterion.Disjunction;
//import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class GenericDaoImpl<T> implements IGenericDao<T> {


		private SessionFactory sessionFactory;
		private Class<T> klass;

		public GenericDaoImpl(SessionFactory sessionFactory, Class<T> klass) {
			this.sessionFactory = sessionFactory;
			this.klass = klass;
		}

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public T findById(Serializable id) {
			T T = (T) sessionFactory.getCurrentSession().get(klass, id);
			return T;
		}

		public List<T> findAll() {
			CriteriaQuery<T> c = sessionFactory.getCurrentSession().getCriteriaBuilder().createQuery(klass);
			Root<T> root = c.from(klass);
			c.select(root);
			Query<T> q = sessionFactory.getCurrentSession().createQuery(c);
			return q.getResultList();
		}

		public List<T> findByAttributes(Map<String, Serializable> eqRestrictions) {
			CriteriaBuilder cb = sessionFactory.getCurrentSession().getCriteriaBuilder();
			CriteriaQuery<T> c = cb.createQuery(klass);
			
			Root<T> table = c.from(klass); //converte a classe em tabela
		    c.select(table); //seta a tabela na consulta
		    
		    List<Predicate> filters = new ArrayList<Predicate>(); //cria um array de filtros(predicados)
			for (Map.Entry<String, Serializable> entry : eqRestrictions.entrySet()) //percorre todos os atributos (entrySet() pq os atributos são um dicionario)
				filters.add(cb.equal(table.get(entry.getKey()),entry.getValue())); //cria os predicados e adiciona ao array
			
			Predicate p = cb.and(filters.toArray(new Predicate[] {}));  // junta todos os predicados com and
			c.where(p);
			Query<T> q = sessionFactory.getCurrentSession().createQuery(c);
			return q.getResultList();
		}

		public List<T> findByAttributesWithPagniation(Map<String, Serializable> eqRestrictions, int index, int limit) {
			CriteriaBuilder cb = sessionFactory.getCurrentSession().getCriteriaBuilder();
			CriteriaQuery<T> c = cb.createQuery(klass);
			
			Root<T> table = c.from(klass); //converte a classe em tabela
		    c.select(table); //seta a tabela na consulta
			
		    List<Predicate> filters = new ArrayList<Predicate>(); //cria um array de filtros(predicados)
			for (Map.Entry<String, Serializable> entry : eqRestrictions.entrySet()) //percorre todos os atributos (entrySet() pq os atributos são um dicionario)
				filters.add(cb.equal(table.get(entry.getKey()),entry.getValue())); //cria os predicados e adiciona ao array
			
			Predicate p = cb.and(filters.toArray(new Predicate[] {}));  // junta todos os predicados com and
			c.where(p);
			
		
			Query<T> q = sessionFactory.getCurrentSession().createQuery(c);
			q.setMaxResults(limit);
			q.setFirstResult(index);
			q.setFetchSize(limit);
			return q.getResultList();
		}

		public T findUniqueByAttribute(String attribute, Serializable value) {
			Map<String, Serializable> eqRestrictions = new HashMap<String, Serializable>();
			eqRestrictions.put(attribute, value);
			List<T> result = findByAttributes(eqRestrictions);
			if (result.size() == 1)
				return result.get(0);

			return null;
		}

		public List<T> findByOrAttributes(Map<String, Serializable> orRestrictions) {
			CriteriaBuilder cb = sessionFactory.getCurrentSession().getCriteriaBuilder();
			CriteriaQuery<T> c = cb.createQuery(klass);
			
			Root<T> table = c.from(klass); //converte a classe em tabela
			c.select(table); //seta a tabela na consulta
			
			List<Predicate> filters = new ArrayList<Predicate>(); //cria um array de filtros(predicados)
			for (Map.Entry<String, Serializable> entry : orRestrictions.entrySet()) //percorre todos os atributos (entrySet() pq os atributos são um dicionario)
				filters.add(cb.equal(table.get(entry.getKey()),entry.getValue())); //cria os predicados e adiciona ao array
			
			Predicate p = cb.or(filters.toArray(new Predicate[] {}));  // junta todos os predicados com or
			c.where(p);
			Query<T> q = sessionFactory.getCurrentSession().createQuery(c);
			return q.getResultList();
		}

		public void flushSession() {
			sessionFactory.getCurrentSession().flush();
			
		}

		public void clearSession() {
			sessionFactory.getCurrentSession().clear();
			
		}

		public void save(Object object) {
			sessionFactory.getCurrentSession().save(object);
		}

		public void update(Object object) {
			sessionFactory.getCurrentSession().update(object);
			
		}

		public void delete(Object object) {
			sessionFactory.getCurrentSession().delete(object);
			
		}

		public void refresh(Object object) {
			sessionFactory.getCurrentSession().refresh(object);
			
		}

		public void evict(Object object) {
			sessionFactory.getCurrentSession().evict(object);
			
		}

		public T merge(Object object) {
			@SuppressWarnings("unchecked")
			T castedObj = (T) sessionFactory.getCurrentSession().merge(object);
			return castedObj;	
		}


}
