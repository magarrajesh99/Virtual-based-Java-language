/*3.Write a program which accept number from user and display all its non factors.

Input:	12
Output:	5	7	8	9	10	11

Input:	13
Output:	2	3	4	5	6	7	8	8	9	10	11	12		

Input:	10
Output:	3	4	6	7	8	9
*/

import java.util.*;

class Sample16
{
	void NonFact(int iNo)
	{
	
		int iCnt=0;
	
		if(iNo<0)								//Updator
		{
			iNo=-iNo;
		}
	
		for(iCnt=1;iCnt<iNo;iCnt++)		//O(N)
		{
			if((iNo%iCnt)!=0)
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
		
		Sample16 obj=new Sample16();
		obj.NonFact(iValue);

	}
}

