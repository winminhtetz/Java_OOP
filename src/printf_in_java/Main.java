package printf_in_java;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hi World!");
        System.out.print("Hello World!");
        System.out.print("Mingalar Par");
        System.out.print("Hey!");

        System.out.println("Okay");
        System.out.println("This is println");
        int currentYear = 2022;
        System.out.println("Using Concat : Current Year is " + currentYear);//concat
        System.out.println("Next Year is 2023");//concat
        System.out.println("Previous Year is 2021");//concat
        //println, print, printf
        System.out.print("This is print1.");
        System.out.print("This is print2.");
        System.out.print("This is print3.");
        System.out.println();

        //Current Year is 2022
        System.out.printf("Using Printf : Current Year is %d.",currentYear);
        System.out.println();

        //String == %s
        //int == %d
        //double == %f
        //char == %c
        //boolean == %b

        char kaGyi = 'က';
        System.out.println("KaGti in Burmese " + kaGyi);
        System.out.printf("KaGyi in Burmese %c", kaGyi);
        System.out.println();
        System.out.printf("KaGyi in Burmese %c and current year is %d",kaGyi,currentYear);
        System.out.println();
        System.out.println("KaGyi in Burmese " + kaGyi + " and current year is "+ currentYear);
    }
}
