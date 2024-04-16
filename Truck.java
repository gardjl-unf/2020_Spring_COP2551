/* COP2551C Monday March 30, 2020
 * Author: Jason Gardner
 * Filename: Truck.java
 * Main Method Included as Part of Assignment (No Author Data)
 * Purpose: Module 8 Program (Utilization of an ArrayList to Store Truck Objects)
 */

// An ArrayList can store objects and is versatile!
import java.util.ArrayList;

public class Truck {
    
    // Private (Member) Variables - Object Properties
    private String manufacturer;
    private String model;
    private int year;
    
    // Default (No Argument) Constructor - No Default Values Given
    Truck () {
        
    }
    
    // Overloaded Constructor - Sets All Three Member Variables
    Truck (String manufacturer, String model, int year) {
        this.manufacturer=manufacturer;
        this.model=model;
        this.year=year;
    }
    
    // "Getters" - Return Each Member Variable
    public String getManufacturer () {
        return this.manufacturer;
    }
    
    public String getModel () {
        return this.model;
    }
    
    public int getYear () {
        return this.year;
    }
    
    // "Setters" - Mutates/Sets Each Member Variable
    public void setManufacturer (String manufacturer) {
        this.manufacturer=manufacturer;
    }
    
    public void setModel (String model) {
        this.model=model;
    }
    
    public void setYear (int year) {
        this.year=year;
    }
    
    // toString() - This Format is Given in Expected Output
    public String toString() {
        return "Manufacturer: " + this.manufacturer + ", Model: " + this.model + ", Year: " + this.year;
    }
    
    
    /* Assumed That manufacturers.length and models.length and years.length are the same length!
     * If this is untrue, we will have an out-of-bounds error.
     * 
     * This method seemed weird, initially, but there are a LOT of examples of toArray() or toList()
     */
    
    public static ArrayList createList (String[] manufacturers, String[] models, int[] years) {
        // ArrayList (Generic) Instantiation for Truck Objects (We could "new ArrayList<Truck>" as lecture said).
        ArrayList truckList =  new ArrayList<>();
        
        // Iterate from 0 to manufacturers.length, placing a new Truck inside truckList
        for (int  i= 0; i < manufacturers.length; i++) {
            truckList.add(new Truck(manufacturers[i], models[i], years[i]));
        }
        // Return the truckList object
        return truckList;
    }
    
    
    
    /* Provided main Method:  Comments
     * 
     * The arrays are linked data intended to be fed into an object constructor.
     * Creating these arrays is something I did in "Babbette's Bistro" to approximate
     * objects.  Think JSON objects, except they're each field.
     * 
     * Below code initializes some arrays with manufacturer, model, and years.
     * It prints our output header "Original list: " followed by creating an
     * ArrayList of Truck objects by passing in our arrays.  It then prints our
     * Truck ArrayList iterating over Truck objects (toString()).
     * 
     * We create a truck object "t" by using .get(4) to copy the 5th object in the
     * Arraylist truckList.  The .setYear(2015) changes the year of t to 2015, then we
     * set the 4th ArrayList Truck to t.
     * 
     * Working, shorter code for this step would be truckList.get(4).setYear(2015);
     * 
     * Finally, printed again to verify the change after the header "New list: "
     */
    
     // ****** DO NOT MODIFY BELOW ******
     
     // Main method for unit test
     public static void main(String[] args) {
         final String[] manufacturers = {
                 "Ford", "Ford", "Toyota", "GMC",    "Honda",     "Chevrolet" };
         final String[] models = {
                 "F150", "F250", "Tundra", "Sierra", "Ridgeline", "Silverado" };
         final int[] years = {
                 2010,   2012,   2014,     2016,     2017,         2018       };
       
         System.out.println("Original list: ");
         ArrayList<Truck>  truckList = Truck.createList(manufacturers, models, years);
         for (Truck t1 : truckList)
             System.out.println(t1);
         System.out.println();
       
         System.out.println("New List: ");
         Truck t = truckList.get(4); // should be Honda
         t.setYear(2015); // new year
         truckList.set(4, t); // change the truck in the list
       
         for (Truck t1 : truckList)
             System.out.println(t1);
     }
    
     // ****** SAFE TO MODIFY BELOW ******
    
     /* Expected Unit Test Output:
      * 
      * Original list:
      * Manufacturer: Ford, Model: F150, Year: 2010
      * Manufacturer: Ford, Model: F250, Year: 2012
      * Manufacturer: Toyota, Model: Tundra, Year: 2014
      * Manufacturer: GMC, Model: Sierra, Year: 2016
      * Manufacturer: Honda, Model: Ridgeline, Year: 2017
      * Manufacturer: Chevrolet, Model: Silverado, Year: 2018
      * 
      * New List:
      * Manufacturer: Ford, Model: F150, Year: 2010
      * Manufacturer: Ford, Model: F250, Year: 2012
      * Manufacturer: Toyota, Model: Tundra, Year: 2014
      * Manufacturer: GMC, Model: Sierra, Year: 2016
      * Manufacturer: Honda, Model: Ridgeline, Year: 2015
      * Manufacturer: Chevrolet, Model: Silverado, Year: 2018
      */
}
