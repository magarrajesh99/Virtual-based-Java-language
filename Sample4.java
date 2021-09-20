import java.util.*;
class Sample4
{
boolean Check(int iNo)
{
	if((iNo%5)==0)
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
	
	System.out.println("Enter number");
	iValue=sobj.nextInt();
	
	Sample4 obj=new Sample4();
	bRet=obj.Check(iValue);
	
	
	if(bRet==true)
	{
		System.out.println("Divisible by 5");
	}
	else
	{
		System.out.println("Not divisible by 5");
	}
	
	
} 
}