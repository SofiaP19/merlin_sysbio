package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationScorerconfig;



public interface IEnzymesAnnotationScorerconfigDAO {

	public void addEnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig); 
	
	public void addEnzymesAnnotationScorerconfig(List<EnzymesAnnotationScorerconfig> enzymesAnnotationScorerconfigList); 
	
	public List<EnzymesAnnotationScorerconfig> getAllEnzymesAnnotationScorerconfig(); 
	
	public EnzymesAnnotationScorerconfig getEnzymesAnnotationScorerconfig(Integer id); 
	
	public void removeEnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig); 
	
	public void removeEnzymesAnnotationScorerconfigList(List<EnzymesAnnotationScorerconfig> enzymesAnnotationScorerconfigList); 
	
	public void updateEnzymesAnnotationScorerconfigList(List<EnzymesAnnotationScorerconfig> enzymesAnnotationScorerconfigList); 
	
	public void updateEnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig);
}
