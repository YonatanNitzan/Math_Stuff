package mathStuff;

import java.io.IOException;

public class Middle_Point extends Math_Ops {
	
	private float x1, y1, x2, y2;
	private String midPoint;
	private boolean execute = true;
	
	public Middle_Point()
	{
		main();
	}
	
	protected void main()
	{
		try
		{
			System.out.print("Enter the x coordinates of the first dot: ");
			x1 = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the y coordinates of the first dot: ");
			y1 = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the x coordinates of the second dot: ");
			x2 = Main_Activity.scanner.nextFloat();
			System.out.print("Enter the y coordinates of the second dot: ");
			y2 = Main_Activity.scanner.nextFloat();
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
		
		midPoint = String.format("(%.2f,%.2f)", (x1+x2)/2, (y1+y2)/2);
		
		if(execute)
		{
			System.out.println("\nThe middle point is: " + midPoint);
			
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
