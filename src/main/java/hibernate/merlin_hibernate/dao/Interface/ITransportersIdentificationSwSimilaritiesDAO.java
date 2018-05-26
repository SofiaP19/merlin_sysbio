package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersIdentificationSwSimilarities;

public interface ITransportersIdentificationSwSimilaritiesDAO {
	public void addTransportersIdentificationSwSimilarity(TransportersIdentificationSwSimilarities similarity); //adiciona similaridade
	
	public void addTransportersIdentificationSwSimilarities(List<TransportersIdentificationSwSimilarities> similarities); //adiciona similaridades
	
	public List<TransportersIdentificationSwSimilarities> getAllTransportersIdentificationSwSimilarities(); //retorna os similaridades
	
	public TransportersIdentificationSwSimilarities getTransportersIdentificationSwSimilarity(Integer id); //retorna um similaridade
	
	public void removeTransportersIdentificationSwSimilarity(TransportersIdentificationSwSimilarities similarity); //remove um similaridade
	
	public void removeSimilarities(List<TransportersIdentificationSwSimilarities> similarities); //remove similaridades
	
	public void updateSimilarity(TransportersIdentificationSwSimilarities similarity);
	
	public void updateSimilarities(List<TransportersIdentificationSwSimilarities> similarities);
}
