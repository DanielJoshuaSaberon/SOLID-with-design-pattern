package SOLID3.ConcreteClasses;

import SOLID3.Interface.Borrow;
import SOLID3.Resource.InternetAccess;

public class Student {
    private String lastName;
    private String firstName;
    private Borrow borrowResource;

    public Student(String lastName, String firstName, Borrow borrowResource) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.borrowResource = borrowResource;
    }

    public String borrow(String title) {
        String output = "";

        if (borrowResource instanceof InternetAccess) {
            output = "--------------------------------------------" +
                    "\nStudent: " + firstName + " " + lastName +
                    "\nAccessing: " + borrowResource.borrow(title);
        }
        else {
            output = "--------------------------------------------" +
                    "\nStudent: " + firstName + " " + lastName +
                    "\nBorrowing: " + borrowResource.borrow(title);
        }

        return output;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
