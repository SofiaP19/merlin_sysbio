package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.InterproInterproResults;



public interface I_InterproInterproResultsDAO {
	
	public void addInterproInterproResults(InterproInterproResults interproInterproResults); 
	
	public void addInterproInterproResults(List<InterproInterproResults> interproInterproResultsLists); 
	
	public List<InterproInterproResults> getAllInterproInterproResults(); 
	
	public InterproInterproResults getInterproInterproResults(Integer id); 
	
	public void removeInterproInterproResults(InterproInterproResults interproInterproResults); 
	
	public void removeInterproInterproResultsList(List<InterproInterproResults> interproInterproResultsList); 
	
	public void updateInterproInterproResultsList(List<InterproInterproResults> interproInterproResultsList); 
	
	public void updateInterproInterproResults(InterproInterproResults interproInterproResults);

}
