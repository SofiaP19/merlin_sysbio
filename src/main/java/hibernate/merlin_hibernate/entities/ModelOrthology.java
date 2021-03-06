package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelOrthology generated by hbm2java
 */
@Entity
@Table(name="model_orthology"
    ,catalog="test_hibernate"
)
public class ModelOrthology  implements java.io.Serializable {


     private Integer id;
     private String entryId;
     private String locusId;

    public ModelOrthology() {
    }

	
    public ModelOrthology(String entryId) {
        this.entryId = entryId;
    }
    public ModelOrthology(String entryId, String locusId) {
       this.entryId = entryId;
       this.locusId = locusId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="entry_id", nullable=false, length=20)
    public String getEntryId() {
        return this.entryId;
    }
    
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    
    @Column(name="locus_id", length=45)
    public String getLocusId() {
        return this.locusId;
    }
    
    public void setLocusId(String locusId) {
        this.locusId = locusId;
    }




}


