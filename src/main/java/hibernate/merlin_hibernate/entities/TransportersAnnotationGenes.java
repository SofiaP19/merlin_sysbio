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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TransportersAnnotationGenes generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_genes", catalog = "sysbio_model")
public class TransportersAnnotationGenes implements java.io.Serializable {

	private Integer id;
	private int projectId;
	private String locusTag;
	private String status;
	private Set<TransportersAnnotationGenesHasTcdbRegistries> transportersAnnotationGenesHasTcdbRegistrieses = new HashSet<TransportersAnnotationGenesHasTcdbRegistries>(
			0);
	private Set<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetaboliteses = new HashSet<TransportersAnnotationGenesHasMetabolites>(
			0);

	public TransportersAnnotationGenes() {
	}

	public TransportersAnnotationGenes(int projectId, String locusTag, String status) {
		this.projectId = projectId;
		this.locusTag = locusTag;
		this.status = status;
	}

	public TransportersAnnotationGenes(int projectId, String locusTag, String status,
			Set<TransportersAnnotationGenesHasTcdbRegistries> transportersAnnotationGenesHasTcdbRegistrieses,
			Set<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetaboliteses) {
		this.projectId = projectId;
		this.locusTag = locusTag;
		this.status = status;
		this.transportersAnnotationGenesHasTcdbRegistrieses = transportersAnnotationGenesHasTcdbRegistrieses;
		this.transportersAnnotationGenesHasMetaboliteses = transportersAnnotationGenesHasMetaboliteses;
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

	@Column(name = "project_id", nullable = false)
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Column(name = "locus_tag", nullable = false, length = 45)
	public String getLocusTag() {
		return this.locusTag;
	}

	public void setLocusTag(String locusTag) {
		this.locusTag = locusTag;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transportersAnnotationGenes")
	public Set<TransportersAnnotationGenesHasTcdbRegistries> getTransportersAnnotationGenesHasTcdbRegistrieses() {
		return this.transportersAnnotationGenesHasTcdbRegistrieses;
	}

	public void setTransportersAnnotationGenesHasTcdbRegistrieses(
			Set<TransportersAnnotationGenesHasTcdbRegistries> transportersAnnotationGenesHasTcdbRegistrieses) {
		this.transportersAnnotationGenesHasTcdbRegistrieses = transportersAnnotationGenesHasTcdbRegistrieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transportersAnnotationGenes")
	public Set<TransportersAnnotationGenesHasMetabolites> getTransportersAnnotationGenesHasMetaboliteses() {
		return this.transportersAnnotationGenesHasMetaboliteses;
	}

	public void setTransportersAnnotationGenesHasMetaboliteses(
			Set<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetaboliteses) {
		this.transportersAnnotationGenesHasMetaboliteses = transportersAnnotationGenesHasMetaboliteses;
	}

}
