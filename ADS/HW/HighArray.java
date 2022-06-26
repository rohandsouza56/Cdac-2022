import java.util.*;

class HighArray{
	int[] arr = new int[100];
	int n=10;
	int key = 0;
	boolean bool = true;
	public HighArray(){

		arr[0]= 55;
		arr[1]= 33;
		arr[2]= 22;
		arr[3]= 11;
		arr[4]= 66;
		arr[5]= 88;
		arr[6]= 72;
		arr[7]= 44;
		arr[8]= 99;
		arr[9]= 22;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("------------");
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("------------");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			System.out.println();
			
			switch(choice){
				case 1:	System.out.print("Enter value to be inserted: "); 
						int value = sc.nextInt();
						insert(value);
						break;
				case 2: display();
						break;
				case 3: System.out.println("Enter element to find: ");
						key = sc.nextInt();
						bool = find(key);
						break;
				case 4: System.out.print("Enter element to delete: ");
						key = sc.nextInt(); 
						bool = delete(key);
						if(bool){
							System.out.println("Element Deleted");
						}else System.out.println("Element not found");
						break;
				case 5:	exit();
						break;
				default: System.out.println("Invalid Option");
			}
		}
	}
	
	public void insert(int value){
		arr[n] = value;
		n++;
		System.out.println("Element added");
	}
	
	public void display(){
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public boolean find(int key){
		int i = 0;
		for(i=0;i<n;i++){
			if(arr[i] == key)
				break;
		}
		if(i==n){
			System.out.println("Element not found");
			return false;
		}
		else{
			System.out.println("Element found at index "+i);
			return true;
		}
	}
	
	public boolean delete(int key){
		int flag = 0;
		int i=0;
		for(i=0;i<n;i++){
			if(arr[i] == key){
				flag = 1;
				break;
			}
				
		}
		for(int j=i;j<n;j++){
			arr[j] = arr[j+1];
		}
		if(flag == 1){
			n--;
			return true;
		}
		else return false;
	}
	
	public void exit(){
		System.exit(0);
	}
		
}