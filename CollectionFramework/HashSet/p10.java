import java.util.HashSet;
class p10
{
	public static void main(String[] args) 
	{
		HashSet obj1=new HashSet();
		obj1.add("oreo");
		obj1.add(123);
		obj1.add(true);
		System.out.println(obj1);

		HashSet obj2=new HashSet();
		obj2.addAll(obj1);
		System.out.println(obj2);


	}
}
