/*1.Write a program which accept number from user and display its multiplication of factors.

Input:	12
Output:	144		(1*2*3*4*6)

Input:	13
Output:	1		(1)

Input:	10
Output:	10		(1*2*5)
*/

import java.util.*;

class Sample15
{
	int MultFact(int iNo)
	{
	
		int iCnt=0,iFact=1;
	
		if(iNo<0)
		{
			iNo=-iNo;
		}
	
		for(iCnt=1;iCnt<=(iNo/2);iCnt++)		//O(N/2)
		{
			if((iNo%iCnt)==0)
			{
				iFact=iFact*iCnt;
			}
		}
		return iFact;
	}

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
	
		Sample15 obj=new Sample15();
		iRet=obj.MultFact(iValue);
	
		System.out.printf("%d",iRet);

	}
}

