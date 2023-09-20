/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneprog6112q2;

import java.util.Scanner;

// The parent class called Coffee
public class Coffee 
{
    // Declarations
     int custChoice;
     int cost;
     int totalCost;
 
     //Constructor
  public Coffee(int custChoice, int cost, int totalCost) 
  {
    this.custChoice = custChoice;
    this.cost = cost;
    this.totalCost = totalCost;
  }// end of constructor
  
  // This is the coffeeChoice() method
   public void coffeeChoice()
   {
       // Declarations 
       boolean coffeeOption;
       final int CAPPUCCINO_COST = 25;
       final int CAFE_LATTE_COST = 22;
       final int ESPRESSO_COST = 28;
       final int CAFE_MOCHA_COST = 30;
       
       Scanner kb = new Scanner(System.in);
       
       // Setting the coffee Option to false
       coffeeOption = false;
       
       // While loop to run while the valid option is false and will remain 
       // looping until a value that is true is selected 
       while(!coffeeOption)
        {
            //Prompting the user
            System.out.println("Please select the customers coffee choice"
               + "\n(1) Cappuccino"
               + "\n(2) Cafe Latte"
               + "\n(3) Espresso"
               + "\n(4) Cafe Mocha");
            custChoice = kb.nextInt();
       
            // Using a switch to display the price of the coffee, depending on the user's choice
            switch (custChoice)
               {
                 /*
                   -- If the user selects 1, 2, 3 or 4 then that option is displayed with the price
                   -- Then that price is stored to a variable called cost - which will then be used
                      to calculate the total cost 
                 */
                 case 1: 
                   System.out.println("-------------------------------" 
                         + "\nCappuccino cost: R" + CAPPUCCINO_COST
                         + "\n-------------------------------" ); 
                    cost = CAPPUCCINO_COST;
                    coffeeOption = true;
                    break;
                 case 2: 
                    System.out.println("-------------------------------"
                            + "\nCafe Latte: R" + CAFE_LATTE_COST
                            + "\n-------------------------------");
                    cost = CAFE_LATTE_COST;
                    coffeeOption = true;
                    break;
                 case 3: 
                    System.out.println("-------------------------------"
                            + "\nEspresso cost: R" + ESPRESSO_COST
                            + "\n-------------------------------");
                    cost = ESPRESSO_COST;
                    coffeeOption = true;
                    break;
                 case 4: 
                    System.out.println("-------------------------------"
                            + "\nCafe Mocha cost: R" + CAFE_MOCHA_COST
                            + "\n-------------------------------");
                    cost = CAFE_MOCHA_COST;
                    coffeeOption = true;
                    break;
                    // A default message is then displayed if the user selects a value other than 1, 2, 3 or 4.
                 default: System.out.println("Invalid Choice");break;
               } // end of switch case
        } // end of while loop 
   }
// end of method
   
   // This is the calculateCost() method
   // It is double and so, will return a double variable
   public double calculateCost()
    {
        // setting the cost to the total cost 
       totalCost = cost;
       
       // Returning the totalCost variable
       return totalCost;
    } // end of method
   
   // This is the output() method - it displays what the customer's total cost 
    public void output()
     {
         System.out.println(
                 "--------------------------------------------"
                 + "\nThe customer's total cost is: R" + totalCost
                 + "\n--------------------------------------------");
     } // end of method
} // end of class
