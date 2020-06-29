import java.util.*;
abstract class person
{
	private String name;
	private String address;
	private String email;
	private int phone;
	private int age;
	person()
	{
		name = "Rowan";
		address = "Default address";
		email = "default.@.gmail.com";
		age = 23;
		phone = 1234567;
		
	}
	person(String s1, String s2)
	{
		this.name = s1;
		this.address = s2;
	}
	public void display()
	{
		System.out.println(name+"   and  "+address+"  and  "+email+"  and  "+age+"  and  "+phone);	
	}
}
	
	class student extends person
	{
		private String status;
		private String course;
		private int PRN;
		private String year;
		student()
		{
			super();
			status = "fresher";
			year = "2019" ;
		}
		student(String n1, String add,String sta,String yea)
		{
			super(name,address);
			this.status = sta;
			this.year = yea;
		}
		
		public void display()
		{
			super.display();
			System.out.println("Status of the student is " +status+ "and year is"+year);
		}
	
	}
	
	abstract class Faculty extends person
	{
		private String spec;
		private String officeName;
		private String DateOfHire;
		private int EmpID;
		protected float Salary = 50000;
		Faculty()
		{
			super();
			spec = "Science";
			officeName = "Sicsr";
			DateOfHire = "1/1/18";
		}
		Faculty(String n1,String add,String s, String of , String dt , int id)
		{
			super(name, address);
			this.spec = s;
			this.officeName = of;
			this.DateOfHire = dt;
			this.EmpID = id;
		}
		public void display()
		{
			super.display();
			System.out.println(officeName+" and "+spec+" and "+DateOfHire);
		}
		abstract void calsal();
		
	}
	class visiting extends Faculty
	{
		private int NoOfHoursTeach;
		private float payment;
		
		visiting(String n1 , String add ,String s, String of , int id, int noh , float pay )
		{
			super(name,address,officeName,EmpID);
			this.NoOfHoursTeach = noh;
			this.payment = pay;
		}
		
		public void calsal()
		{
			Salary = NoOfHoursTeach*payment;
		}
		
	}
	class regular extends Faculty
	{
		regular(String n1 , String add ,String s, String of , int id, float sal )
		{
			super(name,address,officeName,EmpID,Salary);
			
		}
		public void display()
		{
			super.display();
			System.out.println("SALARY IS:"+Salary);
	
		}
	}
	class  DIFF
	{
		public static void main(String arg[])
		{
			person ref;
			ref = new student();
			ref = new student("tom","52 blossom","regular","2019");
			ref.display();
			/*ref.printstu();
			ref = new teacher();
			ref.display();
			ref.printteach();*/
			
			
			
			
		}
	}
