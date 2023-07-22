class Traveller{
    
    int id;
    String name;
    int mobile;
    String email;
    int flightId;
    
    public Traveller(int id, String name, int mobile, String email, int flightId)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.flightId=flightId;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    public void setMobile(int mobile){
        this.mobile=mobile;
    }
    public int getMobile(){
        return mobile;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getFlightId(){
        return flightId;
    }
}