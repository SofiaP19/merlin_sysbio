package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersIdentificationSwSimilarities;
import hibernate.merlin_hibernate.dao.Interface.ITransportersIdentificationSwSimilaritiesDAO;


public class TransportersIdentificationSwSimilaritiesDAOImpl extends GenericDaoImpl<TransportersIdentificationSwSimilarities> implements ITransportersIdentificationSwSimilaritiesDAO {

	public TransportersIdentificationSwSimilaritiesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersIdentificationSwSimilarities.class);
		
	}

	public void addTransportersIdentificationSwSimilarity(TransportersIdentificationSwSimilarities similarity) {
		super.save(similarity);
		
	}

	public void addTransportersIdentificationSwSimilarities(List<TransportersIdentificationSwSimilarities> similarities) {
		for (TransportersIdentificationSwSimilarities similarity: similarities) {
			this.addTransportersIdentificationSwSimilarity(similarity);
		}
		
	}

	public List<TransportersIdentificationSwSimilarities> getAllTransportersIdentificationSwSimilarities() {
		return super.findAll();
	}

	public TransportersIdentificationSwSimilarities getTransportersIdentificationSwSimilarity(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersIdentificationSwSimilarity(TransportersIdentificationSwSimilarities similarity) {
		super.delete(similarity);
		
	}

	public void removeSimilarities(List<TransportersIdentificationSwSimilarities> similarities) {
		for (TransportersIdentificationSwSimilarities similarity: similarities) {
			this.removeTransportersIdentificationSwSimilarity(similarity);
		}
		
	}

	public void updateSimilarity(TransportersIdentificationSwSimilarities similarity) {
		super.update(similarity);
		
	}

	public void updateSimilarities(List<TransportersIdentificationSwSimilarities> similarities) {
		for (TransportersIdentificationSwSimilarities similarity: similarities) {
			this.update(similarity);
		}
		
	}



}
