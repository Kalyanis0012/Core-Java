import java.util.Scanner;
class Scanner3 
{
	public static void main(String[] args) 
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=inp.nextInt();
		//creation
		int[] arr= new int[size];
		//initialization
		System.out.println("Enter the elements: ");
        for (int i=0;i<arr.length ;i++ )
        {
          int input=inp.nextInt();
		  arr[i]=input;
        }
		//print
		 for(int el: arr)
			{
				System.out.println("Array Element "+el);
			}

	}
}
