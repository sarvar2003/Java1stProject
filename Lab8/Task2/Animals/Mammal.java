package Animals;

public class Mammal extends Animal{

    boolean hasTail;
    public Mammal(String name, int age, int weight, boolean hasTail) {
        super(name, age, weight);
        this.hasTail = hasTail;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public void run(int distance){
        System.out.println("The mammal is about to run " + distance + " metres.");
    }

    @Override
    public void eat(){
        System.out.println("Mammal is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammals have different voices.");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "Name='" + name + '\'' +
                "Has tail='" + hasTail + '\'' +
                '}';
    }
}
