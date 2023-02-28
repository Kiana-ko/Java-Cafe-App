
package cafe;

import java.util.UUID; 
/*Importing the UUID class from the java.util package which might come in handy */


public class cafe {
    public static final String[] CAFE_MENU = {"1. Cortado", "2. Cappuccino", "3. Flatwhite", "4. Mocha", "5. V60", "6. Chemex coffee", "7. Iced latte", "8. Cold Brew"};
    // Creating an array of different coffee types on the menu!
    public static final int[] COFFEE_PRICES = {3, 4 , 4 , 5 , 5 , 6 , 5 , 6};
    // Creating an array of prices of different coffee types on the menu!
    public static final String[] COFFEE_TOPPINGS_SYRUPS_ADDITONALS = {"Coca Powder", "Whipped cream", "Salted Caramel syrup", "Hazelnut syrup", "Oat milk"};
    // Creating an array of toppings, sweeteners and subtiute milk avlaible for the coffees!
    public static final int TOPPINGS_EXTRAS_PRICE = 50; 
    // All prices for toppings, sweeteners and subtiute milks r 50 cents!


    public static void showCoffeesWithTheirPrices() {
        for (int MenueItem = 0; MenueItem < CAFE_MENU.length; MenueItem++) {
            System.out.println(CAFE_MENU[MenueItem] + " " + "$" + COFFEE_PRICES[MenueItem] );
        }
    }
    // Creating a function which loops through items and prices of CAFE_MENU String array and displays all the items.
  

    public static void showAdditonals() {
        for (int additional = 0; additional < COFFEE_TOPPINGS_SYRUPS_ADDITONALS.length; additional++) {
            System.out.println(COFFEE_TOPPINGS_SYRUPS_ADDITONALS[additional]);
        }
    }
    // Creating a function which loops through items of COFFEE_TOPPINGS_SYRUPS_ADDITONALS String array and displays all the items.
}












