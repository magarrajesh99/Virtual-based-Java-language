/* 2.Write a program which accept number from user and check whether it contains 0 in it or not.
	Input:	2395
	Output:	There is no Zero
	
	Input:	1018
	Output:	It Contains Zero
*/
import java.util.*;

class Sample21
{
	boolean ChkZero(int iNo)
	{
		int iDigit=0;
	
		if(iNo<0)				//Input Updator
		{
			iNo=-iNo;
		}
	
		if(iNo==0)
		{
			return true;
		}
	
		while(iNo!=0)			//O(N)
		{
			iDigit=iNo%10;
			if(iDigit==0)
			
				return true;
			
			iNo=iNo/10;
		}
		return false;
		
	}
	
	public static void main(String arg[])
	{
		int iValue=0;
		boolean bRet=false;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample21 obj=new Sample21();
	
		bRet=obj.ChkZero(iValue);
	
		if(bRet==true)
		{
			System.out.println("It Contains Zero");
		}
		else
		{
			System.out.println("There is no Zero");
		}
	}

}