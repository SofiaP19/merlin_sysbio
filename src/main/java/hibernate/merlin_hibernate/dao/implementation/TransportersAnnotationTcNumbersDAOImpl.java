package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersAnnotationTcNumbers;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTcNumbersDAO;


public class TransportersAnnotationTcNumbersDAOImpl extends GenericDaoImpl<TransportersAnnotationTcNumbers> implements ITransportersAnnotationTcNumbersDAO {

	public TransportersAnnotationTcNumbersDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTcNumbers.class);
	
	}

	public void addTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers transportersAnnotationTcNumber) {
		super.save(transportersAnnotationTcNumber);
		
	}

	public void addTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> transportersAnnotationTcNumbers) {
		for (TransportersAnnotationTcNumbers transportersAnnotationTcNumber: transportersAnnotationTcNumbers) {
			this.addTransportersAnnotationTcNumber(transportersAnnotationTcNumber);
		}
		
	}

	public List<TransportersAnnotationTcNumbers> getAllTransportersAnnotationTcNumbers() {
		return super.findAll();
	}

	public TransportersAnnotationTcNumbers getTransportersAnnotationTcNumber(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers transportersAnnotationTcNumber) {
		super.delete(transportersAnnotationTcNumber);
		
	}

	public void removeTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> transportersAnnotationTcNumbers) {
		for (TransportersAnnotationTcNumbers transportersAnnotationTcNumber: transportersAnnotationTcNumbers) {
			this.removeTransportersAnnotationTcNumber(transportersAnnotationTcNumber);
		}
		
	}

	public void updateTransportersAnnotationTcNumbers(List<TransportersAnnotationTcNumbers> transportersAnnotationTcNumbers) {
		for (TransportersAnnotationTcNumbers transportersAnnotationTcNumber: transportersAnnotationTcNumbers) {
			this.update(transportersAnnotationTcNumber);
		}
		
	}

	public void updateTransportersAnnotationTcNumber(TransportersAnnotationTcNumbers transportersAnnotationTcNumber) {
		super.update(transportersAnnotationTcNumber);
		
	}

}
