package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationProductrank;


public interface IEnzymesAnnotationProductrankDAO {

	public void addEnzymesAnnotationProductrank(EnzymesAnnotationProductrank enzymesAnnotationProductrank); 
	
	public void addEnzymesAnnotationProductrankList(List<EnzymesAnnotationProductrank> enzymesAnnotationProductrankList); 
	
	public List<EnzymesAnnotationProductrank> getAllEnzymesAnnotationProductrank(); 
	
	public EnzymesAnnotationProductrank getEnzymesAnnotationProductrank(Integer id); 
	
	public void removeEnzymesAnnotationProductrank(EnzymesAnnotationProductrank enzymesAnnotationProductrank); 
	
	public void removeEnzymesAnnotationProductrankList(List<EnzymesAnnotationProductrank> enzymesAnnotationProductrankList); 
	
	public void updateEnzymesAnnotationProductrankList(List<EnzymesAnnotationProductrank> enzymesAnnotationProductrankList); 
	
	public void updateEnzymesAnnotationProductrank(EnzymesAnnotationProductrank enzymesAnnotationProductrank);
}
