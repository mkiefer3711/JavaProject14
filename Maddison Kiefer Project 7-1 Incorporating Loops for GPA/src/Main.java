//@author Maddison Kiefer

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        int count = 0;
        
        // Prompt the user to enter the number of students data they want to input
        System.out.print("How many students data you want to enter: ");
        count = scnr.nextInt();
        
        // Create a list to store Student objects
        List<Student> studentInfo = new LinkedList<Student>();
        
        // Loop to gather information for each student
        for (int i = 0; i < count; i++) {
            scnr.nextLine();
            System.out.print("Enter name: ");
            String name = scnr.nextLine();
            System.out.print("Enter address: ");
            String address = scnr.nextLine();
            System.out.print("Enter gpa: ");
            double gpa = scnr.nextDouble();
            Student stud1 = new Student(name, address, gpa);
            studentInfo.add(stud1);
        }
        
        // Sort the list of students based on their names
        Collections.sort(studentInfo);
        // Use an iterator to traverse the list and write sorted student data to a file
        Iterator<Student> iterator = studentInfo.iterator();
        
        try {
            // Create a FileWriter to write to the file "SortedStudentData.txt"
            FileWriter fileWrite = new FileWriter("SortedStudentData.txt");
            
            // Iterate through the list and write each student's information to the file
            while(iterator.hasNext()) {
                fileWrite.write(iterator.next().toString() + "\n");
            }
            // Close the FileWriter
            fileWrite.close();
        } catch (IOException e) {
        }
    }
}
