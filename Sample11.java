//Write a program which accept one number from user and print factors of that number.
//Input:	24
//Output:	1	2	3	4	6	8	12

import java.util.*;

class Sample11
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
			if(iNo%i==0)
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
	
		Sample11 obj=new Sample11();
		obj.DisplayFactors(iValue);
	}
}