import java.util.ArrayList;

/**
     * Contains Passenger class objects
     * @param arguments The program's arguments
     */
public class Car {
    ArrayList<Passenger> passengersOnboard;  //attribute for passengers on board
    int maxCapacity; //attribute for max capacity on car

    /**
         * Stores the amount of people on the train in am array list as well as maxiumum capacity
         * @param passengers_onboard The numeber of passengers on the train
         * @param maximum_capacity The maximum number of people that can be on the train at once
         */
    public Car(int maxCapacity){ //constructor
        this.passengersOnboard = new ArrayList<Passenger>();
        this.maxCapacity = maxCapacity;
    }
    
    /**
         * Getter for the maximum capacity of people on the entire train, with all cars
         * @return The maximum number of people that can be on the train at once
         */
    public int getCapacity(){ //accessor like methods
        return this.maxCapacity; 
    } 

    /**
         * Calculates and returns the number of remaining seats available on the train
         * @return The remaining number of seats available for passengers
         */
    public int seatsRemaining(){ //accessor like methods
        return maxCapacity - passengersOnboard.size(); 
    } 

    /**
         * Adds passengers to the train in its entirety. 
         * @param p The passenger being added.
         * @throws RuntimeException If the remaining amount of seats is 0.
         * @throws RuntimeException If a passenger who was already added to the train is added again.
         */
    public void addPassenger(Passenger p){
        if (this.seatsRemaining() == 0) {
            throw new RuntimeException("This car is full.");
        } else if (this.passengersOnboard.contains(p)) {
            throw new RuntimeException("This passenger is already onboard this car!");
        }
        else{
            this.passengersOnboard.add(p);
            this.seatsRemaining();
        }
    }

    /**
         * Removes passengers from the train. If a passenger is not on the train, then an exception is thrown, shown below 
         * @param p The passenger being removed.
         * @throws RuntimeException If the information of the passenger being removed does not exist in the passengers_onboard list.
         */
    public void removePassenger(Passenger p){
        if (passengersOnboard.contains(p)){
            throw new RuntimeException("passenger already on board."); //when removing passenger see if passenger is already on board to see if they can be removed

    }
    }

    /**
         * Prints a list of all passengers in a car. If no passengers are in the car, it prints that the car is empty. 
         */
    public void printManifest(){
        if (passengersOnboard.size() == 0){
            System.out.println("this car is empty."); //if passengers on board equals zero then print that the car is empty since there is no one
        }
        else{
            System.out.println("passengers:");
        }
        for (int i = 0; i < passengersOnboard.size(); i++){
            System.out.println(passengersOnboard.get(i) + " "); //prints number of passengers if there is at least one passenger on board
        }
    }
    
}
