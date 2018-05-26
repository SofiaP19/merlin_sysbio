package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelExperimentTurnoverNumber;
import hibernate.merlin_hibernate.dao.Interface.IModelExperimentTurnoverNumberDAO;

public class ModelExperimentTurnoverNumberDAOImpl extends GenericDaoImpl<ModelExperimentTurnoverNumber> implements IModelExperimentTurnoverNumberDAO {

	public ModelExperimentTurnoverNumberDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelExperimentTurnoverNumber.class);
		
	}

	public void addModelExperimentTurnoverNumber(ModelExperimentTurnoverNumber modelExperimentTurnoverNumber) {
		super.save(modelExperimentTurnoverNumber);
		
	}

	public void addModelExperimentTurnoverNumberList(List<ModelExperimentTurnoverNumber> modelExperimentTurnoverNumberList) {
		for (ModelExperimentTurnoverNumber modelExperimentTurnoverNumber: modelExperimentTurnoverNumberList) {
			this.addModelExperimentTurnoverNumber(modelExperimentTurnoverNumber);
		}
		
	}

	public List<ModelExperimentTurnoverNumber> getAllModelExperimentTurnoverNumber() {
		return super.findAll();
	}

	public ModelExperimentTurnoverNumber getModelExperimentTurnoverNumber(Integer id) {
		return super.findById(id);
	}

	public void removeModelExperimentTurnoverNumber(ModelExperimentTurnoverNumber modelExperimentTurnoverNumber) {
		super.delete(modelExperimentTurnoverNumber);
		
	}

	public void removeModelExperimentTurnoverNumberList(List<ModelExperimentTurnoverNumber> modelExperimentTurnoverNumberList) {
		for (ModelExperimentTurnoverNumber modelExperimentTurnoverNumber: modelExperimentTurnoverNumberList) {
			this.removeModelExperimentTurnoverNumber(modelExperimentTurnoverNumber);
		}
		
	}

	public void updateModelExperimentTurnoverNumberList(List<ModelExperimentTurnoverNumber> modelExperimentTurnoverNumberList) {
		for (ModelExperimentTurnoverNumber modelExperimentTurnoverNumber: modelExperimentTurnoverNumberList) {
			this.update(modelExperimentTurnoverNumber);
		}
		
	}

	public void updateModelExperimentTurnoverNumber(ModelExperimentTurnoverNumber modelExperimentTurnoverNumber) {
		super.update(modelExperimentTurnoverNumber);
		
	}

}
