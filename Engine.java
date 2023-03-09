public class Engine {
    FuelType fuelType; //private fuel type attribute
    double fuelLevel; //double currect fuel level when asked
    double fuelCapacity; //double the maximum fuel level 

    /** 
         * Contains variables for the fuel type, maximum fuel level, and the train's current fuel level
         * @param fuel_type The train's fuel type.
         * @param maximum_fuel_level The train's maximum fuel level.
         * @param current_fuel_level The train's current fuel level.
         */
    public Engine(FuelType fuelType, double fuelCapacity){ //constructor
        this.fuelType = fuelType; 
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelCapacity;
    }

    /**
         * Getter for the maximum fuel level method
         * @return the maximum fuel level of the train
         */
    public double getFuelLevel(){ //accessor, the "getter"
        return this.fuelLevel; 
    }

    /**
         * Getter for the current fuel level
         * @return The current fuel level of the train
         */
    public double getFuelCapacity(){ //accessor, the "getter"
        return this.fuelCapacity;
    }

    /**
         * Refuels the train, setting the train's current fuel level to its maximum by increasing
         */
    public void refuel(){ //methods of refuel 
    this.fuelLevel = this.fuelCapacity; 
    }

    /** 
         * Simulates the train's fuel level depleting over time at 10 percent increments. Throws an exception when the train's current fuel level reaches 0
         * @throws RuntimeException When the train runs out of fuel.
         */
    public void go(){ //methods of how much fuel is left, remaining fuel
        if(fuelLevel > 0){
           this.fuelLevel -= this.fuelCapacity*0.1; //decrease fuel level by 10% each time
           System.out.println("The remaining fuel level is:" + fuelLevel); 
        }
        else {
            throw new RuntimeException ("Out of fuel"); //will only print when fuel level is 0 given it doesn't go into the else function
        }


    }

}
