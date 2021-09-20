/* 1. Write a program which accept radius of circle from user and calculate its area.
Consider value of PI as 3.14(Area =PI*Radius*Radius)

Input:	5.3					Input:	10.4
Output:	88.2026 			Output:	339.6224
*/

import java.util.*;

class Sample30
{
	
		final float PI=3.14f;
	
		double CircleArea(float fRadius)
		{
			double Area=0.0;
			Area=PI*fRadius*fRadius;
			return Area;
		
		}	

	public static void main(String arg[])
	{
		float fValue=0.0f;
		double dRet=0.0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter radius\n");
		fValue=sobj.nextFloat();
		
		Sample30 obj=new Sample30();
	
		dRet=obj.CircleArea(fValue);
	
		System.out.printf("Area of circle is: %f",dRet);
	}
}