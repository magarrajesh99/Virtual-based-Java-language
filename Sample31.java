/* 2. Write a program which accept width and height of rectanglen from user and calculate its area.(Area=Width*Height)
	Input:	5.3	  9.78
	Output:	51.834
*/

import java.util.*;

class Sample31
{

	double RectArea(float fWidth,float fHeight)
	{
		return fWidth*fHeight;
	}
	public static void main(String arg[])
	{
		float fValue1=0.0f,fValue2=0.0f;
		double dRet=0.0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter width\n");
		fValue1=sobj.nextFloat();
	
		System.out.println("Enter height\n");
		fValue2=sobj.nextFloat();

		Sample31 obj=new Sample31();
			
		dRet=obj.RectArea(fValue1,fValue2);
	
		System.out.printf("Area of Rectangle is: %f",dRet);
	}
}