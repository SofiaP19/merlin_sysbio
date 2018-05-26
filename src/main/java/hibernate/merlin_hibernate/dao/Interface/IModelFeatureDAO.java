package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelFeature;



public interface IModelFeatureDAO {
	
	public void addModelFeature(ModelFeature modelFeature); 
	
	public void addModelFeatureList(List<ModelFeature> modelFeatureList); 
	
	public List<ModelFeature> getAllModelFeature(); 
	
	public ModelFeature getModelFeature(Integer id); 
	
	public void removeModelFeature(ModelFeature modelFeature); 
	
	public void removeModelFeatureList(List<ModelFeature> modelFeatureList); 
	
	public void updateModelFeatureList(List<ModelFeature> modelFeatureList); 
	
	public void updateModelFeature(ModelFeature modelFeature);

}
