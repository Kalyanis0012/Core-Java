import java.util.Scanner;
class Scanner2 
{
	public static void main(String[] args) 
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Year:");
		int yr=inp.nextInt();
		if(yr%4==0)
		{
			System.out.println("Leap Year");
		}
		System.out.println("Not Leap Year");
	}
}
