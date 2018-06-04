import java.text.SimpleDateFormat;
import java.util.*;

public class Contact {
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
	
	@Override
	public String toString() 
	{
		String tmp="";
		tmp=tmp+"Name:"+this.getName();
		tmp=tmp+"\nCompany:"+this.getCompany();
		tmp=tmp+"\nTitle:"+this.getTitle();
		tmp=tmp+"\nMobile:"+this.getMobile();
		tmp=tmp+"\nAlternate Contact:"+this.getAlternateMobile();
		tmp=tmp+"\nEmail:"+this.getEmail();
		tmp=tmp+"\nDate Created:"+sdf.format(this.getDateCreated());
		return tmp;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
