package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelMetabolicRegulation;
import hibernate.merlin_hibernate.dao.Interface.IModelMetabolicRegulationDAO;

public class ModelMetabolicRegulationDAOImpl extends GenericDaoImpl<ModelMetabolicRegulation> implements IModelMetabolicRegulationDAO {

	public ModelMetabolicRegulationDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelMetabolicRegulation.class);
		
	}

	public void addModelMetabolicRegulation(ModelMetabolicRegulation modelMetabolicRegulation) {
		super.save(modelMetabolicRegulation);
		
	}

	public void addModelMetabolicRegulationList(List<ModelMetabolicRegulation> modelMetabolicRegulationList) {
		for (ModelMetabolicRegulation modelMetabolicRegulation: modelMetabolicRegulationList) {
			this.addModelMetabolicRegulation(modelMetabolicRegulation);
		}
		
	}

	public List<ModelMetabolicRegulation> getAllModelMetabolicRegulation() {
		return super.findAll();
	}

	public ModelMetabolicRegulation getModelMetabolicRegulation(Integer id) {
		return super.findById(id);
	}

	public void removeModelMetabolicRegulation(ModelMetabolicRegulation modelMetabolicRegulation) {
		super.delete(modelMetabolicRegulation);
		
	}

	public void removeModelMetabolicRegulationList(List<ModelMetabolicRegulation> modelMetabolicRegulationList) {
		for (ModelMetabolicRegulation modelMetabolicRegulation: modelMetabolicRegulationList) {
			this.removeModelMetabolicRegulation(modelMetabolicRegulation);
		}
		
	}

	public void updateModelMetabolicRegulationList(List<ModelMetabolicRegulation> modelMetabolicRegulationList) {
		for (ModelMetabolicRegulation modelMetabolicRegulation: modelMetabolicRegulationList) {
			this.update(modelMetabolicRegulation);
		}
		
	}

	public void updateModelMetabolicRegulation(ModelMetabolicRegulation modelMetabolicRegulation) {
		super.update(modelMetabolicRegulation);
		
	}

}
