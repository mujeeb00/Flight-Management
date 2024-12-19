class NodeFlight {
    int flightId;
    City source;
    City destination;
    NodePassenger[] seats;
    NodeFlight next;

    public NodeFlight(int flightId, City source, City destination, int capacity) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.seats = new NodePassenger[capacity];
        this.next = null;
    }

    public int getVacantSeats() {
        int count = 0;
        for (NodePassenger seat : seats) {
            if (seat == null) {
                count++;
            }
        }
        return count;
    }

    public void display() {
        System.out.println("Flight ID: " + flightId);
        System.out.println("Source: " + source.getName());
        System.out.println("Destination: " + destination.getName());
        System.out.println("Vacant Seats: " + getVacantSeats());
    }
}
