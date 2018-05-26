package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumber;


public interface IEnzymesAnnotationEcnumberDAO {

	
	public void addEnzymesAnnotationEcnumber(EnzymesAnnotationEcnumber enzymesAnnotationEcnumber); 
	
	public void addEnzymesAnnotationEcnumberList(List<EnzymesAnnotationEcnumber> enzymesAnnotationEcnumberList); 
	
	public List<EnzymesAnnotationEcnumber> getAllEnzymesAnnotationEcnumber(); 
	
	public EnzymesAnnotationEcnumber getEnzymesAnnotationEcnumber(Integer id); 
	
	public void removeEnzymesAnnotationEcnumber(EnzymesAnnotationEcnumber enzymesAnnotationEcnumber); 
	
	public void removeEnzymesAnnotationEcnumberList(List<EnzymesAnnotationEcnumber> enzymesAnnotationEcnumberList); 
	
	public void updateEnzymesAnnotationEcnumberList(List<EnzymesAnnotationEcnumber> enzymesAnnotationEcnumberList); 
	
	public void updateEnzymesAnnotationEcnumber(EnzymesAnnotationEcnumber enzymesAnnotationEcnumber);

}
