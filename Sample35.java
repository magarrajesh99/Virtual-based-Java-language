/* 1. Write a program which accept range from user and display all numbers in between that range.
	Input:	23 35
	Output:	23 24 25 26 27 28 29 30 31 32 33 34 35
	
	Input:	10 18
	Output:	10 11 12 13 14 15 16 17 18
	
	Input:	-10 2
	Output:	-10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2
	
	Input:	90 18
	Output: Invalid range
*/

import java.util.*;

class Sample35
{
	void RangeDisplay(int iStart,int iEnd)
	{
		int iCnt=0;
	
		if(iStart>iEnd)
		{
			System.out.println("Invalid range\n");
		}
	
		for(iCnt=iStart;iCnt<=iEnd;iCnt++)		//O(N) where N is the value of iEnd
		{
			System.out.printf("%d\t",iCnt);
		}
	}

	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter starting point\n");
		iValue1=sobj.nextInt();
	
		System.out.println("Enter ending point\n");
		iValue2=sobj.nextInt();
		
		Sample35 obj=new Sample35();
		obj.RangeDisplay(iValue1,iValue2);
	}
}