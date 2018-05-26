package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationGenehomology;


public interface IEnzymesAnnotationGenehomologyDAO {

	public void addEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology); 
	
	public void addEnzymesAnnotationGenehomologyList(List<EnzymesAnnotationGenehomology> enzymesAnnotationGenehomologyList); 
	
	public List<EnzymesAnnotationGenehomology> getAllEnzymesAnnotationGenehomology(); 
	
	public EnzymesAnnotationGenehomology getEnzymesAnnotationGenehomology(Integer id); 
	
	public void removeEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology); 
	
	public void removeEnzymesAnnotationGenehomologyList(List<EnzymesAnnotationGenehomology> enzymesAnnotationGenehomologyList); 
	
	public void updateEnzymesAnnotationGenehomologyList(List<EnzymesAnnotationGenehomology> enzymesAnnotationGenehomologyList); 
	
	public void updateEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology);
}
