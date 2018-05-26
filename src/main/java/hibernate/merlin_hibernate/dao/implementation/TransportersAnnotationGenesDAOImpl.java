package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationGenes;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGenesDAO;


public class TransportersAnnotationGenesDAOImpl extends GenericDaoImpl<TransportersAnnotationGenes> implements ITransportersAnnotationGenesDAO{

	public TransportersAnnotationGenesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGenes.class);
	
	}

	public void addTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGenes) {
		super.save(transportersAnnotationGenes);
		
	}

	public void addTransportersAnnotationGenes(List<TransportersAnnotationGenes> transportersAnnotationGenes) {
		for (TransportersAnnotationGenes transportersAnnotationGene: transportersAnnotationGenes) {
			this.addTransportersAnnotationGene(transportersAnnotationGene);
		}
		
	}

	public List<TransportersAnnotationGenes> getAllTransportersAnnotationGenes() {
		return super.findAll();
	}

	public TransportersAnnotationGenes getTransportersAnnotationGene(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGene) {
		super.delete(transportersAnnotationGene);
		
	}

	public void removeTransportersAnnotationGenes(List<TransportersAnnotationGenes> transportersAnnotationGenes) {
		for (TransportersAnnotationGenes transportersAnnotationGene: transportersAnnotationGenes) {
			this.removeTransportersAnnotationGene(transportersAnnotationGene);
		}		
	}

	public void updateTransportersAnnotationGenes(List<TransportersAnnotationGenes> transportersAnnotationGenes) {
		for (TransportersAnnotationGenes transportersAnnotationGene: transportersAnnotationGenes) {
			this.update(transportersAnnotationGene);
		}
		
	}

	public void updateTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGene) {
		super.update(transportersAnnotationGene);
		
	}

}
