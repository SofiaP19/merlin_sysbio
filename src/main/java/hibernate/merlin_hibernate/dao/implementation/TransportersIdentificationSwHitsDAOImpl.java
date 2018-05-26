package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersIdentificationSwHits;
import hibernate.merlin_hibernate.dao.Interface.ITransportersIdentificationSwHitsDAO;



public class TransportersIdentificationSwHitsDAOImpl extends GenericDaoImpl<TransportersIdentificationSwHits> implements ITransportersIdentificationSwHitsDAO {

	public TransportersIdentificationSwHitsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersIdentificationSwHits.class);
		
	}

	public void addSwHit(TransportersIdentificationSwHits swHit) {
		super.save(swHit);
		
	}

	public void addSwHits(List<TransportersIdentificationSwHits> swHits) {
		for (TransportersIdentificationSwHits swHit: swHits) {
			this.addSwHit(swHit);
		}
		
	}

	public List<TransportersIdentificationSwHits> getAllSwHits() {
		return super.findAll();
	}

	public TransportersIdentificationSwHits getSwhit(Integer id) {
		return super.findById(id);
	}

	public void removeSwHit(TransportersIdentificationSwHits swHit) {
		super.delete(swHit);
		
	}

	public void removeSwHits(List<TransportersIdentificationSwHits> swHits) {
		for (TransportersIdentificationSwHits swHit: swHits) {
			this.removeSwHit(swHit);
		}
		
	}

	public void updateSwHits(List<TransportersIdentificationSwHits> swHits) {
		for (TransportersIdentificationSwHits swHit: swHits) {
			this.update(swHit);
		}
		
	}

	public void updateSwHit(TransportersIdentificationSwHits swHit) {
		super.update(swHit);	
		
	}

}
