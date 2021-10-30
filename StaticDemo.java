class StaticDemo
{
	public static void main(String arg[])
	{
		System.out.println("Value of ststic j is "+Demo.j);
	Demo.gun();
	Demo obj = new Demo(); //object creation
	obj.fun();
	obj.gun();
	System.out.println("value of non static i : "+obj.i);
	System.out.println("Value of static j :"+obj.j);
	}
}
class Demo
{
	public int i=10;
	public static int j = 20;
	
	public void fun()
	{
		System.out.println("non static fun");
		System.out.println(i);
		System.out.println(j);
	}
	public static void gun()
	{
		System.out.println("non static gun");
	//System.out.println(i);  //static method can call only static methods 
	
		System.out.println(j);
	}
}
//in c++//static int Demo:: j =20;