/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mazayan
 */
public class TeamTest {
    
    File fileName;
    
    
    public TeamTest() {
    }
    
    @BeforeClass
    public static void setUpTests() {
        System.out.println("Starting Tests");
    }
    
    @Before
    public void setUp() {
        //fileName = new File("/Users/tylerstraffon/documents/NetBeansProjects/Team03App/TeamInfo.txt");
        //fileName = new File("/Users/Ed/NetBeansProjects/Team03App/TeamInfo.txt");
        fileName = new File("/Users/Mazayan/NetBeansProjects/Team03App/TeamInfo.txt");
    }

    /**
     * Test of readInfo method, of class Team.
     */
    @Test
    public void testReadInfo() throws Exception {
        System.out.println("Test of readInfo method");
        this.setUp();
        Team instance = new Team();
        instance.readInfo(fileName);
        System.out.println("Test1: "+ instance.info.toString());
        assertNotNull(instance.info);
    }
    
    @After
    public void tearDown() {
        this.fileName = null;
        System.out.println("Test Finished");
    }
    
    @AfterClass
    public static void tearDownTest() {
        System.out.println("All Tests Finished");
    }
    
    
}
