package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelGene;



public interface IModelGeneDAO {

	public void addModelGene(ModelGene modelGene); 
	
	public void addModelGeneList(List<ModelGene> modelGeneList); 
	
	public List<ModelGene> getAllModelGene(); 
	
	public ModelGene getModelGene(Integer id); 
	
	public void removeModelGene(ModelGene modelGene); 
	
	public void removeModelGeneList(List<ModelGene> modelGeneList); 
	
	public void updateModelGeneList(List<ModelGene> modelGeneList); 
	
	public void updateModelGene(ModelGene modelGene);
}
