package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumber;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationEcnumberDAO;


public class EnzymesAnnotationEcnumberDAOImpl extends GenericDaoImpl<EnzymesAnnotationEcnumber> implements IEnzymesAnnotationEcnumberDAO {

	public EnzymesAnnotationEcnumberDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationEcnumber.class);
	
	}

	public void addEnzymesAnnotationEcnumber(EnzymesAnnotationEcnumber enzymesAnnotationEcnumber) {
		super.save(enzymesAnnotationEcnumber);
		
	}

	public void addEnzymesAnnotationEcnumberList(List<EnzymesAnnotationEcnumber> enzymesAnnotationEcnumberList) {
		for (EnzymesAnnotationEcnumber ecnumber: enzymesAnnotationEcnumberList) {
			this.addEnzymesAnnotationEcnumber(ecnumber);
		}
		
	}

	public List<EnzymesAnnotationEcnumber> getAllEnzymesAnnotationEcnumber() {
		return super.findAll();
	}
	

	public EnzymesAnnotationEcnumber getEnzymesAnnotationEcnumber(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationEcnumber(EnzymesAnnotationEcnumber enzymesAnnotationEcnumber) {
		super.delete(enzymesAnnotationEcnumber);
		
	}

	public void removeEnzymesAnnotationEcnumberList(List<EnzymesAnnotationEcnumber> enzymesAnnotationEcnumberList) {
		for (EnzymesAnnotationEcnumber ecnumber: enzymesAnnotationEcnumberList) {
			this.removeEnzymesAnnotationEcnumber(ecnumber);
		}
	}

	public void updateEnzymesAnnotationEcnumberList(List<EnzymesAnnotationEcnumber> enzymesAnnotationEcnumberList) {
		for (EnzymesAnnotationEcnumber ecnumber: enzymesAnnotationEcnumberList) {
			this.update(ecnumber);
		}
		
	}

	public void updateEnzymesAnnotationEcnumber(EnzymesAnnotationEcnumber enzymesAnnotationEcnumber) {
		super.update(enzymesAnnotationEcnumber);
		
	}

}
