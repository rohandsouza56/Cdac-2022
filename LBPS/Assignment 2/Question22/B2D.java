import java.util.Scanner;

class B2D{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Binary Number ");
		int num = sc.nextInt();
		int decNum=0;
		int i=0,m=0;;
		while(num>0){
			m=num%10;
			decNum += (int)Math.pow(2,i) * m;
			//System.out.println(decNum+" "+(int)Math.pow(2,i)+" " + num%10);
			num /= 10;
			
			i++;
		}
		
		System.out.println("Decimal number is "+decNum);
	}
}