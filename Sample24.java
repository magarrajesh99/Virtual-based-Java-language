/*	5. Write a program which accept number from user and count frequency of such a digit which are less than 6.
	Input:	2395				Input:	1018
	Output:	3					Output:	3
	
	Input:	9440				Input:	96672
	Output:	3					Output:	1
*/

import java.util.*;

class Sample24
{

	int Count(int iNo)
	{
		int iDigit=0,iCnt=0;
	
		while(iNo!=0)		//O(N)
		{
			iDigit=iNo%10;
			if(iDigit<6)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number\n");
		iValue=sobj.nextInt();
	
		Sample24 obj=new Sample24();
		
		iRet=obj.Count(iValue);
	
		System.out.printf("%d",iRet);
	
	}
}