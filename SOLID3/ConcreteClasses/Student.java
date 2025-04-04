package SOLID3.ConcreteClasses;

import SOLID3.Interface.Borrow;
import SOLID3.Resource.InternetAccess;

public class Student {
    private String lastName;
    private String firstName;
    private Borrow borrowedResource;

    public Student(String lastName, String firstName, Borrow borrowedResource) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.borrowedResource = borrowedResource;
    }

    public String borrowResource(String title) {
        String output = "";

        if (borrowResource instanceof InternetAccess) {
            output = "--------------------------------------------" +
                    "\nStudent: " + firstName + " " + lastName +
                    "\nAccessing: " + borrowedResource.borrow(title);
        }
        else {
            output = "--------------------------------------------" +
                    "\nStudent: " + firstName + " " + lastName +
                    "\nBorrowing: " + borrowedResource.borrow(title);
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
