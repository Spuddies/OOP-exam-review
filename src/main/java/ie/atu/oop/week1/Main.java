
package ie.atu.oop.week1;

public class Main {

    public static void main(String[] args) {

        Workshop workshop = new Workshop();

        boolean running = true;

        while (running) {

            workshop.StudentRegister();

            System.out.printf("Workshop name: %s\n",
                    workshop.getWorkshopName());

            System.out.printf("Capacity: %d\n",
                    workshop.getCapacity());

            System.out.printf("register attempts: %d\n",
                    workshop.getRegattempts());

            System.out.println("Accepted: " +
                    workshop.getAccepted());

            System.out.println("Rejected: " +
                    workshop.getRejected());

            System.out.printf("Student IDs: %s\n",
                    workshop.getID().toString());

            running = false;
        }
    }
}
