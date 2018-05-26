package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.InterproInterproResults;
import hibernate.merlin_hibernate.dao.Interface.I_InterproInterproResultsDAO;


public class InterproInterproResultsDAOImpl extends GenericDaoImpl<InterproInterproResults> implements I_InterproInterproResultsDAO{

	public InterproInterproResultsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, InterproInterproResults.class);
	
	}

	public void addInterproInterproResults(InterproInterproResults interproInterproResults) {
		super.save(interproInterproResults);
		
	}

	public void addInterproInterproResults(List<InterproInterproResults> interproInterproResultsList) {
		for (InterproInterproResults interproInterproResults: interproInterproResultsList) {
			this.addInterproInterproResults(interproInterproResults);
		}
		
	}

	public List<InterproInterproResults> getAllInterproInterproResults() {
		return super.findAll();
	}

	public InterproInterproResults getInterproInterproResults(Integer id) {
		return super.findById(id);
	}

	public void removeInterproInterproResults(InterproInterproResults interproInterproResults) {
		super.delete(interproInterproResults);
	}

	public void removeInterproInterproResultsList(List<InterproInterproResults> interproInterproResultsList) {
		for (InterproInterproResults interproInterproResults: interproInterproResultsList) {
			this.removeInterproInterproResults(interproInterproResults);
		}
		
		
	}

	public void updateInterproInterproResultsList(List<InterproInterproResults> interproInterproResultsList) {
		for (InterproInterproResults interproInterproResults: interproInterproResultsList) {
			this.update(interproInterproResults);
		}
		
	}

	public void updateInterproInterproResults(InterproInterproResults interproInterproResults) {
		super.update(interproInterproResults);
		
	}

}
