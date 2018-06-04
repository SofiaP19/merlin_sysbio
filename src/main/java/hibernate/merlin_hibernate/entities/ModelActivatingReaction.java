package hibernate.merlin_hibernate.entities;
// Generated 21/mar/2018 18:06:35 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelActivatingReaction generated by hbm2java
 */
@Entity
@Table(name = "model_activating_reaction", catalog = "test_hibernate")
public class ModelActivatingReaction implements java.io.Serializable {

	private ModelActivatingReactionId id;

	public ModelActivatingReaction() {
	}

	public ModelActivatingReaction(ModelActivatingReactionId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "reactionIdreaction", column = @Column(name = "reaction_idreaction", nullable = false)),
			@AttributeOverride(name = "enzymeEcnumber", column = @Column(name = "enzyme_ecnumber", nullable = false, length = 15)),
			@AttributeOverride(name = "enzymeProteinIdprotein", column = @Column(name = "enzyme_protein_idprotein", nullable = false)) })
	public ModelActivatingReactionId getId() {
		return this.id;
	}

	public void setId(ModelActivatingReactionId id) {
		this.id = id;
	}

}
