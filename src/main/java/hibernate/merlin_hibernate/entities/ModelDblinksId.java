package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ModelDblinksId generated by hbm2java
 */
@Embeddable
public class ModelDblinksId  implements java.io.Serializable {


     private String class_;
     private int internalId;
     private String externalDatabase;

    public ModelDblinksId() {
    }

    public ModelDblinksId(String class_, int internalId, String externalDatabase) {
       this.class_ = class_;
       this.internalId = internalId;
       this.externalDatabase = externalDatabase;
    }
   


    @Column(name="class", nullable=false, length=2)
    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }


    @Column(name="internal_id", nullable=false)
    public int getInternalId() {
        return this.internalId;
    }
    
    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }


    @Column(name="external_database", nullable=false, length=150)
    public String getExternalDatabase() {
        return this.externalDatabase;
    }
    
    public void setExternalDatabase(String externalDatabase) {
        this.externalDatabase = externalDatabase;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModelDblinksId) ) return false;
		 ModelDblinksId castOther = ( ModelDblinksId ) other; 
         
		 return ( (this.getClass_()==castOther.getClass_()) || ( this.getClass_()!=null && castOther.getClass_()!=null && this.getClass_().equals(castOther.getClass_()) ) )
 && (this.getInternalId()==castOther.getInternalId())
 && ( (this.getExternalDatabase()==castOther.getExternalDatabase()) || ( this.getExternalDatabase()!=null && castOther.getExternalDatabase()!=null && this.getExternalDatabase().equals(castOther.getExternalDatabase()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getClass_() == null ? 0 : this.getClass_().hashCode() );
         result = 37 * result + this.getInternalId();
         result = 37 * result + ( getExternalDatabase() == null ? 0 : this.getExternalDatabase().hashCode() );
         return result;
   }   


}


