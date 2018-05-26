package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationOrganism;


public interface IEnzymesAnnotationOrganismDAO {

	public void addEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism); 
	
	public void addEnzymesAnnotationOrganismList(List<EnzymesAnnotationOrganism> enzymesAnnotationOrganismList); 
	
	public List<EnzymesAnnotationOrganism> getAllEnzymesAnnotationOrganism(); 
	
	public EnzymesAnnotationOrganism getEnzymesAnnotationOrganism(Integer id); 
	
	public void removeEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism); 
	
	public void removeEnzymesAnnotationOrganismList(List<EnzymesAnnotationOrganism> enzymesAnnotationOrganismList); 
	
	public void updateEnzymesAnnotationOrganismList(List<EnzymesAnnotationOrganism> enzymesAnnotationOrganismList); 
	
	public void updateEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism);
}
