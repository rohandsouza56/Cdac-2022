
class TableFor{
	public static void main(String args[]){
	
	for(int i=1;i<=30;i++){
		for(int j=1;j<=10;j++){
			System.out.println(i+" * "+j+" = "+(i*j));
		}
		System.out.println("-------------");
	}

	 int j=1;
	 for(int i=1;i<=30;){
		 System.out.println(i+" * "+j+" = "+(i*j));
		 j++;
		 if(j==11){
			 i++;
			 j=1;
			 System.out.println("------------");
		 }
	 }	 
	}
}