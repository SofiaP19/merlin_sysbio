package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersAnnotationGenes;


public interface ITransportersAnnotationGenesDAO {
	
	public void addTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGene); 
	
	public void addTransportersAnnotationGenes(List<TransportersAnnotationGenes> transportersAnnotationGenes); 
	
	public List<TransportersAnnotationGenes> getAllTransportersAnnotationGenes(); 
	
	public TransportersAnnotationGenes getTransportersAnnotationGene(Integer id); 
	
	public void removeTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGene); 
	
	public void removeTransportersAnnotationGenes(List<TransportersAnnotationGenes> transportersAnnotationGenes); 
	
	public void updateTransportersAnnotationGenes(List<TransportersAnnotationGenes> transportersAnnotationGenes); 
	
	public void updateTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGene);

}


