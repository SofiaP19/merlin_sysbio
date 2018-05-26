package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationProductlist;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationProductlistDAO;


public class EnzymesAnnotationProductlistDAOImpl extends GenericDaoImpl<EnzymesAnnotationProductlist> implements IEnzymesAnnotationProductlistDAO {

	public EnzymesAnnotationProductlistDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationProductlist.class);
		
	}

	public void addEnzymesAnnotationProductlist(EnzymesAnnotationProductlist enzymesAnnotationProductlist) {
		super.save(enzymesAnnotationProductlist);
		
	}

	public void addEnzymesAnnotationProductlist(List<EnzymesAnnotationProductlist> enzymesAnnotationProductlistList) {
		for (EnzymesAnnotationProductlist enzymesAnnotationProductlist: enzymesAnnotationProductlistList) {
			this.addEnzymesAnnotationProductlist(enzymesAnnotationProductlist);
		}
		
	}

	public List<EnzymesAnnotationProductlist> getAllEnzymesAnnotationProductlist() {
		return super.findAll();
	}

	public EnzymesAnnotationProductlist getEnzymesAnnotationProductlistInteger(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationProductlist(EnzymesAnnotationProductlist enzymesAnnotationProductlist) {
		super.delete(enzymesAnnotationProductlist);
		
	}

	public void removeEnzymesAnnotationProductlistList(List<EnzymesAnnotationProductlist> enzymesAnnotationProductlistList) {
		for (EnzymesAnnotationProductlist enzymesAnnotationProductlist: enzymesAnnotationProductlistList) {
			this.removeEnzymesAnnotationProductlist(enzymesAnnotationProductlist);
		}
		
	}

	public void updateEnzymesAnnotationProductlistList(List<EnzymesAnnotationProductlist> enzymesAnnotationProductlistList) {
		for (EnzymesAnnotationProductlist enzymesAnnotationProductlist: enzymesAnnotationProductlistList) {
			this.update(enzymesAnnotationProductlist);
		}
		
	}

	public void updateEnzymesAnnotationProductlist(EnzymesAnnotationProductlist enzymesAnnotationProductlist) {
		super.update(enzymesAnnotationProductlist);
		
	}

}
