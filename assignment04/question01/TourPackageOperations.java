// TourPackageOperations.java
package assignment04.question01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TourPackageOperations {
    private List<TourPackage> packages;

    public TourPackageOperations() {
        packages = new ArrayList<>();
    }

    public void addPackage(TourPackage packageObj) {
        packages.add(packageObj);
    }

    public void sortPackagesByDestination() {
        Collections.sort(packages);
    }

    public void sortPackagesByPrice() {
        packages.sort(Comparator.comparingDouble(TourPackage::getPrice));
    }

    public void displayPackages() {
        for (TourPackage packageObj : packages) {
            System.out.println(packageObj);
        }
    }

    public static void main(String[] args) {
        TourPackageOperations tourOp = new TourPackageOperations();

        TourPackage package1 = new TourPackage(1, "Paris", 2000);
        TourPackage package2 = new TourPackage(2, "New York", 2500);
        TourPackage package3 = new TourPackage(3, "Tokyo", 1800);

        tourOp.addPackage(package1);
        tourOp.addPackage(package2);
        tourOp.addPackage(package3);

        System.out.println("Original packages:");
        tourOp.displayPackages();

        tourOp.sortPackagesByDestination();
        System.out.println("\nPackages sorted by destination:");
        tourOp.displayPackages();

        tourOp.sortPackagesByPrice();
        System.out.println("\nPackages sorted by price:");
        tourOp.displayPackages();
    }
}

