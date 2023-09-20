/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentoneprog6112q2;

import java.util.Scanner;

/*
References: 
-- Farrell, J. (2019). Java programming. Australia: Cengage Learning.
*/

public class AssignmentOneProg6112Q2 
{
  /*
    What the Program is about:
    -- For my code, I have chosen to solve a business idea problem
    -- The Business idea problem is: A new business ("The Coffee Shop"), doesn't have
       an applicaiton to help run their business 
    -- They need help so that they can process their customers orders and give 
       them the correct total cost for each customer
    -- Additionally, they need the program so that they can see the amount of 
       money they have made at the end of the day
  */ 
    
    public static void main(String[] args) 
    {
        // The main consists of the introduction, which is presented to the user 
        System.out.println(
                "******************************************"
            + "\nWelcome to the Coffee Shop"
            + "\n******************************************");
        
        // An instance object of this class
        AssignmentOneProg6112Q2 assignment = new AssignmentOneProg6112Q2();
        
        // Calling the getCustEntries() method and assigning it to a variable 
        // so that it can be used in other methods
        int custEntries = getCustEntries();
        
        // Calling the sortingCustOrders() method and assigning it to a variable 
        // so that it can be used in other methods
        double[] totalCost = sortingCustOrders(custEntries);
    
        // Calling the calcTotalProfits() method and assigning it to a variable 
        // so that it can be used in other methods
        double allProfitsMade = calcTotalProfits(totalCost, custEntries);
        
        //Displaying the total amount of money made in the day 
        System.out.println(
           "\n*******************************************************"
        + "\nThe total profits made today is: R" + allProfitsMade +
         "\n*******************************************************");
    }// end of main method
    
    // getCustEntries() method
    // this method is int and not void so that it can return an int variable to 
    // be used in other methods
    public static int getCustEntries()
    {
        //Declarations 
       int numOfCustEntries;
       Scanner kb = new Scanner(System.in);
       
       //Prompting the user and asking them for the number of entries they want to make 
       System.out.println("Please enter the number of entries you could like to make: ");
       numOfCustEntries = kb.nextInt();
       
       //returning the variable so that it can be be used in other methods
       return numOfCustEntries;
    }// end of method
    
    // sortingCustOrders() Method
    // This method is a double array and not void as it displays the customer 
    // number only for the number of entries that the user wants to make - it 
    // is saved to an array 
    public static double[] sortingCustOrders (int custEntries) 
    {
        //Declarations
        double[] totalCost = new double[custEntries];

        // For - loop to only loop for the set number of entries the user wants 
        // to make
        for (int i = 0; i < custEntries; i++) 
         {
           System.out.println(
               "-------------------------"
            + "\nCustomer: " + (i + 1)
            +"\n-------------------------");

           // calls the customerOrder() method and saves it to a variable
            double custTotalCost = customerOrder();
            
          // The variable is then saved as an element in the totalCost array
          // The process continues to loop until it reaches the last customer 
          // entry
            totalCost[i] = custTotalCost;
            
         } // end of for loop 
        
        // returning the totalCost variable to be used in a different method
        return totalCost;
        
    }// end of method 
    
    // This is the customerOrder() method 
    // This method is double and not void because it is going to return a double 
    // variable back to the main to be used in a different method
    public static double customerOrder()
    {
      // Declarations
      int userChoice;
      boolean validOption;
      double custTotalCost = 0.0;
    
      Scanner kb = new Scanner(System.in);
    
      // Instantiate the objects
      Coffee cof = new Coffee(0,0,0);
      SweetTreats st = new SweetTreats(0,0,0,0,0);
      SavouryTreats savt = new SavouryTreats (0,0,0,0,0);
    
      // setting the valid option variable to false
            validOption = false;
            
      // While loop to run while the valid option is false and will remain 
      // looping until a value that is true is selected 
         while(!validOption)
         {
            // Prompting the user
            System.out.println("Please select what the customer would like to have :"
                + "\n(1) Only Coffee"
                + "\n(2) Coffee and a Sweet Treat"
                + "\n(3) Coffee and a Savoury Treat");
            userChoice = kb.nextInt();
         
            // Using a switch to call certain methods from other classes depending on the user's choice
            switch (userChoice)
             {
                /*
                  -- If the user selects 1, then the coffeeChoice() method from the Coffee class is called
                  -- If the user selects 2, then the sweetTreatsChoice() method, is called from the SweetTreats class 
                  -- If the user selects 3, then the savouryTreatsChoice() method is called from the savouryTreats class
                  -- The total cost is then calculated by saving the price to each of the customer's 
                     orders to the custTotalCost
                  -- The output is then displayed 
                */
              
                case 1:
                    cof.coffeeChoice();
                    custTotalCost += cof.calculateCost();
                    cof.output();
                    validOption = true;
                    break;
                case 2:
                    st.coffeeChoice();
                    st.sweetTreatsChoice();
                    custTotalCost += st.calculateCost();
                    st.output();
                    validOption = true;
                    break;
                case 3:
                    savt.coffeeChoice();
                    savt.savouryTreatsChoice();
                    custTotalCost += savt.calculateCost();
                    savt.output();
                    validOption = true;
                    break;
                    // A default message is then displayed if the user selects a value other than 1, 2 or 3.
                default: System.out.println("Invalid choice. \nPlease try again");break;
             }// end of switch case
         }// end of while loop
         return custTotalCost; // return the custTotalCost to be used in a different variable
    }// end of method
    
    /*
      -- This is the calcTotalProfits() method
      -- This method is double because it calculates the total cost of all the 
         customer entries made and it return the value to be used in a different method
      -- The totalCost [] array and the number of customer entries are passed as 
         a parameter so that the value stored in each element of the array can be accumulated.
      -- This process only runs for number of customer entries made 
    */
    public static double calcTotalProfits(double [] totalCost, int custEntries)
    {
        // Declarations
        double allProfitsMade = 0.0;
        
        // For-loop, which runs for the number of customer entries made 
        for (int i = 0; i < custEntries; i++) 
         {
            // This calculates the total cost by storing the first value in the 
            // array to a variable and adding each value stored in each element 
            // in the array, to that variable 
            allProfitsMade += totalCost[i];
         } // end of for loop
        
     return allProfitsMade;
    } // end of method
} // end of class 
