import java.io.*;
public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		Contact[] contacts = new Contact[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter contact "+(i+1)+" detail:");
			String split = buff.readLine();
		//fill the code
			String a[]=split.split(",");
			contacts[i]=new Contact(a[0], a[1], a[2], a[3], a[4], a[5], Contact.sdf.parse(a[6]));
	}
		//fill the code
		for (int i = 0; i < contacts.length; i++) {
			System.out.println("\nContact "+(i+1)+":");
			System.out.println(contacts[i]);
		}
		System.out.println();
		if(contacts[0].equals(contacts[1]))
		{
			System.out.println("Contact 1 is same as Contact 2");
		}
		else
		{
			System.out.println("Contact 1 and Contact 2 are different");
		}
	}
}
