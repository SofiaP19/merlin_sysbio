package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EnzymesAnnotationProductrank generated by hbm2java
 */
@Entity
@Table(name="enzymes_annotation_productrank"
    ,catalog="test_hibernate"
)
public class EnzymesAnnotationProductrank  implements java.io.Serializable {


     private Integer SKey;
     private int geneHomologySKey;
     private String productName;
     private Integer rank;

    public EnzymesAnnotationProductrank() {
    }

	
    public EnzymesAnnotationProductrank(int geneHomologySKey) {
        this.geneHomologySKey = geneHomologySKey;
    }
    public EnzymesAnnotationProductrank(int geneHomologySKey, String productName, Integer rank) {
       this.geneHomologySKey = geneHomologySKey;
       this.productName = productName;
       this.rank = rank;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="s_key", unique=true, nullable=false)
    public Integer getSKey() {
        return this.SKey;
    }
    
    public void setSKey(Integer SKey) {
        this.SKey = SKey;
    }

    
    @Column(name="geneHomology_s_key", nullable=false)
    public int getGeneHomologySKey() {
        return this.geneHomologySKey;
    }
    
    public void setGeneHomologySKey(int geneHomologySKey) {
        this.geneHomologySKey = geneHomologySKey;
    }

    
    @Column(name="productName", length=65535)
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    @Column(name="rank")
    public Integer getRank() {
        return this.rank;
    }
    
    public void setRank(Integer rank) {
        this.rank = rank;
    }




}


