import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        scanner.close();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.printf("\nWidth: %.2f; Length: %.2f;" +
                " \nThe area of the rectangle is: %.2f", width, length, area);
    }
}
