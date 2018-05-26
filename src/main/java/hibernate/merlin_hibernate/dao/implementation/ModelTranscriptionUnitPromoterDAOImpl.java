package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelTranscriptionUnitPromoter;
import hibernate.merlin_hibernate.dao.Interface.IModelTranscriptionUnitPromoterDAO;

public class ModelTranscriptionUnitPromoterDAOImpl extends GenericDaoImpl<ModelTranscriptionUnitPromoter> implements IModelTranscriptionUnitPromoterDAO{

	public ModelTranscriptionUnitPromoterDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelTranscriptionUnitPromoter.class);
		
	}

	public void addModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoter model) {
		super.save(model);
		
	}

	public void addModelTranscriptionUnitPromoterList(List<ModelTranscriptionUnitPromoter> modelList) {
		for (ModelTranscriptionUnitPromoter model: modelList) {
			this.addModelTranscriptionUnitPromoter(model);
		}
		
	}

	public List<ModelTranscriptionUnitPromoter> getAllModelTranscriptionUnitPromoter() {
		return super.findAll();
	}

	public ModelTranscriptionUnitPromoter getModelTranscriptionUnitPromoter(Integer id) {
		return super.findById(id);
	}

	public void removeModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoter Model) {
		super.delete(Model);
		
	}

	public void removeModelTranscriptionUnitPromoterList(List<ModelTranscriptionUnitPromoter> modelList) {
		for (ModelTranscriptionUnitPromoter model: modelList) {
			this.removeModelTranscriptionUnitPromoter(model);
		}
		
	}

	public void updateModelTranscriptionUnitPromoterList(List<ModelTranscriptionUnitPromoter> modelList) {
		for (ModelTranscriptionUnitPromoter model: modelList) {
			this.update(model);
		}
		
	}

	public void updateModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoter model) {
		super.update(model);
		
	}

}
