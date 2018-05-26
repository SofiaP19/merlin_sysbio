package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationOrganism;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationOrganismDAO;

public class EnzymesAnnotationOrganismDAOImpl extends GenericDaoImpl<EnzymesAnnotationOrganism> implements IEnzymesAnnotationOrganismDAO {

	public EnzymesAnnotationOrganismDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationOrganism.class);
		
	}

	public void addEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism) {
		super.save(enzymesAnnotationOrganism);
	}

	public void addEnzymesAnnotationOrganismList(List<EnzymesAnnotationOrganism> enzymesAnnotationOrganismList) {
		for (EnzymesAnnotationOrganism enzymesAnnotationOrganism: enzymesAnnotationOrganismList) {
			this.addEnzymesAnnotationOrganism(enzymesAnnotationOrganism);
		}
		
	}
	public List<EnzymesAnnotationOrganism> getAllEnzymesAnnotationOrganism() {
		return super.findAll();
	}

	
	public EnzymesAnnotationOrganism getEnzymesAnnotationOrganism(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism) {
		super.delete(enzymesAnnotationOrganism);
		
	}

	public void removeEnzymesAnnotationOrganismList(List<EnzymesAnnotationOrganism> enzymesAnnotationOrganismList) {
		for (EnzymesAnnotationOrganism enzymesAnnotationOrganism: enzymesAnnotationOrganismList) {
			this.removeEnzymesAnnotationOrganism(enzymesAnnotationOrganism);
		}
		
	}

	public void updateEnzymesAnnotationOrganismList(List<EnzymesAnnotationOrganism> enzymesAnnotationOrganismList) {
		for (EnzymesAnnotationOrganism enzymesAnnotationOrganism: enzymesAnnotationOrganismList) {
			this.update(enzymesAnnotationOrganism);
		}
		
	}

	public void updateEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism) {
		super.update(enzymesAnnotationOrganism);
		
	}

}

