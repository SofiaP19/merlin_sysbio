package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologysetup;


public interface IEnzymesAnnotationHomologysetupDAO {

	public void addEnzymesAnnotationHomologysetup(EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup); 
	
	public void addEnzymesAnnotationHomologysetupList(List<EnzymesAnnotationHomologysetup> enzymesAnnotationHomologysetupList); 
	
	public List<EnzymesAnnotationHomologysetup> getAllEnzymesAnnotationHomologysetup(); 
	
	public EnzymesAnnotationHomologysetup getEnzymesAnnotationHomologysetup(Integer id); 
	
	public void removeEnzymesAnnotationHomologysetup(EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup); 
	
	public void removeEnzymesAnnotationHomologysetupList(List<EnzymesAnnotationHomologysetup> enzymesAnnotationHomologysetupList); 
	
	public void updateEnzymesAnnotationHomologysetupList(List<EnzymesAnnotationHomologysetup> enzymesAnnotationHomologysetupList); 
	
	public void updateEnzymesAnnotationHomologysetup(EnzymesAnnotationHomologysetup enzymesAnnotationHomologysetup);
}