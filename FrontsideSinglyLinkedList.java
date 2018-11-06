package LinkedList;

public class FrontsideSinglyLinkedList
{
	Node head ;			//Declared a new Node Object named as head
	
	public void input( Object data)		//Input Function is receiving value from main class
	{
		if(head == null)				// If 1st Node i.e., is Null means not exist
		{
			head = new Node() ;		// Initializing. Now head will create a int and node variable
			head.num = data ;		// Storing value received from main to int num of head Node
		}
		else
		{
			Node temp = new Node() ;	//data input > 1. Then, create a new node as temporary.
			
			temp.num = data ;			//allot data value to temp's Node value .
			temp.next = head ;		//Point temp node is pointing to head and newly created node
									//is the main Node which contains address of previous created
									//node(head).
			
			head = temp ;	// Now head will become temp means, head has the value of previous
							//in head.next and this temp is head only. It means, we are
							//assigning the value to privious node to current node and then
							// making it as head node.
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
