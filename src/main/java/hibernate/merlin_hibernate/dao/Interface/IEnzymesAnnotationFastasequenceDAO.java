package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationFastasequence;


public interface IEnzymesAnnotationFastasequenceDAO {
	
	public void addEnzymesAnnotationFastasequence(EnzymesAnnotationFastasequence enzymesAnnotationFastasequence); 
	
	public void addEnzymesAnnotationFastasequenceList(List<EnzymesAnnotationFastasequence> enzymesAnnotationFastasequenceList); 
	
	public List<EnzymesAnnotationFastasequence> getAllEnzymesAnnotationFastasequence(); 
	
	public EnzymesAnnotationFastasequence getEnzymesAnnotationFastasequence(Integer id); 
	
	public void removeEnzymesAnnotationFastasequence(EnzymesAnnotationFastasequence enzymesAnnotationFastasequence); 
	
	public void removeInterproInterproModelList(List<EnzymesAnnotationFastasequence> enzymesAnnotationFastasequenceList); 
	
	public void updateEnzymesAnnotationFastasequenceList(List<EnzymesAnnotationFastasequence> enzymesAnnotationFastasequenceList); 
	
	public void updateEnzymesAnnotationFastasequence(EnzymesAnnotationFastasequence enzymesAnnotationFastasequence);

}
