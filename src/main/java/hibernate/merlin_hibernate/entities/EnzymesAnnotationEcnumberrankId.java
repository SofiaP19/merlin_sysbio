package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnzymesAnnotationEcnumberrankId generated by hbm2java
 */
@Embeddable
public class EnzymesAnnotationEcnumberrankId implements java.io.Serializable {

	private int SKey;
	private int geneHomologySKey;

	public EnzymesAnnotationEcnumberrankId() {
	}

	public EnzymesAnnotationEcnumberrankId(int SKey, int geneHomologySKey) {
		this.SKey = SKey;
		this.geneHomologySKey = geneHomologySKey;
	}

	@Column(name = "s_key", nullable = false)
	public int getSKey() {
		return this.SKey;
	}

	public void setSKey(int SKey) {
		this.SKey = SKey;
	}

	@Column(name = "geneHomology_s_key", nullable = false)
	public int getGeneHomologySKey() {
		return this.geneHomologySKey;
	}

	public void setGeneHomologySKey(int geneHomologySKey) {
		this.geneHomologySKey = geneHomologySKey;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EnzymesAnnotationEcnumberrankId))
			return false;
		EnzymesAnnotationEcnumberrankId castOther = (EnzymesAnnotationEcnumberrankId) other;

		return (this.getSKey() == castOther.getSKey())
				&& (this.getGeneHomologySKey() == castOther.getGeneHomologySKey());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSKey();
		result = 37 * result + this.getGeneHomologySKey();
		return result;
	}

}
