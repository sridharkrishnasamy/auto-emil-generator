package emailapp;

import java.util.*;

public class email {


private static final String String = null;
private String fristname;
private String lastname;
private String password;
private int defaultpassword=8;
private String  email;
private int mailboxCapacity=500;
private String department;
private String alterEmail;
private String company="4ipvt.com";
private int index=0;


	//create a constructor for firstname and lastname
	public email(String fristname,String lastname) {
		this.fristname=fristname;
		this.lastname=lastname;
		System.out.println("New Employee:"+ this.fristname +" "+this.lastname);
	
	//	call a method for asking dept and return the dept
		this.department=setdepartment();
		System.out.println("Department:"+this.department);
		
	//	combine the  given element to generate email
		this.email=fristname.toLowerCase()+ lastname.toLowerCase()+"@"+department+"."+company;
		System.out.println("your email:"+ this.email);
	
	//	call a method for generate random password
		this.password=randompassword(defaultpassword);
		System.out.println("your password is:"+this.password);
	
	
}


//ask for dept
	private String setdepartment() {
		System.out.println("Dept Codes\n 1 for sales\n 2 for development\n 3 for accounting\n 0 for exit");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your department code:");
		int deptchoice = scan.nextInt();
		
		if (deptchoice==1) {
			return "sales";
		}
		else if  (deptchoice==2) {
			return "development";
		}
		else if (deptchoice==3) {
			return "accounting";
		}
		else if(deptchoice==0) {
			return "exited";
		}
		else {
			return "enter the right choice";
			
		}
}



//generate a random password
	private String randompassword(int length){
		String passwordchars="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@_";
		char[] passwords=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordchars.length());
			passwords[i]= passwordchars.charAt(rand);
		}
		return new String(passwords);
		}



//set mail capacity	
	public void setmailcapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}

//set alternate mail
	public void setalternateEmmail(String altemail) {
		this.alterEmail=altemail;
	}



	public void setpassword(String password) {
		this.password=password;
	}

	
	public int getmailcapacity() {return mailboxCapacity;}

	public String getaltemail()  {return alterEmail;}
	public String getpassword()  {return password;}
	
	public String Showinfo() {
		return "DISPLAY NAME: "+fristname+" "+lastname +
				"\nCOMPANY MAIL: "+ email +
				"\nMAIL CAPACITY: "+mailboxCapacity+"mb"+
				"\nPASSWORD: "+password;
	}
	
	
}