package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.InterproInterproEntry;
import hibernate.merlin_hibernate.dao.Interface.I_InterproInterproEntryDAO;


public class InterproInterproEntryDAOImpl extends GenericDaoImpl<InterproInterproEntry> implements I_InterproInterproEntryDAO {

	public InterproInterproEntryDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, InterproInterproEntry.class);
		
	}

	public void addInterproInterproEntry(InterproInterproEntry interproInterproEntry) {
		super.save(interproInterproEntry);
		
	}

	public void addInterproInterproEntryList(List<InterproInterproEntry> interproInterproEntryList) {
		for (InterproInterproEntry interproInterproEntry: interproInterproEntryList) {
			this.addInterproInterproEntry(interproInterproEntry);
		}
		
	}

	public List<InterproInterproEntry> getAllInterproInterproEntryList() {
		return super.findAll();
	}

	public InterproInterproEntry getInterproInterproEntry(Integer id) {
		return super.findById(id);
	}

	public void removeInterproInterproEntry(InterproInterproEntry interproInterproEntry) {
		super.delete(interproInterproEntry);
		
	}

	public void removeInterproInterproEntryList(List<InterproInterproEntry> interproInterproEntryList) {
		for (InterproInterproEntry interproInterproEntry: interproInterproEntryList) {
			this.removeInterproInterproEntry(interproInterproEntry);
		}	
		
	}

	public void updateInterproInterproEntryList(List<InterproInterproEntry> interproInterproEntryList) {
		for (InterproInterproEntry interproInterproEntry: interproInterproEntryList) {
			this.update(interproInterproEntry);
		}
		
	}

	public void updateInterproInterproEntry(InterproInterproEntry interproInterproEntry) {
		super.update(interproInterproEntry);
		
	}

}
