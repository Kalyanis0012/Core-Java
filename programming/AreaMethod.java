import java.util.Scanner;
class AreaMethod 
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1 for area of Circle");
		 System.out.println("Enter 2 for area of rectangle");
		 System.out.println("Enter3 for area of square");
		 System.out.println("Enter4 for area of triangle");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				
					System.out.println("Enter radius of a circle");
					float rad=sc.nextFloat();
					double a1=3.14*rad*rad;
					System.out.println("Area of Circle is "+a1+"cm sq" );
					break;
				
				case 2:
				    System.out.println("Enter length of a rectangle");
					float l=sc.nextFloat();
                    System.out.println("Enter breadth of a rectangle");
					float b=sc.nextFloat();
					double a2=l*b;
					System.out.println("Area of reactangle is "+a2+"cm sq" );
					break;
		
				case 3:
				
					System.out.println("Enter side of a square");
					float s=sc.nextFloat();
					double a3=s*s;
					System.out.println("Area of square is "+a3+"cm sq" );
					break;
				
				case 4:
				
					System.out.println("Enter length of a triangle");
					float l1=sc.nextFloat();
					System.out.println("Enter base of a triangle");
					float b1=sc.nextFloat();
					System.out.println("Enter height of a triangle");
					float h1=sc.nextFloat();
					double a4=l1*b1*h1;
					System.out.println("Area of triangle is "+a4+"cm sq" );
					break;

			
		}
	}
}
