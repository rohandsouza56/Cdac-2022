
class Pattern4{
	public static void main(String args[]){
		//int m=9;
		for(int i=1;i<=9;i++){
			for(int k=9;k>i;k--){
				System.out.print("  ");
			}
		//	m--;
			
			for(int j=1;j<=i;j++){
				System.out.print(""+j+" ");
			}
			for(int l=i-1;l>=1;l--){
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	}
}