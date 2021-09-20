/*2.Write a program which accept number from user and display its factors in decreasing order.

Input:	12
Output:	6	4	3	2	1

Input:	13
Output:	1		

Input:	10
Output:	5	2	1
*/

import java.util.*;

class Sample17
{
	void FactRev(int iNo)
	{
	
		int iCnt=0;
	
		if(iNo<0)								//Updator
		{
			iNo=-iNo;
		}
	
		for(iCnt=iNo/2;iCnt>=1;iCnt--)		//O(N/2)
		{
			if((iNo%iCnt)==0)
			{
				System.out.printf("%d\t",iCnt);
			}
		}
	}

	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample17 obj=new Sample17();
	
		obj.FactRev(iValue);

	}
}

