package mathStuff;

import java.io.IOException;

public class Distance_Between_Parallel_Lines extends Math_Ops {
	
	private float a, b, c1, c2;
	private double distance;
	private boolean execute = true;
	
	public Distance_Between_Parallel_Lines()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter X's factor: ");
			a = Main_Activity.scanner.nextFloat();
			System.out.print("Enter Y's factor: ");
			b = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the first free number: ");
			c1 = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the first second number: ");
			c2 = Main_Activity.scanner.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println("\nThat is not a number");
			System.out.print("Press \"ENTER\" to try again...\n");
			try
			{
				System.in.read(new byte[2]);
				Main_Activity.str = Main_Activity.scanner.next();
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
			main();
			execute = false;
		}
		
		distance = Math.abs(c1 - c2) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		if(execute)
		{
			System.out.printf("The distance between the lines is: %.2f\n", distance);
	
			System.out.print("Press \"ENTER\" to return to the main menu...");
			try
			{
				System.in.read(new byte[2]);
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
		}
	}
}