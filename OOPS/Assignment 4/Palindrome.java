
class Palindrome{	
	public static void main(String args[]){
		String str = "ABCBA";
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--){
			revStr+= str.charAt(i);
		}
		if(str.equals(revStr))
			System.out.println("Palindrome");
		else System.out.println("Not Palindrome");

	}
}





