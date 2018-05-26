package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelEnzyme;


public interface IModelEnzymeDAO {
	
	public void addModelEnzyme(ModelEnzyme modelEnzyme); 
	
	public void addModelEnzymeList(List<ModelEnzyme> modelEnzymeList); 
	
	public List<ModelEnzyme> getAllModelEnzyme(); 
	
	public ModelEnzyme getModelEnzyme(Integer id); 
	
	public void removeModelEnzyme(ModelEnzyme modelEnzyme); 
	
	public void removeModelEnzymeList(List<ModelEnzyme> modelEnzymeList); 
	
	public void updateModelEnzymeList(List<ModelEnzyme> modelEnzymeList); 
	
	public void updateModelEnzyme(ModelEnzyme modelEnzyme);
}
