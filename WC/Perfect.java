import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int result=0;
		int sum=0;
		int fact=0;
		for(int i=1;i<num;i++)
		{
			if(num%i ==0)
			{
				System.out.println(i);
				result+=i;
			}
		}
		if(result==num){
			System.out.println(num+ "is perfect number");
		}
		else{
			System.out.println(num+ "is not perfect number");
		}

	}
}
