package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationEcnumberlist;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationEcnumberlistDAO;


public class EnzymesAnnotationEcnumberlistDAOImpl extends GenericDaoImpl<EnzymesAnnotationEcnumberlist> implements IEnzymesAnnotationEcnumberlistDAO{

	public EnzymesAnnotationEcnumberlistDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationEcnumberlist.class);
	
	}

	public void addEnzymesAnnotationEcnumberlist(EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist) {
		super.save(enzymesAnnotationEcnumberlist);
		
	}

	public void addEnzymesAnnotationEcnumberlistList(List<EnzymesAnnotationEcnumberlist> enzymesAnnotationEcnumberlistList) {
		for (EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist: enzymesAnnotationEcnumberlistList) {
			this.addEnzymesAnnotationEcnumberlist(enzymesAnnotationEcnumberlist);
		}
		
	}

	public List<EnzymesAnnotationEcnumberlist> getAllEnzymesAnnotationEcnumberlist() {
		return super.findAll();
	}

	public EnzymesAnnotationEcnumberlist getEnzymesAnnotationEcnumberlist(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationEcnumberlist(EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist) {
		super.delete(enzymesAnnotationEcnumberlist);
		
	}

	public void removeEnzymesAnnotationEcnumberlistList(List<EnzymesAnnotationEcnumberlist> enzymesAnnotationEcnumberlistList) {
		for (EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist: enzymesAnnotationEcnumberlistList) {
			this.removeEnzymesAnnotationEcnumberlist(enzymesAnnotationEcnumberlist);
		}
		
	}

	public void updateEnzymesAnnotationEcnumberlistList(List<EnzymesAnnotationEcnumberlist> enzymesAnnotationEcnumberlistList) {
		for (EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist: enzymesAnnotationEcnumberlistList) {
			this.update(enzymesAnnotationEcnumberlist);
		}
		
	}

	public void updateEnzymesAnnotationEcnumberlist(EnzymesAnnotationEcnumberlist enzymesAnnotationEcnumberlist) {
		super.update(enzymesAnnotationEcnumberlist);
		
	}


}

