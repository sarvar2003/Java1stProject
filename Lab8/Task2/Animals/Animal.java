package Animals;

public abstract class Animal {
    String name;
    int age;
    int weight
            ;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
    abstract void getVoice();

}

interface AnimalBehavior {
    void sleep();
}

interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " moves");
    }
}

interface AnimalName {
    static void name(String name) {
        System.out.println("Name is: " + name);
    }
}

