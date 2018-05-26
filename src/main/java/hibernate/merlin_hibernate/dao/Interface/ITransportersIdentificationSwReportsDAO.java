package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersIdentificationSwReports;

public interface ITransportersIdentificationSwReportsDAO {
	
	public void addReport(TransportersIdentificationSwReports report); //adiciona um report
	
	public void addReports(List<TransportersIdentificationSwReports> reports); //adiciona reports
	
	public List<TransportersIdentificationSwReports> getAllReports(); //retorna os reports
	
	public TransportersIdentificationSwReports getReport(Integer id); //retorna um report
	
	public void removeReport(TransportersIdentificationSwReports report); //remove um report
	
	public void removeReports(List<TransportersIdentificationSwReports> reports); //remove reports
	
	public void updateReports(List<TransportersIdentificationSwReports> reports); //update reports
	
	public void updateReport(TransportersIdentificationSwReports report); //update report
}
