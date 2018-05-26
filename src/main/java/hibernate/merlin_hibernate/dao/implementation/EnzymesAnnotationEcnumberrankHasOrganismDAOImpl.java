package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberrankHasOrganism;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationEcnumberrankHasOrganismDAO;


public class EnzymesAnnotationEcnumberrankHasOrganismDAOImpl extends GenericDaoImpl<EnzymesAnnotationEcnumberrankHasOrganism> implements IEnzymesAnnotationEcnumberrankHasOrganismDAO {

	public EnzymesAnnotationEcnumberrankHasOrganismDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationEcnumberrankHasOrganism.class);
		
	}

	public void addEnzymesAnnotationEcnumberrankHasOrganism(EnzymesAnnotationEcnumberrankHasOrganism enzymesAnnotationEcnumberrankHasOrganism) {
		super.save(enzymesAnnotationEcnumberrankHasOrganism);
		
	}

	public void addEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrankHasOrganism> enzymesAnnotationEcnumberrankHasOrganismList) {
		for (EnzymesAnnotationEcnumberrankHasOrganism enzymesAnnotationEcnumberrankHasOrganism: enzymesAnnotationEcnumberrankHasOrganismList) {
			this.addEnzymesAnnotationEcnumberrankHasOrganism(enzymesAnnotationEcnumberrankHasOrganism);
		}
		
	}
	public List<EnzymesAnnotationEcnumberrankHasOrganism> getAllEnzymesAnnotationEcnumberrankHasOrganism() {
		return super.findAll();
	}

	public EnzymesAnnotationEcnumberrankHasOrganism getEnzymesAnnotationEcnumberrankHasOrganism(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationEcnumberrankHasOrganism(EnzymesAnnotationEcnumberrankHasOrganism enzymesAnnotationEcnumberrankHasOrganism) {
		super.delete(enzymesAnnotationEcnumberrankHasOrganism);
		
	}

	public void removeEnzymesAnnotationEcnumberrankHasOrganismList(List<EnzymesAnnotationEcnumberrankHasOrganism> enzymesAnnotationEcnumberrankHasOrganismList) {
		for (EnzymesAnnotationEcnumberrankHasOrganism enzymesAnnotationEcnumberrankHasOrganism: enzymesAnnotationEcnumberrankHasOrganismList) {
			this.removeEnzymesAnnotationEcnumberrankHasOrganism(enzymesAnnotationEcnumberrankHasOrganism);
		}
		
	}

	public void updateEnzymesAnnotationEcnumberrankHasOrganismList(List<EnzymesAnnotationEcnumberrankHasOrganism> enzymesAnnotationEcnumberrankHasOrganismList) {
		for (EnzymesAnnotationEcnumberrankHasOrganism enzymesAnnotationEcnumberrankHasOrganism: enzymesAnnotationEcnumberrankHasOrganismList) {
			this.update(enzymesAnnotationEcnumberrankHasOrganism);
		}
		
	}

	public void updateEnzymesAnnotationEcnumberrankHasOrganism(EnzymesAnnotationEcnumberrankHasOrganism enzymesAnnotationEcnumberrankHasOrganism) {
		super.update(enzymesAnnotationEcnumberrankHasOrganism);
		
	}

}
