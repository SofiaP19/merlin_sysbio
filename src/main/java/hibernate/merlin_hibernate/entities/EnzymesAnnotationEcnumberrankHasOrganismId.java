package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnzymesAnnotationEcnumberrankHasOrganismId generated by hbm2java
 */
@Embeddable
public class EnzymesAnnotationEcnumberrankHasOrganismId  implements java.io.Serializable {


     private int ecNumberRankSKey;
     private int organismSKey;

    public EnzymesAnnotationEcnumberrankHasOrganismId() {
    }

    public EnzymesAnnotationEcnumberrankHasOrganismId(int ecNumberRankSKey, int organismSKey) {
       this.ecNumberRankSKey = ecNumberRankSKey;
       this.organismSKey = organismSKey;
    }
   


    @Column(name="ecNumberRank_s_key", nullable=false)
    public int getEcNumberRankSKey() {
        return this.ecNumberRankSKey;
    }
    
    public void setEcNumberRankSKey(int ecNumberRankSKey) {
        this.ecNumberRankSKey = ecNumberRankSKey;
    }


    @Column(name="organism_s_key", nullable=false)
    public int getOrganismSKey() {
        return this.organismSKey;
    }
    
    public void setOrganismSKey(int organismSKey) {
        this.organismSKey = organismSKey;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnzymesAnnotationEcnumberrankHasOrganismId) ) return false;
		 EnzymesAnnotationEcnumberrankHasOrganismId castOther = ( EnzymesAnnotationEcnumberrankHasOrganismId ) other; 
         
		 return (this.getEcNumberRankSKey()==castOther.getEcNumberRankSKey())
 && (this.getOrganismSKey()==castOther.getOrganismSKey());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getEcNumberRankSKey();
         result = 37 * result + this.getOrganismSKey();
         return result;
   }   


}


