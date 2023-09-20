/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
public class SweetTreatsTest 
{
    
    public SweetTreatsTest() 
    {
        
    }
    
    @BeforeClass 
    public static void startup()
    {
        System.out.println("\nTesting has started");
    }
    
    @AfterClass
    public static void tearDown() 
    {
        System.out.println("Testing has ended");
    }

    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSweetTreatsBrownie() 
    {
        System.out.println("Test Sweet Treats Brownie");
        SweetTreats st = new SweetTreats(1,15,1,25,40);
        double actual = st.calculateCost();
        double expected = 40.0;
        assertEquals(expected,actual,0.01);
        
    } // End of Test Method

    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSweetTreatsMuffin() 
    {
        System.out.println("Test Sweet Treats Muffin");
         SweetTreats st = new SweetTreats(2,12,2,22,34);
        double actual = st.calculateCost();
        double expected = 34.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method
    
    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSweetTreatsCroissant() 
    {
        System.out.println("Test Sweet Treats Croissant");
         SweetTreats st = new SweetTreats(3,13,3,28,41);
        double actual = st.calculateCost();
        double expected = 41.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method
    
    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSweetTreatsSliceOfCake() 
    {
        System.out.println("Test Sweet Treats Slice of Cake");
         SweetTreats st = new SweetTreats(3,10,3,30,40);
        double actual = st.calculateCost();
        double expected = 40.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method
    
}// End of Test Class
