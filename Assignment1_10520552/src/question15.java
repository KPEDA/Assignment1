import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner KEYBOARD = new Scanner(System.in);
        
        System.out.println("Give me a word!");
	KEYBOARD.next();
		
	System.out.println("Give me a second word");
	KEYBOARD.next();
		
	System.out.println("Great, now your favorite number?" );
	KEYBOARD.nextInt();
		
	System.out.println("And your second-favorite number...");
	KEYBOARD.nextInt();
                
     System.out.println("Whew! Wasn't that fun?" );
    }
}
