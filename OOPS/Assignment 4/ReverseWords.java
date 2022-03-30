class ReverseWords{
	public static void main(String args[]){
	String str = "ab cd ef gh ij kl";
	String spl[]=str.split(" ");
	for(int i=spl.length-1;i>=0;i--){
		System.out.print(spl[i]+ " ");
	}

	}
}