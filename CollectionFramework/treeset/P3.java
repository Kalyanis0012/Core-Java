import java.util.TreeSet;
class P3 
{
	public static void main(String[] args) 
	{
	  TreeSet obj=new TreeSet();
	  obj.add(1);
	  obj.add(2);
	  try
	  {
		obj.add(false);
	  }
	  catch (ClassCastException var)
	  {
		  System.out.println(var);
	  }
	  System.out.println(obj);
	}
}
