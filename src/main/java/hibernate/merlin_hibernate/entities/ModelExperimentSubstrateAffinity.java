package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ModelExperimentSubstrateAffinity generated by hbm2java
 */
@Entity
@Table(name = "model_experiment_substrate_affinity", catalog = "test_hibernate")
public class ModelExperimentSubstrateAffinity implements java.io.Serializable {

	private ModelExperimentSubstrateAffinityId id;
	private ModelCompound modelCompound;
	private ModelProtein modelProtein;
	private Float substrateAffinity;

	public ModelExperimentSubstrateAffinity() {
	}

	public ModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinityId id, ModelCompound modelCompound,
			ModelProtein modelProtein) {
		this.id = id;
		this.modelCompound = modelCompound;
		this.modelProtein = modelProtein;
	}

	public ModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinityId id, ModelCompound modelCompound,
			ModelProtein modelProtein, Float substrateAffinity) {
		this.id = id;
		this.modelCompound = modelCompound;
		this.modelProtein = modelProtein;
		this.substrateAffinity = substrateAffinity;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "experimentDescription", column = @Column(name = "experiment_description", nullable = false)),
			@AttributeOverride(name = "compoundIdcompound", column = @Column(name = "compound_idcompound", nullable = false)),
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)) })
	public ModelExperimentSubstrateAffinityId getId() {
		return this.id;
	}

	public void setId(ModelExperimentSubstrateAffinityId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compound_idcompound", nullable = false, insertable = false, updatable = false)
	public ModelCompound getModelCompound() {
		return this.modelCompound;
	}

	public void setModelCompound(ModelCompound modelCompound) {
		this.modelCompound = modelCompound;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "protein_idprotein", nullable = false, insertable = false, updatable = false)
	public ModelProtein getModelProtein() {
		return this.modelProtein;
	}

	public void setModelProtein(ModelProtein modelProtein) {
		this.modelProtein = modelProtein;
	}

	@Column(name = "substrate_affinity", precision = 12, scale = 0)
	public Float getSubstrateAffinity() {
		return this.substrateAffinity;
	}

	public void setSubstrateAffinity(Float substrateAffinity) {
		this.substrateAffinity = substrateAffinity;
	}

}
