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
 * EnzymesAnnotationGenehomologyHasHomologues generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_genehomology_has_homologues", catalog = "sysbio_model")
public class EnzymesAnnotationGenehomologyHasHomologues implements java.io.Serializable {

	private EnzymesAnnotationGenehomologyHasHomologuesId id;
	private EnzymesAnnotationGenehomology enzymesAnnotationGenehomology;
	private EnzymesAnnotationHomologues enzymesAnnotationHomologues;
	private String referenceId;
	private String gene;
	private Float evalue;
	private Float bits;

	public EnzymesAnnotationGenehomologyHasHomologues() {
	}

	public EnzymesAnnotationGenehomologyHasHomologues(EnzymesAnnotationGenehomologyHasHomologuesId id,
			EnzymesAnnotationGenehomology enzymesAnnotationGenehomology,
			EnzymesAnnotationHomologues enzymesAnnotationHomologues) {
		this.id = id;
		this.enzymesAnnotationGenehomology = enzymesAnnotationGenehomology;
		this.enzymesAnnotationHomologues = enzymesAnnotationHomologues;
	}

	public EnzymesAnnotationGenehomologyHasHomologues(EnzymesAnnotationGenehomologyHasHomologuesId id,
			EnzymesAnnotationGenehomology enzymesAnnotationGenehomology,
			EnzymesAnnotationHomologues enzymesAnnotationHomologues, String referenceId, String gene, Float evalue,
			Float bits) {
		this.id = id;
		this.enzymesAnnotationGenehomology = enzymesAnnotationGenehomology;
		this.enzymesAnnotationHomologues = enzymesAnnotationHomologues;
		this.referenceId = referenceId;
		this.gene = gene;
		this.evalue = evalue;
		this.bits = bits;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "geneHomologySKey", column = @Column(name = "geneHomology_s_key", nullable = false)),
			@AttributeOverride(name = "homologuesSKey", column = @Column(name = "homologues_s_key", nullable = false)) })
	public EnzymesAnnotationGenehomologyHasHomologuesId getId() {
		return this.id;
	}

	public void setId(EnzymesAnnotationGenehomologyHasHomologuesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geneHomology_s_key", nullable = false, insertable = false, updatable = false)
	public EnzymesAnnotationGenehomology getEnzymesAnnotationGenehomology() {
		return this.enzymesAnnotationGenehomology;
	}

	public void setEnzymesAnnotationGenehomology(EnzymesAnnotationGenehomology enzymesAnnotationGenehomology) {
		this.enzymesAnnotationGenehomology = enzymesAnnotationGenehomology;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "homologues_s_key", nullable = false, insertable = false, updatable = false)
	public EnzymesAnnotationHomologues getEnzymesAnnotationHomologues() {
		return this.enzymesAnnotationHomologues;
	}

	public void setEnzymesAnnotationHomologues(EnzymesAnnotationHomologues enzymesAnnotationHomologues) {
		this.enzymesAnnotationHomologues = enzymesAnnotationHomologues;
	}

	@Column(name = "referenceID", length = 100)
	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "gene", length = 100)
	public String getGene() {
		return this.gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	@Column(name = "eValue", precision = 12, scale = 0)
	public Float getEvalue() {
		return this.evalue;
	}

	public void setEvalue(Float evalue) {
		this.evalue = evalue;
	}

	@Column(name = "bits", precision = 12, scale = 0)
	public Float getBits() {
		return this.bits;
	}

	public void setBits(Float bits) {
		this.bits = bits;
	}

}