
class CountZero{	
public static void main(String args[])
{
	String str = "10101111100010101000000101";
	int count = 0;
	for(int i=0;i<str.length()-1;i++){
		if(str.charAt(i)=='1' && str.charAt(i+1)=='0')
		{
			count++;
		}
	}
	System.out.println("Count of Zeros in program after 1 = "+count);

}
}





