
package team03app;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AssignTest {
    
    File fileName;
    
    
    public AssignTest() {
    }
    
    @BeforeClass
    public static void setUpTests() {
        System.out.println("Starting Assign Test");
    }
    
    @Before
    public void setUp() {
        fileName = new File("/Users/Ed/NetBeansProjects/Team03App/Assignment Form.txt");
    }

    @Test
    public void testReadInfo() throws Exception {
        System.out.println("Assign Test 2 of readInfo method");
        this.setUp();
        Team instance = new Team();
        instance.readInfo(fileName);
        System.out.println("Assign Test2: "+ instance.info.toString());
        assertNotNull(instance.info);
    }
    
    @After
    public void tearDown() {
        this.fileName = null;
        System.out.println("Assign Test 2 Finished");
    }
    
    @AfterClass
    public static void tearDownTest() {
        System.out.println("All Assign Tests Finished");
    }
    
    
}
