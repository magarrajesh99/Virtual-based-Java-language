
//Accept on number from user if number is less than 10 then print "Hello" otherwise print "Demo";
import java.util.*;

class Sample7
{

	 void Display(int iNo)
	{
		if(iNo<10)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Demo");
		}
	} 
	public static void main(String arg[])
	{
		int iValue=0;
		
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter number\n");
		iValue=sobj.nextInt();
		
		Sample7 obj=new Sample7();
		
		obj.Display(iValue);
	}
}