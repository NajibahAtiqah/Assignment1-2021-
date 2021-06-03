package Assignment_1;

public class CancerAssociation {//define class

	String associationName, address, contactNum, email, website, aboutAssociation;
	//pre-define class

	public CancerAssociation(String name) {//1 argument constructor
		
		this.associationName = name;
		this.address = "195, Taman Manis, 17500 Tanah Merah, Kelantan";
		this.contactNum = "\n"+"1) 09-9555875 (Office)"
				+ "\n" +"2) 09-9551663 (Fax)";
		this.email = "cahaya.association@gmail.com";
		this.website = "www.cahayacancerassociationtm.com.my";
		this.aboutAssociation = "We want to raise public awareness about cancer through education";
	}
	
	public void printInfo() {
		System.out.println("     ==============================");
		System.out.println("     |                            |");
		System.out.println("     |          ABOUT US          |");
		System.out.println("     ==============================");
		System.out.println("Name: "+this.associationName);
		System.out.println("Address:" + this.address);
		System.out.println("Contact Number: " + this.contactNum);
		System.out.println("Email: " +this.email);
		System.out.println("Website: " +this.website);
		System.out.println("What We Do: "+this.aboutAssociation);
	}
}
