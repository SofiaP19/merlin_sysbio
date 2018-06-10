package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelSameAs generated by hbm2java
 */
@Entity
@Table(name="model_same_as"
    ,catalog="test_hibernate"
)
public class ModelSameAs  implements java.io.Serializable {


     private ModelSameAsId id;

    public ModelSameAs() {
    }

    public ModelSameAs(ModelSameAsId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="metaboliteId", column=@Column(name="metabolite_id", nullable=false) ), 
        @AttributeOverride(name="similarMetaboliteId", column=@Column(name="similar_metabolite_id", nullable=false) ) } )
    public ModelSameAsId getId() {
        return this.id;
    }
    
    public void setId(ModelSameAsId id) {
        this.id = id;
    }




}


