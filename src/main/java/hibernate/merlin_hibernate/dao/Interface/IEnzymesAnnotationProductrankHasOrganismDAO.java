package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationProductrankHasOrganism;




public interface IEnzymesAnnotationProductrankHasOrganismDAO {

	public void addEnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism); 
	
	public void addEnzymesAnnotationProductrankHasOrganismList(List<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganismList); 
	
	public List<EnzymesAnnotationProductrankHasOrganism> getAllEnzymesAnnotationProductrankHasOrganism(); 
	
	//public EnzymesAnnotationProductrankHasOrganism getEnzymesAnnotationProductrankHasOrganism(Integer id); 
	
	public void removeEnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism); 
	
	public void removeEnzymesAnnotationProductrankHasOrganismList(List<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganismList); 
	
	public void updateEnzymesAnnotationProductrankHasOrganismList(List<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganismList); 
	
	public void updateEnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism);
}