//	6. Accept one number from user and print that number of * on screen.

import java.util.*;

class Sample6
{
	void Display(int iNo)
	{
		while(iNo>=1)
		{
			System.out.print("*\t");
			iNo--;
		}
	}
	public static void main(String arg[])
	{
		int iValue=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample6 obj=new Sample6();
		
		obj.Display(iValue);
	
	}
}
