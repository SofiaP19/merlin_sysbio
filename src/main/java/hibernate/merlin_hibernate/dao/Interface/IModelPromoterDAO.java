package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelPromoter;


public interface IModelPromoterDAO {

	public void addModelPromoter(ModelPromoter modelPromoter); 
	
	public void addModelPromoterList(List<ModelPromoter> modelPromoterList); 
	
	public List<ModelPromoter> getAllModelPromoter(); 
	
	public ModelPromoter getModelPromoter(Integer id); 
	
	public void removeModelPromoter(ModelPromoter modelPromoter); 
	
	public void removeModelPromoterList(List<ModelPromoter> modelPromoterList); 
	
	public void updateModelPromoterList(List<ModelPromoter> modelPromoterList); 
	
	public void updateModelPromoter(ModelPromoter modelPromoter);
}
