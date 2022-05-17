class RunnableInterfaceDemo
{
	public static void main(String a[])
	{
		T1 tx=new T1();
		Thread obj1=new Thread(tx);
		obj1.start();
		
		T2 ty=new T2();
		Thread obj2=new Thread(ty);
		obj2.start();

		T3 tz=new T3();
		Thread obj3=new Thread(tz);
		obj3.start();
		try
		{
			obj1.join();
			obj2.join();
			obj3.join();
		}
		catch(Exception e)
		{}
		tx.displayT1();
		ty.displayT2();
		tz.displayT3();
	}
}

class T1 implements Runnable
{
	int i=0,sum=0;
	public void run()
	{
		for(i=1;i<=5;i++)
			sum+=i;
	}
	void displayT1()
	{
		System.out.println("Sum : "+sum+"\nAverage is : "+(sum/5));
	}
}

class T2 implements Runnable
{
	int i=0,sum=0;
	public void run()
	{
		for(i=6;i<=10;i++)
			sum+=i;
	}
	void displayT2()
	{
		System.out.println("Sum : "+sum+"\nAverage is : "+(sum/5));
	}
}

class T3 implements Runnable
{
	int i=0,sum=0;
	public void run()
	{
		for(i=11;i<=15;i++)
			sum+=i;
	}
	void displayT3()
	{
		System.out.println("Sum : "+sum+"\nAverage is : "+(sum/5));
	}
}