package mathStuff;

import java.io.IOException;

public class Distance_Between_Dots extends Math_Ops {
	
	float x1, y1, x2, y2;
	double distance; 
	
	public Distance_Between_Dots()
	{
		main();
	}
	
	protected void main()
	{
		System.out.print("Enter the x coordinates of the first dot: ");
		x1 = Main_Activity.scanner.nextFloat();
		System.out.print("Enter the y coordinates of the first dot: ");
		y1 = Main_Activity.scanner.nextFloat();
		System.out.print("Enter the x coordinates of the second dot: ");
		x2 = Main_Activity.scanner.nextFloat();
		System.out.print("Enter the y coordinates of the second dot: ");
		y2 = Main_Activity.scanner.nextFloat();
		
		distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
		
		System.out.printf("\nThe distance is: %.2f\n", distance);
		
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
