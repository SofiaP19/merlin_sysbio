package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnzymesAnnotationGenehomologyHasHomologuesId generated by hbm2java
 */
@Embeddable
public class EnzymesAnnotationGenehomologyHasHomologuesId  implements java.io.Serializable {


     private int geneHomologySKey;
     private int homologuesSKey;

    public EnzymesAnnotationGenehomologyHasHomologuesId() {
    }

    public EnzymesAnnotationGenehomologyHasHomologuesId(int geneHomologySKey, int homologuesSKey) {
       this.geneHomologySKey = geneHomologySKey;
       this.homologuesSKey = homologuesSKey;
    }
   


    @Column(name="geneHomology_s_key", nullable=false)
    public int getGeneHomologySKey() {
        return this.geneHomologySKey;
    }
    
    public void setGeneHomologySKey(int geneHomologySKey) {
        this.geneHomologySKey = geneHomologySKey;
    }


    @Column(name="homologues_s_key", nullable=false)
    public int getHomologuesSKey() {
        return this.homologuesSKey;
    }
    
    public void setHomologuesSKey(int homologuesSKey) {
        this.homologuesSKey = homologuesSKey;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnzymesAnnotationGenehomologyHasHomologuesId) ) return false;
		 EnzymesAnnotationGenehomologyHasHomologuesId castOther = ( EnzymesAnnotationGenehomologyHasHomologuesId ) other; 
         
		 return (this.getGeneHomologySKey()==castOther.getGeneHomologySKey())
 && (this.getHomologuesSKey()==castOther.getHomologuesSKey());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getGeneHomologySKey();
         result = 37 * result + this.getHomologuesSKey();
         return result;
   }   


}


