import java.util.Scanner;

public class question18 {
    public static void main(String[] args){
        Scanner KEYBOARD = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Hello. What is your name? ");
        name = KEYBOARD.next();
        
        System.out.println();
        
        System.out.print("Hi, " + name +"! How old are you? ");
        age = KEYBOARD.nextInt();
        
        System.out.println();
        
        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?" );
        System.out.print("And five years ago you were " + (age-5)  + "! Imagine that!");
    }
}
