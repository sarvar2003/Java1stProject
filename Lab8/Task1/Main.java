public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Staff employee1 = new Staff();

//        employee1.initialize1();
//        employee1.print1();
        System.out.println(person1.salaryToPay(180, 26));
        System.out.println(person1.salaryForOvertime(10, 26));
        System.out.println(Salary.shouldRecieveBonus(6));
    }
}
