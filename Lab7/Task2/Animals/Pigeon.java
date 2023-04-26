package Animals;

public class Pigeon extends Bird{
    String species;

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void fly(int height){
        System.out.println("The " + getSpecies() + " pigeon  is flying at " + height + " meters.");
    }

    @Override
    public void eat(){
        System.out.println("Pigeon is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon is singing...");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "Name='" + name + '\'' +
                "Species='" + species + '\'' +
                '}';
    }
}
