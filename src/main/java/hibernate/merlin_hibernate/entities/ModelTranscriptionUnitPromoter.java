package hibernate.merlin_hibernate.entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelTranscriptionUnitPromoter generated by hbm2java
 */
@Entity
@Table(name = "model_transcription_unit_promoter", catalog = "sysbio_model")
public class ModelTranscriptionUnitPromoter implements java.io.Serializable {

	private ModelTranscriptionUnitPromoterId id;

	public ModelTranscriptionUnitPromoter() {
	}

	public ModelTranscriptionUnitPromoter(ModelTranscriptionUnitPromoterId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "promoterIdpromoter", column = @Column(name = "promoter_idpromoter", nullable = false)),
			@AttributeOverride(name = "transcriptionUnitIdtranscriptionUnit", column = @Column(name = "transcription_unit_idtranscription_unit", nullable = false)) })
	public ModelTranscriptionUnitPromoterId getId() {
		return this.id;
	}

	public void setId(ModelTranscriptionUnitPromoterId id) {
		this.id = id;
	}

}
