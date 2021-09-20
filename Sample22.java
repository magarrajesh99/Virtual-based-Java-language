/* 3.Write a program which accept number from user and count frequency of 2 in it.
	Input:	2395						Input:	9000
	Output:	1							Output:	0
	
	Input:	1018						Input:	922432
	Output:	0							Output:	3
*/
import java.util.*;

class Sample22
{
	int CountTwo(int iNo)
	{
		int iDigit=0,iCnt=0;
	
		if(iNo<0)				//Input Updator
		{
			iNo=-iNo;
		}
	
		while(iNo!=0)			//O(N)
		{
			iDigit=iNo%10;
			if(iDigit==2)
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
		
		Sample22 obj=new Sample22();
	
		iRet=obj.CountTwo(iValue);
	
		System.out.printf("%d",iRet);
	}
}