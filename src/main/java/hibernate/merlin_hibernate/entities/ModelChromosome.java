package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ModelChromosome generated by hbm2java
 */
@Entity
@Table(name="model_chromosome"
    ,catalog="test_hibernate"
)
public class ModelChromosome  implements java.io.Serializable {


     private Integer idchromosome;
     private String name;

    public ModelChromosome() {
    }

    public ModelChromosome(String name) {
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idchromosome", unique=true, nullable=false)
    public Integer getIdchromosome() {
        return this.idchromosome;
    }
    
    public void setIdchromosome(Integer idchromosome) {
        this.idchromosome = idchromosome;
    }

    
    @Column(name="name", nullable=false, length=15)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


