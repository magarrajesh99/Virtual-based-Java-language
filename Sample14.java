//Accept on character from user and check whetherthat character is vowel (a,e,i,o,u) or not.
//Input:	E	Output:	TRUE
//Input:	d   Output:	FALSE

import java.util.*;

class Sample14
{
	boolean  ChkVowel(char cValue)
	{
		if(cValue=='a'||cValue=='e'||cValue=='i'||cValue=='o'||cValue=='u'||cValue=='A'||cValue=='E'||cValue=='I'||cValue=='O'||cValue=='U')
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
		char cValue='\0';
		boolean bRet=false;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter character\n");
		cValue=sobj.next().charAt(0);
	
		Sample14 obj=new Sample14();
		bRet=obj.ChkVowel(cValue);
	
		if(bRet==true)
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is a not vowel");
		}
	}
}

