package BootCamp.OOPS;


class Animal {
	void eat() {
		System.out.println("Animal can eat so many");
	}
}

class wildAnimal extends Animal {
	void eat() {
		System.out.println("wild animal is wild");
	}
	void kill() {
		System.out.println("I will kill all the animals");
	}
}

class vegAnimal extends Animal {
	void eat() {
		System.out.println("i am vegetarian");
	}
	void iDontKill() {
		System.out.println("i wont kill anyone");
	}
}

public class PolymorphismExampleOne {
	public static void main(String[] args) {
		wildAnimal wa = new wildAnimal();
		vegAnimal  va = new vegAnimal();
		
		Animal a;
		a = wa;
		
		// down casting : converting parent type reference to child type
		((wildAnimal)(a)).kill();
		a.eat();
		a = va;
		a.eat();
		((vegAnimal)(a)).iDontKill();
		
	}

}
