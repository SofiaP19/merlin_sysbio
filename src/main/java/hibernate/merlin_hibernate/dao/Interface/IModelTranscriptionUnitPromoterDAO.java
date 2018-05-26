package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelTranscriptionUnitPromoter;

public interface IModelTranscriptionUnitPromoterDAO {
	public void addModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoter model); 
	
	public void addModelTranscriptionUnitPromoterList(List<ModelTranscriptionUnitPromoter> model); 
	
	public List<ModelTranscriptionUnitPromoter> getAllModelTranscriptionUnitPromoter(); 
	
	public ModelTranscriptionUnitPromoter getModelTranscriptionUnitPromoter(Integer id); 
	
	public void removeModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoter model); 
	
	public void removeModelTranscriptionUnitPromoterList(List<ModelTranscriptionUnitPromoter> model); 
	
	public void updateModelTranscriptionUnitPromoterList(List<ModelTranscriptionUnitPromoter> model); 
	
	public void updateModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoter model);
}
