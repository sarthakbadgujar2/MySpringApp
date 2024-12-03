package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        // Loading Spring application context
        ApplicationContext con = new ClassPathXmlApplicationContext("springorm.xml");
        StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

        // Create BufferedReader for user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean go = true;
        while (go) {
            // Display menu options to the user
            System.out.println("PRESS 1 for add new student");
            System.out.println("PRESS 2 for display all students");
            System.out.println("PRESS 3 for get detail of single student");
            System.out.println("PRESS 4 for delete student");
            System.out.println("PRESS 5 for update student");
            System.out.println("PRESS 6 for exit");

            try {
                // Read the user input
                int input = Integer.parseInt(br.readLine());

                switch (input) {
                    case 1:
                        // Add new student
                        Student student = new Student(0, "", "");
                        System.out.print("Enter student Id: ");
                        student.setStudentId(Integer.parseInt(br.readLine())); // Correct field

                        System.out.print("Enter student name: ");
                        student.setStudentName(br.readLine()); // Correct field

                        System.out.print("Enter student city: ");
                        student.setStudentCity(br.readLine()); // Correct field

                        // Insert the student into the database
                        int result = studentDao.insert(student);
                        System.out.println("Student added with ID: " + result);
                        break;

                    case 2:
                        // Display all students
                        System.out.println("Displaying all students: ");
                        for (Student s : studentDao.getStudent()) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        // Get details of a single student
                        System.out.print("Enter student ID to get details: ");
                        int studentId = Integer.parseInt(br.readLine());
                        Student studentDetails = studentDao.getStudent(studentId);
                        if (studentDetails != null) {
                            System.out.println("Student Details: " + studentDetails);
                        } else {
                            System.out.println("Student with ID " + studentId + " not found.");
                        }
                        break;

                    case 4:
                        // Delete student
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(deleteId);
                        System.out.println("Student with ID " + deleteId + " deleted.");
                        break;

                    case 5:
                        // Update student details
                        System.out.print("Enter student ID to update: ");
                        int updateId = Integer.parseInt(br.readLine());
                        Student studentToUpdate = studentDao.getStudent(updateId);
                        if (studentToUpdate != null) {
                            System.out.print("Enter new name: ");
                            String newName = br.readLine();
                            System.out.print("Enter new city: ");
                            String newCity = br.readLine();

                            studentToUpdate.setStudentName(newName); // Correct field
                            studentToUpdate.setStudentCity(newCity); // Correct field

                            studentDao.updateStudent(studentToUpdate);
                            System.out.println("Student details updated.");
                        } else {
                            System.out.println("Student with ID " + updateId + " not found.");
                        }
                        break;

                    case 6:
                        // Exit the loop
                        go = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Invalid Input. Please try again!");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thanks for your time!");
    }
}
