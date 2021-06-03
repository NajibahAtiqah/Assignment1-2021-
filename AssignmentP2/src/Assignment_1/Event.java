package Assignment_1;

public class Event {
	private String event;
	private String eventLocation;
	private String eventDate;
	private String eventTime;
	private String eventDuration;
	private double fee;
	
	//Create setter method
		public void setEvent(String event) {
		    this.event = event;
		  }
		
		  public void setEventLocation(String location) {
			    this.eventLocation = location;
		  }
		  
		  public void setEventDate(String date) {
		    this.eventDate = date;
		  }
		  
		  public void setEventTime(String time) {
			    this.eventTime = time;
		  }
		  
		  public void setEventDuration(String duration) {
			  this.eventDuration = duration;
		  }
		  
		  public void setFee(double fee) {
			  this.fee = fee;
		
		  }

		  // Create Getter Method
		  public String getEvent() {
			  return this.event;
		  }
		  
		  public String getEventLocation() {
			  return this.eventLocation;
		  }
		  
		  public String getEventDate() {
			  return this.eventDate;
		  }
		  
		  public String getEventTime() {
		 	  return this.eventTime;
		  }
		  
		  public String getEventDuration() {
			  return this.eventDuration;
		  }
		  public double getFee() {
			  return this.fee;
		  }
		  
		 

}
