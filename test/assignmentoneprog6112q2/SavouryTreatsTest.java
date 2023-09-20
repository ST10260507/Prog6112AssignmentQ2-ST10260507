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
public class SavouryTreatsTest 
{
    
    public SavouryTreatsTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUp() 
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
    public void testSavouryTreatsChickenAndMayo() 
    {
        System.out.println("Test Savoury Treats Chicken and Mayo");
        SavouryTreats savt = new SavouryTreats(1,25,25,25,50);
        double actual = savt.calculateCost();
        double expected = 50.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method

    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSavouryTreatsCheese() 
    {
        System.out.println("Test Savoury Treats Cheese");
        SavouryTreats savt = new SavouryTreats (2,12,2,22,34);
        double actual = savt.calculateCost();
        double expected = 34.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method
    
    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSavouryTreatsCheeseAndTomato() 
    {
        System.out.println("Test Savoury Treats Cheese and Tomato");
        SavouryTreats savt = new SavouryTreats(3,15,3,28,43);
        double actual = savt.calculateCost();
        double expected = 43.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method
    
    /**
     * Test of SavouryTreatsChoicemethod, of class Coffee.
     */
    @Test
    public void testSavouryTreatsTunaAndMayo() 
    {
        System.out.println("STest Savoury Treats Tuna And Mayo");
        SavouryTreats savt = new SavouryTreats(4,20,4,30,50);
        double actual = savt.calculateCost();
        double expected = 50.0;
        assertEquals(expected,actual,0.01);
        
    } // End of Test Method
    
}// End of Test Class
