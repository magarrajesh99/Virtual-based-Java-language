/* 4. Write a program which accept number from user and count frequency of 4 in it.
	Input:	2395					Input:	1018
	Output:	0						Output:	0

	Input:	9440					Input:	922432
	Output:	2						Output:	1
	
*/

import java.util.*;

class Sample23
{

	int CountFour(int iNo)
	{
		int iDigit=0,iCnt=0;
	
		if(iNo<0)				//Input Updator
		{
			iNo=-iNo;
		}
	
		while(iNo!=0)				//O(N)
		{
			iDigit=iNo%10;
			if(iDigit==4)
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
	
		Sample23 obj=new Sample23();
		
		iRet=obj.CountFour(iValue);
	
		System.out.printf("%d",iRet);
	}
}