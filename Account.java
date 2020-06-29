import java.util.*;
class acc
{
	private int id;
	private double bal;
	private char AccType;
	private String AccClass;
	private double ann_int_rate;
	private double MonthlyIntRate;
	private double MonthlyInterest;
	private int choice;
	private double amt;
	
	public int getChoice()
	{
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter your choice:");
		choice = ch.nextInt();
		return(choice);
	}
	
	public void getval()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID:");
		id = sc.nextInt();
		
		System.out.println("Enter BALANCE:");
		bal = sc.nextFloat();
		
		System.out.println("Enter Account Type Current(c) or Saving(s):");
		AccType =sc.next().charAt(0);
		
		System.out.println("Enter Account Class :Silver :Gold : Platinum:");
		AccClass = sc.next();
		
		System.out.println("Enter Annual Interest Rate :");
		ann_int_rate = sc.nextFloat();
	}
	
	public void getMonthlyIntrestRate()
	{
		MonthlyIntRate = (ann_int_rate / 12) ;
		System.out.println("Monthly Interest Rate is:"+MonthlyIntRate);
		
	}
	
	public void getMonthlyInterest()
	{
		MonthlyInterest = (bal * (ann_int_rate/12));
		System.out.println("Monthly Interest is:"+MonthlyInterest);
	}
	
	public void withdraw()
	{
		Scanner am = new Scanner(System.in);
		amt = am.nextInt();
		if(AccType == 's' )
		{
			if (AccClass.equals("Gold"))
			{
				if(amt >= 25000)
				{	
					if ((bal - amt)>10000)
					{
						System.out.println("Allowed To Withdraw \n");
						bal = (bal - amt);
						System.out.print("Balance after Withdrawal:"+bal);
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
				}	
			}
			else if (amt < 25000)
			{
					if ((bal - amt)>1000)
					{
						System.out.println("Allow To Withdraw:");
						bal = bal - amt;
						System.out.print("Balance after Withdrawal:"+bal);
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
			}	
		}
		else if(AccType == 'c')
		{
				if( bal - amt >= 0 )
				{
					bal = bal - amt;
					System.out.println("New Balance:"+bal);
				}
				else
				{
					System.out.println("Insufficient Balance");
				}				
		}
		
	}
	
	public void deposit()
	{
		Scanner dp = new Scanner(System.in);
		amt = dp.nextInt();
		if(AccType=='s')
		{
			bal = (bal + amt);
			System.out.println("Saving Balance is :" +bal);
		}
		else if(AccType=='c')
		{
			bal = (bal + amt);
			System.out.println("Current Balance is :" +bal);
		}
	}
}	
	class Account
	{
		public static void main(String args[])
		{
			
			acc a = new acc();
			a.getval();
			System.out.println("\n 1:Monthly Interest Rate \n 2:Monthly Interest \n 3:Withdrawal \n 4:Deposit \n"  );
			int ch = a.getChoice();
			switch(ch)
			{
				case 1:
				System.out.println("Get Monthly Interest Rate:");
				a.getMonthlyIntrestRate();
				break;
				case 2:
				System.out.println("Get Monthly Interest:");
				a.getMonthlyInterest();
				break;
				case 3:
				System.out.println("Withdraw:");
				a.withdraw();
				break;
				case 4:
				System.out.println("Deposit:");
				a.deposit();
				break;
				default:
				System.out.println("Invalid Choice");
			}
		}
	}