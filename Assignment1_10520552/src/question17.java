import java.util.Scanner;

public class question17 {
     public static void main ( String[] args )
	{
		Scanner KEYBOARD = new Scanner(System.in);
		String firstName, lastName, loginID;
                int grade,studID;
                double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.print("First name: ");
                firstName = KEYBOARD.next();
		
		System.out.print("Last name: ");
		lastName = KEYBOARD.next();
                
                System.out.print("Grade (9-12): ");
                grade = KEYBOARD.nextInt();
                
                System.out.print("Student ID: ");
                studID = KEYBOARD.nextInt();
                
                System.out.print("Login: ");
                loginID = KEYBOARD.next();
                
                System.out.print("GPA (0.0-4.0): ");
                GPA = KEYBOARD.nextDouble();
                
		System.out.println("Your Information:");
		System.out.println("\t\tLogin:\t" + login);

		System.out.println("\t\tID:\t" + studID);
		System.out.println("\t\tName:\t" + lastName +", " + firstName);	
		System.out.println("\t\tGPA:\t" + GPA);
		System.out.println("\t\tGrade:\t" + grade);
	
	}
}
