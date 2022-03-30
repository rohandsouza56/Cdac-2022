
class ArrayTable{

	public static void main(String args[]){
		int arr[][] = new int[30][10];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = (i+1)*(j+1);
			}
		}
		for(int i=0;i<30;i++){
			for(int j=0;j<10;j++){
				//System.out.format("%03d ", arr[j][i]);
				System.out.print((i+1)+"*"+(j+1)+"="+arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
}