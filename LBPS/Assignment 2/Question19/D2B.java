import java.util.Scanner;

class D2B{
	public static void main(String args[]){
		String str = "";
		String revStr="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Decimal Number ");
		int num = sc.nextInt();
		while(num>0){
			str = str + num%2;
			num=num/2;
		}
		for(int i=str.length()-1;i>=0;i--){
			revStr = revStr+str.charAt(i);
		}
		
		System.out.println("Binary number is "+revStr);
	}
}