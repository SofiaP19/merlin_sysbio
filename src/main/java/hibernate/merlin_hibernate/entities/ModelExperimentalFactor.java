package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModelExperimentalFactor generated by hbm2java
 */
@Entity
@Table(name = "model_experimental_factor", catalog = "sysbio_model")
public class ModelExperimentalFactor implements java.io.Serializable {

	private int idexperimentalFactor;
	private String factor;
	private Set<ModelExperimentDescription> modelExperimentDescriptions = new HashSet<ModelExperimentDescription>(0);

	public ModelExperimentalFactor() {
	}

	public ModelExperimentalFactor(int idexperimentalFactor) {
		this.idexperimentalFactor = idexperimentalFactor;
	}

	public ModelExperimentalFactor(int idexperimentalFactor, String factor,
			Set<ModelExperimentDescription> modelExperimentDescriptions) {
		this.idexperimentalFactor = idexperimentalFactor;
		this.factor = factor;
		this.modelExperimentDescriptions = modelExperimentDescriptions;
	}

	@Id

	@Column(name = "idexperimental_factor", unique = true, nullable = false)
	public int getIdexperimentalFactor() {
		return this.idexperimentalFactor;
	}

	public void setIdexperimentalFactor(int idexperimentalFactor) {
		this.idexperimentalFactor = idexperimentalFactor;
	}

	@Column(name = "factor")
	public String getFactor() {
		return this.factor;
	}

	public void setFactor(String factor) {
		this.factor = factor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelExperimentalFactor")
	public Set<ModelExperimentDescription> getModelExperimentDescriptions() {
		return this.modelExperimentDescriptions;
	}

	public void setModelExperimentDescriptions(Set<ModelExperimentDescription> modelExperimentDescriptions) {
		this.modelExperimentDescriptions = modelExperimentDescriptions;
	}

}