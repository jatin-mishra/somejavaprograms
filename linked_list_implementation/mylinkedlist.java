package linkedlistimplementation;

public class mylinkedlist<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	
	public  mylinkedlist() {
		setHead(new ListNode<E>(null));
		setTail(new ListNode<E>(null));
		getHead().setNext(getTail());
		getTail().setPrev(getHead());
	}

	public ListNode<E> getHead() {
		return head;
	}

	public void setHead(ListNode<E> head) {
		this.head = head;
	}

	public ListNode<E> getTail() {
		return tail;
	}

	public void setTail(ListNode<E> tail) {
		this.tail = tail;
	}
	
	

}
