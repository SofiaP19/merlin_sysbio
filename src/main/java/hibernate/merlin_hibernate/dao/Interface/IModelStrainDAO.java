package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelStrain;



public interface IModelStrainDAO {

	public void addModelStrain(ModelStrain modelStrain); 
	
	public void addModelStrainList(List<ModelStrain> modelStrainList); 
	
	public List<ModelStrain> getAllModelStrain(); 
	
	public ModelStrain getModelStrain(Integer id); 
	
	public void removeModelStrain(ModelStrain modelStrain); 
	
	public void removeModelStrainList(List<ModelStrain> modelStrainList); 
	
	public void updateModelStrainList(List<ModelStrain> modelStrainList); 
	
	public void updateModelStrain(ModelStrain modelStrain);
}
