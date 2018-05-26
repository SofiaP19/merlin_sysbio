package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.InterproInterproModel;
import hibernate.merlin_hibernate.dao.Interface.I_InterproInterproModelDAO;

public class InterproInterproModelDAOImpl extends GenericDaoImpl<InterproInterproModel> implements I_InterproInterproModelDAO{

	public InterproInterproModelDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, InterproInterproModel.class);
		
	}


	public void addInterproInterproModel(InterproInterproModel interproInterproModel) {
		super.save(interproInterproModel);
		
	}

	public void addInterproInterproModelList(List<InterproInterproModel> interproInterproModelList) {
		for (InterproInterproModel interproInterproModel: interproInterproModelList) {
			this.addInterproInterproModel(interproInterproModel);
		}
		
	}

	public List<InterproInterproModel> getAllInterproInterproModel() {
		return super.findAll();
	}

	public InterproInterproModel getInterproInterproModel(Integer id) {
		return super.findById(id);
	}

	public void removeInterproInterproModel(InterproInterproModel interproInterproModel) {
		super.delete(interproInterproModel);
		
	}

	public void removeInterproInterproModelList(List<InterproInterproModel> interproInterproModelList) {
		for (InterproInterproModel interproInterproModel: interproInterproModelList) {
			this.removeInterproInterproModel(interproInterproModel);
		}
		
	}

	public void updateInterproInterproModel(List<InterproInterproModel> interproInterproModelList) {
		for (InterproInterproModel interproInterproModel: interproInterproModelList) {
			this.update(interproInterproModel);
		}
		
	}

	public void updateInterproInterproModel(InterproInterproModel interproInterproModel) {
		super.update(interproInterproModel);
	}	
}
