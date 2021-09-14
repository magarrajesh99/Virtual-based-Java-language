import java.lang.*;

class Arithematic
{
	//Characteristics
	public int no1;
	public int no2;
	
	public Arithematic()		//Default constructor
	{
		this.no1=0;
		this.no2=0;
	}
	public Arithematic(int x, int y)	//Parameterised constructor
	{
		this.no1=x;
		this.no2=y;
	}
	
	public int Addition()		//Behaviour
	{
		int ans=0;
		ans=this.no1+this.no2;
		return ans;
	}
	public int Substraction()		//Behaviour
	{
		int ans=0;
		ans=this.no1-this.no2;
		return ans;
	}

}

class Marvellous
{
	public static void main(String arg[])
	{
		System.out.println("Inside main");
		Arithematic obj1;		//Reference
		obj1=new Arithematic();		//Dynamic memory allocation
		Arithematic obj2=new Arithematic(11,21);

		int ret=0;
		ret=obj2.Addition();
		System.out.println("Addition is:",+ret);
		
		ret=obj2.Substraction();
		System.out.println("Substraction is:",+ret);
		
	}
}