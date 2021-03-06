package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelTranscriptionUnit generated by hbm2java
 */
@Entity
@Table(name="model_transcription_unit"
    ,catalog="test_hibernate"
)
public class ModelTranscriptionUnit  implements java.io.Serializable {


     private Integer idtranscriptionUnit;
     private String name;

    public ModelTranscriptionUnit() {
    }

    public ModelTranscriptionUnit(String name) {
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtranscription_unit", unique=true, nullable=false)
    public Integer getIdtranscriptionUnit() {
        return this.idtranscriptionUnit;
    }
    
    public void setIdtranscriptionUnit(Integer idtranscriptionUnit) {
        this.idtranscriptionUnit = idtranscriptionUnit;
    }

    
    @Column(name="name", length=150)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


