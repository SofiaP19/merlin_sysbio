package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TransportersAnnotationGenesHasMetabolitesHasTypeId generated by hbm2java
 */
@Embeddable
public class TransportersAnnotationGenesHasMetabolitesHasTypeId implements java.io.Serializable {

	private int geneId;
	private int transportTypeId;
	private int metaboliteId;

	public TransportersAnnotationGenesHasMetabolitesHasTypeId() {
	}

	public TransportersAnnotationGenesHasMetabolitesHasTypeId(int geneId, int transportTypeId, int metaboliteId) {
		this.geneId = geneId;
		this.transportTypeId = transportTypeId;
		this.metaboliteId = metaboliteId;
	}

	@Column(name = "gene_id", nullable = false)
	public int getGeneId() {
		return this.geneId;
	}

	public void setGeneId(int geneId) {
		this.geneId = geneId;
	}

	@Column(name = "transport_type_id", nullable = false)
	public int getTransportTypeId() {
		return this.transportTypeId;
	}

	public void setTransportTypeId(int transportTypeId) {
		this.transportTypeId = transportTypeId;
	}

	@Column(name = "metabolite_id", nullable = false)
	public int getMetaboliteId() {
		return this.metaboliteId;
	}

	public void setMetaboliteId(int metaboliteId) {
		this.metaboliteId = metaboliteId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TransportersAnnotationGenesHasMetabolitesHasTypeId))
			return false;
		TransportersAnnotationGenesHasMetabolitesHasTypeId castOther = (TransportersAnnotationGenesHasMetabolitesHasTypeId) other;

		return (this.getGeneId() == castOther.getGeneId())
				&& (this.getTransportTypeId() == castOther.getTransportTypeId())
				&& (this.getMetaboliteId() == castOther.getMetaboliteId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGeneId();
		result = 37 * result + this.getTransportTypeId();
		result = 37 * result + this.getMetaboliteId();
		return result;
	}

}