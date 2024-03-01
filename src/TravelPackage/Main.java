package TravelPackage;

public class Main {
 public static void main(String[] args) {
	 
	 // Test Case 
     // Creating activities
     ActivityClass activity1 = new ActivityClass("Hiking", "Enjoy nature", 50.0, 20);
     ActivityClass activity2 = new ActivityClass("Scuba Diving", "Explore underwater world", 100.0, 10);

     // Creating destinations
     DesinationClass destination1 = new DesinationClass("Mountain Resort");
     destination1.addActivity(activity1);
     DesinationClass destination2 = new DesinationClass("Beach Resort");
     destination2.addActivity(activity2);

     // Creating passengers
     PassangerDetails passenger1 = new PassangerDetails("John", 1, "standard", 200.0);
     PassangerDetails passenger2 = new PassangerDetails("Alice", 2, "gold", 300.0);
     PassangerDetails passenger3 = new PassangerDetails("Bob", 3, "premium", 0.0);

     // Creating a travel package
     TravelPackage travelPackage = new TravelPackage("Adventure Package", 50);
     travelPackage.addDestination(destination1);
     travelPackage.addDestination(destination2);
     travelPackage.addPassenger(passenger1);
     travelPackage.addPassenger(passenger2);
     travelPackage.addPassenger(passenger3);

     // Creating TravelPackageManager
     TravelPackageManager packageManager = new TravelPackageManager();
     packageManager.addPackage(travelPackage);

     // Testing methods
     packageManager.printItinerary("Adventure Package");
     System.out.println();
     packageManager.printPassengerList("Adventure Package");
     System.out.println();
     packageManager.printPassengerDetails("Adventure Package", 1);
     System.out.println();
     packageManager.printAvailableActivities("Adventure Package");	 
 }
}

