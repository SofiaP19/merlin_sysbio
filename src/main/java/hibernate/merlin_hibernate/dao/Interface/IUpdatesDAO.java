package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.Updates;

public interface IUpdatesDAO {
	
	public void addUpdates(List<Updates> updates); 
	
	public List<Updates> getAllUpdates(); 
		
	public Updates getUpdate(Integer id); 
		
	public void removeUpdate(Updates update); 
		
	public void removeUpdates(List<Updates> upd); 
		
	public void updateUpdates(List<Updates> updates); 
		
	public void updateUpdate(Updates update);
}
