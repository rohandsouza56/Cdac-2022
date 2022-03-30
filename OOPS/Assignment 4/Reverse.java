
class Reverse{	
public static void main(String args[]){
	String str = "ABCDEFGHIJKLMNOPGRSTUVWXYZ";
	String revStr = "";
	for(int i=str.length()-1;i>=0;i--){
		revStr+= str.charAt(i);
	}
	System.out.println("Reverse = "+revStr);

}
}





