package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelFunctionalParameter;
import hibernate.merlin_hibernate.dao.Interface.IModelFunctionalParameterDAO;


public class ModelFunctionalParameterDAOImpl extends GenericDaoImpl<ModelFunctionalParameter> implements IModelFunctionalParameterDAO {

	public ModelFunctionalParameterDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelFunctionalParameter.class);
		
	}

	public void addModelFunctionalParameter(ModelFunctionalParameter modelFunctionalParameter) {
		super.save(modelFunctionalParameter);
		
	}

	public void addModelFunctionalParameterList(List<ModelFunctionalParameter> modelFunctionalParameterList) {
		for (ModelFunctionalParameter modelFunctionalParameter: modelFunctionalParameterList) {
			this.addModelFunctionalParameter(modelFunctionalParameter);
		}
		
	}

	public List<ModelFunctionalParameter> getAllModelFunctionalParameter() {
		return super.findAll();
	}

	public ModelFunctionalParameter getModelFunctionalParameter(Integer id) {
		return super.findById(id);
	}

	public void removeModelFunctionalParameter(ModelFunctionalParameter modelFunctionalParameter) {
		super.delete(modelFunctionalParameter);
		
	}

	public void removeModelFunctionalParameterList(List<ModelFunctionalParameter> modelFunctionalParameterList) {
		for (ModelFunctionalParameter modelFunctionalParameter: modelFunctionalParameterList) {
			this.removeModelFunctionalParameter(modelFunctionalParameter);
		}
		
	}

	public void updateModelFunctionalParameterList(List<ModelFunctionalParameter> modelFunctionalParameterList) {
		for (ModelFunctionalParameter modelFunctionalParameter: modelFunctionalParameterList) {
			this.update(modelFunctionalParameter);
		}
		
	}

	public void updateModelFunctionalParameter(ModelFunctionalParameter modelFunctionalParameter) {
		super.update(modelFunctionalParameter);
		
	}

}
