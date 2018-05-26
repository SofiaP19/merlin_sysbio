package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberrank;


public interface IEnzymesAnnotationEcnumberrankDAO {
	public void addEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank); 
	
	public void addEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrank> enzymesAnnotationEcnumberrankList); 
	
	public List<EnzymesAnnotationEcnumberrank> getAllEnzymesAnnotationEcnumberrank(); 
	
	public EnzymesAnnotationEcnumberrank getEnzymesAnnotationEcnumberrank(Integer id); 
	
	public void removeEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank); 
	
	public void removeEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrank> enzymesAnnotationEcnumberrankList); 
	
	public void updateEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrank> enzymesAnnotationEcnumberrankList); 
	
	public void updateEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank);
}
