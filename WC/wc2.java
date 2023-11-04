class wc2
{
	//programs for verifying premitive datatype to non premitive datatype
	public static void main(String[] args) 
	{
		int a=100;
		System.out.println(a);
		Integer obj=Integer.valueOf(a);
        System.out.println(obj);

		byte b=2;
		System.out.println(b);
		Byte obj1=Byte.valueOf(b);
		System.out.println(obj1);


		short s=50;
		System.out.println(s);
		Short obj2=Short.valueOf(s);
		System.out.println(obj2);

	}
}
