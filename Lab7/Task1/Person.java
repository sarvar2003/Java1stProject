import java.util.Scanner;


interface Salary{
    double salaryToPay(double hours, double rate);

    default double salaryForOvertime(double overtimeHours, double rate) {return overtimeHours * rate;}

    static boolean shouldRecieveBonus(int yearsOfExperience){
        return yearsOfExperience > 5;
    }
}

public class Person implements Salary{
    String surname;
    String firstname;
    String street;
    String zipCode;
    String city;

    void initialize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surname: ");
        surname = sc.nextLine();
        System.out.println("Enter firstname: ");
        firstname = sc.nextLine();
        System.out.println("Enter street: ");
        street = sc.nextLine();
        System.out.println("Enter zipCode: ");
        zipCode = sc.nextLine();
        System.out.println("Enter city: ");
        city = sc.nextLine();
    }

    void print(){
        System.out.println("Surname: " + surname);
        System.out.println("Firstname: " + firstname);
        System.out.println("Street: " + street);
        System.out.println("zipCode: " + zipCode);
        System.out.println("City: " + city);

    }

    @Override
    public double salaryToPay(double hours, double rate) {
        return hours * rate;
    }


}
