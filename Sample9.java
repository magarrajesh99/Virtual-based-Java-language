 //Accept number from user and check whether number is even or odd.
import java.util.*;

class Sample9
{
	boolean ChkEven(int iNo)
	{
		if(iNo%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String arg[])
	{
		int iValue=0;
		boolean bRet=false;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample9 obj=new Sample9();
		bRet=obj.ChkEven(iValue);
	
		if(bRet==true)
		{
			System.out.println("Number is Even\n");
		}
		else
		{
			System.out.println("Number is Odd\n");
		}
	}
}