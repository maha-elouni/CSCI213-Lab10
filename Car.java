public class Car extends Vehicle {
	
	public static void main(String[] args) {
    Car car1 = new Car("Honda", "Civic", "BINARY", 2, 5);
    System.out.println(car1);  // 2-door Honda Civic with license BINARY.

    Car car2 = car1.copy();
    System.out.println(car1.equals(car2));  // true
}


    private int doors;
    private int passengers;

    public Car(String make, String model, String plate, int doors, int passengers) {
        super(make, model, plate);
        this.doors = doors;
        this.passengers = passengers;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        return this.doors + "-door " + getMake() + " " + getModel() + " with license " + getPlate() + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Car)) {
            return false;
        }
        Car that = (Car) other;
        return super.equals(that) &&
               this.doors == that.doors &&
               this.passengers == that.passengers;
    }

    public Car copy() {
        return new Car(getMake(), getModel(), getPlate(), this.doors, this.passengers);
    }
}