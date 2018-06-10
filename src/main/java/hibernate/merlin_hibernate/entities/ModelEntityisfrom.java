package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelEntityisfrom generated by hbm2java
 */
@Entity
@Table(name="model_entityisfrom"
    ,catalog="test_hibernate"
)
public class ModelEntityisfrom  implements java.io.Serializable {


     private ModelEntityisfromId id;

    public ModelEntityisfrom() {
    }

    public ModelEntityisfrom(ModelEntityisfromId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="strainIdstrain", column=@Column(name="strain_idstrain", nullable=false) ), 
        @AttributeOverride(name="wid", column=@Column(name="wid") ) } )
    public ModelEntityisfromId getId() {
        return this.id;
    }
    
    public void setId(ModelEntityisfromId id) {
        this.id = id;
    }




}


