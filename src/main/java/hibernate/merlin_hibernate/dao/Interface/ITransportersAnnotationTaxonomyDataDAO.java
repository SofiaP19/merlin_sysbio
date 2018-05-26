package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTaxonomyData;



public interface ITransportersAnnotationTaxonomyDataDAO {
	
	public void addTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData transportersAnnotationTaxonomyData); 
	
	public void addTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> transportersAnnotationTaxonomyData); 
	
	public List<TransportersAnnotationTaxonomyData> getAllTransportersAnnotationTaxonomyData(); 
	
	public TransportersAnnotationTaxonomyData getTransportersAnnotationTaxonomyData(Integer id); 
	
	public void removeTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData transportersAnnotationTaxonomyData); 
	
	public void removeTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> transportersAnnotationTaxonomyData); 
	
	public void updateTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> transportersAnnotationTaxonomyData); 
	
	public void updateTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData transportersAnnotationTaxonomyData);

}
