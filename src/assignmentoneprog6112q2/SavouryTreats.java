/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneprog6112q2;

import java.util.Scanner;

/*
  -- This is the child class which inherits from the parent class (Coffee)
  -- As a result of the child class extending the parent class, the user doesn't 
     need to be re-prompted for coffee as that already happens in the parent class, 
     so it would happen in the child class 
*/
public class SavouryTreats extends Coffee
{
  // Declarations - uses information hiding by using private variables
    private int custSavouryChoice;
    private int savouryCost;
    
    //Constructor
    public SavouryTreats(int custSavouryChoice, int savouryCost, int custChoice, int cost, int totalCost) 
    {
        super(custChoice, cost, totalCost);
        this.custSavouryChoice = custSavouryChoice;
        this.savouryCost = savouryCost;
    }// end of constructor
    
    // This is the savouryTreatsChoice() method
   public void savouryTreatsChoice()
   {
       // Declarations
       boolean savouryOption;
       final int CHICKEN_AND_MAYO_COST = 25;
       final int CHEESE_COST = 12;
       final int CHEESE_AND_TOMATO_COST = 15;
       final int TUNA_AND_MAYO_COST = 20;
       
       Scanner kb = new Scanner(System.in);
       
       // Setting the savouryOption to false
       savouryOption = false;
      
       // While loop to run while the valid option is false and will remain 
       // looping until a value that is true is selected 
       while(!savouryOption)
        {
            // Prompting the user
             System.out.println("Please select the customers Savoury Treats choice"
               + "\n(1) Chicken and Mayo Sandwich"
               + "\n(2) Cheese Sandwich"
               + "\n(3) Cheese and Tomato Sandwich"
               + "\n(4) Tuna and Mayo Sandwich ");
            custSavouryChoice = kb.nextInt();
           // Using a switch to display the price of the savoury treat depending on the user's choice
            switch (custSavouryChoice)
             {
                /*
                   -- If the user selects 1, 2, 3 or 4 then that option is displayed with the price
                   -- Then that price is stored to a variable called savouryCost - which will then be used
                      to calculate the total cost 
                 */
                 case 1: 
                    System.out.println("------------------------------------"
                            + "\nChicken and Mayo Sandwich cost: R" + CHICKEN_AND_MAYO_COST
                            + "\n------------------------------------"); 
                    savouryCost = CHICKEN_AND_MAYO_COST;
                    savouryOption = true;
                    break;
                 case 2: 
                    System.out.println("------------------------------------"
                            + "\nCheese Sandwich cost: R" + CHEESE_COST
                            + "\n------------------------------------");
                    savouryCost = CHEESE_COST;
                    savouryOption = true;
                    break;
                 case 3: 
                    System.out.println("------------------------------------"
                            + "\nCheese and Tomato Sandwich cost: R" + CHEESE_AND_TOMATO_COST
                            + "\n------------------------------------");
                    savouryCost = CHEESE_AND_TOMATO_COST;
                    savouryOption = true;
                    break;
                 case 4: 
                    System.out.println("------------------------------------"
                            + "\nTuna and Mayo Sandwich cost: R" + TUNA_AND_MAYO_COST
                            + "\n------------------------------------");
                    savouryCost = TUNA_AND_MAYO_COST;
                    savouryOption = true;
                    break;
                   // A default message is then displayed if the user selects a value other than 1, 2, 3 or 4.
                 default: System.out.println("Invalid Choice");break;
             } // end of switch case
        } // end of while loop 
   } // end of method
  
   /*
    -- Overriding the calculateCost() method from the parent class
    -- This method calculates the customer's total cost by adding their coffee 
       cost to the savoury treat that they chose
   */
    @Override
     public double calculateCost()
      {
       totalCost = cost + savouryCost;
       return totalCost;
      } // end of method
     
     // This overrides the output() method from the Coffee class so that it 
     // displays the combined output rather than only the coffee output
   @Override
    public void output()
     {
        System.out.println(
                  "--------------------------------------------"
                + "\nThe customer's total cost is: R" + totalCost
                + "\n--------------------------------------------");
     } // end of method
} // end of class

