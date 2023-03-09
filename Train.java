import java.util.ArrayList;

/**
    * Ties Car, Engine, and Passenger classes together in public class
    * @param args The program's arguments.
    */
public class Train {
    private final Engine engine;
    private ArrayList<Car> carsAttached;
    FuelType fuelType;
    double fuelCapacity;
    int nCars;
    int passengerCapacity; 
    int seatsRemaining = 0;

    /**
        * The train public class with its fuel details - with fuel type and fuel capacity, number of cars, and amount of the people that can fit in the entine train
        * @param fuelType The type of fuel the train is using.
        * @param fuelCapacity The amount of fuel the train can hold.
        * @param nCars The number of cars attached to the train.
        * @param passengerCapacity The maximum amount of people that can fit in a train car.
        */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        
        this.engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached = new ArrayList<Car>();
        for (int i=0; i<nCars; i++) {
            this.carsAttached.add(new Car(passengerCapacity));
        }
    }

    /**
        * The getter for the Engine class
        * @return The methods within the Engine class.
        */
    public Engine getEngine(){
        return this.engine;
    }

    /**
        * The getter for the Car class
        * @throws RuntimeException When the value of i exceeds the amount of cars currently attached to the train when asked
        * @return The cars currently attached to the train.
        */
    public Car getCar(int i){
        
        if (i>carsAttached.size()) {
            throw new RuntimeException("'i' value is out of range. This train doesn't have this many cars attached. It actually has" + carsAttached.size() + "cars.");
        }
        return this.carsAttached.get(i);
    }

    /**
        * The getter for the getMaxCapacity method.
        * @return The maximum capacity of all the train cars.
        */
    public int getMaxCapacity(){
        int getMaxCapacity_value = 0; 
        for (int i=0; i<carsAttached.size(); i++) {
            getMaxCapacity_value = getMaxCapacity_value + carsAttached.get(i).getCapacity();
        }
        return getMaxCapacity_value;
    }

    /**
        * The getter for the seatsRemaining method.
        * @return The seats remaining in the train car.
        */
    public int seatsRemaining(){
        int seatsRemaining_value = 0; 
        for (int i=0; i<carsAttached.size(); i++) {
            seatsRemaining_value = seatsRemaining_value + carsAttached.get(i).seatsRemaining();
        }
        return seatsRemaining_value;
    }

    /**
        * Prints the names of all the passengers onboard each train car.
        */
    public void printManifest(){
        for (int i=0; i<this.carsAttached.size(); i++){ 
            carsAttached.get(i).printManifest();
        }
    }


    public static void main(String[] args) {
        Train mytrain = new Train(FuelType.ELECTRIC, 50, 2, 6);

        //add cars with different capacities
        Car myCar = new Car(10);
        Car car1 = new Car(2);
        Car car2 = new Car(5);

        // add passegers with specified names
        Passenger Abbey = new Passenger("Abbey");
        Passenger Elli = new Passenger("Elli");
        Passenger Andrea = new Passenger("Andrea");

        //add passengers to designated cars 
        car1.addPassenger(Abbey);
        car2.addPassenger(Elli);
        myCar.addPassenger(Andrea);

        //prints manifest as well as who is in the car
        myCar.printManifest();
        car1.printManifest();
        car2.printManifest();
        System.out.println(mytrain);
      }
}

