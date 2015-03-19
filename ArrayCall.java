public class ArrayCall{
	public int sum[]=new int[5];
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for (int x:a)
		{
			System.out.println(x);
		}
		System.out.println("array declared and initialised");
		int b[]={1,2,3,4,5};
		for(int x:b)
		{
			System.out.println(x);
		}
		System.out.println("it can also be created dynamically at runtime");
		ArrayCall a1=new ArrayCall();
		a1.calc(a,b);
		a1.show();

	}
	public void calc(int x[],int y[])
	{
        for(int i=0;i<5;i++)
        {
        	sum[i]=x[i]+y[i];
        }
	}
	public void show()
	{
		for(int x:sum)
		{
			System.out.println(x);
		}
	}
}