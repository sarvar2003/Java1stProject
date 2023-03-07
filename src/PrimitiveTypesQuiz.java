public class PrimitiveTypesQuiz {
    public static void main(String[] args) {
 //1. what will be printed to the console after this program runs:
//    System.out.println('a' + 'A');
// Ans: 162
      
//2.  System.out.println("\"");
// Ans: "
//      System.out.println("what will be the result of this addition? " + 1 + 2 + 3);
// Ans: 123
      
//3.  System.out.println(1 + 2 + 3 + " and what the result will be here?");
// Ans: 6

//4.  System.out.println("what will be the result of this addition? " + (1 + 2 + 3));
// Ans: 6
        
//5.  boolean boolExample = !(true);
//    System.out.println(boolExample);
// Ans: false
      
//6.  byte data type, so 8 bit integer
//    byte by = (byte)135;
//    System.out.println(by);
// Ans: -121
      
//7.   byte bySecond = (byte)256;
//     System.out.println(bySecond);
// Ans: 0
      
//8.   why is there a mistake here?
//     int i = 12345678901234567;
// Ans: The number is too large for integer type
      
// 9.  why is there a mistake here?
//     long lg = 12345678901234567;
// Ans: Java still considering it as int and it is too large for int, we should add "L" at the end to make it type long
      
//10.   what's going on here
//      char c =  0x6d;
//      char d =  0155;
//      System.out.println(c + " = " + d);
//
//      double roundingExample = 2.0 - 1.9;
//      System.out.println(roundingExample);
//
//11.   find the value of a variable
//      int a = 1000000000;
//      System.out.println("Here the variable has a value: " + a);
//Ans: 1000000000
      
//      a += 1000000000;
//      System.out.println("Here the variable has a value: " + a);
//Ans: 2000000000
        
//      a += 1000000000;
//      System.out.println("Here the variable has a value: " + a);
//Ans: -1294967296
        
//      a += 1000000000;
//      System.out.println("Here the variable has a value: " + a);
//Ans: -294967296
        
//12.   what will be printed to the console after this program runs:
//      System.out.println(2147483647 + 1);
//      System.out.println(2147483647L + 1);
//Ans: -2147483648 ; 2147483648
      
//      int value = 12_346_789;
//      System.out.println("Value of a variable is: " + value);
//Ans: 12346789
        
//      int x1 = 40;
//      int y1 = 10;
//
//      x1 += y1;
//      System.out.println("Now x1 has value: " + x1);
//Ans: 50
        
//      x1 =+ y1;
//      System.out.println("Now x1 has value: " + x1);
//Ans: 10
        
//      int x = 899;
//      short y = 10;
//
//      x = y;
//
//      System.out.println(x);
//Ans: 10
        
    }
}
