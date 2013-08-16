package chapter.two.hello_world;

public class WorldGen {
	//Declaring variables, default name to Earth
	String planetName = "Earth";
	int planetMass;
	double planetGravity;
	int planetColonies;
	long planetPopulation;
	int planetBases;
	int planetMilitary;
	boolean planetProtection;
	
	public WorldGen (String name,int mass, double gravity) {
		planetName = name;
		planetMass = mass;
		planetGravity = gravity;
		planetColonies = 0;
		planetPopulation = 0;
		planetBases = 0;
		planetMilitary = 0;
		planetProtection = false;		
	}
	
	void setPlanetColonies (int numColonies) {
		planetColonies += numColonies;
	}
	
	void setPlanetMilitary (int numBases) {
	planetBases += numBases;
	}
	
	void turnForceFieldOn() {
		planetProtection = true;
	}
	
	void turnForceFieldOff() {
		planetProtection = false;
	}
	
	void setColonyImmigration (int numColonists) {
		planetPopulation += numColonists;
	}
	
	void setBaseProtection (int numForces) {
		planetMilitary += numForces;
	}
}
