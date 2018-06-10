package hibernate.merlin_hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Test;

import hibernate.merlin_hibernate.dao.implementation.EnzymesAnnotationGenehomologyDAOImpl;
import hibernate.merlin_hibernate.dao.implementation.ModelGeneDAOImpl;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
    SessionFactory sessionFactory;
    
    protected void setUp() throws Exception {
    	
    	System.out.println("testing setup");
    	// A SessionFactory is set up once for an application!
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure("hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
    			.build();
    	
    	System.out.println("testing trial");
    	
    	try {
    		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	}
    	catch (Exception e) {
    		// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
    		// so destroy it manually.
    		e.printStackTrace();
    		StandardServiceRegistryBuilder.destroy( registry );
    	}
    }
    
    public void modelGene() {
    	

    	ModelGeneDAOImpl dao = new ModelGeneDAOImpl(this.sessionFactory);
    	System.out.println(dao.getAllDatabaseGenes());
    }
    
    @Test
    public void testApp()
    {
    	System.out.println("testing");
    	try {
			this.setUp();
			System.out.println("testing 2");
			this.modelGene();
		} catch (Exception e) {
			
		}
        
    }
    
    public void getQueries() {
    	

    	EnzymesAnnotationGenehomologyDAOImpl dao = new EnzymesAnnotationGenehomologyDAOImpl(this.sessionFactory);
    	
    	System.out.println(dao.getQueries());
    	
    }
    
    public void getGeneNamesAliases() {
    	ModelGeneDAOImpl gene = new ModelGeneDAOImpl(this.sessionFactory);
    	System.out.println(gene.getGeneNamesAliases());
    }

}

