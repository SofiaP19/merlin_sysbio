package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.InterproInterproLocation;
import hibernate.merlin_hibernate.dao.Interface.I_InterproInterproLocationDAO;


public class InterproInterproLocationDAOImpl extends GenericDaoImpl<InterproInterproLocation> implements I_InterproInterproLocationDAO{

	public InterproInterproLocationDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, InterproInterproLocation.class);
		
	}

	public void addInterproInterproLocation(InterproInterproLocation interproInterproLocation) {
		super.save(interproInterproLocation);
		
	}

	public void addInterproInterproLocationList(List<InterproInterproLocation> interproInterproLocationList) {
		for (InterproInterproLocation interproInterproLocation: interproInterproLocationList) {
			this.addInterproInterproLocation(interproInterproLocation);
		}
		
	}

	public List<InterproInterproLocation> getAllInterproInterproLocation() {
		return super.findAll();
	}

	public InterproInterproLocation getInterproInterproLocation(Integer id) {
		return super.findById(id);
	}

	public void removeInterproInterproLocation(InterproInterproLocation interproInterproLocation) {
		super.delete(interproInterproLocation);
	}

	public void removeInterproInterproLocationList(List<InterproInterproLocation> interproInterproLocationList) {
		for (InterproInterproLocation interproInterproLocation: interproInterproLocationList) {
			this.removeInterproInterproLocation(interproInterproLocation);
		}
		
	}

	public void updateInterproInterproLocationList(List<InterproInterproLocation> interproInterproLocationList) {
		for (InterproInterproLocation interproInterproLocation: interproInterproLocationList) {
			this.update(interproInterproLocation);
		}
		
	}

	public void updateInterproInterproLocation(InterproInterproLocation interproInterproLocation) {
		super.update(interproInterproLocation);
		
	}

}
