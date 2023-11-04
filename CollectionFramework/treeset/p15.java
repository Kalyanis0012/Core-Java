import java.util.TreeSet;
class p15
{
	public static void main(String[] args) 
	{
		TreeSet obj1=new TreeSet();
		obj1.add("oreo");
		obj1.add(123);
		obj1.add(true);
		System.out.println(obj1);

		TreeSet obj2=new TreeSet();
		obj2.addAll(obj1);
		System.out.println(obj2);


	}
}

