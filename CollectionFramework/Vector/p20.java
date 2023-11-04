import java.util.Vector;
class p20
{
	public static void main(String[] args) 
	{
		Vector obj1=new Vector();
		obj1.add("oreo");
		obj1.add(123);
		obj1.add(true);
		System.out.println(obj1);

		Vector obj2=new Vector();
		obj2.addAll(obj1);
		System.out.println(obj2);


	}
}

