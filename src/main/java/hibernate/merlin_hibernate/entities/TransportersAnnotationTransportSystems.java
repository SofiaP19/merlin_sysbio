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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TransportersAnnotationTransportSystems generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_transport_systems", catalog = "sysbio_model")
public class TransportersAnnotationTransportSystems implements java.io.Serializable {

	private Integer id;
	private TransportersAnnotationTransportTypes transportersAnnotationTransportTypes;
	private Boolean reversible;
	private Set<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirectionses = new HashSet<TransportersAnnotationTransportedMetabolitesDirections>(
			0);
	private Set<TransportersAnnotationTcNumbers> transportersAnnotationTcNumberses = new HashSet<TransportersAnnotationTcNumbers>(
			0);

	public TransportersAnnotationTransportSystems() {
	}

	public TransportersAnnotationTransportSystems(
			TransportersAnnotationTransportTypes transportersAnnotationTransportTypes) {
		this.transportersAnnotationTransportTypes = transportersAnnotationTransportTypes;
	}

	public TransportersAnnotationTransportSystems(
			TransportersAnnotationTransportTypes transportersAnnotationTransportTypes, Boolean reversible,
			Set<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirectionses,
			Set<TransportersAnnotationTcNumbers> transportersAnnotationTcNumberses) {
		this.transportersAnnotationTransportTypes = transportersAnnotationTransportTypes;
		this.reversible = reversible;
		this.transportersAnnotationTransportedMetabolitesDirectionses = transportersAnnotationTransportedMetabolitesDirectionses;
		this.transportersAnnotationTcNumberses = transportersAnnotationTcNumberses;
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
	@JoinColumn(name = "transport_type_id", nullable = false)
	public TransportersAnnotationTransportTypes getTransportersAnnotationTransportTypes() {
		return this.transportersAnnotationTransportTypes;
	}

	public void setTransportersAnnotationTransportTypes(
			TransportersAnnotationTransportTypes transportersAnnotationTransportTypes) {
		this.transportersAnnotationTransportTypes = transportersAnnotationTransportTypes;
	}

	@Column(name = "reversible")
	public Boolean getReversible() {
		return this.reversible;
	}

	public void setReversible(Boolean reversible) {
		this.reversible = reversible;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transportersAnnotationTransportSystems")
	public Set<TransportersAnnotationTransportedMetabolitesDirections> getTransportersAnnotationTransportedMetabolitesDirectionses() {
		return this.transportersAnnotationTransportedMetabolitesDirectionses;
	}

	public void setTransportersAnnotationTransportedMetabolitesDirectionses(
			Set<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirectionses) {
		this.transportersAnnotationTransportedMetabolitesDirectionses = transportersAnnotationTransportedMetabolitesDirectionses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "transporters_annotation_tc_numbers_has_transport_systems", catalog = "sysbio_model", joinColumns = {
			@JoinColumn(name = "transport_system_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "tc_number", nullable = false, updatable = false) })
	public Set<TransportersAnnotationTcNumbers> getTransportersAnnotationTcNumberses() {
		return this.transportersAnnotationTcNumberses;
	}

	public void setTransportersAnnotationTcNumberses(
			Set<TransportersAnnotationTcNumbers> transportersAnnotationTcNumberses) {
		this.transportersAnnotationTcNumberses = transportersAnnotationTcNumberses;
	}

}