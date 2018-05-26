package hibernate.merlin_hibernate.entities;
// Generated 18/mai/2018 12:30:24 by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EnzymesAnnotationProductlist generated by hbm2java
 */
@Entity
@Table(name = "enzymes_annotation_productlist", catalog = "sysbio_model")
public class EnzymesAnnotationProductlist implements java.io.Serializable {

	private Integer SKey;
	private EnzymesAnnotationHomologydata enzymesAnnotationHomologydata;
	private String otherNames;

	public EnzymesAnnotationProductlist() {
	}

	public EnzymesAnnotationProductlist(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata) {
		this.enzymesAnnotationHomologydata = enzymesAnnotationHomologydata;
	}

	public EnzymesAnnotationProductlist(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata,
			String otherNames) {
		this.enzymesAnnotationHomologydata = enzymesAnnotationHomologydata;
		this.otherNames = otherNames;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "s_key", unique = true, nullable = false)
	public Integer getSKey() {
		return this.SKey;
	}

	public void setSKey(Integer SKey) {
		this.SKey = SKey;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "homologyData_s_key", nullable = false)
	public EnzymesAnnotationHomologydata getEnzymesAnnotationHomologydata() {
		return this.enzymesAnnotationHomologydata;
	}

	public void setEnzymesAnnotationHomologydata(EnzymesAnnotationHomologydata enzymesAnnotationHomologydata) {
		this.enzymesAnnotationHomologydata = enzymesAnnotationHomologydata;
	}

	@Column(name = "otherNames", length = 65535)
	public String getOtherNames() {
		return this.otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

}
