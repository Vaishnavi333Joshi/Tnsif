package Flight;

//Taking the name,source and destination from user and displaying the message
import java.util.*;

class Airlines {
    private String Name;
    private String Source;
    private String Destination;

    // Setting name
    public void setName(String name) {
        this.Name = name;
    }

    // getting name
    public String getName() {
        return Name;
    }

    // Setting Source
    public void setSource(String source) {
        this.Source = source;
    }

    // displaying Source
    public String getSource() {
        return Source;
    }

    // Setting Desti
    public void setDestination(String destination) {
        this.Destination = destination;
    }

    // displaying Desti
    public String getDestination() {
        return Destination;
    }

    // Displaying msg in full form
    public void writeMessage() {
        System.out.printf("Dear" + " " + getName() + ", " + "welcome onboard with service from" + " " + getSource()
                + " " + "to" + " " + getDestination() + "." + "Thank you for choosing Sky Airlines.Enjoy your flight.");

    }
}

public class Run {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Airlines flightAirlines = new Airlines();
        // Enter Name
        System.out.println("Enter the name");
        flightAirlines.setName(obj.next());
        // Enter Source
        System.out.println("Enter the Source");
        flightAirlines.setSource(obj.next());
        // Enter Destination
        System.out.println("Enter the Destinatiom");
        flightAirlines.setDestination(obj.next());
        // print message
        flightAirlines.writeMessage();
        obj.close();

    }
}
