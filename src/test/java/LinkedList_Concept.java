import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Concept {
	
	public static void main(String[] args){
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Selenim");
		ll.add("Java");
		ll.add("QTP");
		ll.add("Automation");
		
	//	System.out.println(ll);
		
		ll.addFirst("Naveen");
		ll.addLast("Karthik");
		//System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		//System.out.println(ll);
		
		//System.out.println(ll.get(0)); //Selenium
		
		ll.set(0, "SIKDER");
	//	System.out.println(ll.get(0));
		//System.out.println(ll.get(3));  //Automation
		
		ll.remove(2); //Remove java
		//System.out.println(ll);
		
		
		//How to print
		//--------------------------------------------------
		//for Loop
		//Advanced for loop
		//Iterator
		//while loop
		
	/*	for(int i=0; i<ll.size(); i++){
			System.out.println(ll.get(i));
		}*/
		
		/*for(String show: ll){
			System.out.println(show);
		}*/
		
		
		/*Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			String show = it.next();
			System.out.println(show);
		}*/
		
		
		//While loop
		/*int i=0;
		while(ll.size()>i){
			System.out.println(ll.get(i));
			i++;
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int i=0;
		while(ll.size()>i){
			System.out.println(ll.get(i));
			i++;
		}
		
		
	}
		
}
