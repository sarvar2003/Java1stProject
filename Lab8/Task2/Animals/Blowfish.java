package Animals;

public class Blowfish extends Fish {
    String scaleColor;

    public Blowfish(String name, int age, int weight, String offspirng, String scaleColor) {
        super(name, age, weight, offspirng);
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void swim(int speed) {
        System.out.println("The blowfish is swimming " + speed + " metres per second.");
    }

    @Override
    public void eat() {
        System.out.println("The blowfish is eating...");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish has no ability produce voice.");
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "name='" + name + '\'' +
                "scaleColor='" + scaleColor + '\'' +
                '}';
    }
}
