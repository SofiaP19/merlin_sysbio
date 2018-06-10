package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EnzymesAnnotationHomologydata generated by hbm2java
 */
@Entity
@Table(name="enzymes_annotation_homologydata"
    ,catalog="test_hibernate"
)
public class EnzymesAnnotationHomologydata  implements java.io.Serializable {


     private Integer SKey;
     private int geneHomologySKey;
     private String locusTag;
     private String geneName;
     private String product;
     private String ecNumber;
     private Boolean selected;
     private String chromosome;
     private String notes;

    public EnzymesAnnotationHomologydata() {
    }

	
    public EnzymesAnnotationHomologydata(int geneHomologySKey, String locusTag, String product) {
        this.geneHomologySKey = geneHomologySKey;
        this.locusTag = locusTag;
        this.product = product;
    }
    public EnzymesAnnotationHomologydata(int geneHomologySKey, String locusTag, String geneName, String product, String ecNumber, Boolean selected, String chromosome, String notes) {
       this.geneHomologySKey = geneHomologySKey;
       this.locusTag = locusTag;
       this.geneName = geneName;
       this.product = product;
       this.ecNumber = ecNumber;
       this.selected = selected;
       this.chromosome = chromosome;
       this.notes = notes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="s_key", unique=true, nullable=false)
    public Integer getSKey() {
        return this.SKey;
    }
    
    public void setSKey(Integer SKey) {
        this.SKey = SKey;
    }

    
    @Column(name="geneHomology_s_key", nullable=false)
    public int getGeneHomologySKey() {
        return this.geneHomologySKey;
    }
    
    public void setGeneHomologySKey(int geneHomologySKey) {
        this.geneHomologySKey = geneHomologySKey;
    }

    
    @Column(name="locusTag", nullable=false, length=45)
    public String getLocusTag() {
        return this.locusTag;
    }
    
    public void setLocusTag(String locusTag) {
        this.locusTag = locusTag;
    }

    
    @Column(name="geneName", length=45)
    public String getGeneName() {
        return this.geneName;
    }
    
    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    
    @Column(name="product", nullable=false, length=65535)
    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    
    @Column(name="ecNumber", length=16777215)
    public String getEcNumber() {
        return this.ecNumber;
    }
    
    public void setEcNumber(String ecNumber) {
        this.ecNumber = ecNumber;
    }

    
    @Column(name="selected")
    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    
    @Column(name="chromosome", length=20)
    public String getChromosome() {
        return this.chromosome;
    }
    
    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    
    @Column(name="notes", length=65535)
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }




}


