import java.io.*; 

public class LinkedList<T> {
	
	Node head;
	LinkedList()
	{
		head=null;
	}
	class Node{
		Node next;
		T val;
		Node(T data)
		{
			val=data;
			next=null;
		}
	}
	void insertAtFront(T data)
	{
		Node new_node=new Node(data);
		if(head==null)
			head=new_node;
		else
		{
			new_node.next=head;
			head=new_node;
		}
			
	}
	void insertAtEnd(T data)
	{
		Node new_node=new Node(data);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=new_node;
	}
	void insertPos(T data,int pos)
	{
		Node new_node=new Node(data);
		Node temp=head;
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
		}
		new_node.next=temp.next;
		temp.next=new_node;
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
		
	}
		
		
		public static void main(String[] args) 
		{ 
		  LinkedList<Integer> l=new LinkedList<>();
		  l.insertAtFront(4);
		  l.insertAtFront(2);
		  l.insertAtEnd(7);
		  l.insertAtEnd(12);
		  l.insertPos(23, 2);
	      l.display();
		}

}
