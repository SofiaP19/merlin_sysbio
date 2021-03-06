package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TransportersAnnotationTcNumbersId generated by hbm2java
 */
@Embeddable
public class TransportersAnnotationTcNumbersId  implements java.io.Serializable {


     private String tcNumber;
     private int tcVersion;

    public TransportersAnnotationTcNumbersId() {
    }

    public TransportersAnnotationTcNumbersId(String tcNumber, int tcVersion) {
       this.tcNumber = tcNumber;
       this.tcVersion = tcVersion;
    }
   


    @Column(name="tc_number", nullable=false, length=45)
    public String getTcNumber() {
        return this.tcNumber;
    }
    
    public void setTcNumber(String tcNumber) {
        this.tcNumber = tcNumber;
    }


    @Column(name="tc_version", nullable=false)
    public int getTcVersion() {
        return this.tcVersion;
    }
    
    public void setTcVersion(int tcVersion) {
        this.tcVersion = tcVersion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TransportersAnnotationTcNumbersId) ) return false;
		 TransportersAnnotationTcNumbersId castOther = ( TransportersAnnotationTcNumbersId ) other; 
         
		 return ( (this.getTcNumber()==castOther.getTcNumber()) || ( this.getTcNumber()!=null && castOther.getTcNumber()!=null && this.getTcNumber().equals(castOther.getTcNumber()) ) )
 && (this.getTcVersion()==castOther.getTcVersion());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTcNumber() == null ? 0 : this.getTcNumber().hashCode() );
         result = 37 * result + this.getTcVersion();
         return result;
   }   


}


