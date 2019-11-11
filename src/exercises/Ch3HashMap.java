package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ch3HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("Id number: ");
                Integer studentId = input.nextInt();
                students.put(studentId, newStudent);

                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster (ID: Student name):");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
