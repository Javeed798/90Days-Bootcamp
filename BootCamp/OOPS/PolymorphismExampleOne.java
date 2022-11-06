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
}

class vegAnimal extends Animal {
	void eat() {
		System.out.println("i am vegetarian");
	}
}

public class PolymorphismExampleOne {

	public static void main(String[] args) {
		wildAnimal wa = new wildAnimal();
		vegAnimal  va = new vegAnimal();
		
		Animal a;
		a = wa;
		a.eat();
		a = va;
		a.eat();
	}

}
