//Accept two number from user and display first number in second number of times.
//
//Input:	12 5
//Output:	12 12 12 12 12 

import java.util.*;

class Sample8
{
	void  Display(int iNo,int iFrequency)
	{
		if(iFrequency<0)
		{
			iFrequency=-iFrequency;
		}
		
		for(int i=1;i<=iFrequency;i++)
		{
			System.out.print(iNo+"\t");
		}
	}
	public static void main(String arg[])
	{
		int iValue=0,iCount=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number\n");
		iValue=sobj.nextInt();
	
		System.out.println("Enter Frequency\n");
		iCount=sobj.nextInt();
	
		Sample8 obj=new Sample8();
		obj.Display(iValue,iCount);
	
	}
}