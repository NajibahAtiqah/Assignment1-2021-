package Assignment_1;

public class Adsvertisment {
	private String association;
	private String event;
	private int voucher;
	
	public Adsvertisment(String event,int voucher) {//2 argument constructor
		System.out.println("__________________________________________________________________");
		System.out.println("             Join us now and be part of our story!");
		System.out.println();
		association = "Cahaya Cancer Association";
		this.event = event;
		this.voucher = voucher;
	}
	
	public void printDetails() {
		System.out.println(association +"is going to held: "+ event);
		System.out.println("The fee is RM80.0 per person");
		System.out.println("For those that joining this, going to get Shoppee's voucher, RM"+ voucher+ " OFF!");
		System.out.println();
	}
	public void eventLink() {
		System.out.println("For more details, you can browse the link that we provided below.");
		System.out.println("https://www.cahayacancerassociation.com/event");
		System.out.println("__________________________________________________________________");
	}
}
