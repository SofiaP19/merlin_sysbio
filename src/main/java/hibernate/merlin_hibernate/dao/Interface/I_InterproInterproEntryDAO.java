package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.InterproInterproEntry;



public interface I_InterproInterproEntryDAO {
	
	public void addInterproInterproEntry(InterproInterproEntry interproInterproEntry); 
	
	public void addInterproInterproEntryList(List<InterproInterproEntry> interproInterproEntryList); 
	
	public List<InterproInterproEntry> getAllInterproInterproEntryList(); 
	
	public InterproInterproEntry getInterproInterproEntry(Integer id); 
	
	public void removeInterproInterproEntry(InterproInterproEntry interproInterproEntry); 
	
	public void removeInterproInterproEntryList(List<InterproInterproEntry> interproInterproEntryList); 
	
	public void updateInterproInterproEntryList(List<InterproInterproEntry> interproInterproEntryList); 
	
	public void updateInterproInterproEntry(InterproInterproEntry interproInterproEntry);

}
