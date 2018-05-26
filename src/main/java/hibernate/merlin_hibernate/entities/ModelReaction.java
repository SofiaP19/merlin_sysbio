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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModelReaction generated by hbm2java
 */
@Entity
@Table(name = "model_reaction", catalog = "sysbio_model")
public class ModelReaction implements java.io.Serializable {

	private Integer idreaction;
	private ModelCompartment modelCompartment;
	private String name;
	private String equation;
	private Boolean reversible;
	private String booleanRule;
	private Boolean inModel;
	private Boolean isGeneric;
	private Boolean isSpontaneous;
	private Boolean isNonEnzymatic;
	private String source;
	private boolean originalReaction;
	private String notes;
	private Long lowerBound;
	private Long upperBound;
	private Set<ModelEnzyme> modelEnzymes = new HashSet<ModelEnzyme>(0);
	private Set<ModelPathway> modelPathways = new HashSet<ModelPathway>(0);
	private Set<ModelEnzyme> modelEnzymes_1 = new HashSet<ModelEnzyme>(0);
	private Set<ModelReaction> modelReactionsForSubReactionId = new HashSet<ModelReaction>(0);
	private Set<ModelStoichiometry> modelStoichiometries = new HashSet<ModelStoichiometry>(0);
	private Set<ModelReaction> modelReactionsForSuperReactionId = new HashSet<ModelReaction>(0);

	public ModelReaction() {
	}

	public ModelReaction(String source, boolean originalReaction) {
		this.source = source;
		this.originalReaction = originalReaction;
	}

	public ModelReaction(ModelCompartment modelCompartment, String name, String equation, Boolean reversible,
			String booleanRule, Boolean inModel, Boolean isGeneric, Boolean isSpontaneous, Boolean isNonEnzymatic,
			String source, boolean originalReaction, String notes, Long lowerBound, Long upperBound,
			Set<ModelEnzyme> modelEnzymes, Set<ModelPathway> modelPathways, Set<ModelEnzyme> modelEnzymes_1,
			Set<ModelReaction> modelReactionsForSubReactionId, Set<ModelStoichiometry> modelStoichiometries,
			Set<ModelReaction> modelReactionsForSuperReactionId) {
		this.modelCompartment = modelCompartment;
		this.name = name;
		this.equation = equation;
		this.reversible = reversible;
		this.booleanRule = booleanRule;
		this.inModel = inModel;
		this.isGeneric = isGeneric;
		this.isSpontaneous = isSpontaneous;
		this.isNonEnzymatic = isNonEnzymatic;
		this.source = source;
		this.originalReaction = originalReaction;
		this.notes = notes;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.modelEnzymes = modelEnzymes;
		this.modelPathways = modelPathways;
		this.modelEnzymes_1 = modelEnzymes_1;
		this.modelReactionsForSubReactionId = modelReactionsForSubReactionId;
		this.modelStoichiometries = modelStoichiometries;
		this.modelReactionsForSuperReactionId = modelReactionsForSuperReactionId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idreaction", unique = true, nullable = false)
	public Integer getIdreaction() {
		return this.idreaction;
	}

	public void setIdreaction(Integer idreaction) {
		this.idreaction = idreaction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compartment_idcompartment")
	public ModelCompartment getModelCompartment() {
		return this.modelCompartment;
	}

	public void setModelCompartment(ModelCompartment modelCompartment) {
		this.modelCompartment = modelCompartment;
	}

	@Column(name = "name", length = 400)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "equation", length = 65535)
	public String getEquation() {
		return this.equation;
	}

	public void setEquation(String equation) {
		this.equation = equation;
	}

	@Column(name = "reversible")
	public Boolean getReversible() {
		return this.reversible;
	}

	public void setReversible(Boolean reversible) {
		this.reversible = reversible;
	}

	@Column(name = "boolean_rule", length = 400)
	public String getBooleanRule() {
		return this.booleanRule;
	}

	public void setBooleanRule(String booleanRule) {
		this.booleanRule = booleanRule;
	}

	@Column(name = "inModel")
	public Boolean getInModel() {
		return this.inModel;
	}

	public void setInModel(Boolean inModel) {
		this.inModel = inModel;
	}

	@Column(name = "isGeneric")
	public Boolean getIsGeneric() {
		return this.isGeneric;
	}

	public void setIsGeneric(Boolean isGeneric) {
		this.isGeneric = isGeneric;
	}

	@Column(name = "isSpontaneous")
	public Boolean getIsSpontaneous() {
		return this.isSpontaneous;
	}

	public void setIsSpontaneous(Boolean isSpontaneous) {
		this.isSpontaneous = isSpontaneous;
	}

	@Column(name = "isNonEnzymatic")
	public Boolean getIsNonEnzymatic() {
		return this.isNonEnzymatic;
	}

	public void setIsNonEnzymatic(Boolean isNonEnzymatic) {
		this.isNonEnzymatic = isNonEnzymatic;
	}

	@Column(name = "source", nullable = false, length = 45)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "originalReaction", nullable = false)
	public boolean isOriginalReaction() {
		return this.originalReaction;
	}

	public void setOriginalReaction(boolean originalReaction) {
		this.originalReaction = originalReaction;
	}

	@Column(name = "notes", length = 65535)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "lowerBound")
	public Long getLowerBound() {
		return this.lowerBound;
	}

	public void setLowerBound(Long lowerBound) {
		this.lowerBound = lowerBound;
	}

	@Column(name = "upperBound")
	public Long getUpperBound() {
		return this.upperBound;
	}

	public void setUpperBound(Long upperBound) {
		this.upperBound = upperBound;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_activating_reaction", catalog = "sysbio_model", joinColumns = {
			@JoinColumn(name = "reaction_idreaction", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "enzyme_ecnumber", nullable = false, updatable = false) })
	public Set<ModelEnzyme> getModelEnzymes() {
		return this.modelEnzymes;
	}

	public void setModelEnzymes(Set<ModelEnzyme> modelEnzymes) {
		this.modelEnzymes = modelEnzymes;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_pathway_has_reaction", catalog = "sysbio_model", joinColumns = {
			@JoinColumn(name = "reaction_idreaction", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "pathway_idpathway", nullable = false, updatable = false) })
	public Set<ModelPathway> getModelPathways() {
		return this.modelPathways;
	}

	public void setModelPathways(Set<ModelPathway> modelPathways) {
		this.modelPathways = modelPathways;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_reaction_has_enzyme", catalog = "sysbio_model", joinColumns = {
			@JoinColumn(name = "reaction_idreaction", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "enzyme_ecnumber", nullable = false, updatable = false) })
	public Set<ModelEnzyme> getModelEnzymes_1() {
		return this.modelEnzymes_1;
	}

	public void setModelEnzymes_1(Set<ModelEnzyme> modelEnzymes_1) {
		this.modelEnzymes_1 = modelEnzymes_1;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_is_super_reaction", catalog = "sysbio_model", joinColumns = {
			@JoinColumn(name = "super_reaction_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "sub_reaction_id", nullable = false, updatable = false) })
	public Set<ModelReaction> getModelReactionsForSubReactionId() {
		return this.modelReactionsForSubReactionId;
	}

	public void setModelReactionsForSubReactionId(Set<ModelReaction> modelReactionsForSubReactionId) {
		this.modelReactionsForSubReactionId = modelReactionsForSubReactionId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelReaction")
	public Set<ModelStoichiometry> getModelStoichiometries() {
		return this.modelStoichiometries;
	}

	public void setModelStoichiometries(Set<ModelStoichiometry> modelStoichiometries) {
		this.modelStoichiometries = modelStoichiometries;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_is_super_reaction", catalog = "sysbio_model", joinColumns = {
			@JoinColumn(name = "sub_reaction_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "super_reaction_id", nullable = false, updatable = false) })
	public Set<ModelReaction> getModelReactionsForSuperReactionId() {
		return this.modelReactionsForSuperReactionId;
	}

	public void setModelReactionsForSuperReactionId(Set<ModelReaction> modelReactionsForSuperReactionId) {
		this.modelReactionsForSuperReactionId = modelReactionsForSuperReactionId;
	}

}