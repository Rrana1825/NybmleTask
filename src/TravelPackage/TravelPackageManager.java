package TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class TravelPackageManager {
	 private List<TravelPackage> packages;

	 
	 //Constructor
	 public TravelPackageManager() {
       this.packages = new ArrayList<>();
     }

	    // Getters and setters
	 public List<TravelPackage> getPackages() {
	      return packages;
     }

	 public void setPackages(List<TravelPackage> packages) {
	      this.packages = packages;
	 }

	 public void addPackage(TravelPackage travelPackage) {
          packages.add(travelPackage);
	 }

	 public void removePackage(TravelPackage travelPackage) {
	      packages.remove(travelPackage);
     }

	 public void printItinerary(String packageName) {
	      for (TravelPackage travelPackage : packages) {
	          if (travelPackage.getName().equals(packageName)) {
	        	  travelPackage.printItinerary();
	              return;
	          }
	      }
	      System.out.println("Travel package not found with name: " + packageName);
	 }

	 public void printPassengerList(String packageName) {
	      for (TravelPackage travelPackage : packages) {
	          if (travelPackage.getName().equals(packageName)) {
	              travelPackage.printPassengerList();
	              return;
	          }
	      }
	      System.out.println("Travel package not found with name: " + packageName);
	 }

	 public void printPassengerDetails(String packageName, int passengerNumber) {
	      for (TravelPackage travelPackage : packages) {
	          if (travelPackage.getName().equals(packageName)) {
	            travelPackage.printPassengerDetails(passengerNumber);
	            return;
	          }
	      }
	      System.out.println("Travel package not found with name: " + packageName);
	 }

	 public void printAvailableActivities(String packageName) {
	     for (TravelPackage travelPackage : packages) {
	          if (travelPackage.getName().equals(packageName)) {
	              travelPackage.printAvailableActivities();
	              return;
	          }
	     }
	     System.out.println("Travel package not found with name: " + packageName);
	 }
}
