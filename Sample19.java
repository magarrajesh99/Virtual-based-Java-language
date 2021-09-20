/*5.Write a program which accept number from user and return difference between summation of all its factors and  non factors.

Input:	12
Output:	-34		(16-50)

Input:	10
Output:	-29		(8-37)

*/

import java.util.*;

class Sample19
{
	int FactDiff(int iNo)
	{
	
		int iCnt=0,iSum1=0,iSum2=0;
	
		if(iNo<0)								//Updator
		{
			iNo=-iNo;
		}
	
		for(iCnt=1;iCnt<iNo;iCnt++)		//O(N)
		{
			if((iNo%iCnt)==0)
			{
				iSum1=iSum1+iCnt;
			}
			else if((iNo%iCnt)!=0)
			{
				iSum2=iSum2+iCnt;
			}
		}
		return iSum1-iSum2;
	}

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
	
		Sample19 obj=new Sample19();
		iRet=obj.FactDiff(iValue);
	
		System.out.printf("%d",iRet);
	}
}

