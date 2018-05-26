package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologues;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationHomologuesDAO;

public class EnzymesAnnotationHomologuesDAOImpl extends GenericDaoImpl<EnzymesAnnotationHomologues> implements IEnzymesAnnotationHomologuesDAO {

	public EnzymesAnnotationHomologuesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationHomologues.class);
		
	}

	public void addEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues) {
		super.save(enzymesAnnotationHomologues);
		
	}

	public void addEnzymesAnnotationHomologues(List<EnzymesAnnotationHomologues> enzymesAnnotationHomologuesList) {
		for (EnzymesAnnotationHomologues enzymesAnnotationHomologues: enzymesAnnotationHomologuesList) {
			this.addEnzymesAnnotationHomologues(enzymesAnnotationHomologues);
		}
		
	}

	public List<EnzymesAnnotationHomologues> getAllEnzymesAnnotationHomologues() {
		return super.findAll();
	}

	public EnzymesAnnotationHomologues getEnzymesAnnotationHomologues(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues) {
		super.delete(enzymesAnnotationHomologues);
		
	}

	public void removeEnzymesAnnotationHomologuesList(List<EnzymesAnnotationHomologues> enzymesAnnotationHomologuesList) {
		for (EnzymesAnnotationHomologues enzymesAnnotationHomologues: enzymesAnnotationHomologuesList) {
			this.removeEnzymesAnnotationHomologues(enzymesAnnotationHomologues);
		}
		
	}

	public void updateEnzymesAnnotationHomologuesList(List<EnzymesAnnotationHomologues> enzymesAnnotationHomologuesList) {
		for (EnzymesAnnotationHomologues enzymesAnnotationHomologues: enzymesAnnotationHomologuesList) {
			this.update(enzymesAnnotationHomologues);
		}
		
	}

	public void updateEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues) {
		super.update(enzymesAnnotationHomologues);
		
	}

		
	
}


