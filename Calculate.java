import java.util.*;
class Stock
{
	private String symbol;
	private String name;
	private double previousClosing;
	private double currentClosing;
	
	public void getval();
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Symbol:");
		symbol = sc.nextLine();
		System.out.println("Enter Name:");
		name = sc.nextLine();
		System.out.println("Enter Previous price:");
		previousClosing = sc.nextFloat();
		System.out.println("Enter Current price:");
		currentClosing = sc.nextFloat();
	}
	public void printval()
	{
		System.out.println("Symbol is :",+Symbol);
		System.out.println("Name is :",+Name);
		System.out.println("previous price is :",+previousClosing);
		System.out.println("current price is :",+currentClosing);
		System.out.println("Percentage change is :",+percChange);
	}
		
	public double getChangePercentage();
	{
		double change;
		double percChange;
		if (currentClosing > previousClosing)
		{
			change = currentClosing-previousClosing;
			percChange = (change/previousClosing)*100;
		}
		else
		{
			change = previousClosing - currentClosing;
			percChange = (change/currentClosing)*100;
		}
			
	}
	
}
class Calculate
{
	public static void main(String arg[])
	{
		Stock s = new Stock();
		s.getval();
		s.printval();
	}
}