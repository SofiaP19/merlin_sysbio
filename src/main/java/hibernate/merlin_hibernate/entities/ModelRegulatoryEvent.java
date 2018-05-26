package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
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
 * ModelRegulatoryEvent generated by hbm2java
 */
@Entity
@Table(name = "model_regulatory_event", catalog = "sysbio_model")
public class ModelRegulatoryEvent implements java.io.Serializable {

	private ModelRegulatoryEventId id;
	private ModelPromoter modelPromoter;
	private ModelProtein modelProtein;
	private ModelRiFunction modelRiFunction;
	private BigDecimal bindingSitePosition;

	public ModelRegulatoryEvent() {
	}

	public ModelRegulatoryEvent(ModelRegulatoryEventId id, ModelPromoter modelPromoter, ModelProtein modelProtein,
			ModelRiFunction modelRiFunction) {
		this.id = id;
		this.modelPromoter = modelPromoter;
		this.modelProtein = modelProtein;
		this.modelRiFunction = modelRiFunction;
	}

	public ModelRegulatoryEvent(ModelRegulatoryEventId id, ModelPromoter modelPromoter, ModelProtein modelProtein,
			ModelRiFunction modelRiFunction, BigDecimal bindingSitePosition) {
		this.id = id;
		this.modelPromoter = modelPromoter;
		this.modelProtein = modelProtein;
		this.modelRiFunction = modelRiFunction;
		this.bindingSitePosition = bindingSitePosition;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "proteinIdprotein", column = @Column(name = "protein_idprotein", nullable = false)),
			@AttributeOverride(name = "promoterIdpromoter", column = @Column(name = "promoter_idpromoter", nullable = false)),
			@AttributeOverride(name = "riFunctionIdriFunction", column = @Column(name = "ri_function_idri_function", nullable = false)) })
	public ModelRegulatoryEventId getId() {
		return this.id;
	}

	public void setId(ModelRegulatoryEventId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "promoter_idpromoter", nullable = false, insertable = false, updatable = false)
	public ModelPromoter getModelPromoter() {
		return this.modelPromoter;
	}

	public void setModelPromoter(ModelPromoter modelPromoter) {
		this.modelPromoter = modelPromoter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "protein_idprotein", nullable = false, insertable = false, updatable = false)
	public ModelProtein getModelProtein() {
		return this.modelProtein;
	}

	public void setModelProtein(ModelProtein modelProtein) {
		this.modelProtein = modelProtein;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ri_function_idri_function", nullable = false, insertable = false, updatable = false)
	public ModelRiFunction getModelRiFunction() {
		return this.modelRiFunction;
	}

	public void setModelRiFunction(ModelRiFunction modelRiFunction) {
		this.modelRiFunction = modelRiFunction;
	}

	@Column(name = "binding_site_position", precision = 15, scale = 6)
	public BigDecimal getBindingSitePosition() {
		return this.bindingSitePosition;
	}

	public void setBindingSitePosition(BigDecimal bindingSitePosition) {
		this.bindingSitePosition = bindingSitePosition;
	}

}
