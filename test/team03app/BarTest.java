/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tylerstraffon
 */
public class BarTest {
    
    File fileName;

    @BeforeClass
    public static void setUpTests() {
        System.out.println("Starting Tests");
    }
    
    @Before
    public void setUp() {
        fileName = new File("/Users/tylerstraffon/documents/NetBeansProjects/Team03App/listOfBars.txt");
    }

    /**
     * Test of randomBar method, of class BarCntl.
     */
    @Test
    public void testRandomBar() throws Exception {
        System.out.println("Test of randomBar method");
        this.setUp();
        MainMenuCntl theMainMenuCntl = new MainMenuCntl();
        BarCntl theBarCntl = new BarCntl(theMainMenuCntl);
        String randomBar = theBarCntl.randomBar();
        System.out.println("Test1: "+ randomBar);
        assertNotNull(randomBar);
    }
    
    @Test
    public void testShowBarUI() throws Exception {
       System.out.println("Test of showBarUI method");
        MainMenuCntl theMainMenuCntl = new MainMenuCntl();
        BarCntl theBarCntl = new BarCntl(theMainMenuCntl);
        theBarCntl.showBarUI();
        BarUI theBarUI = new BarUI(theBarCntl);
        System.out.println("Test 2: " + theBarUI.frameVisible());
        assertNotNull(theBarUI.frameVisible());
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
