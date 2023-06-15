package collections.doublylinkedlist;

public class DoublyLL {

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	Node head;

	public void fadd(int data)// Adding at first
	{
		Node n = new Node(data);
		n.next = head;// Making the new node as head
		n.prev = null;// assignig new node's prev value as null so that it becomes new head
		if (head != null) {
			head.prev = n;// changing prev of head node from null to new node
		}
		head = n;// head pointing toward new node
	}

	public void ladd(int data) // adding at last
	{
		Node n = new Node(data);
		Node last = head; // Make the node at last as head
		n.next = null; // Point the new node next value as null so that it becomes new tail
		if (head == null) // if the LL is empty then make the new node as head
		{
			n.prev = null;
			head = n;
			return;
		}
		while (last.next != null) // while last is pointing as null
		{
			last = last.next;
		}
		last.next = n; // next value of last is pointing as null to become new tail
		n.prev = last; // and prev value is pointing toward last Node
	}

	public void delete(Node n, Node d) // deletion of node at head
	{
		if (head == null || d == null) // when the node to be deleted is null
		{
			return;
		}
		if (head == d) // if the node to be deleted is head
		{
			head = d.next; // point the head towards new head
		}
		if (d.next != null) // Change next only if node to be deleted is NOT the last node
		{
			d.next.prev = d.prev;
		}
		if (d.prev != null) // Change prev only if node to be deleted is NOT the first node
		{
			d.prev.next = d.next;
		}
		return;
	}

	public void disp() // traversing
	{
		Node curr = head;
		Node last = null;
		while (curr != null) {
			System.out.print(curr.data + " ");
			last = curr;
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLL dl = new DoublyLL();
		dl.fadd(1);
		dl.fadd(131);
		dl.fadd(21);
		dl.fadd(22);
		dl.disp();
		dl.ladd(12);
		dl.disp();
		dl.ladd(2);
		dl.delete(dl.head, dl.head);
		dl.disp();
	}
}