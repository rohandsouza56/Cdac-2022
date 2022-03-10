import java.util.Scanner;

class B2H{
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
			if(decNum%16>=10 && decNum%16<=15){
				switch(decNum%16){
					case 10: str = str + "A"; break;
					case 11: str = str + "B"; break;
					case 12: str = str + "C"; break;
					case 13: str = str + "D"; break;
					case 14: str = str + "E"; break;
					case 15: str = str + "F"; break;
				}
				
			}
				else{
					str = str + decNum%16;
				}
			decNum=decNum/16;
		}
		for(int j=str.length()-1;j>=0;j--){
			revStr = revStr+str.charAt(j);
		}
		
		System.out.println("Hexadecimal number is "+revStr);
	}
}