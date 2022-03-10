import java.util.Scanner;

class B2O{
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
		String str = "";
		String revStr="";
		
		while(decNum>0){
			str = str + decNum%8;
			decNum=decNum/8;
		}
		for(int j=str.length()-1;j>=0;j--){
			revStr = revStr+str.charAt(j);
		}
		
		System.out.println("Octal number is "+revStr);
	}
}