package emailapp;



import java.util.Scanner;

public class emailapp {
	public static void main(String agrs[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the firstname:");
		String em1=scan.nextLine();
		System.out.println("Enter the lastaname:");
		String em2=scan.nextLine();
		email em3=new email(em1,em2);
		System.out.println("\n");
		
	System.out.println(em3.Showinfo());
		 
	}
}

