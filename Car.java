public class Car extends Vehicle{
		
	private int numDoors;
    private int numPassengers;

    /**
     * Constructor for Car
     * 
     * @param make the make of the car
     * @param model the model of the car
     * @param plate the license plate
     * @param doors number of doors
     * @param passengers number of passengers
     */
    public Car(String make, String model, String plate, int doors, int passengers) {
        super(make, model, plate);  // call Vehicle constructor
        this.numDoors = doors;
        this.numPassengers = passengers;
    }

    /**
     * Getter for number of doors
     * @return number of doors
     */
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * Getter for number of passengers
     * @return number of passengers
     */
    public int getNumPassengers() {
        return numPassengers;
    }

    /**
     * Returns a string representation of the car
     * Format: "[#]-door [make] [model] with license [plate]"
     */
    @Override
    public String toString() {
        return numDoors + "-door " + getMake() + " " + getModel() +
               " with license " + getPlate();
    }
    
    /**
     * Determines whether two Car objects are equal.
     * Cars are equal if the Vehicle portion is equal
     * and the number of doors and passengers are equal.
     * 
     * @param obj object to compare
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car other = (Car) obj;

        return super.equals(other)
                && this.numDoors == other.numDoors
                && this.numPassengers == other.numPassengers;
    }

    /**
     * Returns a copy of this Car.
     * 
     * @return copied Car object
     */
 
    public Car copy() {
        return new Car(
                getMake(),
                getModel(),
                getPlate(),
                numDoors,
                numPassengers
        );
    }
}
	