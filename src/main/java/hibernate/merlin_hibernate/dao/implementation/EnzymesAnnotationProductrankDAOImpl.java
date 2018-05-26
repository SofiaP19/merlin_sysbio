package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationProductrank;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationProductrankDAO;


public class EnzymesAnnotationProductrankDAOImpl extends GenericDaoImpl<EnzymesAnnotationProductrank> implements IEnzymesAnnotationProductrankDAO {

	public EnzymesAnnotationProductrankDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationProductrank.class);
	
	}

	public void addEnzymesAnnotationProductrank(EnzymesAnnotationProductrank enzymesAnnotationProductrank) {
		super.save(enzymesAnnotationProductrank);
		
	}

	public void addEnzymesAnnotationProductrankList(List<EnzymesAnnotationProductrank> enzymesAnnotationProductrankList) {
		for (EnzymesAnnotationProductrank enzymesAnnotationProductrank: enzymesAnnotationProductrankList) {
			this.addEnzymesAnnotationProductrank(enzymesAnnotationProductrank);
		}
		
	}

	public List<EnzymesAnnotationProductrank> getAllEnzymesAnnotationProductrank() {
		return super.findAll();
	}

	public EnzymesAnnotationProductrank getEnzymesAnnotationProductrank(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationProductrank(EnzymesAnnotationProductrank enzymesAnnotationProductrank) {
		super.delete(enzymesAnnotationProductrank);
	}

	public void removeEnzymesAnnotationProductrankList(List<EnzymesAnnotationProductrank> enzymesAnnotationProductrankList) {
		for (EnzymesAnnotationProductrank enzymesAnnotationProductrank: enzymesAnnotationProductrankList) {
			this.removeEnzymesAnnotationProductrank(enzymesAnnotationProductrank);
		}
		
	}

	public void updateEnzymesAnnotationProductrankList(List<EnzymesAnnotationProductrank> enzymesAnnotationProductrankList) {
		for (EnzymesAnnotationProductrank enzymesAnnotationProductrank: enzymesAnnotationProductrankList) {
			this.update(enzymesAnnotationProductrank);
		}	
		
	}

	public void updateEnzymesAnnotationProductrank(EnzymesAnnotationProductrank enzymesAnnotationProductrank) {
		super.update(enzymesAnnotationProductrank);
		
	}

}
