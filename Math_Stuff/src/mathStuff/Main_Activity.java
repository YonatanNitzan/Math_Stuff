package mathStuff;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_Activity {

	static Scanner scanner = new Scanner(System.in);
	static String str;
	static Boolean run = true;
	static LinkedList<String> operations = new LinkedList<String>();
	private static int num;
	private static int toolNum;
	
	public static void main(String[] args)
	{
		try
		{
			operations.add("Average");
			operations.add("Circle equation");
			operations.add("Distance between dots");
			operations.add("Distance between parallel lines");
			operations.add("Distance from line");
			operations.add("Formulas roots");
			operations.add("Fraction to decimal");
			operations.add("Middle point");
			operations.add("Parabola");
			operations.add("Relative distribution");
			operations.add("Root to Decimal");
		}
		catch(Exception e)
		{
			
		}
		
		for (int i = 0; i < operations.size(); i++)
		{
			System.out.println((i+1) + " - " + operations.get(i));
		}
	
		while(run)
		{
			toolNum = getToolNumber();
			Math_Ops.pickActivity(toolNum);
		}
	}
	
	private static int getToolNumber()
	{
		System.out.print("\nEnter the number of the tool you want to use: ");
		
		try
		{
			num = scanner.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("\nThat is not a number.");
			System.out.print("Press \"ENTER\" to continue...");
			try
			{
				System.in.read(new byte[2]);
				str = scanner.next();
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
			getToolNumber();
		}
		return num;
	}
	
	public static void error()
	{
		System.out.println("Sorry, there is no tool in this number.");
		System.out.print("Press \"ENTER\" to continue...");
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