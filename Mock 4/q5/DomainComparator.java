import java.util.Comparator;

public class DomainComparator extends Contact implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {
		// TODO Auto-generated method stub
		String a[]=o1.getEmail().split("@");
		String b[]=a[1].split("\\.");
		String a1[]=o2.getEmail().split("@");
		String b1[]=a1[1].split("\\.");
		return b[0].compareTo(b1[0]);
	}

	
	//fill the code
}
