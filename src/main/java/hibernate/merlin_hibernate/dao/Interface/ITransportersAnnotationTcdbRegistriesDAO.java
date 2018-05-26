package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTcdbRegistries;



public interface ITransportersAnnotationTcdbRegistriesDAO{
	
	public void addTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry); 
	
	public void addTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> transportersAnnotationTcdbRegistries); 
	
	public List<TransportersAnnotationTcdbRegistries> getAllTransportersAnnotationTcdbRegistries(); 
	
	public TransportersAnnotationTcdbRegistries getTransportersAnnotationTcdbRegistry(Integer id); 
	
	public void removeTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry); 
	
	public void removeTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> transportersAnnotationTcdbRegistry); 
	
	public void updateTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> transportersAnnotationTcdbRegistry); 
	
	public void updateTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistry);

}
