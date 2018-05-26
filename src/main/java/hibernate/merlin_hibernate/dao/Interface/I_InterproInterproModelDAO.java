package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.InterproInterproModel;


public interface I_InterproInterproModelDAO {
	
	public void addInterproInterproModel(InterproInterproModel interproInterproModel); 
	
	public void addInterproInterproModelList(List<InterproInterproModel> interproInterproModelList); 
	
	public List<InterproInterproModel> getAllInterproInterproModel(); 
	
	public InterproInterproModel getInterproInterproModel(Integer id); 
	
	public void removeInterproInterproModel(InterproInterproModel interproInterproModel); 
	
	public void removeInterproInterproModelList(List<InterproInterproModel> interproInterproModelList); 
	
	public void updateInterproInterproModel(List<InterproInterproModel> interproInterproModelList); 
	
	public void updateInterproInterproModel(InterproInterproModel interproInterproModel);
}
