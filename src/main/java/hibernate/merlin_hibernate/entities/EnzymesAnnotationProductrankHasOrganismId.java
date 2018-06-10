package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnzymesAnnotationProductrankHasOrganismId generated by hbm2java
 */
@Embeddable
public class EnzymesAnnotationProductrankHasOrganismId  implements java.io.Serializable {


     private int productRankSKey;
     private int organismSKey;

    public EnzymesAnnotationProductrankHasOrganismId() {
    }

    public EnzymesAnnotationProductrankHasOrganismId(int productRankSKey, int organismSKey) {
       this.productRankSKey = productRankSKey;
       this.organismSKey = organismSKey;
    }
   


    @Column(name="productRank_s_key", nullable=false)
    public int getProductRankSKey() {
        return this.productRankSKey;
    }
    
    public void setProductRankSKey(int productRankSKey) {
        this.productRankSKey = productRankSKey;
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
		 if ( !(other instanceof EnzymesAnnotationProductrankHasOrganismId) ) return false;
		 EnzymesAnnotationProductrankHasOrganismId castOther = ( EnzymesAnnotationProductrankHasOrganismId ) other; 
         
		 return (this.getProductRankSKey()==castOther.getProductRankSKey())
 && (this.getOrganismSKey()==castOther.getOrganismSKey());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getProductRankSKey();
         result = 37 * result + this.getOrganismSKey();
         return result;
   }   


}


