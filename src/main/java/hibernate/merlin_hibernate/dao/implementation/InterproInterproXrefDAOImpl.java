package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.InterproInterproXref;
import hibernate.merlin_hibernate.dao.Interface.I_InterproInterproXrefDAO;

public class InterproInterproXrefDAOImpl extends GenericDaoImpl<InterproInterproXref> implements I_InterproInterproXrefDAO{

	public InterproInterproXrefDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, InterproInterproXref.class);
	
	}

	public void addInterproInterproXref(InterproInterproXref interproInterproXref) {
		super.save(interproInterproXref);
		
	}

	public void addInterproInterproXrefList(List<InterproInterproXref> interproInterproXrefList) {
		for (InterproInterproXref interproInterproXref: interproInterproXrefList) {
			this.addInterproInterproXref(interproInterproXref);
		}
		
	}

	public List<InterproInterproXref> getAllInterproInterproXref() {
		return super.findAll();
	}

	public InterproInterproXref getInterproInterproXref(Integer id) {
		return super.findById(id);
	}

	public void removeInterproInterproXref(InterproInterproXref interproInterproXref) {
		super.delete(interproInterproXref);
		
	}

	public void removeInterproInterproXrefList(List<InterproInterproXref> interproInterproXrefList) {
		for (InterproInterproXref interproInterproXref: interproInterproXrefList) {
			this.removeInterproInterproXref(interproInterproXref);
		}
	}

	public void updateInterproInterproXrefList(List<InterproInterproXref> interproInterproXrefList) {
		for (InterproInterproXref interproInterproXref: interproInterproXrefList) {
			this.update(interproInterproXref);
		}
		
	}

	public void updateInterproInterproXref(InterproInterproXref interproInterproXref) {
		super.update(interproInterproXref);
		
	}

}
