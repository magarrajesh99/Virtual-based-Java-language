/* 5. Write a program which accept area in square feet and convert it into square meter.(1 square feet=0.0929 Square meter)
	Input:	5						Input:	7
	Output:	0.464515				Output:	0.650321
*/
import java.util.*;

class Sample34
{
	final float meter=0.09290304f;

	double SquareMeter(int iNo)
	{
		double Area=0.0;
		Area=iNo*meter;
		return Area;	
	}
	public static void main(String arg[])
	{
		int iValue=0;
		double dRet=0.0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Area in square feet\n");
		iValue=sobj.nextInt();
	
		Sample34 obj=new Sample34();
		
		dRet=obj.SquareMeter(iValue);
	
		System.out.printf("Conversion in Square Meter: %f\n",dRet);
	}
}