package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologydata;



public interface IEnzymesAnnotationHomologydataDAO {

	public void addEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata); 
	
	public void addEnzymesAnnotationHomologydataList(List<EnzymesAnnotationHomologydata> enzymesAnnotationHomologydataList); 
	
	public List<EnzymesAnnotationHomologydata> getAllEnzymesAnnotationHomologydata(); 
	
	public EnzymesAnnotationHomologydata getEnzymesAnnotationHomologydata(Integer id); 
	
	public void removeEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata); 
	
	public void removeEnzymesAnnotationHomologydataList(List<EnzymesAnnotationHomologydata> enzymesAnnotationHomologydataList); 
	
	public void updateEnzymesAnnotationHomologydataList(List<EnzymesAnnotationHomologydata> enzymesAnnotationHomologydataList); 
	
	public void updateEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata);
}
