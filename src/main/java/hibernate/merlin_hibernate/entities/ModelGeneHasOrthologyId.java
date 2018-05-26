package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelGeneHasOrthologyId generated by hbm2java
 */
@Embeddable
public class ModelGeneHasOrthologyId implements java.io.Serializable {

	private int geneIdgene;
	private int orthologyId;

	public ModelGeneHasOrthologyId() {
	}

	public ModelGeneHasOrthologyId(int geneIdgene, int orthologyId) {
		this.geneIdgene = geneIdgene;
		this.orthologyId = orthologyId;
	}

	@Column(name = "gene_idgene", nullable = false)
	public int getGeneIdgene() {
		return this.geneIdgene;
	}

	public void setGeneIdgene(int geneIdgene) {
		this.geneIdgene = geneIdgene;
	}

	@Column(name = "orthology_id", nullable = false)
	public int getOrthologyId() {
		return this.orthologyId;
	}

	public void setOrthologyId(int orthologyId) {
		this.orthologyId = orthologyId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelGeneHasOrthologyId))
			return false;
		ModelGeneHasOrthologyId castOther = (ModelGeneHasOrthologyId) other;

		return (this.getGeneIdgene() == castOther.getGeneIdgene())
				&& (this.getOrthologyId() == castOther.getOrthologyId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGeneIdgene();
		result = 37 * result + this.getOrthologyId();
		return result;
	}

}
