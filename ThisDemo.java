class ThisDemo
{
	public static void main(String arg[])
	{
		Demo obj=new Demo(10,20);
	}
}
class Demo
{
	public int x,y;
	
	public Demo()
	{
		System.out.println("Default Construcotr");
	}
	public Demo(int a,int b)
	{
			//Use no 1
		System.out.println("Parameterised Construcotr");
		this();	this.x=a;
		this.y=b;
	}
	public void fun()
	{
		System.out.println("Inside fun");
		System.out.println("Value of x:"+this.x);
		
	}
	public void gun()
	{
		System.out.println("Inside gun");
		this.fun();
	}
}