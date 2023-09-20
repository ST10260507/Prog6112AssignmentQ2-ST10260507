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
public class CoffeeTest 
{
   
    public CoffeeTest() 
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
     * Test of coffeeChoice method, of class Coffee.
     */
    @Test
    public void testCoffeeChoiceCappuccino() 
    {
        System.out.println("Test Coffee Choice Cappuccino");
        Coffee cof = new Coffee(1,25,25);
        double actual = cof.calculateCost();
        double expected = 25.0;
        assertEquals(expected,actual,0.01);
        
    } // End of Test Method

    /**
     * Test of coffeeChoice method, of class Coffee.
     */
     @Test
    public void testCoffeeChoiceCafeLatte() 
    {
        System.out.println("Test Coffee Choice Cafe Latte");
        Coffee cof = new Coffee(2,22,22);
        double actual = cof.calculateCost();
        double expected = 22.0;
        assertEquals(expected,actual,0.01);
        
    } // End of Test Method
    
    /**
     * Test of coffeeChoice method, of class Coffee.
     */
     @Test
    public void testCoffeeChoiceEspresso() 
    {
        System.out.println("Test Coffee Choice Espresso");
        Coffee cof = new Coffee(3,28,28);
        double actual = cof.calculateCost();
        double expected = 28.0;
        assertEquals(expected,actual,0.01);
        
    } // End of Test Method
    
    /**
     * Test of coffeeChoice method, of class Coffee.
     */
     @Test
    public void testCoffeeChoiceCafeMocha() 
    {
        System.out.println("TestCoffee Choice Cafe Mocha");
        Coffee cof = new Coffee(4,30,30);
        double actual = cof.calculateCost();
        double expected = 30.0;
        assertEquals(expected,actual,0.01);
        
    }// End of Test Method
    
} // End of Test Class
