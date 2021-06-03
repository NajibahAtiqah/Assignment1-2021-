package Assignment_1;
import java.util.Scanner;

public class ParticipantRegistration {
	private String name;
	private String email;
	private String event;
	private int age;
	private int phoneNum;
	private int donation;
	
	Scanner s = new Scanner (System.in);

	public ParticipantRegistration(String event) {
		System.out.println();
		System.out.println(event+ "'s Registration");
		System.out.println("-------------------------------------------------");
		
}
	public void registration() {
		System.out.println("Please enter the needed information in order to join the event.");
		System.out.print("Name: ");
		this.name = s.nextLine();
		System.out.print("Age: ");
		this.age = s.nextInt();
		System.out.print("Phone Number: ");
		this.phoneNum = s.nextInt();
		System.out.print("Email: ");
		this.email=s.nextLine();
		this.email=s.nextLine();
		System.out.println("And you're done! We will contact you through email for the confirmation.");
	}
	
	public void donationCollected() {
		this.donation = s.nextInt();


	
}
	}
