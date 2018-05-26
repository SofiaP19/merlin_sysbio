package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.TransportersIdentificationSwReports;
import hibernate.merlin_hibernate.dao.Interface.ITransportersIdentificationSwReportsDAO;


public class TransportersIdentificationSwReportsDAOImpl extends GenericDaoImpl<TransportersIdentificationSwReports> implements ITransportersIdentificationSwReportsDAO {

	public TransportersIdentificationSwReportsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersIdentificationSwReports.class);
	
	}

	public void addReport(TransportersIdentificationSwReports report) {
		super.save(report);
		
	}

	public void addReports(List<TransportersIdentificationSwReports> reports) {
		for (TransportersIdentificationSwReports swReport: reports) {
			this.addReport(swReport);
		}
		
	}

	public List<TransportersIdentificationSwReports> getAllReports() {
		return super.findAll();
	}

	public TransportersIdentificationSwReports getReport(Integer id) {
		return super.findById(id);
	}

	public void removeReport(TransportersIdentificationSwReports report) {
		super.delete(report);
		
	}

	public void removeReports(List<TransportersIdentificationSwReports> reports) {
		for (TransportersIdentificationSwReports report: reports) {
			this.removeReport(report);
		}
		
	}

	public void updateReports(List<TransportersIdentificationSwReports> reports) {
		for (TransportersIdentificationSwReports report: reports) {
			this.update(report);
		}	
		
	}

	public void updateReport(TransportersIdentificationSwReports report) {
		super.update(report);
		
	}

}
