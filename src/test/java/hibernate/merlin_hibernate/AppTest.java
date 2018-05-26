package hibernate.merlin_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate.merlin_hibernate.dao.implementation.EnzymesAnnotationGenehomologyDAOImpl;
import hibernate.merlin_hibernate.dao.implementation.ModelGeneDAOImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    SessionFactory sessionFactory;
    
    protected void setUp() throws Exception {
    	// A SessionFactory is set up once for an application!
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure("hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
    			.build();
    	try {
    		sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    	}
    	catch (Exception e) {
    		// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
    		// so destroy it manually.
    		System.out.println(e);
    		StandardServiceRegistryBuilder.destroy( registry );
    	}
    }
    
    public void modelGene() {
    	

    	ModelGeneDAOImpl dao = new ModelGeneDAOImpl(this.sessionFactory);
    	
    	System.out.println(dao.getAllDatabaseGenes());
    	
    	
    }
    
    public void testApp()
    {
    	System.out.println("testing");
    	try {
			this.setUp();
			this.modelGene();
		} catch (Exception e) {
			
		}
        
    }
    
    public void getQueries() {
    	

    	EnzymesAnnotationGenehomologyDAOImpl dao = new EnzymesAnnotationGenehomologyDAOImpl(this.sessionFactory);
    	
    	System.out.println(dao.getQueries());
    	
    }
    

}

