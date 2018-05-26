package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelChromosome;



public interface IModelChromosomeDAO {
	public void addModelChromosome(ModelChromosome modelChromosome); 
	
	public void addModelChromosomeList(List<ModelChromosome> modelChromosomeList); 
	
	public List<ModelChromosome> getAllModelChromosome(); 
	
	public ModelChromosome getEnzymesModelChromosome(Integer id); 
	
	public void removeModelChromosome(ModelChromosome modelChromosome); 
	
	public void removeModelChromosomeList(List<ModelChromosome> modelChromosomeList); 
	
	public void updateModelChromosomeList(List<ModelChromosome> modelChromosomeList); 
	
	public void updateModelChromosome(ModelChromosome modelChromosome);
}
