package BootCamp.OOPS;

abstract class Bird {
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle fly at great heights");
    }
}

class SerpentEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Serpent Eagle hunts over mountains");
    }
}


class GoldenEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("GOlden Eagle hunts over oceans");
    }
}

class Reference {
    static void permit(Bird b) {
        b.eat();
        b.fly();
    }
}



public class AbstractionExample {
    public static void main(String[] args) {
        SerpentEagle se = new SerpentEagle();
        GoldenEagle ge = new GoldenEagle();

        Reference.permit(se);
        Reference.permit(ge);



    }


}
