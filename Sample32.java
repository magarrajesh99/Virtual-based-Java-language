/* 3. Write a program which accept distance in kilometer and convert it into meter.(1 kilometer=1000 Meter)
	Input:	5							Input:	12
	Output:	5000						Output:	12000
*/

import java.util.*;

class Sample32
{

	int KMtoMeter(int iNo)
	{
		return iNo*1000;
	}

	public static void main(String arg[])
	{
		int iValue=0,iRet=0;
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter distance\n");
		iValue=sobj.nextInt();
		
		Sample32 obj=new Sample32();
		
		iRet=obj.KMtoMeter(iValue);
	
		System.out.printf("Distance in Meter is: %d",iRet);
	}
}