package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ModelGeneHasOrthology generated by hbm2java
 */
@Entity
@Table(name="model_gene_has_orthology"
    ,catalog="test_hibernate"
)
public class ModelGeneHasOrthology  implements java.io.Serializable {


     private ModelGeneHasOrthologyId id;
     private Float similarity;

    public ModelGeneHasOrthology() {
    }

	
    public ModelGeneHasOrthology(ModelGeneHasOrthologyId id) {
        this.id = id;
    }
    public ModelGeneHasOrthology(ModelGeneHasOrthologyId id, Float similarity) {
       this.id = id;
       this.similarity = similarity;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="geneIdgene", column=@Column(name="gene_idgene", nullable=false) ), 
        @AttributeOverride(name="orthologyId", column=@Column(name="orthology_id", nullable=false) ) } )
    public ModelGeneHasOrthologyId getId() {
        return this.id;
    }
    
    public void setId(ModelGeneHasOrthologyId id) {
        this.id = id;
    }

    
    @Column(name="similarity", precision=12, scale=0)
    public Float getSimilarity() {
        return this.similarity;
    }
    
    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }




}


