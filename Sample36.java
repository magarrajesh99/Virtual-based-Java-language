/* 2. Write a program which accept range from user and display all even numbers in between that range.
	Input:	23 35
	Output:	24 26 28 30 32 34
	
	Input:	10 18
	Output:	10 12 14 16 18
	
	Input:	-10 2
	Output:	-10 -8 -6 -4 -2  0  2
	
	Input:	90 18
	Output: Invalid range
	
	Input:	10	10
	Output: 10
*/

import java.util.*;

class Sample36
{
	void RangeDisplayEven(int iStart,int iEnd)
	{
		int iCnt=0;
	
		if(iStart>iEnd)
		{
			System.out.println("Invalid range\n");
		}
	
		for(iCnt=iStart;iCnt<=iEnd;iCnt++)		//O(N) where N is the value of iEnd
		{
			if(iCnt%2==0)
			{
				System.out.printf("%d\t",iCnt);
			}
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
	
		Sample36 obj=new Sample36();
		
		obj.RangeDisplayEven(iValue1,iValue2);
	}
}