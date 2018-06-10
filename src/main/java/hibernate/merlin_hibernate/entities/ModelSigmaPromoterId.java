package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelSigmaPromoterId generated by hbm2java
 */
@Embeddable
public class ModelSigmaPromoterId  implements java.io.Serializable {


     private int proteinIdprotein;
     private int promoterIdpromoter;

    public ModelSigmaPromoterId() {
    }

    public ModelSigmaPromoterId(int proteinIdprotein, int promoterIdpromoter) {
       this.proteinIdprotein = proteinIdprotein;
       this.promoterIdpromoter = promoterIdpromoter;
    }
   


    @Column(name="protein_idprotein", nullable=false)
    public int getProteinIdprotein() {
        return this.proteinIdprotein;
    }
    
    public void setProteinIdprotein(int proteinIdprotein) {
        this.proteinIdprotein = proteinIdprotein;
    }


    @Column(name="promoter_idpromoter", nullable=false)
    public int getPromoterIdpromoter() {
        return this.promoterIdpromoter;
    }
    
    public void setPromoterIdpromoter(int promoterIdpromoter) {
        this.promoterIdpromoter = promoterIdpromoter;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelSigmaPromoterId) ) return false;
		 ModelSigmaPromoterId castOther = ( ModelSigmaPromoterId ) other; 
         
		 return (this.getProteinIdprotein()==castOther.getProteinIdprotein())
 && (this.getPromoterIdpromoter()==castOther.getPromoterIdpromoter());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getProteinIdprotein();
         result = 37 * result + this.getPromoterIdpromoter();
         return result;
   }   


}

