package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelPromoter;
import hibernate.merlin_hibernate.dao.Interface.IModelPromoterDAO;

public class ModelPromoterDAOImpl extends GenericDaoImpl<ModelPromoter> implements IModelPromoterDAO {

	public ModelPromoterDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelPromoter.class);
		
	}

	public void addModelPromoter(ModelPromoter modelPromoter) {
		super.save(modelPromoter);
	}

	public void addModelPromoterList(List<ModelPromoter> modelPromoterList) {
		for (ModelPromoter modelPromoter: modelPromoterList) {
			this.addModelPromoter(modelPromoter);
		}
		
	}

	public List<ModelPromoter> getAllModelPromoter() {
		return super.findAll();
	}

	public ModelPromoter getModelPromoter(Integer id) {
		return super.findById(id);
	}

	public void removeModelPromoter(ModelPromoter modelPromoter) {
		super.delete(modelPromoter);
		
	}

	public void removeModelPromoterList(List<ModelPromoter> modelPromoterList) {
		for (ModelPromoter modelPromoter: modelPromoterList) {
			this.removeModelPromoter(modelPromoter);
		}
		
	}

	public void updateModelPromoterList(List<ModelPromoter> modelPromoterList) {
		for (ModelPromoter modelPromoter: modelPromoterList) {
			this.update(modelPromoter);
		}
		
	}

	public void updateModelPromoter(ModelPromoter modelPromoter) {
		super.update(modelPromoter);
		
	}

}
