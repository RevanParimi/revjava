import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Contact> contactList=new ArrayList<Contact>();
		System.out.println("Enter the number of the contacts:");
		Integer count=Integer.parseInt(br.readLine());
		//fill the code
		for(int i=0;i<count;i++)
		{
			contactList.add(Contact.createContact(br.readLine()));
		}
		System.out.println("Enter a type to sort:\n1.Sort by name\n2.Sort by email domain\n3.Sort by date created");
		Integer choice=Integer.parseInt(br.readLine());
		//fill the code
		switch (choice) {
		case 1:
			Collections.sort(contactList);
			break;
		case 2:
			Collections.sort(contactList, new DomainComparator());
			break;
		default:
			Collections.sort(contactList, new DateComparator());
			break;
		}
		System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", "Name","Company","Title","Mobile","Alternate Mobile","Email","Date Created");
		for (Contact contact : contactList) {
			System.out.println(contact);
		}
	}
}
