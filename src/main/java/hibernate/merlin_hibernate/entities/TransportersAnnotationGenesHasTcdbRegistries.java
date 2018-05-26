package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TransportersAnnotationGenesHasTcdbRegistries generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_genes_has_tcdb_registries", catalog = "sysbio_model")
public class TransportersAnnotationGenesHasTcdbRegistries implements java.io.Serializable {

	private TransportersAnnotationGenesHasTcdbRegistriesId id;
	private TransportersAnnotationGenes transportersAnnotationGenes;
	private TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistries;
	private float similarity;

	public TransportersAnnotationGenesHasTcdbRegistries() {
	}

	public TransportersAnnotationGenesHasTcdbRegistries(TransportersAnnotationGenesHasTcdbRegistriesId id,
			TransportersAnnotationGenes transportersAnnotationGenes,
			TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistries, float similarity) {
		this.id = id;
		this.transportersAnnotationGenes = transportersAnnotationGenes;
		this.transportersAnnotationTcdbRegistries = transportersAnnotationTcdbRegistries;
		this.similarity = similarity;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "geneId", column = @Column(name = "gene_id", nullable = false)),
			@AttributeOverride(name = "uniprotId", column = @Column(name = "uniprot_id", nullable = false, length = 45)),
			@AttributeOverride(name = "version", column = @Column(name = "version", nullable = false)) })
	public TransportersAnnotationGenesHasTcdbRegistriesId getId() {
		return this.id;
	}

	public void setId(TransportersAnnotationGenesHasTcdbRegistriesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gene_id", nullable = false, insertable = false, updatable = false)
	public TransportersAnnotationGenes getTransportersAnnotationGenes() {
		return this.transportersAnnotationGenes;
	}

	public void setTransportersAnnotationGenes(TransportersAnnotationGenes transportersAnnotationGenes) {
		this.transportersAnnotationGenes = transportersAnnotationGenes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "uniprot_id", referencedColumnName = "uniprot_id", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "version", referencedColumnName = "version", nullable = false, insertable = false, updatable = false) })
	public TransportersAnnotationTcdbRegistries getTransportersAnnotationTcdbRegistries() {
		return this.transportersAnnotationTcdbRegistries;
	}

	public void setTransportersAnnotationTcdbRegistries(
			TransportersAnnotationTcdbRegistries transportersAnnotationTcdbRegistries) {
		this.transportersAnnotationTcdbRegistries = transportersAnnotationTcdbRegistries;
	}

	@Column(name = "similarity", nullable = false, precision = 12, scale = 0)
	public float getSimilarity() {
		return this.similarity;
	}

	public void setSimilarity(float similarity) {
		this.similarity = similarity;
	}

}