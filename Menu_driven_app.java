package assignment_2;
import java.util.Scanner;
public class Menu_driven_app 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		int choice;
		int a, b, c;
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for substraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 0 for exit");
		do
		{
			choice = S.nextInt();
			switch(choice) 
		{
			case 1:
			System.out.println("Enter the num1");
			a = S.nextInt();
			System.out.println("Enter the Num2");
			b = S.nextInt();
			c = a+b;
			System.out.println("The addition of two number is "+c);
			break;
			case 2:
			System.out.println("Enter the num1");
			a = S.nextInt();
			System.out.println("Enter the Num2");
			b = S.nextInt();
			c = a-b;
			System.out.println("The subtranction of two number is "+c);
			break;
			case 3:
			System.out.println("Enter the num1");
			a = S.nextInt();
			System.out.println("Enter the Num2");
			b = S.nextInt();
			c = a*b;
			System.out.println("The multiplication of two number is "+c);
			break;
			case 0:
			System.out.println("exit");
			break;
			}
		}
		while(choice!=0);
	}
}

