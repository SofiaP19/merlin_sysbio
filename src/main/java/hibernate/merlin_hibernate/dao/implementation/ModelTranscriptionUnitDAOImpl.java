package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelTranscriptionUnit;
import hibernate.merlin_hibernate.dao.Interface.IModelTranscriptionUnitDAO;

public class ModelTranscriptionUnitDAOImpl extends GenericDaoImpl<ModelTranscriptionUnit> implements IModelTranscriptionUnitDAO{

	public ModelTranscriptionUnitDAOImpl(SessionFactory sessionFactory, Class<ModelTranscriptionUnit> klass) {
		super(sessionFactory, ModelTranscriptionUnit.class);
		
	}

	public void addModelTranscriptionUnit(ModelTranscriptionUnit modelTranscriptionUnit) {
		super.save(modelTranscriptionUnit);
		
	}

	public void addModelTranscriptionUnitList(List<ModelTranscriptionUnit> modelTranscriptionUnitList) {
		for (ModelTranscriptionUnit modelTranscriptionUnit: modelTranscriptionUnitList) {
			this.addModelTranscriptionUnit(modelTranscriptionUnit);
		}
		
	}

	public List<ModelTranscriptionUnit> getAllModelTranscriptionUnit() {
		return super.findAll();
	}

	public ModelTranscriptionUnit getModelTranscriptionUnit(Integer id) {
		return super.findById(id);
	}

	public void removeModelTranscriptionUnit(ModelTranscriptionUnit modelTranscriptionUnit) {
		super.delete(modelTranscriptionUnit);
		
	}

	public void removeModelTranscriptionUnitList(List<ModelTranscriptionUnit> modelTranscriptionUnitList) {
		for (ModelTranscriptionUnit modelTranscriptionUnit: modelTranscriptionUnitList) {
			this.removeModelTranscriptionUnit(modelTranscriptionUnit);
		}
		
	}

	public void updateModelTranscriptionUnitList(List<ModelTranscriptionUnit> modelTranscriptionUnitList) {
		for (ModelTranscriptionUnit modelTranscriptionUnit: modelTranscriptionUnitList) {
			this.update(modelTranscriptionUnit);
		}
		
	}

	public void updateModelTranscriptionUnit(ModelTranscriptionUnit modelTranscriptionUnit) {
		super.update(modelTranscriptionUnit);
		
	}

}
