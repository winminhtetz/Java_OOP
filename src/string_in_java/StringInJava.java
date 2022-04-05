package string_in_java;

public class StringInJava {
    public static void main(String[] args) {
        //char array to string
        char [] message = {'u','n','i','v','e','r','s','e'};
        String str = new String(message);
        System.out.println(str);

        //finding the number of character in a string
        String text = "String is a sequence of character.";
        int strLength = text.length();
        System.out.println(strLength);

        //To Lower case and To Upper Case
        String str3 = "this is a cup.";
        System.out.println(str3);

        String str4 = str3.toUpperCase();
        System.out.println(str4);

        String str5 = "THIS IS A CHAIR";
        System.out.println(str5);

        String str6 = str5.toLowerCase();
        System.out.println(str6);

        // Two ways to create String object:
        //  1. String literal     String name = "Mg Mg";
        //  2. new Keyword        String name = new String("Mg Mg");

        String string1 = "java"; //String literal
        String string2 = new String("java"); //new keyword
        String string3 = "java";

        System.out.println("Comparing two string literal by Using == operator");
        if (string1 == string3){
            System.out.println("string1 is equal to string2.");
        }
        else {
            System.out.println("string1 isn't equal to string2.");
        }

        System.out.println("Comparing two string literal by Using .equals() method");
        if (string1.equals(string3)){
            System.out.println("string1 is equal to string2.");
        }
        else {
            System.out.println("string1 isn't equal to string2.");
        }

        System.out.println("By Using == operator");
        if (string1 == string2){
            System.out.println("string1 is equal to string2");
        }
        else{
            System.out.println("string1 isn't equal to string2");
        }

        System.out.println("By Using equals method");
        if (string1.equals(string2)){
            System.out.println("string1 is equal to string2");
        }
        else{
            System.out.println("string1 isn't equal to string2");
        }








    }
}
