package Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Kopaysin", 5, 150, true);
        animals[1] = new Dog("Simba", 3, 25, true, "German Shepherd");
        animals[2] = new Bird("Canary", 2, 1, "green");
        animals[3] = new Pigeon("Cutie", 2, 1, "white", "Mourning Dove");
        animals[4] = new Fish("Nemo", 1, 2, "15");
        animals[5] = new Blowfish("Bob", 1, 1, "10", "brownish");

        animals[4].getVoice();

        Dog dog = new Dog("Simba", 3, 25, true, "German Shepherd");
        dog.run(100);
    }
}
