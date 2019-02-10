package SinglyLL;
import java.util.Scanner;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		System.out.println("Singly Linked List Test\n");
		
		char ch;
		
		do {
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. insert at begining");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. check empty");
			System.out.println("6. get size");
			
			int choice = scan.nextInt();
			
			switch (choice) {
			
			case 1: 
				System.out.println("Enter Name element to insert");
				list.insertAtStart(scan.next());
				break;
				
			case 2: 
				System.out.println("Enter Name element to insert");
				list.insertAtEnd(scan.next());
				break;
				
			case 3: 
				System.out.println("Enter Name element to insert");
				String city = scan.next();
				System.out.println("Enter Position");
				int pos = scan.nextInt();
				if(pos <= 1 || pos > list.getSize()) {
					System.out.println("Invalid position\n");
				}else {
					list.insertAtPos(city, pos);
				}
				break;
				
			case 4:
				System.out.println("Enter position");
				int p = scan.nextInt();
				if(p < 1 || p > list.getSize()) {
					System.out.println("Invalid position\n");
				}else {
					list.deleteAtPos(p);
				}
				break;
				
			case 5:
				System.out.println("Empty status = " + list.isEmpty() + "\n");
				break;
				
			case 6:
				System.out.println("Size = " + list.getSize() + "\n");
				break;
				
				default:
					System.out.println("Wrong Entry \n");
					break;
			}
			
			list.display();
			
			System.out.println("\nDo you wnat to continue (Type y or n) \n");
			
			ch = scan.next().charAt(0);
			
		} while (ch == 'Y' || ch == 'y');
	

	}

}
