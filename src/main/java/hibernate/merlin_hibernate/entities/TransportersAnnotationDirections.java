package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TransportersAnnotationDirections generated by hbm2java
 */
@Entity
@Table(name="transporters_annotation_directions"
    ,catalog="test_hibernate"
)
public class TransportersAnnotationDirections  implements java.io.Serializable {


     private Integer id;
     private String direction;

    public TransportersAnnotationDirections() {
    }

    public TransportersAnnotationDirections(String direction) {
       this.direction = direction;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="direction", length=45)
    public String getDirection() {
        return this.direction;
    }
    
    public void setDirection(String direction) {
        this.direction = direction;
    }




}


