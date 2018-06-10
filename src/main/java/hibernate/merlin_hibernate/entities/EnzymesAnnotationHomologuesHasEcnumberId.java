package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnzymesAnnotationHomologuesHasEcnumberId generated by hbm2java
 */
@Embeddable
public class EnzymesAnnotationHomologuesHasEcnumberId  implements java.io.Serializable {


     private int homologuesSKey;
     private int ecNumberSKey;

    public EnzymesAnnotationHomologuesHasEcnumberId() {
    }

    public EnzymesAnnotationHomologuesHasEcnumberId(int homologuesSKey, int ecNumberSKey) {
       this.homologuesSKey = homologuesSKey;
       this.ecNumberSKey = ecNumberSKey;
    }
   


    @Column(name="homologues_s_key", nullable=false)
    public int getHomologuesSKey() {
        return this.homologuesSKey;
    }
    
    public void setHomologuesSKey(int homologuesSKey) {
        this.homologuesSKey = homologuesSKey;
    }


    @Column(name="ecNumber_s_key", nullable=false)
    public int getEcNumberSKey() {
        return this.ecNumberSKey;
    }
    
    public void setEcNumberSKey(int ecNumberSKey) {
        this.ecNumberSKey = ecNumberSKey;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnzymesAnnotationHomologuesHasEcnumberId) ) return false;
		 EnzymesAnnotationHomologuesHasEcnumberId castOther = ( EnzymesAnnotationHomologuesHasEcnumberId ) other; 
         
		 return (this.getHomologuesSKey()==castOther.getHomologuesSKey())
 && (this.getEcNumberSKey()==castOther.getEcNumberSKey());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getHomologuesSKey();
         result = 37 * result + this.getEcNumberSKey();
         return result;
   }   


}


