package BootCamp.OOPS;


class Plane {
	void takeOff() {
		System.out.println("Plane is flying");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}

class cargoPlane extends Plane {
	
	void fly() {
		System.out.println("Cargo plane is flying at low heights");
	}
	
	void carryCargo() {
		System.out.println("cargo plane carrying cargo");
	}
}

class passengerPLane extends Plane {
	
	void fly() {
		System.out.println("Cargo plane is flying at low heights");
	}
	
	void carryPassengers() {
		System.out.println("Passenger plane carrying passengers");
	}
	
}

class fighterPlane extends Plane {
	
	void fly() {
		System.out.println("Cargo plane is flying at low heights");
	}
	
	void carryWeapons() {
		System.out.println("Fighter plane carrying Weapons");
	}

}


public class InheritancePLANEexample {
	public static void main(String[] args) {
		cargoPlane cp = new cargoPlane();
		cp.fly();
		cp.takeOff();
		cp.carryCargo();
		cp.land();
	}
}
























