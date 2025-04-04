package SOLID3;

import SOLID3.Resource.*;
import SOLID3.Interface.Borrow;
import SOLID3.ConcreteClasses.Student;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name(Surname, Firstname): ");
        String fullName = scanner.nextLine().trim();

        String[] parts = fullName.split(",");
        String lastName = parts[0];
        String firstName = parts[1];

        Student student;

        boolean running = true;
        while (running) {
            System.out.println("\nChoose a resource to borrow:");
            System.out.println("1. Book");
            System.out.println("2. Thesis");
            System.out.println("3. Capstone");
            System.out.println("4. Internet Access");
            System.out.println("5. Journal");
            System.out.println("6. Newspaper");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            Borrow borrowResource;
            String title = "";

            switch (choice) {
                case 1:
                    borrowResource = new Books();
                    break;
                case 2:
                    borrowResource = new Thesis();
                    break;
                case 3:
                    borrowResource = new Capstone();
                    break;
                case 4:
                    borrowResource = new InternetAccess();
                    break;
                case 5:
                    borrowResource = new Journal();
                    break;
                case 6:
                    borrowResource = new Newspaper();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    running = false;
                    continue;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            if(choice == 4){
                System.out.print("Enter website: ");
                title = scanner.nextLine();
            }
            else{
                System.out.print("Enter the title: ");
                title = scanner.nextLine();
            }


            student = new Student(lastName, firstName, borrowResource);
            System.out.println(student.borrowResource(title));
        }

        scanner.close();
    }
}
