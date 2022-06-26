import java.util.*;

class LinkedListEx{
	public static void main(String args[]){
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll);
		
		
		//Iterate Elements
		for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+" ");
        }
		System.out.println();
		
		
		//Iterate Reverse Order
		for (int i = ll.size()-1; i >= 0 ; i--) {
            System.out.print(ll.get(i)+" ");
        }
		System.out.println();
		
		//Insert element in middle
		ll.add(2,5);
		System.out.println(ll);
		
		
		//Insert element at first and last position
		ll.add(0,6);
		ll.offer(7); // or ll.add(7);
		System.out.println(ll);
		
		
		//Add at first position
		ll.addFirst(8);
		System.out.println(ll);
		
		
		//Insert element in specified position
		ll.add(1,9);
		System.out.println(ll);
		
		
		//Get first and last element
		int firstEle = ll.peekFirst();
		int lastEle = ll .peekLast();
		System.out.println(firstEle);
		System.out.println(lastEle);
		System.out.println(ll);
		
		
		//Remove first and last element
		ll.pollFirst();
		ll.pollLast();
		System.out.println(ll);
		
		
		//Swap
		int ele1 = 6;
		int ele2 = 3;
		int index1 = ll.indexOf(ele1);
        int index2 = ll.indexOf(ele2);
		if(index1 == -1 || index2 == -1) System.out.println("Element not in list");
		else{
			ll.set(index1, ele2);
			ll.set(index2, ele1);
			System.out.println(ll);
		}
        
		
		//Join two lists
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(20);
		ll2.add(21);
		ll2.add(22);
		ll.addAll(ll2);
		System.out.println(ll);
		
		
		//Check if element exists
		if(ll.contains(5)) System.out.println("Element is present in list");
		else System.out.println("Element is not present in list");
		
		
		//LinkedList to ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		for(Integer o : ll){
			al.add(o);
		}
		System.out.println(al);
		
		
		//Compare two Linked Lists
		LinkedList<Integer> ll3 = new LinkedList<>();
		ll3.addAll(ll);
		int flag=0;
		System.out.println(ll3);
		for(int j=0;j<ll3.size();j++){
			if(ll.get(j) != ll3.get(j)) {
				flag=1;
				break;
			}
		}
		if(flag==1) System.out.println("Two lists are not same");
		else System.out.println("Two lists are same");
		
		
		//Check if list is empty
		//ll.clear();
		if(ll.isEmpty()) System.out.println("Empty List");
		else System.out.println("Not Empty List");
		
		
		//Replace Element
		ll.set(3,10);
		System.out.println(ll);
	}
}