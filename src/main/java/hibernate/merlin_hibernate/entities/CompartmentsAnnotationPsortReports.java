package hibernate.merlin_hibernate.entities;
// Generated 4/jun/2018 16:57:32 by Hibernate Tools 5.2.8.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CompartmentsAnnotationPsortReports generated by hbm2java
 */
@Entity
@Table(name="compartments_annotation_psort_reports"
    ,catalog="test_hibernate"
)
public class CompartmentsAnnotationPsortReports  implements java.io.Serializable {


     private Integer id;
     private int projectId;
     private String locusTag;
     private String date;

    public CompartmentsAnnotationPsortReports() {
    }

	
    public CompartmentsAnnotationPsortReports(int projectId) {
        this.projectId = projectId;
    }
    public CompartmentsAnnotationPsortReports(int projectId, String locusTag, String date) {
       this.projectId = projectId;
       this.locusTag = locusTag;
       this.date = date;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="project_id", nullable=false)
    public int getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    
    @Column(name="locus_tag", length=45)
    public String getLocusTag() {
        return this.locusTag;
    }
    
    public void setLocusTag(String locusTag) {
        this.locusTag = locusTag;
    }

    
    @Column(name="date", length=45)
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }




}


