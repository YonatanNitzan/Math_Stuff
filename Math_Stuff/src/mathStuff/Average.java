package mathStuff;

import java.util.LinkedList;
import java.io.IOException;

public class Average extends Math_Ops{

	static LinkedList<Float> inputs = new LinkedList<Float>();
	private float input, sum;
	private double avr;
	
	public Average()
	{
		main();
	}
    
	protected void main() {
		while(true)
        {
        	try
        	{
	        	System.out.print("Enter a number: ");
				input = Main_Activity.scanner.nextFloat();
		        inputs.add(input);
        	}
        	catch(Exception e)
        	{
        		break;
        	}
        }
        
        for (double i: inputs)
        {
           sum += i;
        }
        
        avr = sum / inputs.size();
        
        System.out.println("\nThe average is: " + avr);
        
		System.out.print("\nPress \"ENTER\" to return to the main menu...");
		try
		{
			System.in.read(new byte[2]);
			Main_Activity.str = Main_Activity.scanner.next();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}

}