import java.util.ArrayList;
class p5
{
	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		obj1.add("oreo");
		obj1.add(123);
		obj1.add(true);
		System.out.println(obj1);

		ArrayList obj2=new ArrayList();
		obj2.addAll(obj1);
		System.out.println(obj2);


	}
}
