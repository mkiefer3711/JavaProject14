// @author Maddison Kiefer

// Student class represents a student with a name, address, and GPA
public class Student implements Comparable<Student>{
    // Variables to store student information
    private String name;
    private String address;
    private double gpa;
    
     // Constructor to initialize a Student object with given name, address, and GPA
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    
    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }
    
    // Setter method to update the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the student's address
    public String getAddress() {
        return address;
    }
    
    // Setter method to update the student's address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method to retrieve the student's GPA
    public double getGpa() {
        return gpa;
    }

    // Setter method to update the student's GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    // Override the toString() method to provide a string representation of the Student object
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nGPA: " + gpa;
    }

    // Override the compareTo() method from the Comparable interface to enable sorting by name
    @Override
    public int compareTo(Student s) {
        return getName().compareTo(s.getName());
    }
}