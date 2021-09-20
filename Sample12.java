//Write a program which accept number from user and print even factors of that number on screen.
//Input:	36
//Output:	2	4	6	12	18

import java.util.*;

class Sample12
{
	void DisplayFactors(int iNo)
	{
		int i=0;
	
		if(iNo<=0)
		{
			iNo=-iNo;
		}
	
		for(i=1;i<=iNo/2;i++)
		{
			if((iNo%i==0)&&(i%2==0))
			{
				System.out.print(i+"\t");
			}
		}
	}
	public static void main(String arg[])
	{
		int iValue=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample12 obj=new Sample12();
		obj.DisplayFactors(iValue);

	}
}