package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelActivatingReactionId generated by hbm2java
 */
@Embeddable
public class ModelActivatingReactionId  implements java.io.Serializable {


     private int reactionIdreaction;
     private String enzymeEcnumber;
     private int enzymeProteinIdprotein;

    public ModelActivatingReactionId() {
    }

    public ModelActivatingReactionId(int reactionIdreaction, String enzymeEcnumber, int enzymeProteinIdprotein) {
       this.reactionIdreaction = reactionIdreaction;
       this.enzymeEcnumber = enzymeEcnumber;
       this.enzymeProteinIdprotein = enzymeProteinIdprotein;
    }
   


    @Column(name="reaction_idreaction", nullable=false)
    public int getReactionIdreaction() {
        return this.reactionIdreaction;
    }
    
    public void setReactionIdreaction(int reactionIdreaction) {
        this.reactionIdreaction = reactionIdreaction;
    }


    @Column(name="enzyme_ecnumber", nullable=false, length=15)
    public String getEnzymeEcnumber() {
        return this.enzymeEcnumber;
    }
    
    public void setEnzymeEcnumber(String enzymeEcnumber) {
        this.enzymeEcnumber = enzymeEcnumber;
    }


    @Column(name="enzyme_protein_idprotein", nullable=false)
    public int getEnzymeProteinIdprotein() {
        return this.enzymeProteinIdprotein;
    }
    
    public void setEnzymeProteinIdprotein(int enzymeProteinIdprotein) {
        this.enzymeProteinIdprotein = enzymeProteinIdprotein;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelActivatingReactionId) ) return false;
		 ModelActivatingReactionId castOther = ( ModelActivatingReactionId ) other; 
         
		 return (this.getReactionIdreaction()==castOther.getReactionIdreaction())
 && ( (this.getEnzymeEcnumber()==castOther.getEnzymeEcnumber()) || ( this.getEnzymeEcnumber()!=null && castOther.getEnzymeEcnumber()!=null && this.getEnzymeEcnumber().equals(castOther.getEnzymeEcnumber()) ) )
 && (this.getEnzymeProteinIdprotein()==castOther.getEnzymeProteinIdprotein());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getReactionIdreaction();
         result = 37 * result + ( getEnzymeEcnumber() == null ? 0 : this.getEnzymeEcnumber().hashCode() );
         result = 37 * result + this.getEnzymeProteinIdprotein();
         return result;
   }   


}


