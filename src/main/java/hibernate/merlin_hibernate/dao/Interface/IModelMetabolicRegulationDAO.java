package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelMetabolicRegulation;

public interface IModelMetabolicRegulationDAO {

	public void addModelMetabolicRegulation(ModelMetabolicRegulation modelMetabolicRegulation); 
	
	public void addModelMetabolicRegulationList(List<ModelMetabolicRegulation> modelMetabolicRegulation); 
	
	public List<ModelMetabolicRegulation> getAllModelMetabolicRegulation(); 
	
	public ModelMetabolicRegulation getModelMetabolicRegulation(Integer id); 
	
	public void removeModelMetabolicRegulation(ModelMetabolicRegulation modelMetabolicRegulation); 
	
	public void removeModelMetabolicRegulationList(List<ModelMetabolicRegulation> modelMetabolicRegulation); 
	
	public void updateModelMetabolicRegulationList(List<ModelMetabolicRegulation> modelMetabolicRegulation); 
	
	public void updateModelMetabolicRegulation(ModelMetabolicRegulation modelMetabolicRegulation);

}
