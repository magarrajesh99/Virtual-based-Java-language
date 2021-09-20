/*	5. Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.
	Input:	2395						Input:	1018
	Output:	-15 (2-17)					Output:	6(8-2)
	
	Input:	8440						Input:	5733
	Output:	16 (16-0)					Output:	-18	(0-18)
*/
import java.util.*;

class Sample29
{

	int CountDiff(int iNo)
	{
		int iDigit=0,iSum1=0,iSum2=0;
	
		while(iNo!=0)				//O(N)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iSum1=iDigit+iSum1;
			}
			else
			{
				iSum2=iDigit+iSum2;
			}
			iNo=iNo/10;
		}
		return iSum1-iSum2;
	}

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample29 obj=new Sample29();
		
		iRet=obj.CountDiff(iValue);
	
		System.out.printf("%d",iRet);
	}
}