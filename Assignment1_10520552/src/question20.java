import java.util.Scanner;

public class question20 {
    public static void main ( String[] args )
	{
		Scanner KEYBOARD = new Scanner(System.in);
		double mass, kilogram, BMI;
                double inches, pounds;
		
		System.out.print( "Your height in m: " );
		mass = KEYBOARD.nextDouble();
		
		System.out.print( "Your weight in kg: ");
		kilogram = KEYBOARD.nextDouble();
		
		BMI = kilogram / (mass*mass);
		
		System.out.println( "Your BMI is " + BMI );
	
	}
        
}
