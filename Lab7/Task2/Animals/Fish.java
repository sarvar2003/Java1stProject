package Animals;

public class Fish extends Animal{

    String offspring;
    public Fish(String name, int age, int weight, String offspring) {
        super(name, age, weight);
        this.offspring = offspring;
    }

    public String getOffspring() {
        return offspring;
    }

    public void setOffspring(String offspring) {
        this.offspring = offspring;
    }

    public void swim(int speed){
        System.out.println("A fish is swimming " + " metres per second.");
    }

    @Override
    public void eat(){
        System.out.println("Fish is eating.");
    }

    @Override
    public void getVoice(){
        System.out.println("Some fish have voice but mostly they are dead silent...");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "Name='" + name + '\'' +
                "Number of offsprings='" + offspring + '\'' +
                '}';
    }
}
