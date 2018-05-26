package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelFunctionalParameter;



public interface IModelFunctionalParameterDAO {

	public void addModelFunctionalParameter(ModelFunctionalParameter modelFunctionalParameter); 
	
	public void addModelFunctionalParameterList(List<ModelFunctionalParameter> modelFunctionalParameterList); 
	
	public List<ModelFunctionalParameter> getAllModelFunctionalParameter(); 
	
	public ModelFunctionalParameter getModelFunctionalParameter(Integer id); 
	
	public void removeModelFunctionalParameter(ModelFunctionalParameter modelFunctionalParameter); 
	
	public void removeModelFunctionalParameterList(List<ModelFunctionalParameter> modelFunctionalParameterList); 
	
	public void updateModelFunctionalParameterList(List<ModelFunctionalParameter> modelFunctionalParameterList); 
	
	public void updateModelFunctionalParameter(ModelFunctionalParameter modelFunctionalParameter);
}
