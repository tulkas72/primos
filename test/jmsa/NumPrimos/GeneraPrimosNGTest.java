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
import org.testng.annotations.Test;

/**
 *
 * @author jmsa
 */
public class GeneraPrimosNGTest
{
    
    public GeneraPrimosNGTest()
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

    /**
     * Test of criba method, of class GeneraPrimos.
     */
    @Test
    public void testCriba()
    {
        System.out.println("criba");
        int max = 0;
        int[] expResult = null;
        int[] result = GeneraPrimos.criba(max);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
