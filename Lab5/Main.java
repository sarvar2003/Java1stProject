import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        CreateArray();
//        findMinMax();
//        twoDArray();
//        concatStrings();
//        isPalindrome();
        String str1 = "ONE";
        String str2 = "TWO";
        str1 = str2;
        System.out.println(str1 == str2);
    }
    static void CreateArray(){
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = array.length - 1 - i;
        }

        for (int element: array) {
            System.out.println(element);
        }

    }
    static void findMinMax(){
        Random rand = new Random();
        int[] array = new int[10];

        int max = -1;
        int min = 101;

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(1,100);
            if (array[i] > max)max = array[i];
            if (array[i] < min)min = array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Max value is: " + max + "\nMin value is: " + min);

    }

    static void twoDArray(){
        int[][] matrix = new int[10][10];

        int sumDiagonal = 0;
        for (int i = 0; i < matrix.length; i++){
            matrix[i][i] = i;
            sumDiagonal += matrix[i][i];
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\nThe sum of diagonal elements of the matrix is: " + sumDiagonal);
    }

    static void concatStrings(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Please enter the second string: ");
        String str2 = sc.nextLine();

        System.out.println(str1 + " " + str2 + ": " + str1.concat(str2));
        System.out.println(str2 + " " + str1 + ": " + str2.concat(str1));

        boolean isAlternate = str1.equals(str2);

        if (isAlternate) System.out.println("The concatenate of two strings is alternate");
        else System.out.println("The concatenate of two strings is not alternate");
    }

    static void isPalindrome(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();
        String strReversed = "";

        for (int i = str.length()-1; i >= 0; i--){
            strReversed += str.charAt(i);
        }
        System.out.println(strReversed);
        if (str.equals(strReversed)) System.out.println("The string is palindrome");
        else System.out.println("The string is not palindrome");
    }

}