/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3hw6ex2testingmas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class J3hw6ex2TestingMasTest {
    
    public J3hw6ex2TestingMasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of metod method, of class J3hw6ex2TestingMas.
     */
    @Test
    public void testMetod() {
        System.out.println("metod");
        int[] mas = {1,1,4,4,1,1,4};
        J3hw6ex2TestingMas instance = new J3hw6ex2TestingMas();
        boolean expResult = true;
        boolean result = instance.metod(mas);
        assertEquals(expResult, result);        
    }
    
      @Test
    public void testMetod2() {
        System.out.println("metod2");
        int[] mas = {1,1,4,4,1,5,4};
        J3hw6ex2TestingMas instance = new J3hw6ex2TestingMas();
        boolean expResult = false;
        boolean result = instance.metod(mas);
        assertEquals(expResult, result);        
    }
    
     @Test
    public void testMetod3() {
        System.out.println("metod3");
        int[] mas = {1};
        J3hw6ex2TestingMas instance = new J3hw6ex2TestingMas();
        boolean expResult = true;
        boolean result = instance.metod(mas);
        assertEquals(expResult, result);        
    }

    /**
     * Test of main method, of class J3hw6ex2TestingMas.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        J3hw6ex2TestingMas.main(args);      
    }
    
}
