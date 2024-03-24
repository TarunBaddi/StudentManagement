package CIE_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class StudentInfo {

    public static int calculateAge(String dob) {
        try {
            // Parse the date of birth based on the format
            DateTimeFormatter formatter = dob.contains("-") ? DateTimeFormatter.ofPattern("dd-MM-yyyy")
                    : DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dobDate = LocalDate.parse(dob, formatter);

            // Calculate age
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(dobDate, currentDate);

            return period.getYears();
        } catch (Exception e) {
            System.out.println("Invalid date format. Please provide the date in 'DD-MM-YYYY' or 'YYYY-MM-DD' format.");
            return -1;
        }
    }

    public static void displayStudentInfo(String name, String dob) {
        int age = calculateAge(dob);

        if (age != -1) {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age + " years");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter date of birth (DD-MM-YYYY or YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        displayStudentInfo(name, dob);

        scanner.close();
    }
}
