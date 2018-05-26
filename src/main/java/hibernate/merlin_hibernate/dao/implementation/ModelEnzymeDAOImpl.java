package hibernate.merlin_hibernate.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.query.Query;

import hibernate.merlin_hibernate.entities.ModelEnzyme;
import hibernate.merlin_hibernate.entities.ModelEnzymeId;
import hibernate.merlin_hibernate.entities.ModelPathway;
import hibernate.merlin_hibernate.entities.ModelPathwayHasEnzyme;
import hibernate.merlin_hibernate.entities.ModelPathwayHasReaction;
import hibernate.merlin_hibernate.entities.ModelReaction;
import hibernate.merlin_hibernate.entities.ModelReactionHasEnzyme;
import hibernate.merlin_hibernate.dao.Interface.IModelEnzymeDAO;


public class ModelEnzymeDAOImpl extends GenericDaoImpl<ModelEnzyme> implements IModelEnzymeDAO {

	public ModelEnzymeDAOImpl(SessionFactory sessionFactory, Class<ModelEnzyme> klass) {
		super(sessionFactory, ModelEnzyme.class);
		
	}

	public void addModelEnzyme(ModelEnzyme modelEnzyme) {
		super.save(modelEnzyme);
		
	}

	public void addModelEnzymeList(List<ModelEnzyme> modelEnzymeList) {
		for (ModelEnzyme modelEnzyme: modelEnzymeList) {
			this.addModelEnzyme(modelEnzyme);
		}	
	}

	public List<ModelEnzyme> getAllModelEnzyme() {
		return super.findAll();
	}

	public ModelEnzyme getModelEnzyme(Integer id) {
		return super.findById(id);
	}

	public void removeModelEnzyme(ModelEnzyme modelEnzyme) {
		super.delete(modelEnzyme);
		
	}

	public void removeModelEnzymeList(List<ModelEnzyme> modelEnzymeList) {
		for (ModelEnzyme modelEnzyme: modelEnzymeList) {
			this.removeModelEnzyme(modelEnzyme);
		}
		
	}

	public void updateModelEnzymeList(List<ModelEnzyme> modelEnzymeList) {
		for (ModelEnzyme modelEnzyme: modelEnzymeList) {
			this.update(modelEnzyme);
		}
		
	}

	public void updateModelEnzyme(ModelEnzyme modelEnzyme) {
		super.update(modelEnzyme);
		
	}
	
	public List<ModelPathway> getAllPathways(ModelEnzyme modelEnzyme){
		ModelEnzymeId enzymeId = modelEnzyme.getId();
		return new ArrayList<ModelPathway>();
	}
	
	public List<ModelReaction> getAllReactionsByECNumberAndProteinIdFilteredByCompartment(ModelEnzyme modelEnzyme, Boolean isInCompartment){
		String ecNumber = modelEnzyme.getId().getEcnumber();
		Integer proteinId = modelEnzyme.getId().getProteinIdprotein();
		//ModelReactionHasEnzyme
		//ModelPathwayHasEnzyme
		//ModelPathwayHasReaction
		CriteriaBuilder cb = this.getSessionFactory().getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<ModelReaction> c = cb.createQuery(ModelReaction.class);
		Root<ModelReaction> table = c.from(ModelReaction.class); 
	    c.select(table); 
		
		DetachedCriteria reactionsWithEnzyme = DetachedCriteria.forClass(ModelReactionHasEnzyme.class)
				.setProjection(Property.forName("model_reaction_has_enzyme.reactionIdreaction"))
			   // .add(Property.forName("model_reaction_has_enzyme.reactionIdreaction").eqProperty("model_reaction.idreaction"))
			    .add(Property.forName("model_reaction_has_enzyme.enzymeEcnumber").eq(ecNumber))
			    .add(Property.forName("model_reaction_has_enzyme.enzymeProteinIdprotein").eq(proteinId));
		
		DetachedCriteria pathwaysWithEnzyme = DetachedCriteria.forClass(ModelPathwayHasEnzyme.class)
				.setProjection(Property.forName("model_reaction_has_enzyme.pathwayIdpathway"))
			   // .add(Property.forName("model_pathway_has_enzyme.enzymeProteinIdprotein").eqProperty("model_reaction_has_enzyme.enzymeProteinIdprotein") )
			    .add(Property.forName("model_pathway_has_enzyme.enzymeEcnumber").eq(ecNumber))
				.add(Property.forName("model_pathway_has_enzyme.enzymeProteinIdprotein").eq(proteinId));
		
		DetachedCriteria pathwayInEnzymeAndReaction = DetachedCriteria.forClass(ModelPathwayHasReaction.class)
				.setProjection(Property.forName("model_pathway_has_reaction.reactionIdreaction"))
			    .add(Property.forName("model_pathway_has_reaction.pathwayIdpathway").in(pathwaysWithEnzyme) )
			    .add(Property.forName("model_pathway_has_reaction.reactionIdreaction").in(reactionsWithEnzyme));
		
		List<Predicate> filters = new ArrayList<Predicate>();
		Path<Object> reactionId = table.get("idreaction");
		filters.add(reactionId.in(pathwayInEnzymeAndReaction));
		
		filters.add(cb.equal(table.get("originalReaction"), isInCompartment));
		Predicate p = cb.and(filters.toArray(new Predicate[] {}));  // junta todos os predicados com and
		c.where(p);

		Query<ModelReaction> q = this.getSessionFactory().getCurrentSession().createQuery(c);
		return q.getResultList();
	}
}
