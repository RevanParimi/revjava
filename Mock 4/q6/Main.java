import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Contact> list = new ArrayList<Contact>();
		System.out.println("Enter the number of contacts:");
		int n = Integer.parseInt(br.readLine());
		//fill the code
		for(int i=0;i<n;i++)
		{
			list.add(Contact.createContact(br.readLine()));
		}
		System.out.format("%-15s %s\n","Domain Name","Count");
		//fill the code
		Map<String, Integer> map1=Contact.getContactCountForDomain(list);
		//System.out.format("%-15s %s\n","Domain Name","Count");
		for(String s:map1.keySet())
		{
			System.out.format("%-15s %s\n",s,map1.get(s));
		}
	}
}
