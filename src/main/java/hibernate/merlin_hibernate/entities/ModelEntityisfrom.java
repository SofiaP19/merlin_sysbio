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
 * ModelEntityisfrom generated by hbm2java
 */
@Entity
@Table(name = "model_entityisfrom", catalog = "sysbio_model")
public class ModelEntityisfrom implements java.io.Serializable {

	private ModelEntityisfromId id;
	private ModelStrain modelStrain;

	public ModelEntityisfrom() {
	}

	public ModelEntityisfrom(ModelEntityisfromId id, ModelStrain modelStrain) {
		this.id = id;
		this.modelStrain = modelStrain;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "strainIdstrain", column = @Column(name = "strain_idstrain", nullable = false)),
			@AttributeOverride(name = "wid", column = @Column(name = "wid")) })
	public ModelEntityisfromId getId() {
		return this.id;
	}

	public void setId(ModelEntityisfromId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "strain_idstrain", nullable = false, insertable = false, updatable = false)
	public ModelStrain getModelStrain() {
		return this.modelStrain;
	}

	public void setModelStrain(ModelStrain modelStrain) {
		this.modelStrain = modelStrain;
	}

}