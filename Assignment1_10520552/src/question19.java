import java.util.Scanner;

public class question19 {
    public static void main(String[] args){
        Scanner KEYBOARD= new Scanner(System.in);
        double first, second, third;
        
        System.out.print("U:\\>java DumbCalculator");
        System.out.println();
        System.out.println();
        
        System.out.print("What is your first number? ");
        first = KEYBOARD.nextDouble();
        System.out.println();
        
        System.out.print("What is your second number? ");
        second = KEYBOARD.nextDouble();
        System.out.println();
        
        System.out.print("What is your third number? ");
        third = KEYBOARD.nextDouble();
        System.out.println();
        
        System.out.print("( " + first + " + " + second + " + " + third + " ) / 2 is ...");
        System.out.print((first + second + third) / 2 );
        System.out.println();
        
        
    } 
    
}
