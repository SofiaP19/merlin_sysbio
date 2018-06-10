package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EnzymesAnnotationProductlist generated by hbm2java
 */
@Entity
@Table(name="enzymes_annotation_productlist"
    ,catalog="test_hibernate"
)
public class EnzymesAnnotationProductlist  implements java.io.Serializable {


     private Integer SKey;
     private int homologyDataSKey;
     private String otherNames;

    public EnzymesAnnotationProductlist() {
    }

	
    public EnzymesAnnotationProductlist(int homologyDataSKey) {
        this.homologyDataSKey = homologyDataSKey;
    }
    public EnzymesAnnotationProductlist(int homologyDataSKey, String otherNames) {
       this.homologyDataSKey = homologyDataSKey;
       this.otherNames = otherNames;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="s_key", unique=true, nullable=false)
    public Integer getSKey() {
        return this.SKey;
    }
    
    public void setSKey(Integer SKey) {
        this.SKey = SKey;
    }

    
    @Column(name="homologyData_s_key", nullable=false)
    public int getHomologyDataSKey() {
        return this.homologyDataSKey;
    }
    
    public void setHomologyDataSKey(int homologyDataSKey) {
        this.homologyDataSKey = homologyDataSKey;
    }

    
    @Column(name="otherNames", length=65535)
    public String getOtherNames() {
        return this.otherNames;
    }
    
    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }




}


