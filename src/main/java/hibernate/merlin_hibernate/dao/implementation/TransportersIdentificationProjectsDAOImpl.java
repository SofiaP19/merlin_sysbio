package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersIdentificationProjects;
import hibernate.merlin_hibernate.dao.Interface.ITransportersIdentificationProjectsDAO;


public class TransportersIdentificationProjectsDAOImpl extends GenericDaoImpl<TransportersIdentificationProjects> implements ITransportersIdentificationProjectsDAO{

	public TransportersIdentificationProjectsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersIdentificationProjects.class);
		
	}

	public void addTransportersIdentificationProject(TransportersIdentificationProjects transportersIdentificationProject) {
		super.save(transportersIdentificationProject);
		
	}

	public void addTransportersIdentificationProjects(List<TransportersIdentificationProjects> transportersIdentificationProjects) {
		for (TransportersIdentificationProjects transportersIdentificationProject: transportersIdentificationProjects) {
			this.addTransportersIdentificationProject(transportersIdentificationProject);
		}
		
	}

	public List<TransportersIdentificationProjects> getAllTransportersIdentificationProjects() {
		return super.findAll();
	}

	public TransportersIdentificationProjects getTransportersIdentificationProject(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersIdentificationProject(TransportersIdentificationProjects transportersIdentificationProject) {
		super.delete(transportersIdentificationProject);
		
	}

	public void removeTransportersIdentificationProjects(List<TransportersIdentificationProjects> transportersIdentificationProjects) {
		for (TransportersIdentificationProjects transportersIdentificationProject: transportersIdentificationProjects) {
			this.removeTransportersIdentificationProject(transportersIdentificationProject);
		}
		
	}

	public void updateTransportersIdentificationProjects(List<TransportersIdentificationProjects> transportersIdentificationProjects) {
		for (TransportersIdentificationProjects transportersIdentificationProject: transportersIdentificationProjects) {
			this.update(transportersIdentificationProject);
		}
		
	}

	public void updateTransportersIdentificationProject(TransportersIdentificationProjects transportersIdentificationProject) {
		super.update(transportersIdentificationProject);
		
	}


}
