/* COP2551C Monday April 15, 2020
 * Author: Jason Gardner
 * Filename: Vehicle.java
 * Purpose: Module 11 Program (Abstract Implementation)
 */

// I am moving the brackets in "DO NOT MODIFY" code to make it more readable (to me).

public abstract class Vehicle {
    
    /* Non-modification Section Comments:
     * Instantiate a Bicycle and Automobile
     * turn() and move() each.
     */
    
    // ****** DO NOT MODIFY BELOW ******
    public static void main(String args[]) {
        Bicycle b = new Bicycle();
        Automobile a = new Automobile();
        
        b.turn();
        b.move();
        
        a.turn();
        a.move();
    }
    // ****** SAFE TO MODIFY BELOW ******
    
    // Abstract Method for move() (Per-Instructions)
    abstract void move();
}

// Interface Containing turn() (Per-Instructions)
interface Turnable {
    void turn();
}

/* Non-modification Section Comments:
 * Bicycle and Automobile Object Classes
 * Each provides an implementation of the abstract methods
 * inside Vehicle.move() and Turnable.turn()
 */

//****** DO NOT MODIFY BELOW ******
class Bicycle extends Vehicle implements Turnable {
    public void move() {
        System.out.println("Bicycle: pedal.");
    }
    
    public void turn() {
        System.out.println("Bicycle: use the handlebars.");
    }
}

class Automobile extends Vehicle implements Turnable {
    public void move() {
        System.out.println("Automobile: step on the accelerator.");
    }
    
    public void turn() {
        System.out.println("Automobile: use the steering wheel");
    }
}
//****** SAFE TO MODIFY BELOW ******


/* Expected Output (Provided):
 * 
 * Bicycle: use the handlebars.
 * Bicycle: pedal.
 * Automobile: use the steering wheel
 * Automobile: step on the accelerator.
*/

