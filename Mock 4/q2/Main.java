import java.io.*;
public class Main {
    public static void main(String args[]) throws Exception{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Email Validation\n2.Service Provider Identification\nEnter your choice:");
		Integer choice=Integer.parseInt(buff.readLine());
		if(choice==1) {
			System.out.println("Enter the email to be validated:");
			//fill your code
			if(validateEmailId(buff.readLine()))
			{
				System.out.println("Email is valid");
			}
			else
				System.out.println("Email is invalid");
		}
		else if(choice==2) {
			System.out.println("Enter the mobile number to identify the service provider:");
			//fill your code
			String r=identifyServiceProvider(buff.readLine());
			if(r!=null)
			{
				System.out.println("Mobile number belongs to "+r);
			}
			else
				System.out.println("Mobile number is not identified");
		}
	}
	public static Boolean validateEmailId(String email) {
			//fill your code	
		String regex="^[a-zA-Z]{1}[a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}$";
		return email.matches(regex);
	}

	public static String identifyServiceProvider(String mobile) {
			//fill your code	
		String regex="^[0-9]{10}$";
		if(mobile.matches(regex))
		{
			int a=Integer.parseInt(mobile.substring(0, 4));
			if(a==9870)
			{
				return "Airtel";
			}
			if(a==7012)
			{
				return "Jio";
			}
			if(a==8180)
			{
				return "Vodafone";
			}
		}
		
		return null;
	}
}

