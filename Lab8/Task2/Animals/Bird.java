package Animals;


public class Bird extends Animal{

    String featherColor;
    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void fly(int height){
        System.out.println("The bird with " + getFeatherColor() + " is flying at " + height + " metres.");
    }

    @Override
    public void eat(){
        System.out.println("Bird is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Bird is singing...");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Name='" + name + '\'' +
                "Color of feather='" + featherColor + '\'' +
                '}';
    }
}
