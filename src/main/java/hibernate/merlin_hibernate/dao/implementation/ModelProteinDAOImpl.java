package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelProtein;
import hibernate.merlin_hibernate.dao.Interface.IModelProteinDAO;

public class ModelProteinDAOImpl extends GenericDaoImpl<ModelProtein> implements IModelProteinDAO{

	public ModelProteinDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelProtein.class);
		
	}

	public void addModelProtein(ModelProtein modelProtein) {
		super.save(modelProtein);
		
	}

	public void addModelProteinList(List<ModelProtein> modelProteinList) {
		for (ModelProtein modelProtein: modelProteinList) {
			this.addModelProtein(modelProtein);
		}
		
	}

	public List<ModelProtein> getAllModelProtein() {
		return super.findAll();
	}

	public ModelProtein getModelProtein(Integer id) {
		return super.findById(id);
	}

	public void removeModelProtein(ModelProtein modelProtein) {
		super.delete(modelProtein);
		
	}

	public void removeModelProteinList(List<ModelProtein> modelProteinList) {
		for (ModelProtein modelProtein: modelProteinList) {
			this.removeModelProtein(modelProtein);
		}
		
	}

	public void updateModelProteinList(List<ModelProtein> modelProteinList) {
		for (ModelProtein modelProtein: modelProteinList) {
			this.update(modelProtein);
		}
		
	}

	public void updateModelProtein(ModelProtein modelProtein) {
		super.update(modelProtein);
		
	}

}
