package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelSequenceFeature;



public interface IModelSequenceFeatureDAO {

	public void addModelSequenceFeature(ModelSequenceFeature modelSequenceFeature); 
	
	public void addModelSequenceFeatureList(List<ModelSequenceFeature> modelSequenceFeatureList); 
	
	public List<ModelSequenceFeature> getAllModelSequenceFeature(); 
	
	public ModelSequenceFeature getModelSequenceFeature(Integer id); 
	
	public void removeModelSequenceFeature(ModelSequenceFeature modelSequenceFeature); 
	
	public void removeModelSequenceFeatureList(List<ModelSequenceFeature> modelSequenceFeatureList); 
	
	public void updateModelSequenceFeatureList(List<ModelSequenceFeature> modelSequenceFeatureList); 
	
	public void updateModelSequenceFeature(ModelSequenceFeature modelSequenceFeature);
}
