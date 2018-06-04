import java.util.List;
public class Group {
	//fill the code
	private String name;
	private List<Contact> contactList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Group(String name, List<Contact> contactList) {
		super();
		this.name = name;
		this.contactList = contactList;
	}
	
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Contact> getContactList() {
		return contactList;
	}
	
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
	public void addContactToGroup(Contact contact)
	{
		this.getContactList().add(contact);
	}
	
	public Boolean removeContactFromGroup(String name) {
		//fill the code
		for (Contact c:this.getContactList()) 
		{
			if(name.equals(c.getName()))
			{
				this.getContactList().remove(c);
				return true;
			}
		}
		return false;
	}
	
	public void displayContacts() {
		//fill the code
		if(this.getContactList().isEmpty())
		{
			System.out.println("No contact to show");
		}
		else
		{
			System.out.println("Contacts in "+this.getName());
			System.out.format("%-15s %-15s %-20s %-15s %-15s %-15s %s\n", "Name","Company","Title","Mobile","Alternate Mobile","Email","Date Created");
			for (Contact c:this.getContactList()) 
			{
				System.out.println(c);
			}
		}
	}
}
