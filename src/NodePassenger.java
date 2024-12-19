public class NodePassenger {
    int passengerId;
    String passengerName;
    String passNum;
    NodePassenger next;

    public NodePassenger(int passengerId, String passengerName, String passNum) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passNum = passNum;
        this.next = null;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void display() {
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Name: " + passengerName);
        System.out.println("Passport Number: " + passNum);
    }
}
