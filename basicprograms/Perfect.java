import java.util.Scanner
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int lastDigit=0;
		int num=0;
		int fact=0;
		for(int i=0;i<num;i++)
		{
			if(num%i ==0)
			{
				fact=i;
				sum=sum+fact;
			}
		}
		if(sum==num){
			System.out.println(num+ "is perfect number");
		}
		else{
			System.out.println(num+ "is not perfect number");
		}

	}
}
