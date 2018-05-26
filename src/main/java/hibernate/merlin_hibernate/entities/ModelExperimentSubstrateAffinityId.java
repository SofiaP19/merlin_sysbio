package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelExperimentSubstrateAffinityId generated by hbm2java
 */
@Embeddable
public class ModelExperimentSubstrateAffinityId implements java.io.Serializable {

	private int experimentDescription;
	private int compoundIdcompound;
	private int proteinIdprotein;

	public ModelExperimentSubstrateAffinityId() {
	}

	public ModelExperimentSubstrateAffinityId(int experimentDescription, int compoundIdcompound, int proteinIdprotein) {
		this.experimentDescription = experimentDescription;
		this.compoundIdcompound = compoundIdcompound;
		this.proteinIdprotein = proteinIdprotein;
	}

	@Column(name = "experiment_description", nullable = false)
	public int getExperimentDescription() {
		return this.experimentDescription;
	}

	public void setExperimentDescription(int experimentDescription) {
		this.experimentDescription = experimentDescription;
	}

	@Column(name = "compound_idcompound", nullable = false)
	public int getCompoundIdcompound() {
		return this.compoundIdcompound;
	}

	public void setCompoundIdcompound(int compoundIdcompound) {
		this.compoundIdcompound = compoundIdcompound;
	}

	@Column(name = "protein_idprotein", nullable = false)
	public int getProteinIdprotein() {
		return this.proteinIdprotein;
	}

	public void setProteinIdprotein(int proteinIdprotein) {
		this.proteinIdprotein = proteinIdprotein;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ModelExperimentSubstrateAffinityId))
			return false;
		ModelExperimentSubstrateAffinityId castOther = (ModelExperimentSubstrateAffinityId) other;

		return (this.getExperimentDescription() == castOther.getExperimentDescription())
				&& (this.getCompoundIdcompound() == castOther.getCompoundIdcompound())
				&& (this.getProteinIdprotein() == castOther.getProteinIdprotein());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getExperimentDescription();
		result = 37 * result + this.getCompoundIdcompound();
		result = 37 * result + this.getProteinIdprotein();
		return result;
	}

}
