package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationHomologuesHasEcnumberDAO;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologuesHasEcnumber;


public class EnzymesAnnotationHomologuesHasEcnumberDAOImpl extends GenericDaoImpl<EnzymesAnnotationHomologuesHasEcnumber> implements IEnzymesAnnotationHomologuesHasEcnumberDAO {

	public EnzymesAnnotationHomologuesHasEcnumberDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationHomologuesHasEcnumber.class);
		
	}

	public void addEnzymesAnnotationHomologuesHasEcnumber(EnzymesAnnotationHomologuesHasEcnumber enzymesAnnotationHomologuesHasEcnumber) {
		super.save(enzymesAnnotationHomologuesHasEcnumber);
		
	}

	public void addEnzymesAnnotationHomologuesHasEcnumber(List<EnzymesAnnotationHomologuesHasEcnumber> enzymesAnnotationHomologuesHasEcnumberList) {
		for (EnzymesAnnotationHomologuesHasEcnumber enzymesAnnotationHomologuesHasEcnumber: enzymesAnnotationHomologuesHasEcnumberList) {
			this.addEnzymesAnnotationHomologuesHasEcnumber(enzymesAnnotationHomologuesHasEcnumber);
		}
		
	}

	public List<EnzymesAnnotationHomologuesHasEcnumber> getAllEnzymesAnnotationHomologuesHasEcnumber() {
		return super.findAll();
	}

	public EnzymesAnnotationHomologuesHasEcnumber getEnzymesAnnotationHomologuesHasEcnumber(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationHomologuesHasEcnumber(EnzymesAnnotationHomologuesHasEcnumber enzymesAnnotationHomologuesHasEcnumber) {
		super.delete(enzymesAnnotationHomologuesHasEcnumber);
		
	}

	public void removeEnzymesAnnotationHomologuesHasEcnumberList(List<EnzymesAnnotationHomologuesHasEcnumber> enzymesAnnotationHomologuesHasEcnumberList) {
		for (EnzymesAnnotationHomologuesHasEcnumber enzymesAnnotationHomologuesHasEcnumber: enzymesAnnotationHomologuesHasEcnumberList) {
			this.removeEnzymesAnnotationHomologuesHasEcnumber(enzymesAnnotationHomologuesHasEcnumber);
		}
		
	}

	public void updateEnzymesAnnotationHomologuesHasEcnumberList(List<EnzymesAnnotationHomologuesHasEcnumber> enzymesAnnotationHomologuesHasEcnumberList) {
		for (EnzymesAnnotationHomologuesHasEcnumber enzymesAnnotationHomologuesHasEcnumber: enzymesAnnotationHomologuesHasEcnumberList) {
			this.update(enzymesAnnotationHomologuesHasEcnumber);
		}
		
	}

	public void updateEnzymesAnnotationHomologuesHasEcnumber(EnzymesAnnotationHomologuesHasEcnumber enzymesAnnotationHomologuesHasEcnumber) {
		super.update(enzymesAnnotationHomologuesHasEcnumber);
		
	}

}
