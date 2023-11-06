class Ce 
{
	public static void vote(int age) throws InvalidAge
	{
		if(age>=18)
		{
			System.out.println("vote and go home");
		}
		else{
			throw new InvalidAge("Don't come out of home");
		}
	} 
    public static void main(String[] args)
		{
			try{
				vote(9);
			}
			catch(Throwable var)
			{
				System.out.println(var);
			}
		}
	

}
