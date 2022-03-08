
class Pattern9{
	public static void main(String args[]){
		int m=1;;
		for(char i='A';i<='E';i++){
			for(int j='E';j>=i;j--){
				System.out.print(" ");
			}
			
			for(char k='A';k<=i;k++){
				System.out.print(k+" ");
				
			}
			
			System.out.println();
		}
	}
}
