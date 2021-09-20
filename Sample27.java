/*	3. Write a program which accept number from user and return the count of digits in between 3 and 7.
	Input:	2395				Input:	1018
	Output:	1					Output:	0
	
	Input:	4521				Input:	9922
	Output:	2					Output:	0
*/

import java.util.*;

class Sample27
{

	int CountRange(int iNo)
	{
		int iDigit=0,iCnt=0;
	
		if(iNo<0)			//Input Updator
		{
			iNo=-iNo;
		}
	
		while(iNo!=0)			//O(N)
		{
			iDigit=iNo%10;
			if((iDigit>3)&&(iDigit<7))
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
	
		Sample27 obj=new Sample27();
		
		iRet=obj.CountRange(iValue);
	
		System.out.printf("%d",iRet);	
	}
}