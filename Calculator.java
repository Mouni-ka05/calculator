import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		int a, b ;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Value 'a' : ");
		a=sc.nextInt();
		System.out.println("Enter the 2nd Value 'b' : ");
		b=sc.nextInt();
		System.out.println("Choose an operation: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter choice (1-4): ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: int add=a+b;
			System.out.println("Addition: " +add);
			break;
			case 2: int sub=a-b;
			System.out.println("Subtraction: " +sub);
			break;
			case 3: int mul=a*b;
			System.out.println("Multiplication: " +mul);
			break;
			case 4: int div=a/b;
			System.out.println("Division: " +div);
			break;
			default: System.out.println("Invalid Choice");
		}
	}
}

