package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationSynonyms;


public interface ITransportersAnnotationSynonymsDAO {
	
	public void addTransportersAnnotationSynonym(TransportersAnnotationSynonyms transportersAnnotationSynonym); 
	
	public void addTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> transportersAnnotationSynonyms); 
	
	public List<TransportersAnnotationSynonyms> getAllTransportersAnnotationSynonyms(); 
	
	public TransportersAnnotationSynonyms getTransportersAnnotationSynonym(Integer id); 
	
	public void removeTransportersAnnotationSynonym(TransportersAnnotationSynonyms transportersAnnotationSynonym); 
	
	public void removeTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> transportersAnnotationSynonyms); 
	
	public void updateTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> transportersAnnotationSynonyms); 
	
	public void updateTransportersAnnotationSynonym(TransportersAnnotationSynonyms transportersAnnotationSynonym);

}
