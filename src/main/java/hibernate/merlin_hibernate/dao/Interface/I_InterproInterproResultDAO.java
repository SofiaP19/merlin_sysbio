package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.InterproInterproResult;



public interface I_InterproInterproResultDAO {

	public void addInterproInterproResult(InterproInterproResult interproInterproResult); 
	
	public void addInterproInterproResultList(List<InterproInterproResult> interproInterproResultList); 
	
	public List<InterproInterproResult> getAllInterproInterproResult(); 
	
	public InterproInterproResult getInterproInterproResult(Integer id); 
	
	public void removeInterproInterproResult(InterproInterproResult interproInterproResult); 
	
	public void removeInterproInterproResultList(List<InterproInterproResult> interproInterproResultList); 
	
	public void updateInterproInterproResultList(List<InterproInterproResult> interproInterproResultList); 
	
	public void updateInterproInterproResult(InterproInterproResult interproInterproResult);
}
