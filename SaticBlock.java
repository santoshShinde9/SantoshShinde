class StaticBlock
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Demo obj ;
	}
}

class Demo 
{
	public int i,j;
	public static int x,y;   //static charactaristics 
	
	static
	{
		System.out.println("Inside Static Block");
		x=10;
		y=20
	}
	
	public Demo()
	{
		System.out.println("Inside Constructor ");
		i=30;
		j=40;
	}
}