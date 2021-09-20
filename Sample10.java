//Write a program which accept one number from user and print that number of even numbers on screen.
//Input:	7
//Output:	2	4	6	8	10	12	14

import java.util.*;

class Sample10
{ 

	void PrintEven(int iNo)
	{
		int iCnt=0;
	
		if(iNo<=0)
		{
			return;
		}
	
		for(iCnt=1;iCnt<=iNo*2;iCnt++)
		{
			if((iCnt%2)==0)
			{
				System.out.print(iCnt+"\t");
			}
		}
	}
	public static void main(String arg[])
	{
		int iValue=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
	
		Sample10 obj=new Sample10();
		obj.PrintEven(iValue);
	

	}
}