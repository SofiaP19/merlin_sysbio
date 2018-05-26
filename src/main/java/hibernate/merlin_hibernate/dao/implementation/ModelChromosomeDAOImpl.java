package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelChromosome;
import hibernate.merlin_hibernate.dao.Interface.IModelChromosomeDAO;

public class ModelChromosomeDAOImpl extends GenericDaoImpl<ModelChromosome> implements IModelChromosomeDAO {

	public ModelChromosomeDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelChromosome.class);
		
	}

	public void addModelChromosome(ModelChromosome modelChromosome) {
		super.save(modelChromosome);
		
	}

	public void addModelChromosomeList(List<ModelChromosome> modelChromosomeList) {
		for (ModelChromosome modelChromosome: modelChromosomeList) {
			this.addModelChromosome(modelChromosome);
		}
		
	}

	public List<ModelChromosome> getAllModelChromosome() {
		return super.findAll();
	}

	public ModelChromosome getEnzymesModelChromosome(Integer id) {
		return super.findById(id);
	}

	public void removeModelChromosome(ModelChromosome modelChromosome) {
		super.delete(modelChromosome);
		
	}

	public void removeModelChromosomeList(List<ModelChromosome> modelChromosomeList) {
		for (ModelChromosome modelChromosome: modelChromosomeList) {
			this.removeModelChromosome(modelChromosome);
		}
		
		
	}

	public void updateModelChromosomeList(List<ModelChromosome> modelChromosomeList) {
		for (ModelChromosome modelChromosome: modelChromosomeList) {
			this.update(modelChromosome);
		}	
		
	}

	public void updateModelChromosome(ModelChromosome modelChromosome) {
		super.update(modelChromosome);
		
	}

}
