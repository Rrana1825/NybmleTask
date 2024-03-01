package TravelPackage;

import java.util.ArrayList;
import java.util.List;


public class TravelPackage {
	private String name;//name here is the travel package name
	private int capacity;
	private List<DesinationClass> itinerary;
	private List<PassangerDetails> passengers;
	
	
	//constructor
	public TravelPackage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }
	
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public List<DesinationClass> getItinerary() {
		return itinerary;
	}
	public void setItinerary(List<DesinationClass> itinerary) {
		this.itinerary = itinerary;
	}
	
	public List<PassangerDetails> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassangerDetails> passengers) {
		this.passengers = passengers;
	}
	
	
	public void addDestination(DesinationClass destination) {
        itinerary.add(destination);
    }
    public void addPassenger(PassangerDetails passenger) {
        passengers.add(passenger);
    }
    
    
	// Implement printItinerary method
	public void printItinerary() {
	     System.out.println("Package name : "+ this.getName());
	     for(DesinationClass destination : itinerary) {
	    	 System.out.println("Destination name : "+ destination.getName());
	    	 int i = 1;
	    	 for(ActivityClass acti : destination.getActivities()) {
	    		 System.out.println("Activity "+ i);
	    		 System.out.println("Activity name : "+ acti.getName());
	    		 System.out.println("Activity Description : "+ acti.getDescription());
	    		 System.out.println("Activity Cost : "+ acti.getCost());
	    		 System.out.println("Activity Capacity : "+ acti.getCapacity());
	    		 i++;
	    	 }
	     }
	 }
     
	// Implement printPassengerList method
	public void printPassengerList() {
		System.out.println("Package name : "+ this.getName());
		System.out.println("Package Capacity : "+ this.getCapacity());
		System.out.println("Package Enrolled : "+ this.getPassengers().size());
		int i = 1;
		for(PassangerDetails passenger : passengers) {
			System.out.println("Passeneger "+ i + " : "+ passenger.getName() + " - " + passenger.getId());
			i++;
		}
    }

	// Implement printAvailableActivities method
    public void printAvailableActivities() {
		for(DesinationClass desi : itinerary) {
			for(ActivityClass acti : desi.getActivities()) {
				if(acti.getCapacity() > 0) {
					System.out.println("Activity name : " + acti.getClass());
					System.out.println("Activity Description : " + acti.getDescription());
					System.out.println("Activity name : " + acti.getCapacity());
				}
			}
		}
	}
    
    //Implement printPassengerDetails methods
    public void printPassengerDetails(int passengerNumber) {
        System.out.println("Passenger Details:");
        for (PassangerDetails passenger : passengers) {
            if (passenger.getId() == passengerNumber) {
                System.out.println("Name: " + passenger.getName());
                System.out.println("ID: " + passenger.getId());
                if (!passenger.getCardType().equals("premium")) {
                    System.out.println("Balance: " + passenger.getBalance());
                }
                System.out.println("Activities:");
                for (ActivityClass activity : passenger.getActivities()) {
                    System.out.println("- " + activity.getName() + " (Destination: " +
                                       findDestinationByActivity(activity).getName() + ", Cost: " + activity.getCost() + ")");
                }
                return;
            }
        }
        System.out.println("Passenger not found with ID: " + passengerNumber);
    }

    private DesinationClass findDestinationByActivity(ActivityClass activity) {
        for (DesinationClass destination : itinerary) {
            if (destination.getActivities().contains(activity)) {
                return destination;
            }
        }
        return null;
    }

}
