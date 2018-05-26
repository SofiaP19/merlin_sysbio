package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationFastasequence;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationFastasequenceDAO;


public class EnzymesAnnotationFastasequenceDAOImpl extends GenericDaoImpl<EnzymesAnnotationFastasequence> implements IEnzymesAnnotationFastasequenceDAO{

	
	public EnzymesAnnotationFastasequenceDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationFastasequence.class);
		
	}

	public void addEnzymesAnnotationFastasequence(EnzymesAnnotationFastasequence enzymesAnnotationFastasequence) {
		super.save(enzymesAnnotationFastasequence);
		
	}

	public void addEnzymesAnnotationFastasequenceList(List<EnzymesAnnotationFastasequence> enzymesAnnotationFastasequenceList) {
		for (EnzymesAnnotationFastasequence enzymesAnnotationFastasequence: enzymesAnnotationFastasequenceList) {
			this.addEnzymesAnnotationFastasequence(enzymesAnnotationFastasequence);
		}
		
	}

	public List<EnzymesAnnotationFastasequence> getAllEnzymesAnnotationFastasequence() {
		return super.findAll();
	}

	public EnzymesAnnotationFastasequence getEnzymesAnnotationFastasequence(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationFastasequence(EnzymesAnnotationFastasequence enzymesAnnotationFastasequence) {
		super.delete(enzymesAnnotationFastasequence);
		
	}

	public void removeInterproInterproModelList(List<EnzymesAnnotationFastasequence> enzymesAnnotationFastasequenceList) {
		for (EnzymesAnnotationFastasequence enzymesAnnotationFastasequence: enzymesAnnotationFastasequenceList) {
			this.removeEnzymesAnnotationFastasequence(enzymesAnnotationFastasequence);
		}
		
	}

	public void updateEnzymesAnnotationFastasequenceList(List<EnzymesAnnotationFastasequence> enzymesAnnotationFastasequenceList) {
		for (EnzymesAnnotationFastasequence enzymesAnnotationFastasequence: enzymesAnnotationFastasequenceList) {
			this.update(enzymesAnnotationFastasequence);
		}
		
	}

	public void updateEnzymesAnnotationFastasequence(EnzymesAnnotationFastasequence enzymesAnnotationFastasequence) {
		super.update(enzymesAnnotationFastasequence);
		
	}



}
