
class PalinRec
{
    static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)    // If there is only one character 
            return true;  
			
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;   
 
        if (s < e+1 ) 
            return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }   
    
    
    public static void main(String args[]){ 
        String str = "abcba";
		int n = str.length(); 
		
		boolean b = checkPalindrome(str, 0, n - 1);
		
        if (b) 
            System.out.println(str+" is palindrome"); 
        else
            System.out.println(str+ " is not a palindrome"); 
    }   
}