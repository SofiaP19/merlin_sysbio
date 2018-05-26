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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompartmentsAnnotationPsortReports generated by hbm2java
 */
@Entity
@Table(name = "compartments_annotation_psort_reports", catalog = "sysbio_model")
public class CompartmentsAnnotationPsortReports implements java.io.Serializable {

	private Integer id;
	private TransportersIdentificationProjects transportersIdentificationProjects;
	private String locusTag;
	private String date;
	private Set<CompartmentsAnnotationPsortReportsHasCompartments> compartmentsAnnotationPsortReportsHasCompartmentses = new HashSet<CompartmentsAnnotationPsortReportsHasCompartments>(
			0);

	public CompartmentsAnnotationPsortReports() {
	}

	public CompartmentsAnnotationPsortReports(TransportersIdentificationProjects transportersIdentificationProjects) {
		this.transportersIdentificationProjects = transportersIdentificationProjects;
	}

	public CompartmentsAnnotationPsortReports(TransportersIdentificationProjects transportersIdentificationProjects,
			String locusTag, String date,
			Set<CompartmentsAnnotationPsortReportsHasCompartments> compartmentsAnnotationPsortReportsHasCompartmentses) {
		this.transportersIdentificationProjects = transportersIdentificationProjects;
		this.locusTag = locusTag;
		this.date = date;
		this.compartmentsAnnotationPsortReportsHasCompartmentses = compartmentsAnnotationPsortReportsHasCompartmentses;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	public TransportersIdentificationProjects getTransportersIdentificationProjects() {
		return this.transportersIdentificationProjects;
	}

	public void setTransportersIdentificationProjects(
			TransportersIdentificationProjects transportersIdentificationProjects) {
		this.transportersIdentificationProjects = transportersIdentificationProjects;
	}

	@Column(name = "locus_tag", length = 100)
	public String getLocusTag() {
		return this.locusTag;
	}

	public void setLocusTag(String locusTag) {
		this.locusTag = locusTag;
	}

	@Column(name = "date", length = 45)
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compartmentsAnnotationPsortReports")
	public Set<CompartmentsAnnotationPsortReportsHasCompartments> getCompartmentsAnnotationPsortReportsHasCompartmentses() {
		return this.compartmentsAnnotationPsortReportsHasCompartmentses;
	}

	public void setCompartmentsAnnotationPsortReportsHasCompartmentses(
			Set<CompartmentsAnnotationPsortReportsHasCompartments> compartmentsAnnotationPsortReportsHasCompartmentses) {
		this.compartmentsAnnotationPsortReportsHasCompartmentses = compartmentsAnnotationPsortReportsHasCompartmentses;
	}

}
