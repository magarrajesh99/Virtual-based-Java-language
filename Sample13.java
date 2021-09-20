//Accept one character from user and convert case of that character.
//Input:    a	Output:	A
//Input:	D	Output:	d
import java.lang.*;
import java.util.*;

class Sample13
{
	void DisplayConvert(char cValue)
	{
		if((cValue>=96)&&(cValue<=122))
		{
			char value=(char)(cValue-32);
			System.out.println(value);
			
		}
		else if((cValue>=65)&&(cValue<=90))
		{
			System.out.printf("%c",(cValue+32));
		}
	
	}
	public static void main(String arg[])
	{
		char cValue='\0';
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter character\n");
		cValue=sobj.next().charAt(0);
	
		Sample13 obj=new Sample13();
		
		obj.DisplayConvert(cValue);	
	}
}
