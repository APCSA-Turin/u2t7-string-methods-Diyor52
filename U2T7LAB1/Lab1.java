import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter first string:" );
       String firstString = in.nextLine();
       System.out.print("Enter Second string:" );
       String secondString = in.nextLine();
     
       int len = firstString.length();
       int len2 = secondString.length();
      
       if (len > len2){
        System.out.println(firstString + " is longer");
       }else {
        System.out.println(secondString + " is longer");
       }
       if (len == len2){
        System.out.println("Both have the same length");
       }

    int average1 = len/2;
    
    int average2 = len2/2;
   
    
    String half1_1 = firstString.substring(0, average1);
    String half1_2 = firstString.substring(average1);
    
    String half2_1 = secondString.substring(0,average2);
    String half2_2 = secondString.substring(average2);

    System.out.println("First half: " + half1_1);
    System.out.println("Second half: " + half1_2);
    System.out.println("First half: " + half2_1);
    System.out.println("Second half: " + half2_2);

    int index = firstString.indexOf(secondString);

    if (index == -1) {
        System.out.println(secondString + " is not FOUND in " + firstString);
    }else {
        System.out.println(secondString + " is FOUND in " + firstString + " at index " + index );
    }
    in.close();
    }

}

