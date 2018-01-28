import java.util.Scanner;
public class Exerciese3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Please enter an integer: ");
		num = input.nextInt();
		boolean both = false;
		boolean onlyOne = false;
		if (num % 5 == 0 && num % 6 ==0)
		{
			both = true;
			onlyOne = false;
		}else if (num % 5 ==0 || num % 6 == 0)
		{
			both = false;
			onlyOne = true;
		}
		
		System.out.println("Is " + num + " divisible by 5 and 6? " + both);
		System.out.println("Is " + num + " divisible by 5 or 6? " + (both || onlyOne));
		System.out.println("Is " + num + " divisible by 5 or 6 (but not both)? " + onlyOne);
		
				

	}

}
