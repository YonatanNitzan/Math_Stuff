package mathStuff;

import java.util.LinkedList;
import java.io.IOException;

public class Average extends Math_Ops{

	static LinkedList<Double> inputs = new LinkedList<Double>();
	private double input = 0;
	private double sum = 0;
	private double avr = 0;
	
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
				input = Main_Activity.scanner.nextDouble();
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
        
        System.out.println("The average is: " + avr);
		System.out.print("Press \"ENTER\" to continue...");
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