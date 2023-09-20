/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignmentoneprog6112q2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class AssignmentOneProg6112Q2Test 
{
    // AssignmentOneProg6112Q2 instantiated object
    AssignmentOneProg6112Q2 assignment = new AssignmentOneProg6112Q2();
    
    public AssignmentOneProg6112Q2Test() 
    {
        
    }
    
    @BeforeClass
    public static void setUp() 
    {
        System.out.println("Testing has started");
    }
    
    @AfterClass
    public static void tearDown() 
    {
        System.out.println("Testing has ended");
    }

    /**
     * Test of testCalcTotalProfits() method, of class AssignmentOneProg6112Q2.
     */
    @Test
    public void testCalcTotalProfits() 
    {
        System.out.println("Test Calculate Total Profits ");
        double[] totalCost = {10.0, 15.0, 20.0};
        int custEntries = 3;
        double expected = 45.0;
        double actual = assignment.calcTotalProfits(totalCost, custEntries);
        
        // Assert that the total profits match the expected value
        assertEquals(expected, actual, 0.01);
        
    }// End of Test Method
    
    /**
     * Test of testCalcTotalProfits() method, of class AssignmentOneProg6112Q2.
     */
    @Test
    public void testCalcTotalProfitsLowerBoundary()
    {
        System.out.println("Test Calculate Total Profits Lower Boundary");
        double[] totalCost = {24.0};
        int custEntries = 1;
        double expected =24.0;
        double actual = assignment.calcTotalProfits(totalCost, custEntries);
        
        // Assert that the total profits match the expected value
        assertEquals(expected, actual, 0.01);
        
    }// End of Test Method
    
} // End of Test Class






    

