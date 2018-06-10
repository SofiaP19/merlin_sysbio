package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TransportersAnnotationTransportedMetabolitesDirections generated by hbm2java
 */
@Entity
@Table(name="transporters_annotation_transported_metabolites_directions"
    ,catalog="test_hibernate"
)
public class TransportersAnnotationTransportedMetabolitesDirections  implements java.io.Serializable {


     private TransportersAnnotationTransportedMetabolitesDirectionsId id;
     private int stoichiometry;

    public TransportersAnnotationTransportedMetabolitesDirections() {
    }

    public TransportersAnnotationTransportedMetabolitesDirections(TransportersAnnotationTransportedMetabolitesDirectionsId id, int stoichiometry) {
       this.id = id;
       this.stoichiometry = stoichiometry;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="metaboliteId", column=@Column(name="metabolite_id", nullable=false) ), 
        @AttributeOverride(name="directionId", column=@Column(name="direction_id", nullable=false) ), 
        @AttributeOverride(name="transportSystemId", column=@Column(name="transport_system_id", nullable=false) ) } )
    public TransportersAnnotationTransportedMetabolitesDirectionsId getId() {
        return this.id;
    }
    
    public void setId(TransportersAnnotationTransportedMetabolitesDirectionsId id) {
        this.id = id;
    }

    
    @Column(name="stoichiometry", nullable=false)
    public int getStoichiometry() {
        return this.stoichiometry;
    }
    
    public void setStoichiometry(int stoichiometry) {
        this.stoichiometry = stoichiometry;
    }




}


