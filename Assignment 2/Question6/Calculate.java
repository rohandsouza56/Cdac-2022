import java.util.Scanner;

class Calculate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = sc.nextInt();
		System.out.println("Enter second number ");
		int b = sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" mod "+b+" = "+(a%b));
		
		}
}