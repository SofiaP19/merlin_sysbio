package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;


import hibernate.merlin_hibernate.entities.InterproInterproResult;
import hibernate.merlin_hibernate.dao.Interface.I_InterproInterproResultDAO;

public class InterproInterproResultDAOImpl extends GenericDaoImpl<InterproInterproResult> implements I_InterproInterproResultDAO {

	public InterproInterproResultDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, InterproInterproResult.class);
		
	}

	public void addInterproInterproResult(InterproInterproResult interproInterproResult) {
		super.save(interproInterproResult);
		
	}

	public void addInterproInterproResultList(List<InterproInterproResult> interproInterproResultList) {
		for (InterproInterproResult interproInterproResult: interproInterproResultList) {
			this.addInterproInterproResult(interproInterproResult);
		}
	}

	public List<InterproInterproResult> getAllInterproInterproResult() {
		return super.findAll();
	}

	public InterproInterproResult getInterproInterproResult(Integer id) {
		return super.findById(id);
	}

	public void removeInterproInterproResult(InterproInterproResult interproInterproResult) {
		super.delete(interproInterproResult);
		
	}

	public void removeInterproInterproResultList(List<InterproInterproResult> interproInterproResultList) {
		for (InterproInterproResult interproInterproResult: interproInterproResultList) {
			this.removeInterproInterproResult(interproInterproResult);
		}
		
	}

	public void updateInterproInterproResultList(List<InterproInterproResult> interproInterproResultList) {
		for (InterproInterproResult interproInterproResult: interproInterproResultList) {
			this.update(interproInterproResult);
		}
		
	}

	public void updateInterproInterproResult(InterproInterproResult interproInterproResult) {
		super.update(interproInterproResult);
		
	}

}
