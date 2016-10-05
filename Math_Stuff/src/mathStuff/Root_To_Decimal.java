package mathStuff;

import java.io.IOException;

public class Root_To_Decimal extends Math_Ops {
	
	float x, y;
	boolean execute = true;
	
	public Root_To_Decimal()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter a number: ");
			x = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the number of the root: ");
			y = Main_Activity.scanner.nextFloat();
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
			
		if(execute)
		{
			System.out.println("\nThe result is: " + root(x, y));
			
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
	
	private double root(double a, double b)
	{
		return Math.pow(a, (1/b));
	}
}
