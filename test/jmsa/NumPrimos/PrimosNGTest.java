/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmsa.NumPrimos;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author jmsa
 */
public class PrimosNGTest
{
    
    public PrimosNGTest()
    {

    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception
    {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception
    {
    }

    /*@DataProvider(name = "test2")
    public static Object[][] dataForPrimos()
    {
        return new Object[][]
        {{0,0,0},{2,1,2}, {3,2,3},{100,25,97}};
    } */
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
        
      
      /*  int max = 0;
        int[] expResult = null;
        int[] result = Primos.criba(max);
        
        
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
