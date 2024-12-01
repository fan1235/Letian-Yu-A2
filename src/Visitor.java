public class Visitor extends Person {
    private String ticketType;
    private int ridesTaken;

    public Visitor() {}

    public Visitor(String name, int age, String id, String ticketType, int ridesTaken) {
        super(name, age, id);
        this.ticketType = ticketType;
        this.ridesTaken = ridesTaken;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getRidesTaken() {
        return ridesTaken;
    }

    public void setRidesTaken(int ridesTaken) {
        this.ridesTaken = ridesTaken;
    }
}
