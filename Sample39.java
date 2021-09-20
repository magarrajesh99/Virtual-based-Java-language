/* 5.Write a program which accept range from user and display all numbers in between that range in reverse order.
	Input:	23	35
	Output:	35 34 33 32 31 30 29 28 27 26 25 24 23
	
	Input:	10	18
	Output:	18 17 16 15 14 13 12 11 10
	
	Input:	10	10
	Output:	10
	
	Input:	-10	2
	Output:	2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10
	
	Input:	90	18
	Output:	Invalid Range
*/
import java.util.*;

class Sample39
{
	
	void RangeDisplayRev(int iStart,int iEnd)
	{
		int iCnt=0;
	
		if(iStart>iEnd)
		{
			System.out.println("Invalid Range\n");
		}

		for(iCnt=iEnd;iCnt>=iStart;iCnt--)			//O(N) where N is the value of iStart
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
	
		Sample39 obj=new Sample39();
		
		obj.RangeDisplayRev(iValue1,iValue2);
	}
}
