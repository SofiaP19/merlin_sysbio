package hibernate.merlin_hibernate.dao.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.EnzymesAnnotationGenehomology;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationGenehomologyDAO;


public class EnzymesAnnotationGenehomologyDAOImpl extends GenericDaoImpl<EnzymesAnnotationGenehomology> implements IEnzymesAnnotationGenehomologyDAO {

	public EnzymesAnnotationGenehomologyDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationGenehomology.class);
		
	}

	public void addEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology) {
		super.save(enzymesAnnotationGenehomology);
		
	}

	public void addEnzymesAnnotationGenehomologyList(List<EnzymesAnnotationGenehomology> enzymesAnnotationGenehomologyList) {
		for (EnzymesAnnotationGenehomology enzymesAnnotationGenehomology: enzymesAnnotationGenehomologyList) {
			this.addEnzymesAnnotationGenehomology(enzymesAnnotationGenehomology);
		}
		
	}

	public List<EnzymesAnnotationGenehomology> getAllEnzymesAnnotationGenehomology() {
		return super.findAll();
	}

	public EnzymesAnnotationGenehomology getEnzymesAnnotationGenehomology(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology) {
		super.delete(enzymesAnnotationGenehomology);
		
	}

	public void removeEnzymesAnnotationGenehomologyList(List<EnzymesAnnotationGenehomology> enzymesAnnotationGenehomologyList) {
		for (EnzymesAnnotationGenehomology enzymesAnnotationGenehomology: enzymesAnnotationGenehomologyList) {
			this.removeEnzymesAnnotationGenehomology(enzymesAnnotationGenehomology);
		}
		
	}

	public void updateEnzymesAnnotationGenehomologyList(List<EnzymesAnnotationGenehomology> enzymesAnnotationGenehomologyList) {
		for (EnzymesAnnotationGenehomology enzymesAnnotationGenehomology: enzymesAnnotationGenehomologyList) {
			this.update(enzymesAnnotationGenehomology);
		}
		
	}

	public void updateEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology) {
		super.update(enzymesAnnotationGenehomology);
		
	}
	
	public Map<Integer, String> getQueries(){
		Map<Integer, String> ret = new HashMap<Integer, String>();
		List<EnzymesAnnotationGenehomology> list = this.findAll();
		for (EnzymesAnnotationGenehomology x: list) {
			ret.put(x.getSKey(), x.getQuery());
		}

		return ret;
	}

}
