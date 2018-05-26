package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTaxonomyData;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTaxonomyDataDAO;


public class TransportersAnnotationTaxonomyDataDAOImpl extends GenericDaoImpl<TransportersAnnotationTaxonomyData> implements ITransportersAnnotationTaxonomyDataDAO{

	public TransportersAnnotationTaxonomyDataDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTaxonomyData.class);
		
	}

	public void addTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData transportersAnnotationTaxonomyData) {
		super.save(transportersAnnotationTaxonomyData);
		
	}

	public void addTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> transportersAnnotationTaxonomyData) {
		for (TransportersAnnotationTaxonomyData transportersAnnotTaxonomyData: transportersAnnotationTaxonomyData) {
			this.addTransportersAnnotationTaxonomyData(transportersAnnotTaxonomyData);
		}
	}

	public List<TransportersAnnotationTaxonomyData> getAllTransportersAnnotationTaxonomyData() {
		return super.findAll();
	}

	public TransportersAnnotationTaxonomyData getTransportersAnnotationTaxonomyData(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData transportersAnnotationTaxonomyData) {
		super.delete(transportersAnnotationTaxonomyData);
		
	}

	public void removeTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> transportersAnnotationTaxonomyData) {
		for (TransportersAnnotationTaxonomyData transportersAnnotTaxonomyData: transportersAnnotationTaxonomyData) {
			this.removeTransportersAnnotationTaxonomyData(transportersAnnotTaxonomyData);
		}
		
	}

	public void updateTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> transportersAnnotationTaxonomyData) {
		for (TransportersAnnotationTaxonomyData transportersAnnotTaxonomyData: transportersAnnotationTaxonomyData) {
			this.update(transportersAnnotTaxonomyData);
		}
		
	}

	public void updateTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData transportersAnnotationTaxonomyData) {
		super.update(transportersAnnotationTaxonomyData);
		
	}

}
