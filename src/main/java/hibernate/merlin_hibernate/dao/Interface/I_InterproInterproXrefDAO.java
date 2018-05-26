package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.InterproInterproXref;


public interface I_InterproInterproXrefDAO {
	
	
	public void addInterproInterproXref(InterproInterproXref interproInterproXref); 
	
	public void addInterproInterproXrefList(List<InterproInterproXref> interproInterproXrefList); 
	
	public List<InterproInterproXref> getAllInterproInterproXref(); 
	
	public InterproInterproXref getInterproInterproXref(Integer id); 
	
	public void removeInterproInterproXref(InterproInterproXref interproInterproXref); 
	
	public void removeInterproInterproXrefList(List<InterproInterproXref> interproInterproXrefList); 
	
	public void updateInterproInterproXrefList(List<InterproInterproXref> interproInterproXrefList); 
	
	public void updateInterproInterproXref(InterproInterproXref interproInterproXref);
}
