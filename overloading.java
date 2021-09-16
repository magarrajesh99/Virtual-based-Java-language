import java.lang.*;

class Demo
{
	//Overloading by changing the data type
	public int Add(int no1,int no2)
	{
		return no1+no2;
	}
	public float Add(float no1,float no2)
	{
		return no1+no2;
	}
	public int Add(int no1,int no2,int no3)
	{
		return no1+no2+no3;
	}
}
class overloading
{
	public static void main(String arg[])
	{
		Demo obj=new Demo();
		
		System.out.println("Addition of 2 Integers"+obj.Add(10,11));
		
		System.out.println("Addition of 2 floats "+obj.Add(10.5f,11.5f));
		
		System.out.println("Addition of 2 Integers"+obj.Add(10,11,30));
		
		
	}
}