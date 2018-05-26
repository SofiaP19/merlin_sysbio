package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModelCompartment generated by hbm2java
 */
@Entity
@Table(name = "model_compartment", catalog = "sysbio_model")
public class ModelCompartment implements java.io.Serializable {

	private Integer idcompartment;
	private String name;
	private String abbreviation;
	private Set<ModelStoichiometry> modelStoichiometries = new HashSet<ModelStoichiometry>(0);
	private Set<ModelGeneHasCompartment> modelGeneHasCompartments = new HashSet<ModelGeneHasCompartment>(0);
	private Set<ModelReaction> modelReactions = new HashSet<ModelReaction>(0);

	public ModelCompartment() {
	}

	public ModelCompartment(String name, String abbreviation, Set<ModelStoichiometry> modelStoichiometries,
			Set<ModelGeneHasCompartment> modelGeneHasCompartments, Set<ModelReaction> modelReactions) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.modelStoichiometries = modelStoichiometries;
		this.modelGeneHasCompartments = modelGeneHasCompartments;
		this.modelReactions = modelReactions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcompartment", unique = true, nullable = false)
	public Integer getIdcompartment() {
		return this.idcompartment;
	}

	public void setIdcompartment(Integer idcompartment) {
		this.idcompartment = idcompartment;
	}

	@Column(name = "name", length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "abbreviation", length = 20)
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelCompartment")
	public Set<ModelStoichiometry> getModelStoichiometries() {
		return this.modelStoichiometries;
	}

	public void setModelStoichiometries(Set<ModelStoichiometry> modelStoichiometries) {
		this.modelStoichiometries = modelStoichiometries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelCompartment")
	public Set<ModelGeneHasCompartment> getModelGeneHasCompartments() {
		return this.modelGeneHasCompartments;
	}

	public void setModelGeneHasCompartments(Set<ModelGeneHasCompartment> modelGeneHasCompartments) {
		this.modelGeneHasCompartments = modelGeneHasCompartments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelCompartment")
	public Set<ModelReaction> getModelReactions() {
		return this.modelReactions;
	}

	public void setModelReactions(Set<ModelReaction> modelReactions) {
		this.modelReactions = modelReactions;
	}

}
