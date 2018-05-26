package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.EnzymesAnnotationScorerconfig;
import hibernate.merlin_hibernate.dao.Interface.IEnzymesAnnotationScorerconfigDAO;


public class EnzymesAnnotationScorerconfigDAOImpl extends GenericDaoImpl<EnzymesAnnotationScorerconfig> implements IEnzymesAnnotationScorerconfigDAO  {

	public EnzymesAnnotationScorerconfigDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, EnzymesAnnotationScorerconfig.class);
		
	}

	public void addEnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig) {
		super.save(enzymesAnnotationScorerconfig);
		
	}

	public void addEnzymesAnnotationScorerconfig(List<EnzymesAnnotationScorerconfig> enzymesAnnotationScorerconfigList) {
		for (EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig: enzymesAnnotationScorerconfigList) {
			this.addEnzymesAnnotationScorerconfig(enzymesAnnotationScorerconfig);
		}
		
	}

	public List<EnzymesAnnotationScorerconfig> getAllEnzymesAnnotationScorerconfig() {
		return super.findAll();
	}

	public EnzymesAnnotationScorerconfig getEnzymesAnnotationScorerconfig(Integer id) {
		return super.findById(id);
	}

	public void removeEnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig) {
		super.delete(enzymesAnnotationScorerconfig);
		
	}

	public void removeEnzymesAnnotationScorerconfigList(List<EnzymesAnnotationScorerconfig> enzymesAnnotationScorerconfigList) {
		for (EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig: enzymesAnnotationScorerconfigList) {
			this.removeEnzymesAnnotationScorerconfig(enzymesAnnotationScorerconfig);
		}
		
	}

	public void updateEnzymesAnnotationScorerconfigList(List<EnzymesAnnotationScorerconfig> enzymesAnnotationScorerconfigList) {
		for (EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig: enzymesAnnotationScorerconfigList) {
			this.update(enzymesAnnotationScorerconfig);
		}
		
	}

	public void updateEnzymesAnnotationScorerconfig(EnzymesAnnotationScorerconfig enzymesAnnotationScorerconfig) {
		super.update(enzymesAnnotationScorerconfig);
		
	}

}
