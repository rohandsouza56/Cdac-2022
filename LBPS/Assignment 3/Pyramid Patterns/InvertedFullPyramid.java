
class InvertedFullPyramid{
	public static void main(String args[]){
		
		for(int i=6;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=i+1;k>1;k--){
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
	}
}
