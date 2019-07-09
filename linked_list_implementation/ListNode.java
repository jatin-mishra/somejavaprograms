package linkedlistimplementation;

public class ListNode<E> {
	
	private ListNode<E> next;
	private ListNode<E> prev;
	private E data;
	private String name;
	private int age;
	
	public ListNode(E data) {
		this.data = data;
		this.next = null;
		this.prev = null;
		this.name = "this is not your data node";
		this.age = 0;
	}
	
	public E getdata() {
		return this.data;
	}

	public ListNode<E> getNext() {
		return next;
	}

	public void setNext(ListNode<E> next) {
		this.next = next;
	}

	public ListNode<E> getPrev() {
		return prev;
	}

	public void setPrev(ListNode<E> prev) {
		this.prev = prev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
