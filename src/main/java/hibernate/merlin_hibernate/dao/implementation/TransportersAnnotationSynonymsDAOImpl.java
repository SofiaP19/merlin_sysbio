package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationSynonyms;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationSynonymsDAO;


public class TransportersAnnotationSynonymsDAOImpl extends GenericDaoImpl<TransportersAnnotationSynonyms> implements ITransportersAnnotationSynonymsDAO {

	public TransportersAnnotationSynonymsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationSynonyms.class);
		
	}

	public void addTransportersAnnotationSynonym(TransportersAnnotationSynonyms transportersAnnotationSynonym) {
		super.save(transportersAnnotationSynonym);
		
	}

	public void addTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> transportersAnnotationSynonyms) {
		for (TransportersAnnotationSynonyms transportersAnnotationSynonym: transportersAnnotationSynonyms) {
			this.addTransportersAnnotationSynonym(transportersAnnotationSynonym);
		}
		
	}

	public List<TransportersAnnotationSynonyms> getAllTransportersAnnotationSynonyms() {
		return super.findAll();
	}

	public TransportersAnnotationSynonyms getTransportersAnnotationSynonym(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationSynonym(TransportersAnnotationSynonyms transportersAnnotationSynonym) {
		super.delete(transportersAnnotationSynonym);
		
	}

	public void removeTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> transportersAnnotationSynonyms) {
		for (TransportersAnnotationSynonyms transportersAnnotationSynonym: transportersAnnotationSynonyms) {
			this.removeTransportersAnnotationSynonym(transportersAnnotationSynonym);
		}
		
	}

	public void updateTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> transportersAnnotationSynonyms) {
		for (TransportersAnnotationSynonyms transportersAnnotationSynonym: transportersAnnotationSynonyms) {
			this.update(transportersAnnotationSynonym);
		}
		
	}

	public void updateTransportersAnnotationSynonym(TransportersAnnotationSynonyms transportersAnnotationSynonym) {
		super.update(transportersAnnotationSynonym);
		
	}

}
