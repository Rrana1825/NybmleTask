package TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class DesinationClass {
	private String name; //name here is the Destination name 
	private List<ActivityClass> activities;
	
	//Constructor
	public DesinationClass(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ActivityClass> getActivities() {
		return activities;
	}
	public void setActivities(List<ActivityClass> activities) {
		this.activities = activities;
	}
	
	public void addActivity(ActivityClass activity) {
        activities.add(activity);
    }
}
