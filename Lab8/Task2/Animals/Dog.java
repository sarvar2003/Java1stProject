package Animals;

class Dog extends Mammal implements AnimalMove, AnimalBehavior {
    String breed;

    public Dog(String name, int age, int weight, boolean hasTail, String breed) {
        super(name, age, weight, hasTail);
        this.breed = breed;
    }

    public Dog(String name, int age, int weight, boolean hasTail) {
        super(name, age, weight, hasTail);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void run(int distance){
        System.out.println("The " + getBreed() + " dog is about to run " + distance + " meters.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void getVoice() {
        System.out.println("Bark!");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "breed='" + breed + '\'' +
                '}';
    }

}
