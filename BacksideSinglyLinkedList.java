package LinkedList;

public class BacksideSinglyLinkedList
{
	Node head ;			//Declared a new Node Object named as head
	
	public void input( Object data)		//Input Function is receiving value from main class
	{
		if( head == null)				// If 1st Node i.e., is Null means not exist
		{
			head = new Node() ;		// Initializing. Now head will create a int and node variable
			head.num = data ;		// Storing value received from main to int num of head Node
		}
		else
		{
			Node temp = new Node() ;	//data input > 1. Then, create a new node as temporary.
			temp.num = data ;			//allot data value to temp's Node value .
			
			Node ptr = head ;		//Make one more new node as ptr as give it's value as head ;
			
			while(ptr.next != null)		//Now check the last node where Null is available
										//i.e, recently last node created.
			{
				ptr = ptr.next ;		// This will help in switching the node till Last
			}
			ptr.next = temp ;			// Now ptr is pointed to last node which has null value
										// in it's ptr.next value & assign that next value to temp node
		}
	}
	
	public void print()
	{
		Node temp = head ;		// Create a node of any name say temp & point to head node ;
		
		while( temp != null)	// Now, head will be switching till last node
		{
			System.out.print( temp.num +"  ") ;		// Before switching we are printing value
			temp = temp.next ;						//This temp.next help in switching
		}
		System.out.println("") ;
	}
}
