/*1. Write a program which accept number from user and display its digits in reverse order.
	Input:	2395						
	Output:	5
			9
			3
			2
	Input:	1018
	Output:	8
			1
			0
			1		
*/

import java.util.*;

class Sample20
{

	void DisplayDigit(int iNo)
	{
		int iDigit=0;
	
		if(iNo<0)				//Input Updator
		{
			iNo=-iNo;
		}
	
		while(iNo!=0)				//O(N)
		{
			iDigit=iNo%10;
			System.out.printf("%d\n",iDigit);
			iNo=iNo/10;
		}
	}
	public static void main(String arg[])
	{
		int iValue=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number");
		iValue=sobj.nextInt();
	
		Sample20 obj=new Sample20();
		
		obj.DisplayDigit(iValue);
	
	}
}