package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationGenehomologyHasHomologues;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationGenehomologyHasHomologuesDAO;


public class EnzymesAnnotationGenehomologyHasHomologuesDAOImpl extends GenericDaoImpl<EnzymesAnnotationGenehomologyHasHomologues> implements IEnzymesAnnotationGenehomologyHasHomologuesDAO {

	public EnzymesAnnotationGenehomologyHasHomologuesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationGenehomologyHasHomologues.class);
		
	}

	public void addEnzymesAnnotationGenehomologyHasHomologues(
			EnzymesAnnotationGenehomologyHasHomologues enzymesAnnotationGenehomologyHasHomologues) {
		super.save(enzymesAnnotationGenehomologyHasHomologues);
		
	}

	public void addEnzymesAnnotationGenehomologyHasHomologuesList(List<EnzymesAnnotationGenehomologyHasHomologues> enzymesAnnotationGenehomologyHasHomologuesList) {
		for (EnzymesAnnotationGenehomologyHasHomologues enzymesAnnotationGenehomologyHasHomologues: enzymesAnnotationGenehomologyHasHomologuesList) {
			this.addEnzymesAnnotationGenehomologyHasHomologues(enzymesAnnotationGenehomologyHasHomologues);
		}
		
	}

	public List<EnzymesAnnotationGenehomologyHasHomologues> getAllEnzymesAnnotationGenehomologyHasHomologues() {
		return super.findAll();
	}

	public EnzymesAnnotationGenehomologyHasHomologues getEnzymesAnnotationGenehomologyHasHomologues(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationGenehomologyHasHomologues(EnzymesAnnotationGenehomologyHasHomologues enzymesAnnotationGenehomologyHasHomologues) {
		super.delete(enzymesAnnotationGenehomologyHasHomologues);
		
	}

	public void removeEnzymesAnnotationGenehomologyHasHomologuesList(List<EnzymesAnnotationGenehomologyHasHomologues> enzymesAnnotationGenehomologyHasHomologuesList) {
		for (EnzymesAnnotationGenehomologyHasHomologues enzymesAnnotationGenehomologyHasHomologues: enzymesAnnotationGenehomologyHasHomologuesList) {
			this.removeEnzymesAnnotationGenehomologyHasHomologues(enzymesAnnotationGenehomologyHasHomologues);
		}
		
	}

	public void updateEnzymesAnnotationGenehomologyHasHomologuesList(List<EnzymesAnnotationGenehomologyHasHomologues> enzymesAnnotationGenehomologyHasHomologuesList) {
		for (EnzymesAnnotationGenehomologyHasHomologues enzymesAnnotationGenehomologyHasHomologues: enzymesAnnotationGenehomologyHasHomologuesList) {
			this.update(enzymesAnnotationGenehomologyHasHomologues);
		}
		
	}

	public void updateEnzymesAnnotationGenehomologyHasHomologues(EnzymesAnnotationGenehomologyHasHomologues enzymesAnnotationGenehomologyHasHomologues) {
		super.update(enzymesAnnotationGenehomologyHasHomologues);
		
	}

}
