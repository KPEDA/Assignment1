import java.util.Scanner;

public class question16 {
     public static void main ( String[] args )
	{
		Scanner KEYBOARD = new Scanner(System.in);
		String NAME;
                int AGE;
                double EARN;
		
		System.out.println("What is your name?");
		NAME= KEYBOARD.next();
		
		System.out.println("Hi, " + name + "! How old are you?");
		AGE = KEYBOARD.nextInt();
                
                System.out.println("So you're " + age + ", eh? That's not old at all!");
                System.out.println("How much do you make, " + NAME + "?");
                EARN = KEYBOARD.nextDouble();
                
		
		System.out.println(earn+ "I hope that's  per hour and not per year! LOL!");
		
	
	}
}
