package linkedlistimplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclassforlinking {

	public int size_of_list() {
		return 0;
	}
	
	
	public static <E> void insert_instance(mylinkedlist<E> have_last_and_start , ListNode<E> instance) {
		
		ListNode<E> iterator = have_last_and_start.getTail().getPrev();
		instance.setNext(iterator.getNext());
		instance.setPrev(iterator);
		iterator.getNext().setPrev(instance);
		iterator.setNext(instance);
				
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public static <E> void addLast(mylinkedlist<E> mainclass) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		E mydata;
		
		System.out.println("enter the name ");
		name = br.readLine();
		System.out.println("enter the age ");
		age = Integer.valueOf(br.readLine());
		System.out.println("enter your data");
		mydata = (E)(br.readLine());
		ListNode<E> instance = new ListNode<E>(mydata);
		instance.setAge(age);
		instance.setName(name);
		
		insert_instance(mainclass,instance);
		
	}
	
	
	public static <E> void remove(mylinkedlist<E> list,String name){
		int flag = 0 ;
		ListNode<E> searching_for_deletion = list.getHead();
		while(searching_for_deletion.getNext() != list.getTail() ) {
			
			if(searching_for_deletion.getNext().getName().equals(name)) {
				flag = 1;
				break;
			}
			searching_for_deletion = searching_for_deletion.getNext();
		}
		if(flag == 1) {
			
			searching_for_deletion.getNext().getNext().setPrev(searching_for_deletion);
			searching_for_deletion.setNext(searching_for_deletion.getNext().getNext());
			
		}else {
			System.out.println("sorry! there is no such element");
		}
		
		
	}
	
	public static <E> void print_all(mylinkedlist<E> l) {
		
		ListNode<E> instance_to_print = l.getHead().getNext();
		while(instance_to_print != l.getTail()) {
			System.out.println("name : "+instance_to_print.getName());
			System.out.println("age : "+ instance_to_print.getAge());
			System.out.println("data : "+instance_to_print.getdata());
			instance_to_print = instance_to_print.getNext();
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		int choice , instance_numbers = 0;
		String name;
		int want_more = 1;
		
		
		mylinkedlist<Integer> list1 = new mylinkedlist<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(!(want_more == 0)) {
			
			System.out.println("you are going to traverse the list");
			System.out.println("enter : "
					+ "1. to add element "
					+ "2. to remove element"
					+ "3. to get the size "
					+ "4. to get info of the class");
		 choice = Integer.valueOf(br.readLine());
			switch(choice) {
			
			case 1:
				System.out.println("you are going to add the elements ");
				addLast(list1);
				instance_numbers++;
				System.out.println("element is added ");
				break;
			case 2:
				if(instance_numbers > 0) {
					System.out.println("you are going to delete the element , so enter the name whose data you want to delete");
					name = br.readLine();
					remove(list1, name);
					instance_numbers--;
				}
				else {
					System.out.println("sorry! list is empty");
				}
				break;
			case 3:
				System.out.println("number of entries :  " + instance_numbers );
				break;
			case 4:
				System.out.println(" we are going to print whole list ");
				if(instance_numbers > 0) {
					print_all(list1);
				}else {
					System.out.println("it is empty");
				}
				break;
			
			}
//			System.out.println("do you want more analysis");
//			want_more = Integer.valueOf(br.readLine());
			
		}

	}

}
