package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelIsSuperReaction generated by hbm2java
 */
@Entity
@Table(name="model_is_super_reaction"
    ,catalog="test_hibernate"
)
public class ModelIsSuperReaction  implements java.io.Serializable {


     private ModelIsSuperReactionId id;

    public ModelIsSuperReaction() {
    }

    public ModelIsSuperReaction(ModelIsSuperReactionId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="superReactionId", column=@Column(name="super_reaction_id", nullable=false) ), 
        @AttributeOverride(name="subReactionId", column=@Column(name="sub_reaction_id", nullable=false) ) } )
    public ModelIsSuperReactionId getId() {
        return this.id;
    }
    
    public void setId(ModelIsSuperReactionId id) {
        this.id = id;
    }




}


