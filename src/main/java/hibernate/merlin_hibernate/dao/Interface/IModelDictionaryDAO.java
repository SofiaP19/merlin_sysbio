package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelDictionary;


public interface IModelDictionaryDAO {
	
	public void addModelDictionary(ModelDictionary modelDictionary); 
	
	public void addModelDictionaryList(List<ModelDictionary> modelDictionaryList); 
	
	public List<ModelDictionary> getAllModelDictionary(); 
	
	public ModelDictionary getModelDictionary(Integer id); 
	
	public void removeModelDictionary(ModelDictionary modelDictionary); 
	
	public void removeModelDictionaryList(List<ModelDictionary> modelDictionaryList); 
	
	public void updateModelDictionaryList(List<ModelDictionary> modelDictionaryList); 
	
	public void updateModelDictionary(ModelDictionary modelDictionary);
}
