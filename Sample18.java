/*4.Write a program which accept number from user and return summation of all its non factors.

Input:	12
Output:	50

Input:	10
Output:	37

*/

import java.util.*;

class Sample18
{

	int SumNonFact(int iNo)
	{
		
		int iCnt=0,iSum=0;
	
		if(iNo<0)								//Updator
		{
			iNo=-iNo;
		}
	
		for(iCnt=1;iCnt<iNo;iCnt++)		//O(N)
		{
			if((iNo%iCnt)!=0)
			{
				iSum=iSum+iCnt;
			}
		}
		return iSum;
	}

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
	
		Sample18 obj=new Sample18();
		
		iRet=obj.SumNonFact(iValue);
	
		System.out.printf("%d",iRet);

	}
}

