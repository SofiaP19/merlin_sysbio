package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationProductrankHasOrganism;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationProductrankHasOrganismDAO;



public class EnzymesAnnotationProductrankHasOrganismDAOImpl extends GenericDaoImpl<EnzymesAnnotationProductrankHasOrganism> implements IEnzymesAnnotationProductrankHasOrganismDAO {

	public EnzymesAnnotationProductrankHasOrganismDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationProductrankHasOrganism.class);
		
	}

	public void addEnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism) {
		super.save(enzymesAnnotationProductrankHasOrganism);
		
	}

	public void addEnzymesAnnotationProductrankHasOrganismList(List<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganismList) {
		for (EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism: enzymesAnnotationProductrankHasOrganismList) {
			this.addEnzymesAnnotationProductrankHasOrganism(enzymesAnnotationProductrankHasOrganism);
		}
		
	}

	public List<EnzymesAnnotationProductrankHasOrganism> getAllEnzymesAnnotationProductrankHasOrganism() {
		return super.findAll();
	}

//	public EnzymesAnnotationProductrankHasOrganism getEnzymesAnnotationProductrankHasOrganism(Integer id) {
//		return super.findById(id);
//	}

	public void removeEnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism) {
		super.delete(enzymesAnnotationProductrankHasOrganism);
		
	}

	public void removeEnzymesAnnotationProductrankHasOrganismList(List<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganismList) {
		for (EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism: enzymesAnnotationProductrankHasOrganismList) {
			this.removeEnzymesAnnotationProductrankHasOrganism(enzymesAnnotationProductrankHasOrganism);
		}
		
	}

	public void updateEnzymesAnnotationProductrankHasOrganismList(List<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganismList) {
		for (EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism: enzymesAnnotationProductrankHasOrganismList) {
			this.update(enzymesAnnotationProductrankHasOrganism);
		}
		
	}

	public void updateEnzymesAnnotationProductrankHasOrganism(EnzymesAnnotationProductrankHasOrganism enzymesAnnotationProductrankHasOrganism) {
		super.update(enzymesAnnotationProductrankHasOrganism);
		
	}

}
