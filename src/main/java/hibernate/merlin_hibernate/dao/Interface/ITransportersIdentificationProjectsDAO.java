package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.TransportersIdentificationProjects;

public interface ITransportersIdentificationProjectsDAO {
	
	public void addTransportersIdentificationProject(TransportersIdentificationProjects project); //adiciona um projeto
	
	public void addTransportersIdentificationProjects(List<TransportersIdentificationProjects> projects); //adiciona projetos
	
	public List<TransportersIdentificationProjects> getAllTransportersIdentificationProjects(); //retorna os projetos
	
	public TransportersIdentificationProjects getTransportersIdentificationProject(Integer id); //retorna um projeto
	
	public void removeTransportersIdentificationProject(TransportersIdentificationProjects project); //remove um projeto
	
	public void removeTransportersIdentificationProjects(List<TransportersIdentificationProjects> project); //remove projetos
	
	public void updateTransportersIdentificationProjects(List<TransportersIdentificationProjects> projects); //update de um projeto
	
	public void updateTransportersIdentificationProject(TransportersIdentificationProjects project);
}
