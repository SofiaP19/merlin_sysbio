package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTcNumbers;



public interface ITransportersAnnotationTcNumbersDAO {
	
	public void addTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers transportersAnnotationTcNumber); 
	
	public void addTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> transportersAnnotationTcNumbers); 
	
	public List<TransportersAnnotationTcNumbers> getAllTransportersAnnotationTcNumbers(); 
	
	public TransportersAnnotationTcNumbers getTransportersAnnotationTcNumber(Integer id); 
	
	public void removeTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers transportersAnnotationTcNumber); 
	
	public void removeTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> transportersAnnotationTcNumber); 
	
	public void updateTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> transportersAnnotationTcNumber); 
	
	public void updateTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers transportersAnnotationTcNumber);

}
