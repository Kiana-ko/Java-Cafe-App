
import java.util.Scanner;
/* Importing the Scanner class from the java.util package, in order to be able to read user input from the 
command line and also allowing the user to input values ! */


import cafe.cafe; // Importing our cafe class


public class App {
    public static void main(String[] args) {
        System.out.println("=== Kiana's Cafe menu ===");
        cafe.showCoffeesWithTheirPrices(); // Calling a function that we created in the cafe class

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Hi, what would you like to order today? ");
        String customerOrder = scanner.nextLine(); // Using .nextline() method to be able to read what user inputs

        System.out.println("U chose " + customerOrder + "!" );
        //Creating a scanner class 
        //There should also be an if else statement for when the user types in an item that isn't on the menu (that could say: "this item isn't on the menu") 
        


        
        Scanner additionals = new Scanner(System.in);
        System.out.println("Do you want to add any toppings, sweeteners or subtitute milk to your coffee?");
        String extraToppings = additionals.nextLine(); // Using .nextline() method to be able to read what user inputs
        //reating a scanner class 


        if (extraToppings.equalsIgnoreCase("yes")) {
            System.out.println("=== toppings, sweeteners or subtitute milk ===");
            cafe.showAdditonals(); // Calling a function that we created in the cafe class
            System.out.println("=== === === === === === === === === === === ===");
            String costumersAdditonals = additionals.nextLine(); 
            System.out.println("U ordered a/an" + " " + customerOrder +  " " + costumersAdditonals + "!");
        } else {
            System.out.println("Ok, thank you for your order! ");
        }

    }
}



// And lastly:

/* Creating an if else statement that will show the user the menu if they type yes when asked if they want 
additonal things like toppings with their coffee, if the user says yes they will see the menu and get to
choose sth additonal like syrup or substiute milk for their coffee */

// Note: we use .equalsIgnoreCase() to compare two string without considering theie sensitivity!







