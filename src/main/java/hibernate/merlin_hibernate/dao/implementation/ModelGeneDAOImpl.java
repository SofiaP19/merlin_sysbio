package hibernate.merlin_hibernate.dao.implementation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import hibernate.merlin_hibernate.entities.ModelGene;
import hibernate.merlin_hibernate.dao.Interface.IModelGeneDAO;


public class ModelGeneDAOImpl extends GenericDaoImpl<ModelGene> implements IModelGeneDAO {

	public ModelGeneDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelGene.class);
		
	}

	public void addModelGene(ModelGene modelGene) {
		super.save(modelGene);
		
	}

	public void addModelGeneList(List<ModelGene> modelGeneList) {
		for (ModelGene modelGene: modelGeneList) {
			this.addModelGene(modelGene);
		}
		
	}

	public List<ModelGene> getAllModelGene() {
		return super.findAll();
	}

	public ModelGene getModelGene(Integer id) {
		return super.findById(id);
	}

	public void removeModelGene(ModelGene modelGene) {
		super.delete(modelGene);
		
	}

	public void removeModelGeneList(List<ModelGene> modelGeneList) {
		for (ModelGene modelGene: modelGeneList) {
			this.removeModelGene(modelGene);
		}
		
	}

	public void updateModelGeneList(List<ModelGene> modelGeneList) {
		for (ModelGene modelGene: modelGeneList) {
			this.update(modelGene);
		}
		
	}

	public void updateModelGene(ModelGene modelGene) {
		super.update(modelGene);
		
	}
	
	/*public String getChromosomeName(ModelGene modelGene) {

		Integer chromosomeid = modelGene.getChromosomeIdchromosome();
		IGenericDao<ModelChromosome> chromosomeDao = new GenericDaoImpl<ModelChromosome>(this.getSessionFactory(),ModelChromosome.class);
		ModelChromosome chromosome = chromosomeDao.findById(chromosomeid);
		return chromosome.getName()

	}*/

	public Integer loadGene(String sequence_id) {
		Map<String, Serializable> map = new HashMap<String, Serializable>();
		map.put("sequence_id", sequence_id);
		ModelGene modelGene = (ModelGene) this.findByAttributes(map);
		
		return modelGene.getIdgene();
	}
	
	public Set<String> getAllDatabaseGenes(){
		Set<String> allGenes = new TreeSet<String>();
		List<ModelGene> list = this.findAll();
		for (ModelGene x: list){
			allGenes.add(x.getSequenceId());	
		}

		return allGenes;
	}
	
	public Map<String, Set<String>> getGeneNamesAliases() {
		
		Map<String, Set<String>> resList = new HashMap<String, Set<String>> ();
		
		
		Query query = super.getSessionFactory().getCurrentSession().createQuery("SELECT sequence_id, alias FROM model_gene "
									+ "INNER JOIN model_aliases ON (idgene=aliases.entity) WHERE class='g' ", ArrayList.class );
		
		List<ArrayList<String>> queryResultList = query.getResultList();
 
		
		for(ArrayList<String> line: queryResultList) {
			Set<String> aliasesList = resList.get(line.get(0)); 
			if(aliasesList == null) { //se a key nao estiver no dic
				aliasesList = new TreeSet<String>();
				resList.put(line.get(0), aliasesList); //cria o TreeSet e coloca-o na key
			}
			aliasesList.add(line.get(1)); //adiciona o value
		}
		
		
		return resList;
	
//		String query = "SELECT sequence_id, alias FROM gene "
//				+ "INNER JOIN aliases ON (idgene=aliases.entity) WHERE class='g' ";

//		ResultSet rs = statement.executeQuery(query);
//
//		while(rs.next()) {
//
//			Set<String> aliases = new TreeSet<>();
//
//			if(existingGeneNamesAlias.containsKey(rs.getString(1)))
//				aliases = existingGeneNamesAlias.get(rs.getString(1));
//
//			aliases.add(rs.getString(2));
//			existingGeneNamesAlias.put(rs.getString(1), aliases);
//		}
//
//		return existingGeneNamesAlias;
//	}

}
	
	
	
}
