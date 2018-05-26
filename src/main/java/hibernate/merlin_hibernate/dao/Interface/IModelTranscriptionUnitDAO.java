package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelTranscriptionUnit;



public interface IModelTranscriptionUnitDAO {

	public void addModelTranscriptionUnit(ModelTranscriptionUnit modelTranscriptionUnit); 
	
	public void addModelTranscriptionUnitList(List<ModelTranscriptionUnit> modelTranscriptionUnitList); 
	
	public List<ModelTranscriptionUnit> getAllModelTranscriptionUnit(); 
	
	public ModelTranscriptionUnit getModelTranscriptionUnit(Integer id); 
	
	public void removeModelTranscriptionUnit(ModelTranscriptionUnit modelTranscriptionUnit); 
	
	public void removeModelTranscriptionUnitList(List<ModelTranscriptionUnit> modelTranscriptionUnitList); 
	
	public void updateModelTranscriptionUnitList(List<ModelTranscriptionUnit> modelTranscriptionUnitList); 
	
	public void updateModelTranscriptionUnit(ModelTranscriptionUnit modelTranscriptionUnit);
}
