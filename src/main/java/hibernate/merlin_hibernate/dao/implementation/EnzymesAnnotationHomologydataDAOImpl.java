package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationHomologydata;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationHomologydataDAO;


public class EnzymesAnnotationHomologydataDAOImpl extends GenericDaoImpl<EnzymesAnnotationHomologydata> implements IEnzymesAnnotationHomologydataDAO {

	public EnzymesAnnotationHomologydataDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationHomologydata.class);
		
	}

	public void addEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata) {
		super.save(enzymesAnnotationHomologydata);
		
	}

	public void addEnzymesAnnotationHomologydataList(List<EnzymesAnnotationHomologydata> enzymesAnnotationHomologydataList) {
		for (EnzymesAnnotationHomologydata enzymesAnnotationHomologydata: enzymesAnnotationHomologydataList) {
			this.addEnzymesAnnotationHomologydata(enzymesAnnotationHomologydata);
		}
		
	}

	public List<EnzymesAnnotationHomologydata> getAllEnzymesAnnotationHomologydata() {
		return super.findAll();
	}

	public EnzymesAnnotationHomologydata getEnzymesAnnotationHomologydata(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata) {
		super.delete(enzymesAnnotationHomologydata);
		
	}

	public void removeEnzymesAnnotationHomologydataList(List<EnzymesAnnotationHomologydata> enzymesAnnotationHomologydataList) {
		for (EnzymesAnnotationHomologydata enzymesAnnotationHomologydata: enzymesAnnotationHomologydataList) {
			this.removeEnzymesAnnotationHomologydata(enzymesAnnotationHomologydata);
		}
		
	}

	public void updateEnzymesAnnotationHomologydataList(List<EnzymesAnnotationHomologydata> enzymesAnnotationHomologydataList) {
		for (EnzymesAnnotationHomologydata enzymesAnnotationHomologydata: enzymesAnnotationHomologydataList) {
			this.update(enzymesAnnotationHomologydata);
		}
		
	}

	public void updateEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata) {
		super.update(enzymesAnnotationHomologydata);
		
	}

}
