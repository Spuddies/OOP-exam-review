package ie.atu.oop.week1;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        int Reglimit,Regattempts = 0,Accepted = 0,Rejected = 0;
        boolean running = true;

        HashSet<String> ID = new HashSet<>();
        while (running) {
            Scanner input =  new Scanner(System.in);
            System.out.println("enter workshop name");
            String workshopName  = input.nextLine();
            if(workshopName.isEmpty()){
                System.out.println("workshop name cannot be empty");

            }
            System.out.println("enter register attempts");
            Reglimit = input.nextInt();
            System.out.println("enter capacity");
            int capacity = input.nextInt();

            for (int i=1;i<=Reglimit;i++) {

                System.out.println("enter student IDs");
                boolean added = ID.add(input.next());





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
                if(capacity >= Reglimit) {
                    System.out.println("Workshop capacity exceeded");
                    Rejected++;
                    Regattempts++;
                }


            }
            System.out.printf("Workshop name: %s\n",workshopName);
            System.out.printf("Capacity: %d\n",capacity);
            System.out.printf("register attempts: %d\n",Regattempts);
            System.out.println("Accepted: "+Accepted);
            System.out.println("Rejected: "+Rejected);
            System.out.printf("Student IDs: %s\n",ID.toString());
            running = false;








        }






    }
}