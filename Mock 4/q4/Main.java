import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the group name:");
		//fill the code
		Group ob=new Group(buff.readLine(), new ArrayList<>());
		while(true)
		{
		System.out.println("1.Add Contact\n2.Delete Contact\n3.Display contacts\n4.Exit\nEnter your choice:");
		Integer choice=Integer.parseInt(buff.readLine());
		//fill the code
		switch (choice) {
		case 1:
			System.out.println("Enter the number of contacts:");
			int a=Integer.parseInt(buff.readLine());
			for (int i = 0; i < a; i++) 
			{
				String data=buff.readLine();
				ob.getContactList().add(Contact.createContact(data));
			}
			break;
		case 2:
			System.out.println("Enter the name of the contact to be deleted:");
			String name=buff.readLine();
			if(ob.removeContactFromGroup(name))
				System.out.println("Contact successfully deleted");
			else
				System.out.println("Contact not found in the group");
			break;	
		case 3:
			ob.displayContacts();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			break;
		}
		}
	}
}
