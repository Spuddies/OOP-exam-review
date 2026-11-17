
package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Workshop {

    private String workshopName;
    private int capacity;

    private Set<String> ID = new HashSet<String>();

    private int Accepted = 0;
    private int Rejected = 0;
    private int Regattempts = 0;
    private int Reglimit = 0;

    public Workshop(String workshopName, int capacity) {
        this.workshopName = workshopName;
        this.capacity = capacity;
    }

    public Workshop() {
        this.workshopName = "";
        this.capacity = 0;
    }


    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Set<String> getID() {
        return ID;
    }

    public int getAccepted() {
        return Accepted;
    }

    public int getRejected() {
        return Rejected;
    }

    public int getRegattempts() {
        return Regattempts;
    }


    public void StudentRegister() {

        Scanner input = new Scanner(System.in);

        System.out.println("enter workshop name");
        setWorkshopName(input.nextLine());

        if (workshopName.isEmpty()) {
            System.out.println("workshop name cannot be empty");
        }

        System.out.println("enter capacity");
        setCapacity(input.nextInt());

        System.out.println("enter register attempts");
        Reglimit = input.nextInt();

        input.nextLine();

        for (int i = 1; i <= Reglimit; i++) {

            System.out.println("enter student IDs");
            String studentID = input.nextLine();

            if (studentID.trim().isEmpty()) {
                System.out.println("Student ID cannot be empty");
                i--;
                continue;
            }

            boolean added = ID.add(studentID);

            if (added) {
                System.out.println("ID added successfully");
                Accepted++;
                Regattempts++;
            }
            else {
                System.out.println("ID already in use");
                Rejected++;
                Regattempts++;
                i--;
            }

            if (Accepted > capacity) {
                System.out.println("Workshop capacity exceeded");
                Rejected++;
                Accepted--;
            }
        }
    }
}
