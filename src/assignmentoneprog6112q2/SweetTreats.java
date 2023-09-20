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
public class SweetTreats extends Coffee
{
    // Declarations - uses information hiding by using private variables
    private int custSweetChoice;
    private int sweetCost;

    // Constructor
    public SweetTreats(int custSweetChoice,int sweetCost, int custChoice, int cost, int totalCost) {
        super(custChoice, cost, totalCost);
        this.custSweetChoice = custSweetChoice;
        this.sweetCost = sweetCost;
    } // end of constructor
    
    //This is the sweetTreatsChoice() method
   public void sweetTreatsChoice()
   {
       // Declarations 
       boolean sweetOption;
       final int BROWNIE_COST = 15;
       final int MUFFIN_COST = 12;
       final int CROISSANT_COST = 13;
       final int SLICE_OF_CAKE_COST = 10;
       
       Scanner kb = new Scanner(System.in);
       
       // Setting the sweetOption to false
       sweetOption = false;
       
       // While loop to run while the valid option is false and will remain 
       // looping until a value that is true is selected 
       while(!sweetOption)
         {
             // Prompting the user
              System.out.println("Please select the customers Sweet Treats choice"
               + "\n(1) Brownie"
               + "\n(2) Muffin"
               + "\n(3) Croissant"
               + "\n(4) Slice of Cake");
              custSweetChoice = kb.nextInt();
              
            // Using a switch to display the price of the sweet treat depending on the user's choice
            switch (custSweetChoice)
               {
                /*
              -- If the user selects 1, 2, 3 or 4 then that option is displayed with the price
              -- Then that price is stored to a variable called cost - which will then be used
                 to calculate the total cost 
            */
                  case 1: 
                      System.out.println("-------------------------------"
                              + "\nBrownie cost: R" + BROWNIE_COST
                              + "\n-------------------------------"); 
                      sweetCost = BROWNIE_COST;
                      sweetOption = true;
                      break;
                  case 2: 
                      System.out.println("-------------------------------"
                              + "\nMuffin: R" + MUFFIN_COST
                              + "\n-------------------------------");
                      sweetCost = MUFFIN_COST;
                      sweetOption = true;
                      break;
                  case 3: 
                      System.out.println("-------------------------------"
                              + "\nCroissant cost: R" +CROISSANT_COST
                              + "\n-------------------------------");
                      sweetCost = CROISSANT_COST;
                      sweetOption = true;
                      break;
                  case 4: 
                      System.out.println("-------------------------------"
                              + "\nSlice of cake cost: R" + SLICE_OF_CAKE_COST
                              + "\n-------------------------------");
                      sweetCost = SLICE_OF_CAKE_COST;
                      sweetOption = true;
                      break;
                     // A default message is then displayed if the user selects a value other than 1, 2, 3 or 4.
                  default: System.out.println("Invalid Choice");break;
               } // end of switch case
         } // end of while loop
   }// end of method
   
   /*
    -- Overriding the calculateCost() method from the parent class
    -- This method calculates the customer's total cost by adding their coffee 
       cost to the savoury treat that they chose
   */
   @Override
     public double calculateCost()
    {
       totalCost = cost + sweetCost;
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