package mathStuff;

import java.io.IOException;

public class Circle_Equation extends Math_Ops {
	
	private float midX, midY, radius;
	private String xSection, ySection, radiusSection;
	private Boolean execute = true;
	
	public Circle_Equation()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter the x coordinates of the circle's middle point: ");
			midX = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the y coordinates of the circle's middle point: ");
			midY = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the circle's radius: ");
			radius = Main_Activity.scanner.nextFloat();
			
			if(midX < 0)
				xSection = String.format("(X + %.2f) + ", -midX);
			else
				xSection = String.format("(X - %.2f) + ", midX);
			
			if(midY < 0)
				ySection = String.format("(Y + %.2f)", -midY);
			else
				ySection = String.format("(Y - %.2f)", midY);
			
			if(radius <= 0)
			{
				System.out.println("\nThat is not a posible radius");
				System.out.println("Press \"ENTER\" to try again...");
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
				radiusSection = String.format(" = %.2f", radius * 2);
			
			if(execute)
				{
				System.out.println("\nThe circle's equation is: " + xSection + ySection + radiusSection);
				
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
		}
		
		
	}
}