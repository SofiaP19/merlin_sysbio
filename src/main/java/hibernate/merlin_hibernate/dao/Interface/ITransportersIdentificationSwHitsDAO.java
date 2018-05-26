package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersIdentificationSwHits;

public interface ITransportersIdentificationSwHitsDAO {
public void addSwHit(TransportersIdentificationSwHits swHit); //adiciona hit
	
	public void addSwHits(List<TransportersIdentificationSwHits> swHits); //adiciona hits
	
	public List<TransportersIdentificationSwHits> getAllSwHits(); //retorna hits
	
	public TransportersIdentificationSwHits getSwhit(Integer id); //retorna hit
	
	public void removeSwHit(TransportersIdentificationSwHits swHit); //remove hit
	
	public void removeSwHits(List<TransportersIdentificationSwHits> swHits); //remove hits
	
	public void updateSwHits(List<TransportersIdentificationSwHits> SwHits); //update hits
	
	public void updateSwHit(TransportersIdentificationSwHits SwHit); //update hit
}
