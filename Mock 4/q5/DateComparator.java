import java.util.Comparator;

public class DateComparator extends Contact implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {
		// TODO Auto-generated method stub
		return o1.getDateCreated().compareTo(o2.getDateCreated());
	}

	//fill the code
	
}
