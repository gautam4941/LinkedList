package LinkedList;

import java.util.Scanner ;

public class main
{
	public static Scanner sc = new Scanner( System.in) ;
	public static BacksideSinglyLinkedList bsll ;
	public static FrontsideSinglyLinkedList fsll ;
	
	public static void main(String[] args)
	{
		int op, frontorback ;
		
		System.out.println("1.Data will added toward right side or Backward side") ;
		System.out.println("2.Data will added toward Left side or Front side") ;
		frontorback = sc.nextInt() ;
		
		if(frontorback == 1)
		{
			bsll = new BacksideSinglyLinkedList() ;
			
			while(true)
			{
				System.out.println("1. Push, 2. Print, 3. Break   :-   ") ;
				op = sc.nextInt() ;
				
				if(op == 1)
				{
					input(frontorback) ;
				}
				else if(op == 2)
				{
					bsll.print() ;
				}
				else if(op == 3)
				{
					break ;
				}
				else
				{
					System.out.println("Please, Choose correct Input ");
				}
			}
		}
		else if(frontorback == 2)
		{
			fsll = new FrontsideSinglyLinkedList() ;
			
			while(true)
			{
				System.out.println("1. Push, 2. Print, 3. Break   :-   ") ;
				op = sc.nextInt() ;
				
				if(op == 1)
				{
					input(frontorback) ;
				}
				else if(op == 2)
				{
					fsll.print() ;
				}
				else if(op == 3)
				{
					break ;
				}
				else
				{
					System.out.println("Please, Choose correct Input ");
				}
			}
		}
		else
		{
			System.out.print("Please Choose correct option");
		}
	}
	public static void input( int frontorback)
	{
		if(frontorback == 1)
		{
			System.out.print("Enter a number  :-  ") ;
			bsll.input( sc.nextInt() ) ;
		}
		else
		{
			System.out.print("Enter a number  :-  ") ;
			fsll.input( sc.nextInt() ) ;
		}
	}
}