package MainPackage;

import java.util.Scanner;
import Student.*;
import Books.*;
import Interface.*;
import ClearScreen.*;
import ActionPerformingFiles.*;

public class LibraryProject {
	

	
	public static void main(String [] args) throws Exception{					// Main Method		

		ClearScreen c = new ClearScreen();					// ClearScreen Object
		Scanner sc = new Scanner(System.in);					// Scanner Class Object
		Book book[] = new Book[20];						// Book class object's array
		FrontPage fpage = new FrontPage();
		SetCategory s = new SetCategory();
		char backward = 'b';
		
		
	do{	
		fpage.mainMenu();
		System.out.print("	Press any number [1,2,3...] ...  ");
		int option = sc.nextInt();

		switch(option){
			case 1:
				book[Book.number_of_books] = new Book();

				fpage.addBooks();
				System.out.print("		Press any number [1,2,3...] ... ");
				int choice = sc.nextInt();
				book[Book.number_of_books].book_category = s.setCategory(choice);
				fpage.addBooks2();
				book[Book.number_of_books].book_name = fpage.setName();
				book[Book.number_of_books].book_edition = fpage.setEdition();
				book[Book.number_of_books].book_quantity = fpage.setQuantity();
				Book.number_of_books++;
			
			break;
	
		}
		
		
		System.out.println("\n	  Do you want to go back... ");
		System.out.print("\n	  	Please enter [b] for back ... ");
		backward = sc.next().charAt(0);
		
		
	}while(backward == 'b' || backward == 'B');
	}
}