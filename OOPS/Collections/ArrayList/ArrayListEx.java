import java.util.*;

class ArrayListEx{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<>();
		al.add("Movie A");
		al.add("Movie B");
		al.add("Movie C");
		al.add("Movie D");
		System.out.println(al);
		
		al.add(0,"Movie E");
		System.out.println(al);
		
		
		String str = al.get(2);
		System.out.println(str);
		
		
		al.set(3,"Movie F");
		System.out.println(al);
		
		
		al.remove(2);
		System.out.println(al);
		
		
		//Search Element
		int index = al.indexOf("Movie F");
		if(index == -1)
			System.out.println("The element is not in the ArrayList");
		else
			System.out.println("The element is in the ArrayList at index " + index);
		
		
		//Sort Elements
		Collections.sort(al);  
		// Collections.sort(al,Collections.reverseOrder()); For descending
		System.out.println(al);
		
		
		
		//Reverse elements in list
		Collections.reverse(al);  
		System.out.println(al);
		/*
		ArrayList<String> revAl = new ArrayList<String>();
        for (int i = al.size() - 1; i >= 0; i--) {
            revAl.add(al.get(i));
        }
		System.out.println(revAl);
		*/
		
		
		//Empty and ArrayList
		al.clear();
		System.out.println(al);
		
		
	}
}