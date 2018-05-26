package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationProductlist;


public interface IEnzymesAnnotationProductlistDAO {

	public void addEnzymesAnnotationProductlist(EnzymesAnnotationProductlist enzymesAnnotationProductlist); 
	
	public void addEnzymesAnnotationProductlist(List<EnzymesAnnotationProductlist> enzymesAnnotationProductlistList); 
	
	public List<EnzymesAnnotationProductlist> getAllEnzymesAnnotationProductlist(); 
	
	public EnzymesAnnotationProductlist getEnzymesAnnotationProductlistInteger(Integer id); 
	
	public void removeEnzymesAnnotationProductlist(EnzymesAnnotationProductlist enzymesAnnotationProductlist); 
	
	public void removeEnzymesAnnotationProductlistList(List<EnzymesAnnotationProductlist> enzymesAnnotationProductlistList); 
	
	public void updateEnzymesAnnotationProductlistList(List<EnzymesAnnotationProductlist> enzymesAnnotationProductlistList); 
	
	public void updateEnzymesAnnotationProductlist(EnzymesAnnotationProductlist enzymesAnnotationProductlist);
}
