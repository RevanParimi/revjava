import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ContactBO {
	public List<Contact> findContact(List<Contact> contactList,List<String> name){
		//fill the code
		List<Contact> mylist=new ArrayList<>();
		for (String s:name) 
		{
			for (Contact c:contactList) 
			{
				if(s.equals(c.getName()))
				{
					mylist.add(c);
					break;
				}
			}
		}
		return mylist;
	}
	
	public List<Contact> findContact(List<Contact> contactList,Date dateCreated){
		//fill the code
		List<Contact> mylist=new ArrayList<>();
		for (Contact c:contactList) 
		{
			if(dateCreated.equals(c.getDateCreated()))
			{
				mylist.add(c);
			}
		}
		return mylist;
	}
	
	public List<Contact> findContact(List<Contact> contactList,String emailDomain){
		//fill the code
		String regex="^.*@"+emailDomain+"\\..*$";
		List<Contact> mylist=new ArrayList<>();
		for (Contact c:contactList) 
		{
			if(c.getEmail().matches(regex))
				mylist.add(c);
		}
		return mylist;
	}
}
