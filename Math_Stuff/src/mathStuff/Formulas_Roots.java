package mathStuff;

import java.io.IOException;

public class Formulas_Roots extends Math_Ops {
	
	float a, b, c;
	double x1, x2;
	boolean execute = true;
	String result;
	
	public Formulas_Roots()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter A: ");
			a = Main_Activity.scanner.nextFloat();
			System.out.print("Enter B: ");
			b = Main_Activity.scanner.nextFloat();
			System.out.print("Enter C: ");
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
			
		x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / 2*a;
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / 2*a;
		
		if(x1 == x2)
		{
			if(a == 0)
				x1 = c / -b;
			result = String.format("\nX = %.2f", x1);
		}
		
		else if((Math.pow(b, 2) - 4*a*c) < 0)
		{
			System.out.println("\nThat not possible");
			System.out.print("Press \"ENTER\" to try again...\n");
			try
			{
				System.in.read(new byte[2]);
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
			main();
			execute = false;
		}
			
		else
			result = String.format("\nX1 = %.2f\nX2 = %.2f", x1,x2);	
		
		if(execute)
		{
			System.out.println(result);
			
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