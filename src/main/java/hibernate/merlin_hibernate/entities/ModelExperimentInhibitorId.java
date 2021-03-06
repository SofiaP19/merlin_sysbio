package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelExperimentInhibitorId generated by hbm2java
 */
@Embeddable
public class ModelExperimentInhibitorId  implements java.io.Serializable {


     private int compoundIdcompound;
     private int experimentDescription;
     private int proteinIdprotein;

    public ModelExperimentInhibitorId() {
    }

    public ModelExperimentInhibitorId(int compoundIdcompound, int experimentDescription, int proteinIdprotein) {
       this.compoundIdcompound = compoundIdcompound;
       this.experimentDescription = experimentDescription;
       this.proteinIdprotein = proteinIdprotein;
    }
   


    @Column(name="compound_idcompound", nullable=false)
    public int getCompoundIdcompound() {
        return this.compoundIdcompound;
    }
    
    public void setCompoundIdcompound(int compoundIdcompound) {
        this.compoundIdcompound = compoundIdcompound;
    }


    @Column(name="experiment_description", nullable=false)
    public int getExperimentDescription() {
        return this.experimentDescription;
    }
    
    public void setExperimentDescription(int experimentDescription) {
        this.experimentDescription = experimentDescription;
    }


    @Column(name="protein_idprotein", nullable=false)
    public int getProteinIdprotein() {
        return this.proteinIdprotein;
    }
    
    public void setProteinIdprotein(int proteinIdprotein) {
        this.proteinIdprotein = proteinIdprotein;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelExperimentInhibitorId) ) return false;
		 ModelExperimentInhibitorId castOther = ( ModelExperimentInhibitorId ) other; 
         
		 return (this.getCompoundIdcompound()==castOther.getCompoundIdcompound())
 && (this.getExperimentDescription()==castOther.getExperimentDescription())
 && (this.getProteinIdprotein()==castOther.getProteinIdprotein());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCompoundIdcompound();
         result = 37 * result + this.getExperimentDescription();
         result = 37 * result + this.getProteinIdprotein();
         return result;
   }   


}


