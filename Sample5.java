//5. Accept one number from user and print that number of * on screen.

class Sample5
{

	void  Accept(int iNo)
	{
		int iCnt=0;
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			System.out.print("*\t");
		}
	}

	public static void main(String arg[])
	{
		int iValue=0;
		iValue=5;
		Sample5 obj=new Sample5();
		
		obj.Accept(iValue);
	
	}
}