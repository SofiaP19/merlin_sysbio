package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;import hibernate.merlin_hibernate.entities.ModelGeneHasOrthology;

public interface IModelGeneHasOrthologyDAO {

	public void addModelGeneHasOrthology(ModelGeneHasOrthology modelGeneHasOrthology); 
	
	public void addModelGeneHasOrthologyList(List<ModelGeneHasOrthology> modelGeneHasOrthologyList); 
	
	public List<ModelGeneHasOrthology> getAllModelGeneHasOrthology(); 
	
	public ModelGeneHasOrthology getModelGeneHasOrthology(Integer id); 
	
	public void removeModelGeneHasOrthology(ModelGeneHasOrthology modelGeneHasOrthology); 
	
	public void removeModelGeneHasOrthologyList(List<ModelGeneHasOrthology> modelGeneHasOrthologyList); 
	
	public void updateModelGeneHasOrthologyList(List<ModelGeneHasOrthology> modelGeneHasOrthologyList); 
	
	public void updateModelGeneHasOrthology(ModelGeneHasOrthology modelGeneHasOrthology);
}