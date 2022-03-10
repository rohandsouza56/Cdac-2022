import java.util.Scanner;

class D2O{
	public static void main(String args[]){
		String str = "";
		String revStr="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Decimal Number ");
		int num = sc.nextInt();
		while(num>0){
			str = str + num%8;
			num=num/8;
		}
		for(int i=str.length()-1;i>=0;i--){
			revStr = revStr+str.charAt(i);
		}
		
		System.out.println("Octal number is "+revStr);
	}
}