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
 * TransportersAnnotationDirections generated by hbm2java
 */
@Entity
@Table(name = "transporters_annotation_directions", catalog = "sysbio_model")
public class TransportersAnnotationDirections implements java.io.Serializable {

	private Integer id;
	private String direction;
	private Set<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirectionses = new HashSet<TransportersAnnotationTransportedMetabolitesDirections>(
			0);

	public TransportersAnnotationDirections() {
	}

	public TransportersAnnotationDirections(String direction,
			Set<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirectionses) {
		this.direction = direction;
		this.transportersAnnotationTransportedMetabolitesDirectionses = transportersAnnotationTransportedMetabolitesDirectionses;
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

	@Column(name = "direction", length = 45)
	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transportersAnnotationDirections")
	public Set<TransportersAnnotationTransportedMetabolitesDirections> getTransportersAnnotationTransportedMetabolitesDirectionses() {
		return this.transportersAnnotationTransportedMetabolitesDirectionses;
	}

	public void setTransportersAnnotationTransportedMetabolitesDirectionses(
			Set<TransportersAnnotationTransportedMetabolitesDirections> transportersAnnotationTransportedMetabolitesDirectionses) {
		this.transportersAnnotationTransportedMetabolitesDirectionses = transportersAnnotationTransportedMetabolitesDirectionses;
	}

}
