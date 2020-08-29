package Sorting_searching;
//Java implementation of the approach 
class Selectionsortl{ 

	
	static class Node { 
		int data; 
		Node next; 
	}; 

	 
	static Node newNode(int val) 
	{ 
		Node temp = new Node(); 

		temp.data = val; 

		temp.next = null; 

		return temp; 
	} 

	
	static Node selectionSort(Node head) 
	{ 
		Node a, b, c, d, r; 

		a = b = head; 

		
		while (b.next != null) { 

			c = d = b.next; 

			
			while (d != null) { 

				if (b.data > d.data) { 

					
					if (b.next == d) { 

					
						if (b == head) { 

							 
							b.next = d.next; 
							d.next = b; 

							
							r = b; 
							b = d; 
							d = r; 

							c = d; 

							
							head = b; 

							d = d.next; 
						} 

		else { 

							
							b.next = d.next; 
							d.next = b; 
							a.next = d; 

														r = b; 
							b = d; 
							d = r; 

							c = d; 

							d = d.next; 
						} 
					} 

					else { 

		if (b == head) { 

							 
							r = b.next; 
							b.next = d.next; 
							d.next = r; 
							c.next = b; 

							
							r = b; 
							b = d; 
							d = r; 

							c = d; 

							
							d = d.next; 

														head = b; 
						} 

						 
						else { 

														r = b.next; 
							b.next = d.next; 
							d.next = r; 
							c.next = b; 
							a.next = d; 

							
							r = b; 
							b = d; 
							d = r; 

							c = d; 

							
							d = d.next; 
						} 
					} 
				} 
				else { 

					c = d; 
					d = d.next; 
				} 
			} 

			a = b; 
			b = b.next; 
		} 

		return head; 
	} 

		static void printList(Node head) 
	{ 
		while (head != null) { 
			System.out.print(head.data + " "); 
			head = head.next; 
		} 
	} 

		public static void main(String args[]) 
	{ 
		Node head = newNode(5); 
		head.next = newNode(4); 
		head.next.next = newNode(3); 

		head = selectionSort(head); 

		printList(head); 
	} 
} 



