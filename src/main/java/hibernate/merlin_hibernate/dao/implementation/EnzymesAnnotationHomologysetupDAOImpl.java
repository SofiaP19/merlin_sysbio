package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologysetup;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationHomologysetupDAO;


public class EnzymesAnnotationHomologysetupDAOImpl extends GenericDaoImpl<EnzymesAnnotationHomologysetup> implements IEnzymesAnnotationHomologysetupDAO  {

	public EnzymesAnnotationHomologysetupDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationHomologysetup.class);
		
	}

	public void addEnzymesAnnotationHomologysetup(EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup) {
		super.save(enzymesAnnotationHomologysetup);
		
	}

	public void addEnzymesAnnotationHomologysetupList(List<EnzymesAnnotationHomologysetup> enzymesAnnotationHomologysetupList) {
		for (EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup: enzymesAnnotationHomologysetupList) {
			this.addEnzymesAnnotationHomologysetup(enzymesAnnotationHomologysetup);
		}
		
	}

	public List<EnzymesAnnotationHomologysetup> getAllEnzymesAnnotationHomologysetup() {
		return super.findAll();
	}

	public EnzymesAnnotationHomologysetup getEnzymesAnnotationHomologysetup(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationHomologysetup(EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup) {
		super.delete(enzymesAnnotationHomologysetup);
		
	}

	public void removeEnzymesAnnotationHomologysetupList(List<EnzymesAnnotationHomologysetup> enzymesAnnotationHomologysetupList) {
		for (EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup: enzymesAnnotationHomologysetupList) {
			this.removeEnzymesAnnotationHomologysetup(enzymesAnnotationHomologysetup);
		}
		
	}

	public void updateEnzymesAnnotationHomologysetupList(List<EnzymesAnnotationHomologysetup> enzymesAnnotationHomologysetupList) {
		for (EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup: enzymesAnnotationHomologysetupList) {
			this.update(enzymesAnnotationHomologysetup);
		}
		
	}

	public void updateEnzymesAnnotationHomologysetup(EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup) {
		super.update(enzymesAnnotationHomologysetup);
		
	}

}
