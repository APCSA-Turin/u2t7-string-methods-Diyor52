package U2T7_lab_3;


public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        

        boolean case1 = methods.longerThan("Halloween", 12);
System.out.println(case1);

String case2 = methods.funnyString("Diyor", 3);
System.out.println(case2);

String case3 = methods.halvesReversed("BrooklynTech");
System.out.println(case3);

String case4 = methods.pigLatin("Poodles");
System.out.println(case4);

String case5 = methods.removeCharacter("GoldFish", 5);
System.out.println(case5);

String case6 = methods.insertAt("School", "fun", "o");
System.out.println(case6);

String case7 = methods.endUp("Powder",4);
System.out.println(case7);

String case8 = methods.yellOrWhisper("computer");
System.out.println(case8);

        

    }
}