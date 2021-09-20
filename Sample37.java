/* 3. Write a program which accept number from user and return addition of all numbers in between that range.(Range should contains positive numbers only)
	Input:	23	30
	Output:	212
	
	Input:	10	18
	Output:	126
	
	Input:	-19	2
	Output:	Invalid Range
	
	Input:	90	18
	Output:	Invalid Range
*/

import java.util.*;

class Sample37
{

	int RangeSum(int iStart,int iEnd)
	{
		int iCnt=0,iSum=0;
	
		if(iStart>iEnd||iStart<0)
		{
			return -1;
		}
		for(iCnt=iStart;iCnt<=iEnd;iCnt++)			//O(N) where N is the value of iEnd
		{
			iSum=iSum+iCnt;
		}
		return iSum;
	}

	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0,iRet=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Starting point\n");
		iValue1=sobj.nextInt();
	
		System.out.println("Enter Ending point\n");
		iValue2=sobj.nextInt();
	
		Sample37 obj=new Sample37();
		iRet=obj.RangeSum(iValue1,iValue2);
	
		if(iRet==-1)
		{
			System.out.println("Invalid Range");
		}
		else
		{
			System.out.printf("Addition is: %d",iRet);
		}
	}
}