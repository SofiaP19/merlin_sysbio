package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberrank;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationEcnumberrankDAO;

public class EnzymesAnnotationEcnumberrankDAOImpl extends GenericDaoImpl<EnzymesAnnotationEcnumberrank> implements IEnzymesAnnotationEcnumberrankDAO {

	public EnzymesAnnotationEcnumberrankDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationEcnumberrank.class);
		
	}

	public void addEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank) {
		super.save(enzymesAnnotationEcnumberrank);
		
	}

	public void addEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrank> enzymesAnnotationEcnumberrankList) {
		for (EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank: enzymesAnnotationEcnumberrankList) {
			this.addEnzymesAnnotationEcnumberrank(enzymesAnnotationEcnumberrank);
		}		
		
	}

	public List<EnzymesAnnotationEcnumberrank> getAllEnzymesAnnotationEcnumberrank() {
		return super.findAll();
	}

	public EnzymesAnnotationEcnumberrank getEnzymesAnnotationEcnumberrank(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank) {
		super.delete(enzymesAnnotationEcnumberrank);
		
	}

	public void removeEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrank> enzymesAnnotationEcnumberrankList) {
		for (EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank: enzymesAnnotationEcnumberrankList) {
			this.removeEnzymesAnnotationEcnumberrank(enzymesAnnotationEcnumberrank);
		}
		
	}

	public void updateEnzymesAnnotationEcnumberrankList(List<EnzymesAnnotationEcnumberrank> enzymesAnnotationEcnumberrankList) {
		for (EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank: enzymesAnnotationEcnumberrankList) {
			this.update(enzymesAnnotationEcnumberrank);
		}
		
	}

	public void updateEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank) {
		super.update(enzymesAnnotationEcnumberrank);
		
	}

}
