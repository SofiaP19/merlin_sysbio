package hibernate.merlin_hibernate.dao.Interface;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

public interface IGenericDao<T> {
	
		public SessionFactory getSessionFactory();
	//	public void setKlass(Class<T> klass); - eliminar método na impl
	
		public T findById(Serializable id);

		public List<T> findAll();

		public List<T> findByAttributes(Map<String, Serializable> eqRestrictions);
		
		public List<T> findByAttributesWithPagniation(Map<String, Serializable> eqRestrictions, int index, int limit);

		public T findUniqueByAttribute(String attribute, Serializable value);

		public List<T> findByOrAttributes(Map<String, Serializable> orRestrictions);

		public void flushSession();
		
		public void clearSession();

		public void save(Object object);

		public void update(Object object);

		public void delete(Object object);

		public void refresh(Object object);

		public void evict(Object object);
		
		public T merge(Object object);
}


