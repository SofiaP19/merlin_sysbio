package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelGeneHasOrthology;
import hibernate.merlin_hibernate.dao.Interface.IModelGeneHasOrthologyDAO;

public class modelGeneHasOrthologyDAOImpl extends GenericDaoImpl<ModelGeneHasOrthology> implements IModelGeneHasOrthologyDAO {

	public modelGeneHasOrthologyDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelGeneHasOrthology.class);
		
	}

	public void addModelGeneHasOrthology(ModelGeneHasOrthology modelGeneHasOrthology) {
		super.save(modelGeneHasOrthology);
		
	}

	public void addModelGeneHasOrthologyList(List<ModelGeneHasOrthology> modelGeneHasOrthologyList) {
		for (ModelGeneHasOrthology modelGeneHasOrthology: modelGeneHasOrthologyList) {
			this.addModelGeneHasOrthology(modelGeneHasOrthology);
		}
		
	}

	public List<ModelGeneHasOrthology> getAllModelGeneHasOrthology() {
		return super.findAll();
	}

	public ModelGeneHasOrthology getModelGeneHasOrthology(Integer id) {
		return super.findById(id);
	}

	public void removeModelGeneHasOrthology(ModelGeneHasOrthology modelGeneHasOrthology) {
		super.delete(modelGeneHasOrthology);
		
	}

	public void removeModelGeneHasOrthologyList(List<ModelGeneHasOrthology> modelGeneHasOrthologyList) {
		for (ModelGeneHasOrthology modelGeneHasOrthology: modelGeneHasOrthologyList) {
			this.removeModelGeneHasOrthology(modelGeneHasOrthology);
		}
		
	}

	public void updateModelGeneHasOrthologyList(List<ModelGeneHasOrthology> modelGeneHasOrthologyList) {
		for (ModelGeneHasOrthology modelGeneHasOrthology: modelGeneHasOrthologyList) {
			this.update(modelGeneHasOrthology);
		}
		
	}

	public void updateModelGeneHasOrthology(ModelGeneHasOrthology modelGeneHasOrthology) {
		super.update(modelGeneHasOrthology);
		
	}


		
}
