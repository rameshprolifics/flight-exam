
public class Main
{
	public static void main(String[] args) {
		
		Airport ai = new Airport();
		
		System.out.println("Flight Added in Flight Class");
		System.out.println();
		ai.addFlight(new Flight(1,"MG-Flight","DRN-Company","6:37AM","8:12PM","BNG","MUM"));
		System.out.println(ai.addFlight(new Flight(2,"VG-Flight","DRN-Company","6:30AM","7:12PM","HYD","MUM")));
		
		System.out.println();
		System.out.println("Before booking search the flight by name and destination");
		System.out.println();
		ai.searchFlightBySourceDestination("HYD","MUM");
		
		System.out.println();
		System.out.println("After Booking the Ticket the avaible seats get minus of the flight only");
		System.out.println();
		ai.bookTicket(new Traveller(1,"Ramesh",987654,"ram@email.com",1));
		ai.bookTicket(new Traveller(2,"Suresh",321456,"sur@gmail.in",2));
		ai.bookTicket(new Traveller(1,"Rajesh",789654,"dhee@gmail.in",2));
		
		
		System.out.println();
		System.out.println("Searching after booking flight so seat should defferent from flights to flight");
		System.out.println();
		ai.searchFlightBySourceDestination("HYD","MUM");
		
		
		
	}
}
