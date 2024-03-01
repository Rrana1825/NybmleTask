package TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class PassangerDetails {
	private String name;
	private int id; // id here is passenger number
	private List<ActivityClass> activities;
	private String cardType;
	private double balance;
	
	//constuctor
	public PassangerDetails(String name, int id, String cardType, double balance) {
        this.name = name;
        this.id = id;
        this.cardType = cardType;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<ActivityClass> getActivities() {
		return activities;
	}
	public void setActivities(List<ActivityClass> activities) {
		this.activities = activities;
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		//Assuming Passenger have sufficient balance 
		if(this.getCardType() == "Standard") {
			for(ActivityClass acti : this.getActivities()) {
				this.balance -= acti.getCost();
			}
		}else if(this.getCardType() == "Gold") {
			for(ActivityClass acti : this.getActivities()) {
				this.balance -= (acti.getCost()- 10*acti.getCost()/100);
			}
		}else if(this.getCardType() == "Premium") {
			this.balance = balance;
		}
	}

    public void addActivity(ActivityClass activity) {
        activities.add(activity);
    }

}
