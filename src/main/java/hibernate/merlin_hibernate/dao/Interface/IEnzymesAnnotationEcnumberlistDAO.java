package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberlist;


public interface IEnzymesAnnotationEcnumberlistDAO {
	
	public void addEnzymesAnnotationEcnumberlist(EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist); 
	
	public void addEnzymesAnnotationEcnumberlistList(List<EnzymesAnnotationEcnumberlist> enzymesAnnotationEcnumberlistList); 
	
	public List<EnzymesAnnotationEcnumberlist> getAllEnzymesAnnotationEcnumberlist(); 
	
	public EnzymesAnnotationEcnumberlist getEnzymesAnnotationEcnumberlist(Integer id); 
	
	public void removeEnzymesAnnotationEcnumberlist(EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist); 
	
	public void removeEnzymesAnnotationEcnumberlistList(List<EnzymesAnnotationEcnumberlist> enzymesAnnotationEcnumberlistList); 
	
	public void updateEnzymesAnnotationEcnumberlistList(List<EnzymesAnnotationEcnumberlist> enzymesAnnotationEcnumberlistList); 
	
	public void updateEnzymesAnnotationEcnumberlist(EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist);

}
