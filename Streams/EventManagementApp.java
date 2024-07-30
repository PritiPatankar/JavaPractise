//You need to filter out attendees below the age of 18 and sort them by name using Java 8 functionalities.

//Your task is to complete the following file:
    //1. EventManagementApp.java
package Streams;

import java.util.*;
import java.util.stream.Collectors;

class Attendee{
    int id;
    String name;
    int age;

    public Attendee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class EventManagementApp {

    public static List<Attendee> filterAndSortAttendees(List<Attendee> a1) {
        return a1.stream().filter(att -> att.age < 18).collect(Collectors.toList());

    }

 public static void main(String[] args) {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee(1, "Alice", 25));
        attendees.add(new Attendee(2, "Bob", 16));
        attendees.add(new Attendee(4, "David", 19));
        attendees.add(new Attendee(3, "Carol", 22));
        attendees.add(new Attendee(5, "Eve", 17));

        List<Attendee> filteredAndSorted = filterAndSortAttendees(attendees).sort(Comparator);;
        // List<Attendee> a = attendees.stream().filter(att -> att.age < 18).collect(Collectors.toList());
        for(Attendee A1 : filteredAndSorted){
            System.out.println(A1.id);
            System.out.println(A1.name);
            System.out.println(A1.age);
            System.out.println("---------------");
        }
 }
}
	//implement code

