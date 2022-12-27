package benchJavaAssignment;
import java.util.*;


public class benchJavaQuestion1 {
	    public static void main(String[] args) {
		   
		float tempInCel, tempInFah;
		List tempList = new ArrayList<>(); // to hold the temperatures entered by the user 
		char choice;     // to hold 'y' or 'n'
		int count=0;  
		
	    Scanner in = new Scanner(System.in); 
	    // Scanner is a class in java. util package used for obtaining the input of the primitive types like int, double, etc. and strings.
	    
	    do{
	    
	    System.out.println("Enter temperature(in Fahrenheit)");
	    tempInFah = in.nextFloat();

	    tempInCel = ((tempInFah - 32)*5)/9; // Mathematical formula to convert the temperature from fahrenheit to celsius

	    System.out.println("Temperature in Celsius will be " + tempInCel);
	    
	    tempList.add(count,"Temperature in Fahrenite and Celsius are respectively. "+ tempInFah + "   " + tempInCel);
	    count ++;
	   // Get the choice from the user to add more number
        System.out.print("Enter Y for yes or N for no: ");
        choice = in.next().charAt(0);
	    }   
	
	    while ((choice == 'y') || (choice == 'Y'));
        //Exit if user press any other no than y
	    for(int i =0; i < tempList.size() ;i++) {
	    	System.out.println(tempList.get(i));
	    }
	    in.close();
	    
	}
}
