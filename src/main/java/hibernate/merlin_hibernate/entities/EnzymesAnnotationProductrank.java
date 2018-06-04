package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EnzymesAnnotationProductrank generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_productrank", catalog = "test_hibernate")
public class EnzymesAnnotationProductrank implements java.io.Serializable {

	private EnzymesAnnotationProductrankId id;
	private EnzymesAnnotationGenehomology enzymesAnnotationGenehomology;
	private String productName;
	private Integer rank;
	private Set<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganisms = new HashSet<EnzymesAnnotationProductrankHasOrganism>(
			0);

	public EnzymesAnnotationProductrank() {
	}

	public EnzymesAnnotationProductrank(EnzymesAnnotationProductrankId id,
			EnzymesAnnotationGenehomology enzymesAnnotationGenehomology) {
		this.id = id;
		this.enzymesAnnotationGenehomology = enzymesAnnotationGenehomology;
	}

	public EnzymesAnnotationProductrank(EnzymesAnnotationProductrankId id,
			EnzymesAnnotationGenehomology enzymesAnnotationGenehomology, String productName, Integer rank,
			Set<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganisms) {
		this.id = id;
		this.enzymesAnnotationGenehomology = enzymesAnnotationGenehomology;
		this.productName = productName;
		this.rank = rank;
		this.enzymesAnnotationProductrankHasOrganisms = enzymesAnnotationProductrankHasOrganisms;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "SKey", column = @Column(name = "s_key", nullable = false)),
			@AttributeOverride(name = "geneHomologySKey", column = @Column(name = "geneHomology_s_key", nullable = false)) })
	public EnzymesAnnotationProductrankId getId() {
		return this.id;
	}

	public void setId(EnzymesAnnotationProductrankId id) {
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

	@Column(name = "productName", length = 65535)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "rank")
	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enzymesAnnotationProductrank")
	public Set<EnzymesAnnotationProductrankHasOrganism> getEnzymesAnnotationProductrankHasOrganisms() {
		return this.enzymesAnnotationProductrankHasOrganisms;
	}

	public void setEnzymesAnnotationProductrankHasOrganisms(
			Set<EnzymesAnnotationProductrankHasOrganism> enzymesAnnotationProductrankHasOrganisms) {
		this.enzymesAnnotationProductrankHasOrganisms = enzymesAnnotationProductrankHasOrganisms;
	}

}
