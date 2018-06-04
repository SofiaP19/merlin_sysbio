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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModelModule generated by hbm2java
 */
@Entity
@Table(name = "model_module", catalog = "test_hibernate")
public class ModelModule implements java.io.Serializable {

	private Integer id;
	private String reaction;
	private String entryId;
	private String stoichiometry;
	private String name;
	private String definition;
	private String hieralchicalClass;
	private String type;
	private Set<ModelOrthology> modelOrthologies = new HashSet<ModelOrthology>(0);
	private Set<ModelEnzymeHasModule> modelEnzymeHasModules = new HashSet<ModelEnzymeHasModule>(0);
	private Set<ModelPathway> modelPathways = new HashSet<ModelPathway>(0);
	private Set<ModelCompound> modelCompounds = new HashSet<ModelCompound>(0);

	public ModelModule() {
	}

	public ModelModule(String reaction, String entryId, String definition, String type) {
		this.reaction = reaction;
		this.entryId = entryId;
		this.definition = definition;
		this.type = type;
	}

	public ModelModule(String reaction, String entryId, String stoichiometry, String name, String definition,
			String hieralchicalClass, String type, Set<ModelOrthology> modelOrthologies,
			Set<ModelEnzymeHasModule> modelEnzymeHasModules, Set<ModelPathway> modelPathways,
			Set<ModelCompound> modelCompounds) {
		this.reaction = reaction;
		this.entryId = entryId;
		this.stoichiometry = stoichiometry;
		this.name = name;
		this.definition = definition;
		this.hieralchicalClass = hieralchicalClass;
		this.type = type;
		this.modelOrthologies = modelOrthologies;
		this.modelEnzymeHasModules = modelEnzymeHasModules;
		this.modelPathways = modelPathways;
		this.modelCompounds = modelCompounds;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "reaction", nullable = false, length = 65535)
	public String getReaction() {
		return this.reaction;
	}

	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	@Column(name = "entry_id", nullable = false, length = 6)
	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	@Column(name = "stoichiometry", length = 45)
	public String getStoichiometry() {
		return this.stoichiometry;
	}

	public void setStoichiometry(String stoichiometry) {
		this.stoichiometry = stoichiometry;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "definition", nullable = false, length = 65535)
	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	@Column(name = "hieralchical_class", length = 65535)
	public String getHieralchicalClass() {
		return this.hieralchicalClass;
	}

	public void setHieralchicalClass(String hieralchicalClass) {
		this.hieralchicalClass = hieralchicalClass;
	}

	@Column(name = "type", nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_module_has_orthology", catalog = "test_hibernate", joinColumns = {
			@JoinColumn(name = "module_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "orthology_id", nullable = false, updatable = false) })
	public Set<ModelOrthology> getModelOrthologies() {
		return this.modelOrthologies;
	}

	public void setModelOrthologies(Set<ModelOrthology> modelOrthologies) {
		this.modelOrthologies = modelOrthologies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelModule")
	public Set<ModelEnzymeHasModule> getModelEnzymeHasModules() {
		return this.modelEnzymeHasModules;
	}

	public void setModelEnzymeHasModules(Set<ModelEnzymeHasModule> modelEnzymeHasModules) {
		this.modelEnzymeHasModules = modelEnzymeHasModules;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_pathway_has_module", catalog = "test_hibernate", joinColumns = {
			@JoinColumn(name = "module_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "pathway_idpathway", nullable = false, updatable = false) })
	public Set<ModelPathway> getModelPathways() {
		return this.modelPathways;
	}

	public void setModelPathways(Set<ModelPathway> modelPathways) {
		this.modelPathways = modelPathways;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "model_modules_has_compound", catalog = "test_hibernate", joinColumns = {
			@JoinColumn(name = "modules_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "compound_idcompound", nullable = false, updatable = false) })
	public Set<ModelCompound> getModelCompounds() {
		return this.modelCompounds;
	}

	public void setModelCompounds(Set<ModelCompound> modelCompounds) {
		this.modelCompounds = modelCompounds;
	}

}
