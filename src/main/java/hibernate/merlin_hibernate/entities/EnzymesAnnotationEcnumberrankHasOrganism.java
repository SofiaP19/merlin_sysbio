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
 * EnzymesAnnotationEcnumberrankHasOrganism generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_ecnumberrank_has_organism", catalog = "sysbio_model")
public class EnzymesAnnotationEcnumberrankHasOrganism implements java.io.Serializable {

	private EnzymesAnnotationEcnumberrankHasOrganismId id;
	private EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank;
	private EnzymesAnnotationOrganism enzymesAnnotationOrganism;

	public EnzymesAnnotationEcnumberrankHasOrganism() {
	}

	public EnzymesAnnotationEcnumberrankHasOrganism(EnzymesAnnotationEcnumberrankHasOrganismId id,
			EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank,
			EnzymesAnnotationOrganism enzymesAnnotationOrganism) {
		this.id = id;
		this.enzymesAnnotationEcnumberrank = enzymesAnnotationEcnumberrank;
		this.enzymesAnnotationOrganism = enzymesAnnotationOrganism;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "ecNumberRankSKey", column = @Column(name = "ecNumberRank_s_key", nullable = false)),
			@AttributeOverride(name = "organismSKey", column = @Column(name = "organism_s_key", nullable = false)) })
	public EnzymesAnnotationEcnumberrankHasOrganismId getId() {
		return this.id;
	}

	public void setId(EnzymesAnnotationEcnumberrankHasOrganismId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ecNumberRank_s_key", nullable = false, insertable = false, updatable = false)
	public EnzymesAnnotationEcnumberrank getEnzymesAnnotationEcnumberrank() {
		return this.enzymesAnnotationEcnumberrank;
	}

	public void setEnzymesAnnotationEcnumberrank(EnzymesAnnotationEcnumberrank enzymesAnnotationEcnumberrank) {
		this.enzymesAnnotationEcnumberrank = enzymesAnnotationEcnumberrank;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organism_s_key", nullable = false, insertable = false, updatable = false)
	public EnzymesAnnotationOrganism getEnzymesAnnotationOrganism() {
		return this.enzymesAnnotationOrganism;
	}

	public void setEnzymesAnnotationOrganism(EnzymesAnnotationOrganism enzymesAnnotationOrganism) {
		this.enzymesAnnotationOrganism = enzymesAnnotationOrganism;
	}

}