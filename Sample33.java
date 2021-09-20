/* 4. Write a program which accept temperature in Fahrenheit and convert it into celsius.(1 celsius=(Fahrenheit-32)*(5/9))
	Input:	10								Input:	34
	Output:	-12.2222	(10-32)*(5/9)		Output:1.11111	(34-32)*(5/9)
*/
import java.util.*;

class Sample33
{
	double FhtoCs(float fTemp)
	{
		double dTemp=0.0;
		dTemp=((fTemp-32)*5/9);
		return dTemp;
	}

	public static void main(String arg[])
	{
		float fValue=0.0f;
		double dRet=0.0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit\n");
		fValue=sobj.nextFloat();
		
		Sample33 obj=new Sample33();
		
		dRet=obj.FhtoCs(fValue);
	
		System.out.printf("Temperature in Celcius: %f",dRet);
	}
}