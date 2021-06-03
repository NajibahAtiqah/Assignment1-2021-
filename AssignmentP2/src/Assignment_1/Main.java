package Assignment_1;
import java.util.Scanner;
public class Main {

	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int choose;
		 
		 System.out.println("                 _______________________________________________");
		 System.out.println("                      xx CAHAYA CANCER ASSOCIATION xx");
		 System.out.println("                                 EST 2009");
		 System.out.println("                 _______________________________________________");
		 System.out.println();
		 
		 CancerAssociation NGO = new CancerAssociation("Cahaya Cancer Association");//1 argument constructor
		 NGO.printInfo();
		 System.out.println();
		 System.out.println("Choose Option: \n(1) Registration"
			 		+ " \n(2) Financial \n");
		 
		 do {
			System.out.print("Enter option: ");
			int option = s.nextInt();
			if(option == 1) {
				Adsvertisment A = new Adsvertisment("Pink Ribbon Charity Dinner", 15);
				A.printDetails();
				A.eventLink();
				System.out.println();
				
				Event E1 = new Event();
				E1.setEvent("Pink Ribbon Charity Dinner");
				E1.setEventDate("19 May 2022");
				E1.setEventTime("8.45 PM");
				E1.setEventLocation("Shangri-La Hotel");
				E1.setEventDuration("2 hours and 30 minutes");
				E1.setFee(80.00);
				System.out.println("-------------------------------------");
				System.out.println("|  Event: "+E1.getEvent()+             "|");
				System.out.println("|  Date: "+E1.getEventDate()+"                |");
				System.out.println("|  Time: "+E1.getEventTime()+"                    |");
				System.out.println("|  Venue: "+E1.getEventLocation()+"          |");
				System.out.println("|  Duration: "+E1.getEventDuration()+" |");
				System.out.println("|  Fee: "+E1.getFee()+"                        |");
				System.out.println("-------------------------------------");

				ParticipantRegistration P1 = new ParticipantRegistration("Pink Ribbon Charity Dinner");
				P1.registration();
				System.out.println();
				System.out.println("Donation is not about giving. It's making a difference. Any donation?");
				System.out.println("Enter amount: RM");
				int amount = s.nextInt();
				if(amount != 0) {
					System.out.println("Thankyou for your generous gift to Cahaya Cancer Association");
				}
				else {
					System.out.println("It's okay. Thankyou.");
				}
			}
			else {
				System.out.println();
				System.out.println("Financial Section");
				System.out.println();
		 
		 Finance f = new Finance(2589.90, 3345.67, 10000.00, 80.0, 30);
		 f.FinancialSatement();
}
			System.out.println();
			System.out.println("Do you want to continue? (1)Yes "+ "(2)Exit");
			choose = s.nextInt();
		 }while(choose == 1);
}
	}
