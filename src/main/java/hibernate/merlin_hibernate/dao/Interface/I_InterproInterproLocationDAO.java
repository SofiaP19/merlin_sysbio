package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.InterproInterproLocation;



public interface I_InterproInterproLocationDAO {
	
	public void addInterproInterproLocation(InterproInterproLocation interproInterproLocation); 
	
	public void addInterproInterproLocationList(List<InterproInterproLocation> interproInterproLocation); 
	
	public List<InterproInterproLocation> getAllInterproInterproLocation(); 
	
	public InterproInterproLocation getInterproInterproLocation(Integer id); 
	
	public void removeInterproInterproLocation(InterproInterproLocation interproInterproLocation); 
	
	public void removeInterproInterproLocationList(List<InterproInterproLocation> interproInterproLocationList); 
	
	public void updateInterproInterproLocationList(List<InterproInterproLocation> interproInterproLocationList); 
	
	public void updateInterproInterproLocation(InterproInterproLocation interproInterproLocation);
}
