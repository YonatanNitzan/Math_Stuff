package mathStuff;

import java.io.IOException;

public class Distance_From_Line extends Math_Ops {
	
	private float x, y, a, b, c;
	private double distance;
	private boolean execute = true;
	
	public Distance_From_Line()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter the x coordinates of the dot: ");
			x = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the y coordinates of the dot: ");
			y = Main_Activity.scanner.nextFloat();
			System.out.print("Enter X's factor: ");
			a = Main_Activity.scanner.nextFloat();
			System.out.print("Enter Y's factor: ");
			b = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the free number: ");
			c = Main_Activity.scanner.nextFloat();
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
		
		if(b == 0)
		{
			if(a == 1)
				distance = Math.abs(x - c);
			
			else
			{
				System.out.println("\nThat is not a function");
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
		}
		
		else
			distance = Math.abs(a*x + b*y + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		if(execute)
		{
			System.out.printf("\nThe distance is: %.2f\n", distance);
			
			System.out.print("Press \"ENTER\" to return to the main menu...");
			try
			{
				System.in.read(new byte[2]);
			}
			catch (IOException e2)
			{
				e2.printStackTrace();
			}
		}
	}
}