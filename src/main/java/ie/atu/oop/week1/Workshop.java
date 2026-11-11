package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Set;

public class Workshop {
    private final String workshopName;
    private final int capacity;
    Set<String> ID = new HashSet<String>();

    public Workshop(String workshopName, int capacity) {
        this.workshopName = workshopName;
        this.capacity = capacity;
    }

    public Workshop() {
        this.workshopName = "";
        this.capacity = 0;
        Set<String> ID = new HashSet<String>();
        int Accepted, Rejeted;


    }
}