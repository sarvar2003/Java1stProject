import java.util.Scanner;

public class Staff extends Person{
    String education;
    String position;

    void initialize1() {
        super.initialize();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter education: ");
        education = sc.nextLine();
        System.out.println("Enter position: ");
        position = sc.nextLine();
    }

    void print1(){
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}
