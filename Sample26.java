/*	2. Write a program which accept number from user and return the count of odd digits.
	Input:	2395				Input:	1018
	Output:	3					Output:	2
	
	Input:	-1018				Input:	8462
	Output:	2					Output:	0
*/

import java.util.*;

class Sample26
{

	int CountOdd(int iNo)
	{
		int iDigit=0,iCnt=0;
	
		while(iNo!=0)			//O(N)
		{
			iDigit=iNo%10;
			if(iDigit%2!=0)
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
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
	
		Sample26 obj=new Sample26();
		
		iRet=obj.CountOdd(iValue);
	
		System.out.printf("%d",iRet);
	}
}