
class Divide
{
	int Division(int iNo1,int iNo2)
	{
		int iAns=0;
		
		if(iNo2<0)
		{
			return -1;
		}
		
		iAns=iNo1/iNo2;
		
		return iAns;
		
	}
}

class sample1
{
	public static void main(String arg[])
	{
		int iValue1=15,iValue2=5,iRet=0;
		
		Divide obj=new Divide();
		
		iRet=obj.Division(iValue1,iValue2);
		
		System.out.println("Division is:"+iRet);
		
	}
}