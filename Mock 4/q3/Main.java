import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Contact> list=new ArrayList<Contact>();
		List<Contact> list1=new ArrayList<>();
		
		ContactBO cb = new ContactBO();
		System.out.println("Enter the number of contact details:");
		int n = Integer.parseInt(br.readLine());
		//fill you code
		for (int i = 0; i < n; i++) 
		{
			String m=br.readLine();
			String b[]=m.split(",");
			list.add(new Contact(b[0], b[1], b[2], b[3], b[4], b[5], Contact.sdf.parse(b[6])));
		}
		System.out.println("Enter a search type:\n1.Name\n2.Date created\n3.Email domain");
		int choice=Integer.parseInt(br.readLine());
		if(choice==1){
			System.out.println("Enter the names:");
			String names=br.readLine();
			//fill you code
			List<String> nlist=new ArrayList<>();
			String q[]=names.split(",");
			for (int i = 0; i < q.length; i++) 
			{
				nlist.add(q[i]);
			}
			list1=cb.findContact(list, nlist);
			
		}
		else if(choice==2){
			System.out.println("Enter the date to search contacts that were created on that date");
			//fill you code	
			String d=br.readLine();
			list1=cb.findContact(list, Contact.sdf.parse(d));
	}
		else if(choice==3){
			System.out.println("Enter the Email domain to search contacts that have same email domain");
			String domain=br.readLine();
			//fill you code	
			list1=cb.findContact(list, domain);
			}
		else{
			System.out.println("Invalid choice");
			System.exit(0);
		}
		
		System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", "Name","Company","Title","Mobile","Alternate Mobile","Email","Date Created");
		for (Contact c:list1) 
		{
			System.out.println(c);
		}
	}
}

