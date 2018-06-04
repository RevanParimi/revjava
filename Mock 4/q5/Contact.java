import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact implements Comparable<Contact> {
	//fill the code
	private String name;
	private String company;
	private String title;
	private String mobile;
	private String alternateMobile;
	private String email;
	private Date dateCreated;
	static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String name, String company, String title, String mobile, String alternateMobile, String email,
			Date dateCreated) {
		super();
		this.name = name;
		this.company = company;
		this.title = title;
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.email = email;
		this.dateCreated = dateCreated;
	}
	
	
	public static Contact createContact(String detail) throws Exception{
		//fill the code
		String a[]=detail.split(",");
		return new Contact(a[0], a[1], a[2], a[3], a[4], a[5], sdf.parse(a[6]));
	}
	
	@Override
	public int compareTo(Contact arg0) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(arg0.getName());
	}
	
	/*public String getDomain()
	{
		String a[]=this.getEmail().split("@");
		String b[]=a[1].split("\\.");
		return b[0];
	}*/
	
	public String toString() {
		//fill the code
		String tmp="";
		tmp=tmp+tmp.format("%-15s %-15s %-20s %-15s %-20s %-15s %s", this.getName(),this.getCompany(),this.getTitle(),this.getMobile(),this.getAlternateMobile(),this.getEmail(),sdf.format(this.getDateCreated()));
		return tmp;
	}
}
