package Interface;
import java.util.Scanner;
import ClearScreen.*;
public class FrontPage{
	Scanner sc = new Scanner(System.in);
	ClearScreen c = new ClearScreen();
	String name;
	String edition;
	int quantity;		
	public void mainMenu() throws Exception{
		c.cls();
		System.out.println("         		  =========WELCMOME TO SUKKUR IBA KNOWLEDGE CENTER===========\n");
		System.out.println("	[1] - Add New Book .... ");
	}
	
	public void addBooks ()throws Exception{
		
		c.cls();
		System.out.println("		     		    Please Select the Category of Book");
		System.out.println("         	   ----------------------------------------------------------------------------\n");
		System.out.println(" 	[1]- Programming");
		System.out.println(" 	[2]- Buisness ");
		System.out.println(" 	[3]- Novels");
		System.out.println(" 	[4]- Mathematics");
	}
	
	public void addBooks2()throws Exception{
		c.cls();
		System.out.println("		     		    Please Fill the Details of the Book");
		System.out.println("         	   ----------------------------------------------------------------------------\n");
		System.out.print(" 	Please Enter the Name of Book : ");
		name = sc.nextLine();
		System.out.print(" 	Please Enter the Edition of the Book : ");
		edition = sc.nextLine();
		System.out.print(" 	Please Enter the Quantity of Book : ");
		quantity = sc.nextInt();
	}
	public String setName(){
		return name;
	}
	public String setEdition(){
		return edition;
	}
	public int setQuantity(){
		return quantity;
	}
}

