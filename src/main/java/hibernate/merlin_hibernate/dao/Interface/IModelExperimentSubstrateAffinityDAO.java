package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelExperimentSubstrateAffinity;



public interface IModelExperimentSubstrateAffinityDAO {

	public void addModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity); 
	
	public void addEnzymesAnnotationEcnumberList(List<ModelExperimentSubstrateAffinity> modelExperimentSubstrateAffinityList); 
	
	public List<ModelExperimentSubstrateAffinity> getAllModelExperimentSubstrateAffinity(); 
	
	public ModelExperimentSubstrateAffinity getModelExperimentSubstrateAffinity(Integer id); 
	
	public void removeModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity); 
	
	public void removeModelExperimentSubstrateAffinityList(List<ModelExperimentSubstrateAffinity> modelExperimentSubstrateAffinityList); 
	
	public void updateModelExperimentSubstrateAffinityList(List<ModelExperimentSubstrateAffinity> modelExperimentSubstrateAffinityList); 
	
	public void updateModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity);
}
