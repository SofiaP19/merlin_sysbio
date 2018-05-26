package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelProteinComplex;


public interface IModelProteinComplexDAO {

	public void addModelProteinComplex(ModelProteinComplex modelProteinComplex); 
	
	public void addModelProteinComplexList(List<ModelProteinComplex> modelProteinComplexList); 
	
	public List<ModelProteinComplex> getAllModelProteinComplex(); 
	
	public ModelProteinComplex getModelProteinComplex(Integer id); 
	
	public void removeModelProteinComplex(ModelProteinComplex modelProteinComplex); 
	
	public void removeModelProteinComplexList(List<ModelProteinComplex> modelProteinComplexList); 
	
	public void updateModelProteinComplexList(List<ModelProteinComplex> modelProteinComplex); 
	
	public void updateModelProteinComplex(ModelProteinComplex modelProteinComplex);
}
