/*	4. Write a program which accept range fram user and return addition of all even numbers in between that range.(Range should contains positive numbers only)
	Input:	23 30
	Output:	108
	
	Input:	10	18
	Output:	70
	
	Input:	-10	2
	Output:	Invalid Range
	
	Input:	90	18
	Output:	Invalid Range
*/
import java.util.*;

class Sample38
{
	
	int RangeSumEven(int iStart, int iEnd)
	{
		int iCnt=0,iSum=0;
	
		if(iStart>iEnd||iStart<0)
		{
			return -1;
		}

		for(iCnt=iStart;iCnt<=iEnd;iCnt++)				//O(N) where N is the value of iEnd
		{
			if(iCnt%2==0)
			{
				iSum=iSum+iCnt;
			}
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
	
		Sample38 obj=new Sample38();
		iRet=obj.RangeSumEven(iValue1,iValue2);
	
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