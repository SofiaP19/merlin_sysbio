package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelStrain;
import hibernate.merlin_hibernate.dao.Interface.IModelStrainDAO;


public class ModelStrainDAOImpl extends GenericDaoImpl<ModelStrain> implements IModelStrainDAO{

	public ModelStrainDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelStrain.class);
		
	}

	public void addModelStrain(ModelStrain modelStrain) {
		super.save(modelStrain);
		
	}

	public void addModelStrainList(List<ModelStrain> modelStrainList) {
		for (ModelStrain modelStrain: modelStrainList) {
			this.addModelStrain(modelStrain);
		}
		
	}

	public List<ModelStrain> getAllModelStrain() {
		return super.findAll();
	}

	public ModelStrain getModelStrain(Integer id) {
		return super.findById(id);
	}

	public void removeModelStrain(ModelStrain modelStrain) {
		super.delete(modelStrain);
		
	}

	public void removeModelStrainList(List<ModelStrain> modelStrainList) {
		for (ModelStrain modelStrain: modelStrainList) {
			this.removeModelStrain(modelStrain);
		}
		
	}

	public void updateModelStrainList(List<ModelStrain> modelStrainList) {
		for (ModelStrain modelStrain: modelStrainList) {
			this.update(modelStrain);
		}
		
	}

	public void updateModelStrain(ModelStrain modelStrain) {
		super.update(modelStrain);
		
	}

}
