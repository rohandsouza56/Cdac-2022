
class SearchArray {
	public static void main(String args[]){ 
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int x = 110;
		int i=0;
		
		for(i=0;i<arr.length;i++){
			if(arr[i]==x) break;
		}
		if(i==arr.length)
			System.out.println("Elemet not found");
		else
			System.out.println("Elemet "+x+" is present at index "+i);
    }
}

