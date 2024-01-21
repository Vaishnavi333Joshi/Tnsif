package Flight;

public class Airlines {
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
