package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelDictionary;
import hibernate.merlin_hibernate.dao.Interface.IModelDictionaryDAO;


public class ModelDictionaryDAOImpl extends GenericDaoImpl<ModelDictionary> implements IModelDictionaryDAO {

	public ModelDictionaryDAOImpl(SessionFactory sessionFactory, Class<ModelDictionary> klass) {
		super(sessionFactory, ModelDictionary.class);
		
	}

	public void addModelDictionary(ModelDictionary modelDictionary) {
		super.save(modelDictionary);
		
	}

	public void addModelDictionaryList(List<ModelDictionary> modelDictionaryList) {
		for (ModelDictionary modelDictionary: modelDictionaryList) {
			this.addModelDictionary(modelDictionary);
		}
		
	}

	public List<ModelDictionary> getAllModelDictionary() {
		return super.findAll();
	}

	public ModelDictionary getModelDictionary(Integer id) {
		return super.findById(id);
	}

	public void removeModelDictionary(ModelDictionary modelDictionary) {
		super.delete(modelDictionary);
		
	}

	public void removeModelDictionaryList(List<ModelDictionary> modelDictionaryList) {
		for (ModelDictionary modelDictionary: modelDictionaryList) {
			this.removeModelDictionary(modelDictionary);
		}
		
	}

	public void updateModelDictionaryList(List<ModelDictionary> modelDictionaryList) {
		for (ModelDictionary modelDictionary: modelDictionaryList) {
			this.update(modelDictionary);
		}
		
	}

	public void updateModelDictionary(ModelDictionary modelDictionary) {
		super.update(modelDictionary);
		
	}

}
