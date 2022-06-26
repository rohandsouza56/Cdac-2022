
class RevArray{
	public static void main(String args[]){
		int arr[] = {4, 5, 1, 2};
		int temp=0;
		
		for(int i=0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-i-1]; 
			arr[arr.length-i-1] = temp;
		}
		
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		
	}
}