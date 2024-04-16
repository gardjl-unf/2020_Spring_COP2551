/* COP2551C Monday March 23, 2020
 * Author: Jason Gardner
 * Filename: Insect.java
 * Main Method Included as Part of Assignment (No Author Data)
 * Purpose: Module 7 Program (Insect Object Creation and Testing)
 */

public class Insect {
    
    // Static Constants
    public static final String NONAME = "no name";
    public static final double NOWINGS = 0.0;
    
    // Private (Member) Variables
    private String name;
    private double wingLength;
    private boolean terrestrial;
    
    // Default Constructor
    Insect () {
        
    }
    
    // Overloaded Constructor
    Insect (String name, double wingLength, boolean terrestrial) {
        this.name=name;
        this.wingLength=wingLength;
        this.terrestrial=terrestrial;
    }
    
    // "Getters" (accessor) for all three member variables
    public String getName() {
        return this.name;
    }
    
    public double getWingLength() {
        return this.wingLength;
    }
    
    public boolean isTerrestrial() {
        return this.terrestrial;
    }
    
    // "Setters" (mutator) for wingLength and terrestrial
    public void setWingLength(double wingLength) {
        this.wingLength=wingLength;
    }
    
    public void setTerrestrial(boolean terrestrial) {
        this.terrestrial=terrestrial;
    }
    
    // toString() method
    public String toString() {
        return "Insect: name = " + name + ", winglength = " + wingLength + "mm, terrestrial = " + terrestrial;
    }
    
// Do not include main in the class.
    
// ****** DO NOT MODIFY BELOW ******
    // main method
    public static void main(String[] args) {
        // test overloaded constructor
        Insect ins1 = new Insect("honeybee",11.0, true); // name, wing length, terrestrial
        Insect ins2 = new Insect("water beetle", NOWINGS, false);
       
        // test wing length accessor
        System.out.println(ins1.getName() + " wing length = " + ins1.getWingLength() + "mm");
        System.out.println(ins2.getName() + " wing length = " + ins2.getWingLength() + "mm");
       
        // test terrestrial accessor
        if (ins1.isTerrestrial() == true)
            System.out.println(ins1.getName() + " is terrestrial.");
        else
            System.out.println(ins1.getName() + " is not terrestrial.");

        if (ins2.isTerrestrial() == true)
            System.out.println(ins2.getName() + " is terrestrial.");
        else
            System.out.println(ins2.getName() + " is not terrestrial.");
       
        // test wing length mutator
        System.out.println("Doubling " + ins1.getName() + " wing length.");
        ins1.setWingLength(ins1.getWingLength() * 2.0);
       
        // test terrestrial mutator
        System.out.println("Changing " + ins2.getName() + " to terrestrial.");
        ins2.setTerrestrial(true);
       
        // test toString
        System.out.println("Final state of insects: ");
        System.out.println(ins1);
        System.out.println(ins2);
    }
// ****** SAFE TO MODIFY BELOW ******
}
