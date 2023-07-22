class Flight {

    int id;
    String flightName;
    String companyName;
    String arrivalTime;
    String departureTime;
    String source;
    String destination;
    int totalSeats = 80;
    int availableSeats = 0;

    public Flight(int id, String flightName, String companyName, String arrivalTime, String departureTime, String source,String destination) 
    {
        this.id = id;
        this.flightName = flightName;
        this.companyName = companyName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.source=source;
        this.destination=destination;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightName() {
        return flightName;
    }
    
    public String getCompanyName()
    {
        return companyName;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    
    public void setSource(String source)
    {
        this.source=source;
    }
    
    public String getSource()
    {
        return source;
    }
    
    public void setDestination()
    {
        this.destination=destination;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public int getTotalSeats()
    {
        return totalSeats;
    }
    
    public int getAvailableSeats() {
        availableSeats = totalSeats--;
        return availableSeats;
    }
    
    

    
}
