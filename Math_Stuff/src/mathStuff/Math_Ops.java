package mathStuff;

import java.io.IOException;

public class Math_Ops {
	// TODO: Add history
	
	protected void main()
	{
		System.out.println("Sorry, This tool is not yet available...");
		System.out.print("Press \"ENTER\" to try again...");
		try
		{
			System.in.read(new byte[2]);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void pickActivity(int a)
	{
		try
		{
			System.out.println("You picked: " + Main_Activity.operations.get(a-1) + "\n");
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		switch(a)
		{
		case 1:
			@SuppressWarnings("unused")
			Average avr = new Average();
			break;
			
		case 2:
			@SuppressWarnings("unused")
			Circle_Equation circle = new Circle_Equation();
			break;
			
		case 3:
			@SuppressWarnings("unused")
			Distance_Between_Dots dis = new Distance_Between_Dots();
			break;
			
		case 4:
			@SuppressWarnings("unused")
			Distance_Between_Parallel_Lines disBetweenLines = new Distance_Between_Parallel_Lines();
			break;
		
		case 5:
			@SuppressWarnings("unused")
			Distance_From_Line disFromLine = new Distance_From_Line();
			break;
			
		case 6:
			@SuppressWarnings("unused")
			Formulas_Roots formulasRoots = new Formulas_Roots();
			break;
			
		case 7:
			@SuppressWarnings("unused")
			Fraction_To_Decimal fracToDec = new Fraction_To_Decimal();
			break;
			
		case 8:
			@SuppressWarnings("unused")
			Middle_Point midPoint = new Middle_Point();
			break;
			
		case 9:
			@SuppressWarnings("unused")
			Parabola parabola = new Parabola();
			break;
			
		case 10:
			@SuppressWarnings("unused")
			Relative_Distribution relativeDis = new Relative_Distribution();
			break;
			
		case 11:
			@SuppressWarnings("unused")
			Root_To_Decimal rootToDec = new Root_To_Decimal();
			break;
			
		case 666:
			System.out.print("Terminating... \nIn ");
			for (int i = 5; i > 0; i--)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Terminated");
			Main_Activity.run = false;
			break;
			
		default:
			Main_Activity.error();
			break;
		}
	}
}