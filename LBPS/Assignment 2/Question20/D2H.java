import java.util.Scanner;

class D2H{
	public static void main(String args[]){
		String str = "";
		String revStr="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Decimal Number ");
		int num = sc.nextInt();
		while(num>0){
			if(num%16>=10 && num%16<=15){
				switch(num%16){
					case 10: str = str + "A"; break;
					case 11: str = str + "B"; break;
					case 12: str = str + "C"; break;
					case 13: str = str + "D"; break;
					case 14: str = str + "E"; break;
					case 15: str = str + "F"; break;
				}
				
			}
				else{
					str = str + num%16;
				}
			num=num/16;
		}
		for(int i=str.length()-1;i>=0;i--){
			revStr = revStr+str.charAt(i);
		}
		
		System.out.println("Hexadecimal number is "+revStr);
	}
}