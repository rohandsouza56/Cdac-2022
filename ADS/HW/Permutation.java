
class Permutation{
	
	static void display(String res, String str){
		if(str.length()==0){
			//System.out.println(res);
			return;
		}
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			String r1=str.substring(0,i)+str.substring(i+1);
			//System.out.println((res+ch)+" ,"+r1);
			display(res+ch,r1);
		}
	}
	
	public static void main(String[] args){
		String str="ABC";
		display("",str);
	}
}