package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelSuperpathwayId generated by hbm2java
 */
@Embeddable
public class ModelSuperpathwayId  implements java.io.Serializable {


     private int pathwayIdpathway;
     private int superpathway;

    public ModelSuperpathwayId() {
    }

    public ModelSuperpathwayId(int pathwayIdpathway, int superpathway) {
       this.pathwayIdpathway = pathwayIdpathway;
       this.superpathway = superpathway;
    }
   


    @Column(name="pathway_idpathway", nullable=false)
    public int getPathwayIdpathway() {
        return this.pathwayIdpathway;
    }
    
    public void setPathwayIdpathway(int pathwayIdpathway) {
        this.pathwayIdpathway = pathwayIdpathway;
    }


    @Column(name="superpathway", nullable=false)
    public int getSuperpathway() {
        return this.superpathway;
    }
    
    public void setSuperpathway(int superpathway) {
        this.superpathway = superpathway;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelSuperpathwayId) ) return false;
		 ModelSuperpathwayId castOther = ( ModelSuperpathwayId ) other; 
         
		 return (this.getPathwayIdpathway()==castOther.getPathwayIdpathway())
 && (this.getSuperpathway()==castOther.getSuperpathway());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPathwayIdpathway();
         result = 37 * result + this.getSuperpathway();
         return result;
   }   


}


