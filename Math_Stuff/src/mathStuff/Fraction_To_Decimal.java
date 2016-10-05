package mathStuff;

import java.io.IOException;

public class Fraction_To_Decimal extends Math_Ops {
	
	private float x, y, decimal;
	private boolean execute = true;
	
	public Fraction_To_Decimal()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter counter: ");
			x = Main_Activity.scanner.nextFloat();
			System.out.print("Enter denominator: ");
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
		
		decimal = x / y;
		
		if(execute)
		{
			System.out.printf("\nThe decimal number is: %.2f\n", decimal);
			
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
