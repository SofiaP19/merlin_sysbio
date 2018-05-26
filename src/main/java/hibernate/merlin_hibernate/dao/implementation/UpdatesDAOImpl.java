package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.Updates;
import hibernate.merlin_hibernate.dao.Interface.IUpdatesDAO;


public class UpdatesDAOImpl extends GenericDaoImpl<Updates> implements IUpdatesDAO{

	public UpdatesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Updates.class);
		
	}

	public void addUpdate(Updates update) {
		super.save(update);
		
	}

	public void addUpdates(List<Updates> updates) {
		for (Updates upd: updates) {
			this.addUpdate(upd);
		}	
	}

	public List<Updates> getAllUpdates() {
		return super.findAll();
	}

	public Updates getUpdate(Integer id) {
		return super.findById(id);
	}

	public void removeUpdate(Updates update) {
		super.delete(update);
		
	}

	public void removeUpdates(List<Updates> updates) {
		for (Updates upd: updates) {
			this.removeUpdate(upd);
		}
		
	}

	public void updateUpdates(List<Updates> updates) {
		for (Updates upd: updates) {
			this.update(upd);
		}
		
	}

	public void updateUpdate(Updates update) {
		super.update(update);
		
	}

}
