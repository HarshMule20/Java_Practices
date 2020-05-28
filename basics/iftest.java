interface IntStack
{
	void push(int item);	
	int pop();
}
class FixedStack implements IntStack
{	
	private int stck[];
	private int tos;
	FixedStack(int size)
	{
		stck=new int [size];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==stck.length-1)
		{
			System.out.println("Stack is full");
			return 0;
		}
		else 
			return stck[tos--];
	}
}
class iftest
{
	public static void main(String args[])
	{
		FixedStack s1=new FixedStack(5);
		FixedStack s2=new FixedStack(8);
		int i;
		for(i=0;i<5;i++)
		{
			s1.push(i);
			System.out.println(i);
		}
		for(i=0;i<8;i++)
			s2.push(i);
		System.out.println("Stack in s1= ");
		for(i=0;i<5;i++)
			System.out.println(s1.pop());
		System.out.println("Stack in s2= ");
		for(i=0;i<8;i++)
			System.out.println(s2.pop());
	}
}
