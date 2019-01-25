/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmsa.NumPrimos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

/**
 *
 * @author jmsa
 */
public class PrimosTest
{
    
    public PrimosTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of criba method, of class Primos.
     */
    @Test
    public void testCriba()
    {
     System.out.println("criba");
     int[] nullArray = Primos.criba(0);  
     assertEquals(nullArray.length, 0); 
     int[] minArray = Primos.criba(2); 
     assertEquals(minArray.length, 1); 
     assertEquals(minArray[0], 2);
     int[] threeArray = Primos.criba(3); 
     assertEquals(threeArray.length, 2); 
     assertEquals(threeArray[0], 2); 
     assertEquals(threeArray[1], 3);   
     int[] centArray = Primos.criba(100); 
     assertEquals(centArray.length, 25); 
     assertEquals(centArray[24], 97); 
       /* int max = 0;
        int[] expResult = null;
        int[] result = Primos.criba(max);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
