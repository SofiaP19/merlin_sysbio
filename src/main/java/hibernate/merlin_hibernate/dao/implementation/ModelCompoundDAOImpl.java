package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelCompound;
import hibernate.merlin_hibernate.dao.Interface.IModelCompoundDAO;


public class ModelCompoundDAOImpl extends GenericDaoImpl<ModelCompound> implements IModelCompoundDAO {

	public ModelCompoundDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelCompound.class);
		
	}

	public void addModelCompound(ModelCompound modelCompound) {
		super.save(modelCompound);
		
	}

	public void addModelCompoundList(List<ModelCompound> modelCompoundList) {
		for (ModelCompound modelCompound: modelCompoundList) {
			this.addModelCompound(modelCompound);
		}	
		
	}

	public List<ModelCompound> getAllModelCompound() {
		return super.findAll();
	}

	public ModelCompound getModelCompound(Integer id) {
		return super.findById(id);
	}

	public void removeModelCompound(ModelCompound modelCompound) {
		super.delete(modelCompound);
		
	}

	public void removeModelCompoundList(List<ModelCompound> modelCompoundList) {
		for (ModelCompound modelCompound: modelCompoundList) {
			this.removeModelCompound(modelCompound);
		}	
		
	}

	public void updateModelCompoundList(List<ModelCompound> modelCompoundList) {
		for (ModelCompound modelCompound: modelCompoundList) {
			this.update(modelCompound);
		}	
		
	}

	public void updateModelCompound(ModelCompound modelCompound) {
		super.update(modelCompound);
		
	}

}
