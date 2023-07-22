import java.util.ArrayList;

class Airport{
    
    ArrayList<Flight> flight = new ArrayList<>();
    
    ArrayList<Traveller> traveller = new ArrayList<>();
    
    
    
    public boolean addFlight(Flight fli)
    {
        if(fli instanceof Flight)
        {
            Flight f1 = (Flight)fli;
            flight.add(f1);
            return true;
            
        }
        return false;
    }
    
    
    public void searchFlightBySourceDestination(String source, String destination)
    {
        for(Flight fl : flight)
        {
            if(fl.getSource().equals(source) || fl.getDestination().equals(destination))
            {
               if(fl.availableSeats==0)
               {
                    System.out.println(fl.getId()+" "+fl.getFlightName()+" "+fl.getCompanyName()+" "+fl.getSource()+" "+fl.getArrivalTime()+" "+fl.getDepartureTime()+" "+fl.getTotalSeats());
               }
               else{
                   System.out.println(fl.getId()+" "+fl.getFlightName()+" "+fl.getCompanyName()+" "+fl.getSource()+" "+fl.getArrivalTime()+" "+fl.getDepartureTime()+" "+fl.getAvailableSeats());
                   
               }
               
            }
        }
        
    }
    
    
    public void bookTicket(Traveller tr){
        if(tr instanceof Traveller)
        {
            Traveller t = (Traveller)tr;
            traveller.add(t);
            
            for(Flight fl:flight)
            {
                if(t.getFlightId()==fl.getId())
                {
                    fl.getAvailableSeats();
                    System.out.println("E-Flight Ticket");
                    System.out.println("----------------------------------");
                    System.out.println("Traveller Name        :"+t.getName());
                    System.out.println("Traveller Id          :"+t.getId());
                    System.out.println("Booked Flight Id      :"+t.getFlightId());
                    System.out.println("Booked Flight Nmae    :"+fl.getFlightName());
                }
            }
        }
    }
    
    
    
    
}