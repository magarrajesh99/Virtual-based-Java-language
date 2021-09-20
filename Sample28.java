/*	4. Write a program which accept number from user and return multiplication of all digits.
	Input:	2395				Input:	1018
	Output:	270					Output:	8
	
	Input:	9440				Input:	922432
	Output:	144					Output:	864
*/
import java.util.*;

class Sample28
{

	int MultDigits(int iNo)
	{
		int iDigit=0,iMult=1;
	
		while(iNo!=0)			//O(N)
		{
			iDigit=iNo%10;
			if(iDigit==0)
			{
				iDigit=iDigit+1;	
			}
			iMult=iDigit*iMult;
			iNo=iNo/10;
		}
		return iMult;
	}	 

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
	
		Sample28 obj=new Sample28();
		
		iRet=obj.MultDigits(iValue);
	
		System.out.printf("%d",iRet);
	}
}