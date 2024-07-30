// TourPackage.java
package assignment04.question01;

public class TourPackage implements Comparable<TourPackage> {
    private int packageID;
    private String destination;
    private double price;

    public TourPackage(int packageID, String destination, double price) {
        this.packageID = packageID;
        this.destination = destination;
        this.price = price;
    }

    // Getters and setters (if needed)

    @Override
    public int compareTo(TourPackage other) {
        return this.destination.compareTo(other.destination);
    }

    @Override
    public String toString() {
        return "Package ID: " + packageID + ", Destination: " + destination + ", Price: " + price;
    }
}
