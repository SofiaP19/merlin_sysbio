package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologues;



public interface IEnzymesAnnotationHomologuesDAO {
	
	public void addEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues); 
	
	public void addEnzymesAnnotationHomologues(List<EnzymesAnnotationHomologues> enzymesAnnotationHomologuesList); 
	
	public List<EnzymesAnnotationHomologues> getAllEnzymesAnnotationHomologues(); 
	
	public EnzymesAnnotationHomologues getEnzymesAnnotationHomologues(Integer id); 
	
	public void removeEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues); 
	
	public void removeEnzymesAnnotationHomologuesList(List<EnzymesAnnotationHomologues> enzymesAnnotationHomologuesList); 
	
	public void updateEnzymesAnnotationHomologuesList(List<EnzymesAnnotationHomologues> enzymesAnnotationHomologuesList); 
	
	public void updateEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues);
}
