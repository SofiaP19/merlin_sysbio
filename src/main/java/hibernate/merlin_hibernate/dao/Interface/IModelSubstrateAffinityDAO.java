package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelSubstrateAffinity;



public interface IModelSubstrateAffinityDAO {

	public void addModelSubstrateAffinity(ModelSubstrateAffinity modelSubstrateAffinity); 
	
	public void addModelSubstrateAffinityList(List<ModelSubstrateAffinity> modelSubstrateAffinityList); 
	
	public List<ModelSubstrateAffinity> getAllModelSubstrateAffinity(); 
	
	public ModelSubstrateAffinity getModelSubstrateAffinity(Integer id); 
	
	public void removeModelSubstrateAffinity(ModelSubstrateAffinity modelSubstrateAffinity); 
	
	public void removeModelSubstrateAffinityList(List<ModelSubstrateAffinity> modelSubstrateAffinityList); 
	
	public void updateModelSubstrateAffinityList(List<ModelSubstrateAffinity> modelSubstrateAffinityList); 
	
	public void updateModelSubstrateAffinity(ModelSubstrateAffinity modelSubstrateAffinity);
}
