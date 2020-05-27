package hackerblock;

import java.util.*;
class LinkedList {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public void merge_sorted_list(LinkedList other) throws Exception {

        LinkedList ll = new LinkedList();         // Tostore the final Linked List

        Node temp1 = this.head;                  // Start from the first list
        Node temp2 = other.head;                // Start from the second list

        while(temp1 != null && temp2 != null){    // Iterate on both simultaneously

        if(temp1.data < temp2.data){      // If data of first list is less
        ll.addLast(temp1.data);             // add into the list
        temp1 = temp1.next;                 // Update the iterator
        }else{

        ll.addLast(temp2.data);          // otherwise add data of list2
        temp2 = temp2.next;              // Update the iterator 

        }


    }

    while(temp1 != null){   // Till list1 is not empty

    ll.addLast(temp1.data);  
    temp1 = temp1.next;

    }

    while(temp2 != null){   // Till list2 is not empty 
    ll.addLast(temp2.data);
    temp2 = temp2.next;
    }

       ll.display();                  // return the list
}



	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		    int t = scn.nextInt();
		    
		    while(t > 0){

			    LinkedList list1 = new LinkedList();
			    int n1 = scn.nextInt();
			 
			    for (int j = 0; j < n1; j++) {
				    int item = scn.nextInt();
				    list1.addLast(item);
			}

                LinkedList list2 = new LinkedList();
			    int n2 = scn.nextInt();
			 
			    for (int j = 0; j < n2; j++) {
				    int item = scn.nextInt();
				    list2.addLast(item);
			}
			    
			    list1.merge_sorted_list(list2);
			  

            t--;
            }
		
	}
}
